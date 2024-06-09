import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.json.simple.parser.ParseException;

@SuppressWarnings({"serial","deprecation"})

public class Arkanoid extends JPanel {

	public static int frame = 0;
	public static final int ANCHO = 600;
	public static final int ALTO = 800;
	public boolean salir = false;
	public boolean restart = false;
	public String nombre = "???";
	public int nivel = 1;
	//public Maon maon = new Maon( new Cordenada(300, 300), Maon.TAMAÑODEFAULT, 3, this);
	public ArrayList<Maon> maones = new ArrayList<Maon>();
	public ArrayList<Item> items = new ArrayList<Item>();
	public ArrayList<Boliche> bolas = new ArrayList<Boliche>();
	public Jugador jugador = new Jugador(this);
	public Escenario escenario = new Escenario();
	public static final String nombreFichero = "src/datos.json";
	
	public Arkanoid() {
		
		addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
			}

			public void keyReleased(KeyEvent e) {
			}

			public void keyPressed(KeyEvent e) {
				jugador.keyPressed(e);
			}
		});
		setFocusable(true);
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		JFrame ventana = new JFrame("Arkanoid Basado");
		Arkanoid partida = new Arkanoid();
		partida.setNombre();
		partida.rellenarArrayList();
		partida.bolas.add(new Boliche(partida));
		ventana.add(partida);
		ventana.setSize(ANCHO, ALTO);
		ventana.setVisible(true);
		ventana.setResizable(false);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		do {
			
			while (partida.jugador.getVidas() > 0) {
	
				if (partida.jugador.pausa == false) {
	
					partida.movimiento();
					partida.jugador.utilizarBufos();
					frame += 2;
					if (frame > 80) frame = 0;
				
				}
				partida.repaint();
				Thread.sleep(10);
				
			}
			while (partida.bolas.size() >= 1) partida.bolas.remove(0);
			partida.repaint();
			
			if (partida.restart) {
				partida.restartPartida();
			}
			
		} while (partida.salir == false);
		partida.guardarDatos();
		System.exit(ABORT);
		
	}
	
	private void movimiento() {
		
		boolean colisionadoRecientemente = colisiones();
		limpiezaMaons();
		for (int i = 0; i < bolas.size(); i++) {
			boolean bolaPrincipal = false;
			if (i == 0) bolaPrincipal = true;
			bolas.get(i).moverBoliche(ANCHO - (int)(bolas.get(i).getAncho() * 1.4), ALTO - (int)(bolas.get(i).getAltura() * 2.2), colisionadoRecientemente, this.jugador, bolaPrincipal);
		}
		for(int i = 0; i < maones.size();  i++) {
			if (maones.get(i).getCaer()) {
				maones.get(i).mover();
				if (maones.get(i).getCordenada().getY() > 800) {
					maones.remove(i);
					i--;
				}
			}
		}
		for(int i = 0; i < items.size(); i++) {
			boolean fuera = items.get(i).mover();
			if (fuera) items.remove(i);
		}
		
	}
	
	private boolean colisiones() {
		
		boolean colisionadoRecientemente = false;
		for (int i = 0; i < bolas.size(); i++) bolas.get(i).setCollisionJugador(this.jugador.getBounds().intersects(bolas.get(i).getBounds()));
		
		for (int i = 0; i < items.size(); i++) {
			boolean colisionado = jugador.añadirBufo(jugador.getBounds().intersects(items.get(i).getBounds()), items.get(i));
			if (colisionado) items.remove(i);
		}
		for (int i = 0; i < maones.size(); i++) {
			if (maones.get(i).getCaer()) {
				
				if (jugador.getBounds().intersects(maones.get(i).getBounds())) {
					
					for (int y = 0; y < 3; y++)jugador.restarVida();
					maones.remove(i);
					
				}
				
			}
		}
		for (int b = 0; b < bolas.size(); b++) {
			for(int i = 0; i < this.maones.size(); i++) {
					
					boolean restarvida = bolas.get(b).setCollisionMaon(this.maones.get(i).getBounds().intersects(bolas.get(b).getBounds()), this.maones.get(i));
					if (restarvida) {
						colisionadoRecientemente = true;
						bolas.get(b).setCollisionMaon(restarvida);
						if(maones.get(i).getTimerInvencibilidad() <= 0) this.maones.get(i).restarVida(bolas.get(b));
						else maones.get(i).setTimerInvencibilidad(5);
					}
					
				
			}
		}
		return colisionadoRecientemente;
		
	}
	
	public void paint (Graphics graficos) {
		
		super.paint(graficos);
		Graphics2D graficos2D = (Graphics2D) graficos;
		graficos2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		this.escenario.pintar(graficos2D, graficos, this.nivel,this.nombre);
		for (int i = 0; i < bolas.size(); i++) bolas.get(i).pintar(graficos2D);
		for(int i = 0; i < maones.size(); i++) maones.get(i).pintar(graficos2D);
		for(int i = 0; i < items.size(); i++) items.get(i).pintar(graficos2D, graficos);
		this.jugador.pintar(graficos2D);
		if (jugador.getVidas() < 1) {
			try {
				
				escenario.preguntarContinuar(graficos2D, graficos,this);
				
			} catch (IOException | ParseException e) {
				
				e.printStackTrace();
			}
		}
		else if (jugador.pausa == true) escenario.pintarPausa(graficos2D, graficos);
		
	}
	
	private void rellenarArrayList() {
		int numeroFilas = (this.nivel > 5) ? 5 : this.nivel;
		
		for (int i = 0; i < numeroFilas; i++) {
			
			for (int j = 0; j < 6; j++) {
				
				this.maones.add(new Maon(new Cordenada(70 * (j + 1), 140 + (i * 30 )), Maon.TAMAÑODEFAULT, (int)(Math.random() * this.nivel + 1), this));
				
			}
			
		}
		
	}
	
	private void limpiezaMaons() {
	
		int random = (int)(Math.random() * 5);
		int randomCaer = (int)(Math.random() * 3);
		
		for (int i = 0; i < maones.size() ; i++) {
			
			if (maones.get(i).getTimerInvencibilidad() > 0) maones.get(i).restarTimer();
			if (maones.get(i).getVida() <= 0 && maones.get(i).getCaer() == false) {
				
				jugador.sumarPuntuacion( maones.get(i).valorMaon());
				if (random == 0)items.add(new Item(new Cordenada(maones.get(i).getX() + 30, maones.get(i).getY()), (int)(Math.random() * Item.TOTALITEMS + 1),this));
				if (randomCaer != 0)maones.remove(i);
				else {
					maones.get(i).setCaer(true);
					maones.get(i).setSpeed((int)(Math.random() * 10 + 1));
				}
				
			}
			
		}
		if (maones.size() == 0) {
			
			this.nivel++;
			borrarBolasAdicionales();
			bolas.get(0).setCordenada(new Cordenada(jugador.getX() + jugador.getAncho()/2 ,ALTO - 10 - 105));
			rellenarArrayList();
			
		}
		
	}
	
	public void vaciarArrayListMaons() {
		
		for(int j = 0; j < 5; j++) for (int i = 0; i < this.maones.size(); i++) this.maones.remove(0);

	}
	
	public void borrarBolasAdicionales() {
		
		for(int j = 0; j < 5; j++) for (int i = 1; i < this.bolas.size(); i++) this.bolas.remove(0);
		
	}
	
	public void borrarItems() {
		
		for(int j = 0; j < 5; j++) for (int i = 0; i < this.items.size(); i++) this.items.remove(0);
		
	}
	
	public void restartPartida () {
		
		this.guardarDatos();
		this.vaciarArrayListMaons();
		this.borrarItems();
		this.nivel = 1;
		this.rellenarArrayList();
		this.jugador.vaciarBufos();
		this.jugador.setVidas(3);
		this.jugador.setPunatuacion(0);
		this.bolas.add(new Boliche(this));
		this.bolas.get(0).setCordenada(new Cordenada(this.jugador.getCordenada().getX(),this.jugador.getCordenada().getY()));
		this.restart = false;
	}
	
	public void guardarDatos () {
		
		AgileJSON nombre = new AgileJSON("Nombre",this.nombre,'S');
		AgileJSON puntuacion = new AgileJSON("Puntos","" + (this.jugador.getPunatuacion()) + "",'I');
		ArrayList<AgileJSON> datos = new ArrayList<AgileJSON>();
		datos.add(nombre);
		datos.add(puntuacion);
		Agile.guardarJSON(nombreFichero, datos);
		
	}
	
	public void setNombre () {
		
		this.nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		if (this.nombre == null) this.nombre = "???";
		else if (this.nombre.equals("")) this.nombre = "???";
		else if (this.nombre.length() > 3) {
			
			char letraAux;
			String nombreAcortado = "";
			for (int i = 0; i < 3; i++) {
				
				letraAux = this.nombre.charAt(i);
				nombreAcortado += letraAux;
				
			}
			
			this.nombre = nombreAcortado;
			
		}
		
	}

}
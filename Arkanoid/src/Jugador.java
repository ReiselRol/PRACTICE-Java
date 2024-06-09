

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Jugador {

	public static final Tamaño TAMAÑODEFAULT = new Tamaño(80,20);
	public static final Cordenada CORDENADADEFAULT = new Cordenada(Arkanoid.ANCHO / 2 - TAMAÑODEFAULT.getAncho() / 2 - 40, Arkanoid.ALTO - 10 - 75);
	
	private Cordenada cordenada;
	private Tamaño tamaño;
	public boolean pausa = false;
	private int speed;
	private int vidas;
	private Arkanoid partida;
	private int punatuacion;
	private ArrayList<Buff> buffs = new ArrayList<Buff>();
	
	
	public Arkanoid getPartida() {
		return partida;
	}

	public void setPartida(Arkanoid partida) {
		this.partida = partida;
	}
	
	public Jugador() {
		
		this.tamaño = TAMAÑODEFAULT;
		this.cordenada = CORDENADADEFAULT;
		this.speed = 10;
		this.vidas = 3;
		
	}
	
	public Jugador(Arkanoid partida) {
		
		this.tamaño = TAMAÑODEFAULT;
		this.cordenada = CORDENADADEFAULT;
		this.speed = 10;
		this.vidas = 3;
		this.partida = partida;
		
	}

	public Cordenada getCordenada() {
		return cordenada;
	}

	public void setCordenada(Cordenada cordenada) {
		this.cordenada = cordenada;
	}

	public Tamaño getTamaño() {
		return tamaño;
	}

	public void setTamaño(Tamaño tamaño) {
		this.tamaño = tamaño;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	
	public int getX() {
		return cordenada.getX();
	}
	
	public void setX(int x) {
		this.cordenada.setX(x);
	}
	public int getY() {
		return cordenada.getY();
	}
	
	public void setY(int y) {
		this.cordenada.setY(y);
	}
	
	public int getAltura() {
		return tamaño.getAltura();
	}
	
	public void setAltura(int altura) {
		this.tamaño.setAltura(altura);
	}
	
	public int getAncho() {
		return tamaño.getAncho();
	}
	
	public void setAncho(int Ancho) {
		this.tamaño.setAncho(Ancho);
	}

	public void keyReleased(KeyEvent e) {

	}
	public void keyPressed(KeyEvent e) {
		
		if (this.vidas > 0) {
			if (this.pausa == false) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					if((getX() + -speed) > 30) setX(getX() + -speed);
				}
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					if((getX() + speed) < Arkanoid.ANCHO - 125) setX(getX() + speed);
				}
			}
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				if (this.pausa) pausa = false;
				else pausa = true;
			}
		}
		else {
			if (e.getKeyCode() == KeyEvent.VK_Y) {
				this.partida.salir = false;
				this.partida.restart = true;
			}
			if (e.getKeyCode() == KeyEvent.VK_N) {
				this.partida.salir = true;
				this.partida.restart = false;
			}
		}
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle(getX(), getY(), getAltura(), getAncho());
	}
	
	public void pintar(Graphics2D graficos2D) {
		
		graficos2D.setColor(Color.DARK_GRAY);
		graficos2D.fillRect(getX(), getY(), getAltura(), getAncho());
		graficos2D.setColor(Color.GRAY);
		graficos2D.fillRect(getX() + 3, getY() + 3, getAltura() - 3 * 2, getAncho() - 3 * 2);
		graficos2D.setColor(Color.LIGHT_GRAY);
		graficos2D.fillRect(getX() + 6, getY() + 6, getAltura() - 6 * 2, getAncho() - 6 * 2);
		graficos2D.setColor(Color.GRAY);
		graficos2D.fillOval(getX() + getAltura() / 2 - getAncho() / 2, getY(), getAncho(), getAncho());
		graficos2D.setColor(Color.LIGHT_GRAY);
		graficos2D.fillOval(getX() + getAltura() / 2 - getAncho() / 2 + 3, getY() + 3, getAncho() - 6, getAncho() - 6);
		graficos2D.setColor(Color.BLACK);
		graficos2D.drawRect(getX(), getY(), getAltura(), getAncho());
		graficos2D.setFont(new Font("Verdana", Font.BOLD, 16));
		graficos2D.setColor(Color.BLACK);
		graficos2D.drawString("Puntos: " + String.valueOf(this.punatuacion), Arkanoid.ANCHO - 151, 44);
		graficos2D.drawString("Vidas: " + String.valueOf(this.vidas), 29, 44);
		graficos2D.setFont(new Font("Verdana", Font.BOLD, 15));
		graficos2D.setColor(Color.WHITE);
		graficos2D.drawString("Puntos: " + String.valueOf(this.punatuacion), Arkanoid.ANCHO - 150, 45);
		graficos2D.drawString("Vidas: " + String.valueOf(this.vidas), 30, 45);
		
	}
	
	public void restarVida() {
		this.vidas--;
		if (this.vidas < 0) this.vidas = 0;
	}

	public int getPunatuacion() {
		return punatuacion;
	}

	public void setPunatuacion(int punatuacion) {
		this.punatuacion = punatuacion;
	}
	
	public void sumarPuntuacion(int punatuacion) {
		this.punatuacion += punatuacion;
	}
	
	public boolean añadirBufo(boolean añadir, Item bufo) {
		if(añadir == true) this.buffs.add(new Buff(bufo.getId()));
		return añadir;
	}
	
	public void utilizarBufos() {
		
		for (int i = 0; i < buffs.size() ; i++) {
			
			if (buffs.get(i).isAplicado()) {
				
				buffs.get(i).setTimer( buffs.get(i).getTimer() - 1);
				
			}
			else {
				
				buffs.get(i).setAplicado(true);
				buffs.get(i).aplicarBufo(buffs.get(i).getId(),this);
			}
			if (buffs.get(i).getTimer() <= 0) {
				
				buffs.get(i).resetBufo(buffs.get(i).getId(),this);
				buffs.remove(i);
				i--;
			}
			
		}
		
	}
	
	public void vaciarBufos() {
		while (this.buffs.size() > 0) buffs.remove(0);
	}
	
}

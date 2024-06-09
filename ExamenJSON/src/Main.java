import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.json.simple.parser.ParseException;

@SuppressWarnings({ "serial", "unused" })
public class Main extends JPanel {

	private ArrayList<Bola> bolas = new ArrayList<Bola>();
	private static int ANCHO = 0;
	private static int ALTO = 0;
	private static final String ARCHIVO = "src/figures2.json";
	
	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		
		lecturaJson();
		JFrame ventana = new JFrame("Ventana Examen");
		Main main = new Main();
		main.rellenarBolas();
		ventana.add(main);
		ventana.setSize(ANCHO, ALTO);
		ventana.setVisible(true);
		ventana.setResizable(false);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.repaint();

	}
	
	public void paint (Graphics graficos) {
		
		super.paint(graficos);
		Graphics2D graficos2D = (Graphics2D) graficos;
		graficos2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		for (int i = 0; i < bolas.size(); i++) bolas.get(i).pintar(graficos2D);
		
	}
	
	private static void lecturaJson() throws NumberFormatException, IOException, ParseException {
		
		assignarTamaños();
		
	}
	
	private static void assignarTamaños() throws NumberFormatException, IOException, ParseException {
		
		ANCHO = Integer.parseInt(Agile.searchJSON( ARCHIVO, "dades", "O", "pantalla", "O", "ample", "E"));
		ALTO = Integer.parseInt(Agile.searchJSON( ARCHIVO, "dades", "O", "pantalla", "O", "altura", "E"));
		
	}
	
	private void rellenarBolas() throws IOException, ParseException {
		
		int totalBolas = Agile.searchSizeJSON( ARCHIVO, "files", "A");
		int tamaño = Integer.parseInt(Agile.searchJSON( ARCHIVO, "dades", "O", "mida_figures", "E"));
		
		for (int i = 0; i < totalBolas; i++) {

			int totalBolasFila = Integer.parseInt(Agile.searchJSON( ARCHIVO, "files", "A", "" + i, "O", "n", "E"));
			int y = Integer.parseInt(Agile.searchJSON( ARCHIVO, "files", "A", "" + i, "O", "y", "E"));
			int distancia = Integer.parseInt(Agile.searchJSON( ARCHIVO, "files", "A", "" + i, "O", "distancia", "E"));
			int R = Integer.parseInt(Agile.searchJSON( ARCHIVO, "files", "A", "" + i, "O", "color", "O", "R", "E"));
			int G = Integer.parseInt(Agile.searchJSON( ARCHIVO, "files", "A", "" + i, "O", "color", "O", "G", "E"));
			int B = Integer.parseInt(Agile.searchJSON( ARCHIVO, "files", "A", "" + i, "O", "color", "O", "B", "E"));
			String tipo = Agile.searchJSON( ARCHIVO, "files", "A", "" + i, "O", "tipus", "E");
			Color color = new Color(R, G, B);
			boolean vacio = false;
			
			if (tipo.equals("rodonaBuida")) vacio = true;
			
			for (int j = 0; j < totalBolasFila; j++) {
				
				Bola bola = new Bola(vacio, distancia * j, y, tamaño, color);
				bolas.add(bola);
				
			}
			
		}
		
	}

}

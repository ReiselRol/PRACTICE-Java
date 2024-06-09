

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import org.json.simple.parser.ParseException;

@SuppressWarnings({"serial","deprecation"})
public class Escenario extends JPanel{
	
	private Image imagen;
	
	public void pintar(Graphics2D graficos2D, Graphics graphics, int nivel, String nombre) {
		
		imagen = new ImageIcon(getClass().getResource("/Contenido/Background.png")).getImage();
		
		int alto = Arkanoid.ALTO;
		int ancho = Arkanoid.ANCHO;
		int frame = Arkanoid.frame;
		
		graficos2D.setColor(new Color(33,33,33));
		graficos2D.fillRect(0, 70, ancho, alto);
		graphics.drawImage(imagen,0, 0, 600, 800, this);
		graficos2D.setColor(new Color(180,180,180,80));
		graficos2D.setFont(new Font("Verdana", Font.BOLD, 40));
		graficos2D.drawString("Nivel: " + String.valueOf(nivel), 200, 390);
		graficos2D.setColor(Color.BLACK);
		graficos2D.fillRect(0, 0, ancho, 70);
		
		if (frame < 20) {
			
			graficos2D.setColor(Color.RED);
			graficos2D.fillRect(30, 70, 2, alto);
			graficos2D.setColor(Color.BLACK);
			graficos2D.fillRect(32, 70, 2, alto);
			graficos2D.fillRect(34, 70, 2, alto);
			
			graficos2D.setColor(Color.RED);
			graficos2D.fillRect(ancho - 47, 70, 2, alto);
			graficos2D.setColor(Color.BLACK);
			graficos2D.fillRect(ancho - 49, 70, 2, alto);
			graficos2D.fillRect(ancho - 51, 70, 2, alto);
			
			graficos2D.setColor(Color.RED);
			graficos2D.fillRect(32, 100, ancho - 45 - 32, 2);
			graficos2D.setColor(Color.BLACK);
			graficos2D.fillRect(34, 102, ancho - 45 - 38, 2);
			graficos2D.fillRect(36, 104, ancho - 45 - 40, 2);
			
		}
		else if (frame < 40) {
			
			graficos2D.setColor(Color.ORANGE);
			graficos2D.fillRect(30, 70, 2, alto);
			graficos2D.setColor(Color.RED);
			graficos2D.fillRect(32, 70, 2, alto);
			graficos2D.setColor(Color.BLACK);
			graficos2D.fillRect(34, 70, 2, alto);
			
			graficos2D.setColor(Color.ORANGE);
			graficos2D.fillRect(ancho - 47, 70, 2, alto);
			graficos2D.setColor(Color.RED);
			graficos2D.fillRect(ancho - 49, 70, 2, alto);
			graficos2D.setColor(Color.BLACK);
			graficos2D.fillRect(ancho - 51, 70, 2, alto);
			
			graficos2D.setColor(Color.ORANGE);
			graficos2D.fillRect(32, 100, ancho - 45 - 32, 2);
			graficos2D.setColor(Color.RED);
			graficos2D.fillRect(34, 102, ancho - 45 - 38, 2);
			graficos2D.setColor(Color.BLACK);
			graficos2D.fillRect(36, 104, ancho - 45 - 40, 2);
			
		}
		else if (frame < 60) {
			
			graficos2D.setColor(Color.YELLOW);
			graficos2D.fillRect(30, 70, 2, alto);
			graficos2D.setColor(Color.ORANGE);
			graficos2D.fillRect(32, 70, 2, alto);
			graficos2D.setColor(Color.RED);
			graficos2D.fillRect(34, 70, 2, alto);
			
			graficos2D.setColor(Color.YELLOW);
			graficos2D.fillRect(ancho - 47, 70, 2, alto);
			graficos2D.setColor(Color.ORANGE);
			graficos2D.fillRect(ancho - 49, 70, 2, alto);
			graficos2D.setColor(Color.RED);
			graficos2D.fillRect(ancho - 51, 70, 2, alto);
			
			graficos2D.setColor(Color.YELLOW);
			graficos2D.fillRect(32, 100, ancho - 45 - 32, 2);
			graficos2D.setColor(Color.ORANGE);
			graficos2D.fillRect(34, 102, ancho - 45 - 38, 2);
			graficos2D.setColor(Color.RED);
			graficos2D.fillRect(36, 104, ancho - 45 - 40, 2);
			
		}
		else {
			
			graficos2D.setColor(Color.BLACK);
			graficos2D.fillRect(30, 70, 2, alto);
			graficos2D.fillRect(32, 70, 2, alto);
			graficos2D.fillRect(34, 70, 2, alto);
			
			graficos2D.fillRect(ancho - 47, 70, 2, alto);
			graficos2D.fillRect(ancho - 49, 70, 2, alto);
			graficos2D.fillRect(ancho - 51, 70, 2, alto);
			
			graficos2D.fillRect(32, 100, ancho - 45 - 32, 2);
			graficos2D.fillRect(34, 102, ancho - 45 - 34, 2);
			graficos2D.fillRect(36, 104, ancho - 45 - 36, 2);
			
		}
		
		graficos2D.setColor(Color.DARK_GRAY);
		graficos2D.fillRect(0, 70, 30, alto);
		graficos2D.setColor(Color.GRAY);
		graficos2D.fillRect(18, 70, 7, alto);
		graficos2D.setColor(Color.LIGHT_GRAY);
		graficos2D.fillRect(25, 70, 5, alto);
		graficos2D.setColor(Color.BLACK);
		graficos2D.drawRect(0, 70, 30, alto);

		graficos2D.setColor(Color.BLACK);
		graficos2D.drawRect(30, 70, ancho - 45, 30);

		graficos2D.setColor(Color.DARK_GRAY);
		graficos2D.fillRect(ancho - 45, 70, 30, alto);
		graficos2D.setColor(Color.GRAY);
		graficos2D.fillRect(ancho - 45, 70, 12, alto);
		graficos2D.setColor(Color.LIGHT_GRAY);
		graficos2D.fillRect(ancho - 45, 70, 5, alto);
		graficos2D.setColor(Color.BLACK);
		graficos2D.drawRect(ancho - 45, 70, 30, alto);
		
		graficos2D.setColor(Color.GRAY);
		graficos2D.fillRect(19, 70, ancho - 45 - 13, 30);
		graficos2D.setColor(Color.LIGHT_GRAY);
		graficos2D.fillRect(25, 95, ancho - 45 - 20, 5);
		graficos2D.setColor(Color.DARK_GRAY);
		graficos2D.fillRect(0, 70, ancho, 19);
		
		graficos2D.setColor(Color.DARK_GRAY);
		graficos2D.fillRect(0, 0, ancho, 70);
		graficos2D.setColor(Color.GRAY);
		graficos2D.fillRect(Arkanoid.ANCHO - 176, 9, 150 + 12, 50 + 12);
		graficos2D.setColor(Color.LIGHT_GRAY);
		graficos2D.fillRect(Arkanoid.ANCHO - 170, 15, 150, 50);
		graficos2D.setColor(new Color(33,33,33));
		graficos2D.fillRect(Arkanoid.ANCHO - 164, 22, 150 -12, 50 - 12);
		graficos2D.setColor(Color.BLACK);
		graficos2D.drawRect(Arkanoid.ANCHO - 164, 22, 150 -12, 50 - 12);
		
		graficos2D.setColor(Color.GRAY);
		graficos2D.fillRect(10, 9, 100 + 12, 50 + 12);
		graficos2D.setColor(Color.LIGHT_GRAY);
		graficos2D.fillRect(16, 15, 100, 50);
		graficos2D.setColor(new Color(33,33,33));
		graficos2D.fillRect(22, 22, 100 -12, 50 - 12);
		graficos2D.setColor(Color.BLACK);
		graficos2D.drawRect(22, 22, 100 -12, 50 - 12);
		
		graficos2D.setColor(Color.white);
		graficos2D.setFont(new Font("Verdana", Font.BOLD, 30));
		graficos2D.drawString("Nombre: " + nombre, 150, 50);
		
	}
	
	public void pintarPausa(Graphics2D graficos2D, Graphics graphics) {
		
		graficos2D.setColor(new Color(1,1,1, 90));
		graficos2D.fillRect(0, 0, 600, 800);
		graficos2D.setColor(Color.WHITE);
		graficos2D.setFont(new Font("Verdana", Font.BOLD, 50));
		graficos2D.drawString("Paused", 200, 390);
		
	}
	public void preguntarContinuar(Graphics2D graficos2D, Graphics graphics, Arkanoid partida) throws IOException, ParseException {
		
		graficos2D.setColor(new Color(1,1,1, 90));
		graficos2D.fillRect(0, 0, 600, 800);
		graficos2D.setColor(Color.WHITE);
		graficos2D.setFont(new Font("Verdana", Font.BOLD, 50));
		graficos2D.drawString("Retry?", 200, 190);
		graficos2D.drawString("Y/N", 230, 250);
		
		graficos2D.setFont(new Font("Verdana", Font.BOLD, 20));
		ArrayList<String> puntuaciones = Agile.getSortedJSON( Arkanoid.nombreFichero,"Puntos" ,"Nombre","Puntos");
		
		for (int i = 1; i < puntuaciones.size() && i < 20; i += 2) {
			
			String textoAMostrar = puntuaciones.get(i - 1) + ": " +puntuaciones.get(i);
			graficos2D.drawString(textoAMostrar, 230, 300 + 15 * i);
			
		}
		
	}
	
}


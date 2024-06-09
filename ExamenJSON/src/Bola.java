import java.awt.Color;
import java.awt.Graphics2D;

public class Bola {

	private boolean vacio;
	private int x;
	private int y;
	private int tamaño;
	private Color color;
	
	public Bola () {
		
	}
	
	public Bola (boolean vacio, int x, int y, int tamaño, Color color) {
		
		this.vacio = vacio;
		this.x = x;
		this.y = y;
		this.color = color;
		this.tamaño = tamaño;
		
	}
	
	public void pintar (Graphics2D graficos2D) {
		
		if (this.vacio) {
			
			graficos2D.setColor(this.color);
			graficos2D.drawOval(this.x, this.y, this.tamaño, this.tamaño);
			
		}
		else {
			
			graficos2D.setColor(this.color);
			graficos2D.fillOval(this.x, this.y, this.tamaño, this.tamaño);
			
		}
		
	}
	
}

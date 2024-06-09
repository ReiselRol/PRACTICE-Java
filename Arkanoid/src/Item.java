import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Item extends JPanel {

	public static final Tamaño TAMAÑODEFAULT = new Tamaño(20,20);
	public static final int TOTALITEMS = 5;
	private Cordenada cordenada;
	private Tamaño tamaño;
	private int id;
	private Arkanoid partida;
	private Image imagen;
	
	public Item () {
		
	}
	
	public Item (Cordenada cordenada, int id, Arkanoid partida) {
		
		this.cordenada = cordenada;
		this.id = id;
		this.tamaño = TAMAÑODEFAULT;
		this.setPartida(partida);
		setearImagen();
		
	}
	
	public Item (Cordenada cordenada, int id, Tamaño tamaño, Arkanoid partida) {
		
		this.cordenada = cordenada;
		this.id = id;
		this.tamaño = tamaño;
		this.setPartida(partida);
		setearImagen();
		
	}
	
	public Cordenada getCordenada() {
		return cordenada;
	}

	public void setCordenada(Cordenada cordenada) {
		this.cordenada = cordenada;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean mover() {
		
		boolean fueracampo = false;
		this.cordenada.setY( this.cordenada.getY() + 4);
		if (this.cordenada.getY() > 880) fueracampo = true;
		return fueracampo;
		
	}
	
	public void setearImagen() {
		
			if ( this.id == 1 ) this.imagen = new ImageIcon(getClass().getResource("/Contenido/Buff_1.png")).getImage();
			else if ( this.id == 2 ) this.imagen = new ImageIcon(getClass().getResource("/Contenido/Buff_2.png")).getImage();
			else if ( this.id == 3 ) this.imagen = new ImageIcon(getClass().getResource("/Contenido/Buff_3.png")).getImage();
			else if ( this.id == 4 ) this.imagen = new ImageIcon(getClass().getResource("/Contenido/Buff_4.png")).getImage();
			else if ( this.id == 5 ) this.imagen = new ImageIcon(getClass().getResource("/Contenido/Buff_5.png")).getImage();
			else if ( this.id == 6 ) this.imagen = new ImageIcon(getClass().getResource("/Contenido/Buff_6.png")).getImage();
		
	}
	
	public void pintar(Graphics2D graficos2D, Graphics graphics) {
		
		graphics.drawImage(imagen, this.cordenada.getX(), this.cordenada.getY(), this.tamaño.getAltura(), this.tamaño.getAncho(), this);
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle(cordenada.getX(), cordenada.getY(), this.tamaño.getAltura(), this.tamaño.getAncho());
	}

	public Arkanoid getPartida() {
		return partida;
	}

	public void setPartida(Arkanoid partida) {
		this.partida = partida;
	}

	
}

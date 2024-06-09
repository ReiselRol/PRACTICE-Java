

public class Tamaño {

	public static final int ALTURADEFAULT = 20;
	public static final int ANCHURADEFAULT = 20;
	private int altura;
	private int ancho;
	
	public Tamaño () {
		
	}
	
	public Tamaño (int altura, int ancho) {
		
		this.altura = altura;
		this.ancho = ancho;
		
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
}

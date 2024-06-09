package Aeronautica;

public class Cordenada {
	
	private int x;
	private int y;
	private int altura;
	
	public Cordenada() {
		
	}
	public Cordenada(int x, int y, int altura) { 
		
		this.x = x;
		this.y = y;
		this.altura = altura;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public void subirAltura (int cantidad) {
		this.altura += cantidad;
	}
	public void bajarAltura (int cantidad) {
		this.altura -= cantidad;
	}
	 
}

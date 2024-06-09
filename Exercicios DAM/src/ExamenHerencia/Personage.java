package ExamenHerencia;

public abstract class Personage {

	protected String nombre;
	protected int ataquePoder;
	protected Arma [] armas;
	protected String faccion;
	
	public Personage () {
		
	}
	
	public Personage (String nombre, int ataquePoder, Arma [] armas, String faccion) {
		
		this.nombre = nombre;
		this.ataquePoder = ataquePoder;
		this.armas = armas;
		this.faccion = faccion;
		
	}
	
	public String getFaccion() {
		return faccion;
	}

	public abstract void mostrarInfo();
	public abstract int mediaPoder();
	
}

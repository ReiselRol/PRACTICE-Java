package ExamenHerencia;

public class Arma {

	private String nombre;
	private int ataquePoder;
	
	public Arma () {
		
	}
	
	public Arma (String nombre, int ataquePoder) {
		
		this.nombre = nombre;
		this.ataquePoder = ataquePoder;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAtaquePoder() {
		return ataquePoder;
	}

	public void setAtaquePoder(int ataquePoder) {
		this.ataquePoder = ataquePoder;
	}
	
}

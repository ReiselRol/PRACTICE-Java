package GestionadorVehiculo;

public abstract class Vehiculo {
	
	protected String matricula;
	protected int places;
	final protected double PRECIODIA = 50;
	
	public Vehiculo () {
		
	}
	
	public Vehiculo (String matricula, int places) {
		
		this.matricula = matricula;
		this.places = places;
		
	}

	public int getPlaces() {
		return places;
	}

	public void setPlaces(int places) {
		this.places = places;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public abstract void obtenerPrecio(int dias);

}

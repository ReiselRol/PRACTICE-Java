package GestionadorVehiculo;

public abstract class Persones extends Vehiculo {

	public Persones() {
		super();
	}
	
	public Persones(String matricula, int places) {
		super(matricula,places);
	}

	public abstract void obtenerPrecio(int dias);
}

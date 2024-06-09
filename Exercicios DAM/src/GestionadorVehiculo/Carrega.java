package GestionadorVehiculo;

public abstract class Carrega extends Vehiculo {

	protected int PMA;
	final protected double PRECIOCARREGA = 20;
	
	public int getPMA() {
		return PMA;
	}

	public void setPMA(int pMA) {
		PMA = pMA;
	}

	public double getPRECIOCARREGA() {
		return PRECIOCARREGA;
	}

	public Carrega() {
		super();
	}
	
	public Carrega(String matricula, int places, int PMA) {
		super(matricula,places);
		this.PMA = PMA;
	}
	
	public abstract void obtenerPrecio(int dias);
}

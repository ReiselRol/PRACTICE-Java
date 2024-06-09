package GestionadorVehiculo;

public class Camiones extends Carrega{

	private double PRECIOFIJO = 40;
	
	public Camiones () {
		super();
	}
	
	public Camiones (String matricula, int plazas, int PMA) {
		super(matricula, plazas, PMA);
	}
	
	public void obtenerPrecio (int dias) {
		
		double precioTotal = PMA * PRECIOCARREGA + dias * PRECIODIA + PRECIOFIJO;
		String [] datosCoche = {"Matricula : " + getMatricula(), "Plazas: " + getPlaces(), "PMA: " +  getPMA(), "Dias usados: " + dias, "Importe total: " + precioTotal};
		I.printListAdv(datosCoche, 5);
		
	}
	
}

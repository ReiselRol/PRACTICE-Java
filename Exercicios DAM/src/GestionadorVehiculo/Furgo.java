package GestionadorVehiculo;

public class Furgo extends Carrega{
	
	public Furgo () {
		super();
	}
	
	public Furgo (String matricula, int plazas, int PMA) {
		super(matricula, plazas, PMA);
	}
	
	public void obtenerPrecio (int dias) {
		
		double precioTotal = PMA * PRECIOCARREGA + dias * PRECIODIA;
		String [] datosCoche = {"Matricula : " + getMatricula(), "Plazas: " + getPlaces(), "PMA: " +  getPMA(), "Dias usados: " + dias, "Importe total: " + precioTotal};
		I.printListAdv(datosCoche, 5);
		
	}
	
}

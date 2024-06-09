package GestionadorVehiculo;

public class Coche extends Persones {

	final private double PRECIOCOCHE = PRECIODIA + 1.5;
	
	public Coche () {
		super();
	}
	
	public Coche (String matricula, int plazas) {
		super(matricula,plazas);
	}
	
	public void obtenerPrecio (int dias) {
		
		double precioTotal = PRECIOCOCHE * dias;
		String [] datosCoche = {"Matricula : " + getMatricula(), "Plazas: " + getPlaces(), "Dias usados: " + dias, "Importe total: " + precioTotal};
		I.printListAdv(datosCoche, 5);
		
	}

}

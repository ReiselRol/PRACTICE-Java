package GestionadorVehiculo;

public class Bus extends Persones {

	final private double PRECIOCOCHE = PRECIODIA + 1.5;
	final private double PRECIOPERSONA = 2;
	
	public Bus () {
		super();
	}
	
	public Bus (String matricula, int plazas) {
		super(matricula,plazas);
	}
	
	public void obtenerPrecio (int dias) {
		
		double precioTotal = (PRECIOCOCHE * dias) + places * PRECIOPERSONA;
		String [] datosCoche = {"Matricula : " + getMatricula(), "Plazas: " + getPlaces(), "Dias usados: " + dias, "Importe total: " + precioTotal};
		I.printListAdv(datosCoche, 5);
		
	}
	
}

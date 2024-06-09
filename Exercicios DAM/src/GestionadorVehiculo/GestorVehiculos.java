package GestionadorVehiculo;

import java.util.ArrayList;

public class GestorVehiculos {

	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	public GestorVehiculos() {
		
	}

	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	public static void seleccionarOpcion (int opcion) {
		
		GestorVehiculos i = new GestorVehiculos();
		
		if (opcion == 1) i.añadirVehiculo();
		else i.enseñarVehiculo();
		
	}
	
	private void añadirVehiculo() {
		
		final String [] lista = {"Coche","Bus","Furgo","Camion"};
		final String titulo = I.title("Añadir Vehiculo");
		
		I.printAdv(titulo, 6);
		I.printAdv("Escribe el numero del que quieres crear", 5, titulo.length());
		I.printMenu(lista, 16);
		int opcion = I.qInt(5,1,lista.length);
		
		if (opcion == 1) {
			
			I.print("Introduce una Matricula:",5);
			String Matricula = I.qString(5);
			I.print("Introduce numero de plazas:",5);
			int Places = I.qInt(5);
			
			Coche vehiculo = new Coche(Matricula,Places);
			vehiculos.add(vehiculo);

			
		}
		else if (opcion == 2) {
			
			I.print("Introduce una Matricula:",5);
			String Matricula = I.qString(5);
			I.print("Introduce numero de plazas:",5);
			int Places = I.qInt(5);
			
			Bus vehiculo = new Bus(Matricula,Places);
			vehiculos.add(vehiculo);
			
		}
		else if (opcion == 3) {
			
			I.print("Introduce una Matricula:",5);
			String Matricula = I.qString(5);
			I.print("Introduce numero de plazas:",5);
			int Places = I.qInt(5);
			I.print("Introduce PMA:",5);
			int PMA = I.qInt(5);
			
			Furgo vehiculo = new Furgo(Matricula,Places,PMA);
			vehiculos.add(vehiculo);
			
		}
		else {
			
			I.print("Introduce una Matricula:",5);
			String Matricula = I.qString(5);
			I.print("Introduce numero de plazas:",5);
			int Places = I.qInt(5);
			I.print("Introduce PMA:",5);
			int PMA = I.qInt(5);
			
			Camiones vehiculo = new Camiones(Matricula,Places,PMA);
			vehiculos.add(vehiculo);
			
		}
		
		
	}
	
	private void enseñarVehiculo () {
		
		if (vehiculos.size() != 0) {
			
			String [] matriculas = new String [vehiculos.size()];
			for (int i = 0; i < vehiculos.size(); i++) {
				matriculas[i] = (vehiculos.get(i).getMatricula());
			}
			
			I.printMenu(matriculas, 5);
			I.print("Selecciona uno de los coches", 5);
			int cocheSeleccionado = I.qInt(5,1,vehiculos.size());
			I.print("Introduce una cantidad de dias", 5);
			int dias = I.qInt(5);
			vehiculos.get(cocheSeleccionado).obtenerPrecio(dias);
			
		}
		else I.print("No hay Vehiculos", 5);
		
	}
	
}

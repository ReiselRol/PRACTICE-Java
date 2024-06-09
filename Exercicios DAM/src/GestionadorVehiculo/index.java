package GestionadorVehiculo;

public class index {

	public static void main(String[] args) {
		
		index i = new index();
		i.principal();
	}
	public void principal () {
		
		String [] menu = {"Añadir vehículo","Obtener precio de alquiler de un vehículo concreto","Salir"};
		int opcion;
		
		do {
			
			GestorVehiculos gestorVehiculos = new GestorVehiculos();
			I.printMenu(menu, 5);
			opcion = I.qInt(5, 1, 3);
			if (opcion != 3) gestorVehiculos.seleccionarOpcion(opcion);
			
		} while (opcion != 3);
		
	}

}

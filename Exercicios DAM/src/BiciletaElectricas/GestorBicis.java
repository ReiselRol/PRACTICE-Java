package BiciletaElectricas;

public class GestorBicis {
	
	public static void main(String[] args) throws InterruptedException {
		
		GestorBicis a = new GestorBicis();
		a.principal();
	}
	
	public void principal() throws InterruptedException {
		
		Tienda tienda = new Tienda();
		int opcion = 0;
		boolean cerrarPrograma = false;
		
		do {
			
			opcion = Interfaz.Menu();
			
			if (opcion == 1) {
				
				Interfaz.AltaTienda(1);
				tienda.setNombre(Engine.entrarString());
				Interfaz.AltaTienda(2);
				tienda.setDireccion(Engine.entrarString());
				
			}
			else if (opcion == 2) {
				
				if( !( tienda.getNombre() == null ) ) Interfaz.InfoTienda(tienda);
				else Interfaz.ErrorInfoTienda();
				
			}
			
		} while (cerrarPrograma == false);
			
	}

}

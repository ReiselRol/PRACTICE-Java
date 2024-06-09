package BiciletaElectricas;

public class Interfaz {
	
	public static int Menu() {
		
		final int MAX = 6;
		final int MIN = 1;
		
		System.out.println("\n     ________________________________________________________________"
						 + "\n     |_|                                                          |_|"
						 + "\n     |                                                              |"
					     + "\n     |          G E S T O R   D E   B I C I C L E T A S             |"
						 + "\n     |_                                                            _|"
						 + "\n     |_|__________________________________________________________|_|"
						 + "\n     |_|                                                          |_|"
						 + "\n     |                                                              |"
						 + "\n     |      Ingresa un valor para escoger una de las opciones       |"
						 + "\n     |      siguientes:                                             |"
						 + "\n     |                                                              |"
						 + "\n     |      1 .- Alta Tienda.                                       |"
						 + "\n     |      1 .- Ver informacion Tienda.                            |"
						 + "\n     |      3 .- Alta de Bicicleta.                                 |"
						 + "\n     |      4 .- Alquilar Bicicleta.                                |"
						 + "\n     |      5 .- Mostrar Informacion Bicicleta.                     |"
						 + "\n     |      6 .- Devolver Bicicleta.                                |"
						 + "\n     |_                                                            _|"
						 + "\n     |_|__________________________________________________________|_|");
		
		int opciones = Engine.entrarInt(MAX, MIN);
		return opciones;
	}
	
	public static void AltaTienda(int parteInterfaz) {
		
		if (parteInterfaz == 1) {
			
			System.out.println("\n     ________________________________________________________________"
					         + "\n     |_|                                                          |_|"
					         + "\n     |                                                              |"
					         + "\n     |                    A L T A   T I E N D A                     |"
					         + "\n     |_                                                            _|"
					         + "\n     |_|__________________________________________________________|_|"
					         + "\n     |_|                                                          |_|"
					         + "\n     |                                                              |"
					         + "\n     |      Ingresa el nombre de la tienda:                         |"
					         + "\n     |_                                                            _|"
					         + "\n     |_|__________________________________________________________|_|");
		}
		else if (parteInterfaz == 2) {
			
			System.out.println("\n     ________________________________________________________________"
					         + "\n     |_|                                                          |_|"
					         + "\n     |                                                              |"
					         + "\n     |                    A L T A   T I E N D A                     |"
					         + "\n     |_                                                            _|"
					         + "\n     |_|__________________________________________________________|_|"
					         + "\n     |_|                                                          |_|"
					         + "\n     |                                                              |"
					         + "\n     |      Ingresa la direccion de la tienda:                      |"
					         + "\n     |_                                                            _|"
					         + "\n     |_|__________________________________________________________|_|");
		}
		
	}
	public static void InfoTienda( Tienda tienda ) throws InterruptedException {
		
		final int TOTALESPACIOSNOMBRE = 48;
		final int TOTALESPACIOSDIRECCION = 45;
		
		int longitudNombre = TOTALESPACIOSNOMBRE - ( tienda.getNombre().length() );
		int longitudDireccion = TOTALESPACIOSDIRECCION - ( tienda.getDireccion().length() );
		
		System.out.println("\n     ________________________________________________________________"
		                 + "\n     |_|                                                          |_|"
		                 + "\n     |                                                              |"
		                 + "\n     |                    I N F O   T I E N D A                     |"
		                 + "\n     |_                                                            _|"
		                 + "\n     |_|__________________________________________________________|_|"
		                 + "\n     |_|                                                          |_|"
		                 + "\n     |                                                              |");
		System.out.print(  "     |      Nombre: " + tienda.getNombre());
		for (int ciclo = 0; ciclo < longitudNombre; ciclo++) System.out.print(" ");
		System.out.print("|");
		System.out.println("\n     |                                                              |");
		System.out.print(  "     |      Direccion: " + tienda.getDireccion());
		for (int ciclo = 0; ciclo < longitudDireccion; ciclo++) System.out.print(" ");
		System.out.print("|");
		System.out.println("\n     |_                                                            _|"
                         + "\n     |_|__________________________________________________________|_|");
		
		Thread.sleep(2000);
		
	}
	public static void ErrorInfoTienda() throws InterruptedException {
		
		System.out.println("\n     ________________________________________________________________"
                		 + "\n     |_|                                                          |_|"
                		 + "\n     |                                                              |"
                		 + "\n     |            E R R O R    I N F O   T I E N D A                |"
                		 + "\n     |_                                                            _|"
                		 + "\n     |_|__________________________________________________________|_|"
                		 + "\n     |_|                                                          |_|"
                		 + "\n     |                                                              |"
                		 + "\n     |       No hay ninguna tienda que mostrar, crea una primero    |"
                		 + "\n     |_                                                            _|"
				         + "\n     |_|__________________________________________________________|_|");
		
		Thread.sleep(2000);
		
	}

}

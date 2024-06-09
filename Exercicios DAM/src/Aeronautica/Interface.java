package Aeronautica;

import java.util.ArrayList;

public class Interface {

	public static int menuControladorAereo() {
		
		final int MAX = 7;
		final int MIN = 1;
		
		System.out.println("\n     ______________________________________________________________"
						 + "\n     |_|                                                        |_|"
						 + "\n     |                                                            |"
						 + "\n     |       C O N T R O L    D E    A E R O P U E R T O S        |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|"
						 + "\n     |_|                                                        |_|"
						 + "\n     |                                                            |"
						 + "\n     |            C O N T R O L A D O R    A E R E O              |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|"
						 + "\n     |_|                                                        |_|"
						 + "\n     |                                                            |"
						 + "\n     |       Selecciona un de las siguientes opciones para        |"
						 + "\n     |       esa funcion:                                         |"
						 + "\n     |                                                            |"
						 + "\n     |       1.- Añadir avion en espacio aereo.                   |"
						 + "\n     |       2.- Añadir avion en espacio aereo (Automatico).      |"
						 + "\n     |       3.- Gestionar un avion en el espacio aereo.          |"
						 + "\n     |       4.- Mostrar el espacio Aereo actual.                 |"
						 + "\n     |       5.- Cifrar aviones de combate.                       |"
						 + "\n     |       6.- Descifrar aviones de combate.                    |"
						 + "\n     |       7.- Volver a menu principal.                         |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		
		int opcion = Engine.entradaInt(MAX, MIN);
		return opcion;
		
	}
	public static int menuPrincipal() {
		
		final int MAX = 3;
		final int MIN = 1;
		
		System.out.println("\n     ______________________________________________________________"
						 + "\n     |_|                                                        |_|"
						 + "\n     |                                                            |"
						 + "\n     |       C O N T R O L    D E    A E R O P U E R T O S        |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|"
						 + "\n     |_|                                                        |_|"
						 + "\n     |                                                            |"
						 + "\n     |       Selecciona un de las siguientes opciones para        |"
						 + "\n     |       ver ese menu:                                        |"
						 + "\n     |                                                            |"
						 + "\n     |       1.- Controlador Aereo.                               |"
						 + "\n     |       2.- Controlador de Aviones.                          |"
						 + "\n     |       3.- Salir                                            |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");

		int opcion = Engine.entradaInt(MAX, MIN);
		return opcion;
		
	}
	public static int menuControladorAviones(boolean esCombate) {
		
		final int MAX = 12;
		final int MIN = 1;
		if (esCombate)
		System.out.println("\n     ______________________________________________________________"
						 + "\n     |_|                                                        |_|"
						 + "\n     |                                                            |"
						 + "\n     |       C O N T R O L    D E    A E R O P U E R T O S        |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|"
						 + "\n     |_|                                                        |_|"
						 + "\n     |                                                            |"
						 + "\n     |       C O N T R O L A D O R    D E    A V I O N E S        |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|"
						 + "\n     |_|                                                        |_|"
						 + "\n     |                                                            |"
						 + "\n     |       Selecciona un de las siguientes opciones para        |"
						 + "\n     |       esa funcion:                                         |"
						 + "\n     |                                                            |"
						 + "\n     |       1.- Seleccionar Avion.                               |"
						 + "\n     |       2.- Encender Motores.                                |"
						 + "\n     |       3.- Apagar Motores.                                  |"
						 + "\n     |       4.- Accelerar.                                       |"
						 + "\n     |       5.- Frenar.                                          |"
						 + "\n     |       6.- Cojer Altura.                                    |"
						 + "\n     |       7.- Bajar Altura.                                    |"
						 + "\n     |       8.- Activar/Desactivar Tren de Aterrizage.           |"
						 + "\n     |       9.- Posicionar X / Y.                                |"
						 + "\n     |       10.- Disparar a Avion comercial sospechoso.          |"
						 + "\n     |       11.- Deseleccionar Avion.                            |"
						 + "\n     |       12.- Volver a menu principal.                        |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		else
		System.out.println("\n     ______________________________________________________________"
					     + "\n     |_|                                                        |_|"
					     + "\n     |                                                            |"
					 	 + "\n     |       C O N T R O L    D E    A E R O P U E R T O S        |"
					 	 + "\n     |_                                                          _|"
					 	 + "\n     |_|________________________________________________________|_|"
					 	 + "\n     |_|                                                        |_|"
					 	 + "\n     |                                                            |"
					 	 + "\n     |       C O N T R O L A D O R    D E    A V I O N E S        |"
					 	 + "\n     |_                                                          _|"
					 	 + "\n     |_|________________________________________________________|_|"
					 	 + "\n     |_|                                                        |_|"
					 	 + "\n     |                                                            |"
					 	 + "\n     |       Selecciona un de las siguientes opciones para        |"
					 	 + "\n     |       esa funcion:                                         |"
					 	 + "\n     |                                                            |"
					 	 + "\n     |       1.- Seleccionar Avion.                               |"
					 	 + "\n     |       2.- Encender Motores.                                |"
					 	 + "\n     |       3.- Apagar Motores.                                  |"
					 	 + "\n     |       4.- Accelerar.                                       |"
					 	 + "\n     |       5.- Frenar.                                          |"
					 	 + "\n     |       6.- Cojer Altura.                                    |"
					 	 + "\n     |       7.- Bajar Altura.                                    |"
					 	 + "\n     |       8.- Activar/Desactivar Tren de Aterrizage.           |"
					 	 + "\n     |       9.- Posicionar X / Y.                                |"
					 	 + "\n     |       10.- Deseleccionar Avion.                            |"
					 	 + "\n     |       11.- Volver a menu principal.                        |"
					 	 + "\n     |_                                                          _|"
					 	 + "\n     |_|________________________________________________________|_|");
		
		int opcion = Engine.entradaInt(MAX, MIN);
		return opcion;
	}
	public static String preguntarEsDeCombate () {
		
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |            C O N T R O L A D O R    A E R E O              |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       A Ñ A D I R    A V I O N    A    E S P A C I O       |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       El avion que deseas añadir es de combate?            |"
				 		 + "\n     |       (Si/No)                                              |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		
		String respuesta = Engine.entradaString();
		return respuesta;
		
	}
	public static String preguntarMatricula () {
		
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |            C O N T R O L A D O R    A E R E O              |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       A Ñ A D I R    A V I O N    A    E S P A C I O       |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       Introduzca la matricula del avion (ejemplo C-FURB)   |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		
		String respuesta = Engine.entradaString();
		return respuesta;
		
	}
	public static String preguntarMarca () {
		
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |            C O N T R O L A D O R    A E R E O              |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       A Ñ A D I R    A V I O N    A    E S P A C I O       |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       Introduzca la marca del avion:                       |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		
		String respuesta = Engine.entradaString();
		return respuesta;
		
	}
	public static String preguntarModelo () {
		
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |            C O N T R O L A D O R    A E R E O              |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       A Ñ A D I R    A V I O N    A    E S P A C I O       |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       Introduzca el modelo del avion:                      |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		
		String respuesta = Engine.entradaString();
		return respuesta;
		
	}
	public static int preguntarCapacidad () {
		
		
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |            C O N T R O L A D O R    A E R E O              |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       A Ñ A D I R    A V I O N    A    E S P A C I O       |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       Introduzca la capacidad del avion (sin contar        |"
				 		 + "\n     |       a los tripulantes).                                  |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		
		int opcion = Engine.entradaInt();
		return opcion;
		
	}
	public static int preguntarTripulantes () {
		
		
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |            C O N T R O L A D O R    A E R E O              |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       A Ñ A D I R    A V I O N    A    E S P A C I O       |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       Introduzca la cantidad de tripulantes del avion      |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		
		int opcion = Engine.entradaInt();
		return opcion;
		
	}
	public static String preguntarOrigen () {
		
		final int MAX = 4;
		final int MIN = 1;
		final String [] SITIOS = {"BCN", "MDR", "FRN", "ITL"};
		
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |            C O N T R O L A D O R    A E R E O              |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       A Ñ A D I R    A V I O N    A    E S P A C I O       |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       Introduzca un numero para fijar origen:              |"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       1.- BCN (Barcelona)                                  |"
				 		 + "\n     |       2.- MDR (Madrid)                                     |"
				 		 + "\n     |       3.- FRN (Francia)                                    |"
				 		 + "\n     |       4.- ITL (Italia)                                     |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		
		int opcion = Engine.entradaInt(MAX, MIN);
		return SITIOS[opcion - 1];
	}
	public static String preguntarDestino (String origen) {
		
		final int MAX = 4;
		final int MIN = 1;
		int elOrigen = 0;
		int opcion = 0;
		final String [] SITIOS = {"BCN", "MDR", "FRN", "ITL"};
		
		for (elOrigen = 0; elOrigen < SITIOS.length; elOrigen++) {
			
			if (SITIOS[elOrigen].equalsIgnoreCase(origen)) break;
		}
		elOrigen ++;
		
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |            C O N T R O L A D O R    A E R E O              |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       A Ñ A D I R    A V I O N    A    E S P A C I O       |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       Introduzca un numero para fijar origen:              |"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       1.- BCN (Barcelona)                                  |"
				 		 + "\n     |       2.- MDR (Madrid)                                     |"
				 		 + "\n     |       3.- FRN (Francia)                                    |"
				 		 + "\n     |       4.- ITL (Italia)                                     |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		
		do {
			
			opcion = Engine.entradaInt(MAX, MIN);
			if (opcion == elOrigen) System.err.print("\n [E] El oigen y el destino no pueden coencidir, porfabor, elije un destino que no sea " + origen);
			
		} while (opcion == elOrigen); 
		return SITIOS[opcion - 1];
	}
	public static int preguntarAutonomia () {
		
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |            C O N T R O L A D O R    A E R E O              |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       A Ñ A D I R    A V I O N    A    E S P A C I O       |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       Introduzca la cantidad de kilometros que el avion    |"
				 		 + "\n     |       tiene de autonomia:                                  |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		
		int opcion = Engine.entradaInt();
		return opcion;
		
	}
	public static int preguntarCordenadas (char letra) {
		
		System.out.println((letra == 'x') ?
						   "\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |            C O N T R O L A D O R    A E R E O              |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       A Ñ A D I R    A V I O N    A    E S P A C I O       |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       Introduzca las cordenadas (en metros) de la X:       |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|"
						 :
						   "\n     ______________________________________________________________"
						 + "\n     |_|                                                        |_|"
						 + "\n     |                                                            |"
						 + "\n     |            C O N T R O L A D O R    A E R E O              |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|"
						 + "\n     |_|                                                        |_|"
						 + "\n     |                                                            |"
						 + "\n     |       A Ñ A D I R    A V I O N    A    E S P A C I O       |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|"
						 + "\n     |_|                                                        |_|"
						 + "\n     |                                                            |"
						 + "\n     |       Introduzca las cordenadas (en metros) de la Y:       |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|"	);
		
		int opcion = Engine.entradaInt();
		return opcion;
		
	}
	public static int preguntarVelocidad () {
		
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |            C O N T R O L A D O R    A E R E O              |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       A Ñ A D I R    A V I O N    A    E S P A C I O       |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       A que velocidad esta el avion (en km/h):             |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		
		int opcion = Engine.entradaInt();
		return opcion;
		
	}
	public static int preguntarMisiles () {
		
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |            C O N T R O L A D O R    A E R E O              |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       A Ñ A D I R    A V I O N    A    E S P A C I O       |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       Cuantos misiles tiene el avion?                      |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		
		int opcion = Engine.entradaInt();
		return opcion;
		
	}
	public static String preguntarMotores () {
		
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |            C O N T R O L A D O R    A E R E O              |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       A Ñ A D I R    A V I O N    A    E S P A C I O       |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       Los motores del avion estan encendidos?              |"
				 		 + "\n     |       (Si/No)                                              |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		
		String respuesta = Engine.entradaString();
		return respuesta;
		
	}
	public static String preguntarTrenAterrizage () {
		
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |            C O N T R O L A D O R    A E R E O              |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       A Ñ A D I R    A V I O N    A    E S P A C I O       |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       El tren de aterrizage esta encendido?                |"
				 		 + "\n     |       (Si/No)                                              |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		
		String respuesta = Engine.entradaString();
		return respuesta;
		
	}
	public static int preguntarDistancia () {
		
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |            C O N T R O L A D O R    A E R E O              |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       A Ñ A D I R    A V I O N    A    E S P A C I O       |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       A cuanta distancia alcanza el avion a disparar?      |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		
		int opcion = Engine.entradaInt();
		return opcion;
		
	}
	public static String preguntarAliado () {
		
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |            C O N T R O L A D O R    A E R E O              |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       A Ñ A D I R    A V I O N    A    E S P A C I O       |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       Este avion es un avion aliado?                       |"
				 		 + "\n     |       (Si/No)                                              |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		
		String respuesta = Engine.entradaString();
		return respuesta;
		
	}
	public static void noHayAviones () {
		
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       C O N T R O L    D E    A E R O P U E R T O S        |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       C O N T R O L A D O R    D E    A V I O N E S        |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       No hay ningun avion, porfabor ves al menu de         |"
				 		 + "\n     |       Cotrolador Aereo y introduce un avion.               |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|");
		
	}
	public static void noHayMatricula () {
		
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       C O N T R O L    D E    A E R O P U E R T O S        |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       C O N T R O L A D O R    D E    A V I O N E S        |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       No hay ningun avion con esa matricula, Porfabor      |"
				 		 + "\n     |       Cotrolador Aereo y vuelve a introducir bien la       |"
				 		 + "\n     |       matricula del avion que deseas controlar.            |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|");
	}
	public static void noHayAvionSeleccionado () {
		
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       C O N T R O L    D E    A E R O P U E R T O S        |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       C O N T R O L A D O R    D E    A V I O N E S        |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       No hay ningun avion seleccionado, Porfabor           |"
				 		 + "\n     |       seleccione un avion antes  de controlarlo.           |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|");
	
	}
	public static String preguntarEncenderMotores () {
		
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       C O N T R O L    D E    A E R O P U E R T O S        |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       C O N T R O L A D O R    D E    A V I O N E S        |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       Quieres encender los motores del avion?              |"
				 		 + "\n     |       (Si/No)                                              |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		
		String respuesta = Engine.entradaString();
		return respuesta;
		
	}
	public static String preguntarApagarMotores () {
		
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       C O N T R O L    D E    A E R O P U E R T O S        |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       C O N T R O L A D O R    D E    A V I O N E S        |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       Quieres apagar los motores del avion?                |"
				 		 + "\n     |       (Si/No)                                              |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		
		String respuesta = Engine.entradaString();
		return respuesta;
		
	}
	public static int preguntarCuantaVelocidadAccelerar () {
		
		final int MIN = 0;
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       C O N T R O L    D E    A E R O P U E R T O S        |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       C O N T R O L A D O R    D E    A V I O N E S        |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       Cuanta velocidad quieres añadir al avion (km/h)?     |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		
		int opcion = Engine.entradaInt(MIN);
		return opcion;
		
	}
	public static int preguntarCuantaVelocidadFrenar () {
		
		final int MIN = 0;
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       C O N T R O L    D E    A E R O P U E R T O S        |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       C O N T R O L A D O R    D E    A V I O N E S        |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       Cuanta velocidad quieres reducir al avion (km/h)?    |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		
		int opcion = Engine.entradaInt(MIN);
		return opcion;
		
	}
	public static int preguntarCuantaAlturaAscender () {
		
		final int MIN = 0;
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       C O N T R O L    D E    A E R O P U E R T O S        |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       C O N T R O L A D O R    D E    A V I O N E S        |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       Cuanta altura quieres ascender al avion (en metros)? |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		
		int opcion = Engine.entradaInt(MIN);
		return opcion;
		
	}
	public static int preguntarAltura () {
		
		final int MIN = 0;
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       C O N T R O L    D E    A E R O P U E R T O S        |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       C O N T R O L A D O R    D E    A V I O N E S        |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       Cuanta altura esta el avion (en metros)?             |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		
		int opcion = Engine.entradaInt(MIN);
		return opcion;
		
	}
	public static int preguntarCuantaAlturaDescender () {
		
		final int MIN = 0;
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       C O N T R O L    D E    A E R O P U E R T O S        |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       C O N T R O L A D O R    D E    A V I O N E S        |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       Cuanta altura quieres desascender                    |"
				 		 + "\n     |       al avion (en metros)?                                |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		
		int opcion = Engine.entradaInt(MIN);
		return opcion;
		
	}
	public static String preguntarTrenAterrijaze () {
		
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       C O N T R O L    D E    A E R O P U E R T O S        |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       C O N T R O L A D O R    D E    A V I O N E S        |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       Que quieres hacer con el tren de aterrizage?         |"
				 		 + "\n     |       Escriba una de las siguientes:                       |"
				 		 + "\n     |       (Encender/Apagar)                                    |"
						 + "\n     |_                                                          _|"
						 + "\n     |_|________________________________________________________|_|");
		
		String respuesta = Engine.entradaString();
		return respuesta;
		
	}
	
	private static void mostrarApartadoAvion(String palabra, int longitudMaxima) {
		System.out.print("  " + palabra);
		for (int i = 0; i < longitudMaxima + 1 - (palabra).length(); i ++) System.out.print(" ");
		System.out.print("  |");
	}
	
	public static void mostrarAviones(ArrayList<Avion> aviones) {
		
		if (aviones.size() != 0) {
			
			final String TITULO = "          C O N T R O L A D O R    A E R E O            ";
			final String SUBTITULO = "             M O S T R A R   A V I O N E S              ";
			final String AVIONPALABRA = "AVION ";
			final String TAPACATEGORIAS = "____________________";
			final String LATERALSUPERIORCATEGORIAS = "|_|               |_";
			final String LATERALCATEGORIAS = "|                   ";
			final String LATERALINFERIORCATEGORIAS = "|_                 _";
			final String INFERIORCATEGORIAS = "|_|_______________|_";
			final String LETRASDECATEGORIAS = "| CATEGORIAS AVIONES";
			final String LETRASAVIONES = "|      Aviones:     ";
			final String LETRASDEMARCAS = "|      Marcas:      ";
			final String LETRASDEMODELOS = "|      Modelos:     ";
			final String LETRASDEMATRICU = "|      Matricula:   ";
			final String LETRASX = "|      X:           ";
			final String LETRASY = "|      Y:           ";
			final String LETRASALTURA = "|      Altura:      ";
			final String LETRASVELOCIDAD = "|      Velocidad:   ";
			final String LETRASTREN = "|      Tren Aterr:  ";
			final String LETRASMOTORES = "|      Motores:     ";
			final String LETRASORIGEN = "|      Origen:      ";
			final String LETRASDESTINO = "|      Destino:     ";
			final String CATEGORIAVACIO = "                    ";
			final int bordes = 5;
			String palabra = "";
			
			int longuitudCaracteresMax = Engine.calcularLongMaxString(aviones);
			int columna = longuitudCaracteresMax + bordes;
			longuitudCaracteresMax = ((longuitudCaracteresMax % 2 == 0) ? longuitudCaracteresMax : longuitudCaracteresMax + 1) + 2;
			int loguitudTotal =  ((columna * aviones.size()) + 1 > TITULO.length() + bordes + 1) ? (columna + 3) * aviones.size() + 1 : TITULO.length() + bordes + 1;
			
				//////////////////////////////////////////////////Titulo//////////////////////////////////////////////////////////////
				
				System.out.print("\n     " + CATEGORIAVACIO);
				for (int i = 0; i < loguitudTotal; i ++) System.out.print("_");
				System.out.print("     ");
				
				System.out.print("\n     " + CATEGORIAVACIO + "|_|");
				for (int i = 0; i < loguitudTotal - (bordes + 1) ; i ++) System.out.print(" ");
				System.out.print("|_|");
				
				System.out.print("\n     " + CATEGORIAVACIO + "|  ");
				for (int i = 0; i < loguitudTotal - (bordes + 1) ; i ++) System.out.print(" ");
				System.out.print("  |");
				
				System.out.print("\n     " + CATEGORIAVACIO + "|");
					
				int espaciosLaterales = (loguitudTotal - TITULO.length() - 2);
				boolean espaciosLateralesPares = ( espaciosLaterales % 2 == 0) ? true : false;
				
				if (espaciosLateralesPares) {
					
					for (int i = 0; i < espaciosLaterales / 2 ; i ++) System.out.print(" ");
					System.out.print(TITULO);
					for (int i = 0; i < espaciosLaterales / 2 ; i ++) System.out.print(" ");
					
				}
				else {
					
					for (int i = 0; i < espaciosLaterales / 2 ; i ++) System.out.print(" ");
					System.out.print(TITULO);
					for (int i = 0; i < (espaciosLaterales / 2) + 1 ; i ++) System.out.print(" ");
					
				}
					
				System.out.print("|");
				
				System.out.print("\n     " + CATEGORIAVACIO + "|_ ");
				for (int i = 0; i < loguitudTotal - (bordes + 1) ; i ++) System.out.print(" ");
				System.out.print(" _|");
				
				System.out.print("\n     " + TAPACATEGORIAS + "|_|");
				for (int i = 0; i < loguitudTotal - (bordes + 1) ; i ++) System.out.print("_");
				System.out.print("|_|");
				
				////////////////////////////////////////////Sub-Titulo////////////////////////////////////////////////////////////////
				
				System.out.print("\n     " + LATERALSUPERIORCATEGORIAS + "|_|");
				for (int i = 0; i < loguitudTotal - (bordes + 1) ; i ++) System.out.print(" ");
				System.out.print("|_|");
				
				System.out.print("\n     "+ LATERALCATEGORIAS+"|  ");
				for (int i = 0; i < loguitudTotal - (bordes + 1) ; i ++) System.out.print(" ");
				System.out.print("  |");
				
				System.out.print("\n     " + LETRASDECATEGORIAS + "|");
				
				espaciosLaterales = (loguitudTotal - TITULO.length() - 2);
				espaciosLateralesPares = ( espaciosLaterales % 2 == 0) ? true : false;
				
				if (espaciosLateralesPares) {
				
				for (int i = 0; i < espaciosLaterales / 2 ; i ++) System.out.print(" ");
				System.out.print(SUBTITULO);
				for (int i = 0; i < espaciosLaterales / 2 ; i ++) System.out.print(" ");
				
				}
				else {
				
				for (int i = 0; i < espaciosLaterales / 2 ; i ++) System.out.print(" ");
				System.out.print(SUBTITULO);
				for (int i = 0; i < (espaciosLaterales / 2) + 1 ; i ++) System.out.print(" ");
				
				}
				
				System.out.print("|");
				
				System.out.print("\n     "+LATERALINFERIORCATEGORIAS+"|_ ");
				for (int i = 0; i < loguitudTotal - (bordes + 1) ; i ++) System.out.print(" ");
				System.out.print(" _|");
				
				System.out.print("\n     "+INFERIORCATEGORIAS+"|_|");
				for (int i = 0; i < loguitudTotal - (bordes + 1) ; i ++) System.out.print("_");
				System.out.print("|_|");
				
					
													//AVIONES//
					
					System.out.print("\n     "+LATERALSUPERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_|");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print("|_|");
						
					}
					
					System.out.print("\n     "+LATERALCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						System.out.print("  ");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print("  |");
					}
					
					String avionNumero = AVIONPALABRA;
					
					System.out.print("\n     "+LETRASAVIONES+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						avionNumero = AVIONPALABRA + (columnas + 1);
						System.out.print("  " + avionNumero);
						for (int i = 0; i < longuitudCaracteresMax + 1 - avionNumero.length(); i ++) System.out.print(" ");
						System.out.print("  |");
					}
					
					System.out.print("\n     "+LATERALINFERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						System.out.print("_ ");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print(" _|");
					}
					
					System.out.print("\n     "+INFERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						System.out.print("_|");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print("_");
						System.out.print("|_|");
					}
					
					
																		//MARCA//
				
					System.out.print("\n     "+LATERALSUPERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						System.out.print("_|");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print("|_|");
					}
					
					System.out.print("\n     "+LATERALCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						System.out.print("  ");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print("  |");
					}
					
					System.out.print("\n     "+LETRASDEMARCAS+"|");
					
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						palabra = aviones.get(columnas).getMarca();
						if( !(aviones.get(columnas) instanceof Combate) ) mostrarApartadoAvion(palabra ,longuitudCaracteresMax);
						else {
							if (((Combate)aviones.get(columnas)).getEncriptado()) mostrarApartadoAvion("Encript" ,longuitudCaracteresMax);
							else mostrarApartadoAvion(palabra ,longuitudCaracteresMax);
						}
						
					}
	
					
					System.out.print("\n     "+LATERALINFERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						System.out.print("_ ");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print(" _|");
					}
					
					System.out.print("\n     "+INFERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						System.out.print("_|");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print("_");
						System.out.print("|_|");
					}
					
										//MODELO//
										
					System.out.print("\n     "+LATERALSUPERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_|");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print("|_|");
						
					}
					
					System.out.print("\n     "+LATERALCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("  ");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print("  |");
						
					}
					
					System.out.print("\n     "+LETRASDEMODELOS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						palabra = aviones.get(columnas).getModelo();
						if( !(aviones.get(columnas) instanceof Combate) ) mostrarApartadoAvion(palabra ,longuitudCaracteresMax);
						else {
							if (((Combate)aviones.get(columnas)).getEncriptado()) mostrarApartadoAvion("Encript" ,longuitudCaracteresMax);
							else mostrarApartadoAvion(palabra ,longuitudCaracteresMax);
						}
						
					}
					
					System.out.print("\n     "+LATERALINFERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_ ");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print(" _|");
						
					}
					
					System.out.print("\n     "+INFERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_|");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print("_");
						System.out.print("|_|");
						
					}
					
													//MATRICULA//
					
					System.out.print("\n     "+LATERALSUPERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_|");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print("|_|");
						
					}
					
					System.out.print("\n     "+LATERALCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("  ");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print("  |");
						
					}
					
					System.out.print("\n     "+LETRASDEMATRICU+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						palabra = aviones.get(columnas).getMatricula();
						if( !(aviones.get(columnas) instanceof Combate) ) mostrarApartadoAvion(palabra ,longuitudCaracteresMax);
						else {
							if (((Combate)aviones.get(columnas)).getEncriptado()) mostrarApartadoAvion("Encript" ,longuitudCaracteresMax);
							else mostrarApartadoAvion(palabra ,longuitudCaracteresMax);
						}
						
					}
					
					System.out.print("\n     "+LATERALINFERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_ ");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print(" _|");
						
					}
					
					System.out.print("\n     "+INFERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_|");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print("_");
						System.out.print("|_|");
						
					}
					
											//X//
					
					System.out.print("\n     "+LATERALSUPERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_|");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print("|_|");
						
					}
					
					System.out.print("\n     "+LATERALCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("  ");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print("  |");
						
					}
					
					System.out.print("\n     "+LETRASX+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						palabra = String.valueOf(aviones.get(columnas).getCordenadas().getX());
						if( !(aviones.get(columnas) instanceof Combate) ) mostrarApartadoAvion(palabra ,longuitudCaracteresMax);
						else {
							if (((Combate)aviones.get(columnas)).getEncriptado()) mostrarApartadoAvion("Encript" ,longuitudCaracteresMax);
							else mostrarApartadoAvion(palabra ,longuitudCaracteresMax);
						}
						
					}
					
					System.out.print("\n     "+LATERALINFERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_ ");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print(" _|");
						
					}
					
					System.out.print("\n     "+INFERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_|");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print("_");
						System.out.print("|_|");
						
					}
					
						//Y//
						
					System.out.print("\n     "+LATERALSUPERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_|");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print("|_|");
						
					}
					
					System.out.print("\n     "+LATERALCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("  ");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print("  |");
						
					}
					
					System.out.print("\n     "+LETRASY+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						palabra = String.valueOf(aviones.get(columnas).getCordenadas().getY());
						if( !(aviones.get(columnas) instanceof Combate) ) mostrarApartadoAvion(palabra ,longuitudCaracteresMax);
						else {
							if (((Combate)aviones.get(columnas)).getEncriptado()) mostrarApartadoAvion("Encript" ,longuitudCaracteresMax);
							else mostrarApartadoAvion(palabra ,longuitudCaracteresMax);
						}
						
					}
					
					System.out.print("\n     "+LATERALINFERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_ ");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print(" _|");
						
					}
					
					System.out.print("\n     "+INFERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
					System.out.print("_|");
					for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print("_");
					System.out.print("|_|");
					}
					
									//ALTURA//
					
					System.out.print("\n     "+LATERALSUPERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_|");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print("|_|");
						
					}
					
					System.out.print("\n     "+LATERALCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("  ");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print("  |");
						
					}
					
					System.out.print("\n     "+LETRASALTURA+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						palabra = String.valueOf(aviones.get(columnas).getCordenadas().getAltura());
						if( !(aviones.get(columnas) instanceof Combate) ) mostrarApartadoAvion(palabra ,longuitudCaracteresMax);
						else {
							if (((Combate)aviones.get(columnas)).getEncriptado()) mostrarApartadoAvion("Encript" ,longuitudCaracteresMax);
							else mostrarApartadoAvion(palabra ,longuitudCaracteresMax);
						}
						
					}
					
					System.out.print("\n     "+LATERALINFERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_ ");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print(" _|");
						
					}
					
					System.out.print("\n     "+INFERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_|");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print("_");
						System.out.print("|_|");
						
					}
					
						//VELOCIDAD//
					
					System.out.print("\n     "+LATERALSUPERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_|");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print("|_|");
						
					}
					
					System.out.print("\n     "+LATERALCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("  ");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print("  |");
						
					}
					
					System.out.print("\n     "+LETRASVELOCIDAD+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						palabra = String.valueOf(aviones.get(columnas).getVelocitat());
						if( !(aviones.get(columnas) instanceof Combate) ) mostrarApartadoAvion(palabra ,longuitudCaracteresMax);
						else {
							if (((Combate)aviones.get(columnas)).getEncriptado()) mostrarApartadoAvion("Encript" ,longuitudCaracteresMax);
							else mostrarApartadoAvion(palabra ,longuitudCaracteresMax);
						}
						
					}
					
					System.out.print("\n     "+LATERALINFERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_ ");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print(" _|");
						
					}
					
					System.out.print("\n     "+INFERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_|");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print("_");
						System.out.print("|_|");
						
					}
					
							//TREN ATERRIZAGE//
					
					System.out.print("\n     "+LATERALSUPERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_|");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print("|_|");
						
					}
					
					System.out.print("\n     "+LATERALCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("  ");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print("  |");
						
					}
					
					System.out.print("\n     "+LETRASTREN+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						palabra = (aviones.get(columnas).getTrenAterrizage() == true) ? "On" : "Off";
						if( !(aviones.get(columnas) instanceof Combate) ) mostrarApartadoAvion(palabra ,longuitudCaracteresMax);
						else {
							if (((Combate)aviones.get(columnas)).getEncriptado()) mostrarApartadoAvion("Encript" ,longuitudCaracteresMax);
							else mostrarApartadoAvion(palabra ,longuitudCaracteresMax);
						}
						
					}
					
					System.out.print("\n     "+LATERALINFERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_ ");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print(" _|");
						
					}
					
					System.out.print("\n     "+INFERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_|");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print("_");
						System.out.print("|_|");
						
					}
					
							//MOTORES//
					
					System.out.print("\n     "+LATERALSUPERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_|");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print("|_|");
						
					}
					
					System.out.print("\n     "+LATERALCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("  ");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print("  |");
						
					}
					
					System.out.print("\n     "+LETRASMOTORES+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						palabra = (aviones.get(columnas).getMotores() == true) ? "On" : "Off";
						if( !(aviones.get(columnas) instanceof Combate) ) mostrarApartadoAvion(palabra ,longuitudCaracteresMax);
						else {
							if (((Combate)aviones.get(columnas)).getEncriptado()) mostrarApartadoAvion("Encript" ,longuitudCaracteresMax);
							else mostrarApartadoAvion(palabra ,longuitudCaracteresMax);
						}
						
					}
					
					System.out.print("\n     "+LATERALINFERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_ ");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print(" _|");
						
					}
					
					System.out.print("\n     "+INFERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_|");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print("_");
						System.out.print("|_|");
						
					}
					
						//ORIGEN//
					
					System.out.print("\n     "+LATERALSUPERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_|");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print("|_|");
						
					}
					
					System.out.print("\n     "+LATERALCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("  ");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print("  |");
						
					}
					
					System.out.print("\n     "+LETRASORIGEN+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						palabra = aviones.get(columnas).getOrigen();
						if( !(aviones.get(columnas) instanceof Combate) ) mostrarApartadoAvion(palabra ,longuitudCaracteresMax);
						else {
							if (((Combate)aviones.get(columnas)).getEncriptado()) mostrarApartadoAvion("Encript" ,longuitudCaracteresMax);
							else mostrarApartadoAvion(palabra ,longuitudCaracteresMax);
						}
						
					}
					
					System.out.print("\n     "+LATERALINFERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_ ");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print(" _|");
						
					}
					
					System.out.print("\n     "+INFERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_|");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print("_");
						System.out.print("|_|");
						
					}
					
						//DESTINO//
					
					System.out.print("\n     "+LATERALSUPERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_|");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print("|_|");
						
					}
					
					System.out.print("\n     "+LATERALCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("  ");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print("  |");
						
					}
					
					System.out.print("\n     "+LETRASDESTINO+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						palabra = aviones.get(columnas).getDestino();
						if( !(aviones.get(columnas) instanceof Combate) ) mostrarApartadoAvion(palabra ,longuitudCaracteresMax);
						else {
							if (((Combate)aviones.get(columnas)).getEncriptado()) mostrarApartadoAvion("Encript" ,longuitudCaracteresMax);
							else mostrarApartadoAvion(palabra ,longuitudCaracteresMax);
						}
						
					}
					
					System.out.print("\n     "+LATERALINFERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_ ");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print(" ");
						System.out.print(" _|");
						
					}
					
					System.out.print("\n     "+INFERIORCATEGORIAS+"|");
					for (int columnas = 0; columnas < aviones.size(); columnas ++) {
						
						System.out.print("_|");
						for (int i = 0; i < longuitudCaracteresMax + 1; i ++) System.out.print("_");
						System.out.print("|_|");
						
					}
					
					System.out.println("\n");
					
					int incidencias = 0;
					
					System.out.println("     __________________________________________________________________________________________");
					System.out.println("     |_|                                                                                    |_|");
					System.out.println("     |                                                                                        |");
					
					String incidenciasTexto = "";
					
					for (int i = 0; i < aviones.size(); i++) {
						
						for (int j = 0; j < aviones.size(); j++) {
							
							if (i != j) {
								
								if (ControladorAeropuerto.estanCerca(aviones.get(i), aviones.get(j))) {
									incidenciasTexto = "Peligro de colision: " + aviones.get(i).getMatricula() + " y " + aviones.get(j).getMatricula() + " estan cerca, porfabor cambien rumbos";
									System.out.print("     |  " + incidenciasTexto);
									for (int espacios = 0; espacios < 84 - incidenciasTexto.length(); espacios ++) System.out.print(" ");
									System.out.print("  |\n");
									incidencias ++;
								}
								
							}
							
						}
						if (aviones.get(i).getMotores() == false && aviones.get(i).getCordenadas().getAltura() != 0) {
							incidenciasTexto = "Peligro de colision: El avion " + aviones.get(i).getMatricula() + " tiene los motores apagados en medio del aire";
							System.out.print("     |  " + incidenciasTexto);
							for (int espacios = 0; espacios < 84 - incidenciasTexto.length(); espacios ++) System.out.print(" ");
							System.out.print("  |\n");
							incidencias ++;
						}
					}
					
					if (incidencias == 0) System.out.println("     |      No hay ninguna incidencia avistada.                                               |");
					else {
						System.out.println("     |                                                                                        |");
						String totalIncidencias = "Total de Incidencias: " + incidencias;
						System.out.print("     |  " + totalIncidencias);
						for (int espacios = 0; espacios < 84 - totalIncidencias.length(); espacios ++) System.out.print(" ");
						System.out.print("  |\n");
					}
					System.out.println("     |_                                                                                      _|");
					System.out.println("     |_|____________________________________________________________________________________|_|");
		}
		
	}
	public static void noPuedeAñadir() {
		
		System.out.println("\n     ______________________________________________________________"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |       C O N T R O L    D E    A E R O P U E R T O S        |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |            C O N T R O L A D O R    A E R E O              |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|"
				 		 + "\n     |_|                                                        |_|"
				 		 + "\n     |                                                            |"
				 		 + "\n     |      No se pueden añadir mas aviones, el aforo maximo      |"
				 		 + "\n     |      es de 10 y actualmente ya hay 10.                     |"
				 		 + "\n     |_                                                          _|"
				 		 + "\n     |_|________________________________________________________|_|");
	}
	public static void avionesEncriptados(int numeroAviones) {
		if (numeroAviones == 10) {
			System.out.println("\n     ______________________________________________________________"
			 		 		 + "\n     |_|                                                        |_|"
			 		 		 + "\n     |                                                            |"
			 		 		 + "\n     |       C O N T R O L    D E    A E R O P U E R T O S        |"
			 		 		 + "\n     |_                                                          _|"
			 		 		 + "\n     |_|________________________________________________________|_|"
			 		 		 + "\n     |_|                                                        |_|"
			 		 		 + "\n     |                                                            |"
			 		 		 + "\n     |            C O N T R O L A D O R    A E R E O              |"
			 		 		 + "\n     |_                                                          _|"
			 		 		 + "\n     |_|________________________________________________________|_|"
			 		 		 + "\n     |_|                                                        |_|"
			 		 		 + "\n     |                                                            |"
			 		 		 + "\n     |      Se han encriptado 10 aviones                          |"
			 		 		 + "\n     |_                                                          _|"
			 		 		 + "\n     |_|________________________________________________________|_|");
		}
		else {
			System.out.println("\n     ______________________________________________________________"
	 		 		 		 + "\n     |_|                                                        |_|"
	 		 		 		 + "\n     |                                                            |"
	 		 		 		 + "\n     |       C O N T R O L    D E    A E R O P U E R T O S        |"
	 		 		 		 + "\n     |_                                                          _|"
	 		 		 		 + "\n     |_|________________________________________________________|_|"
	 		 		 		 + "\n     |_|                                                        |_|"
	 		 		 		 + "\n     |                                                            |"
	 		 		 		 + "\n     |            C O N T R O L A D O R    A E R E O              |"
	 		 		 		 + "\n     |_                                                          _|"
	 		 		 		 + "\n     |_|________________________________________________________|_|"
	 		 		 		 + "\n     |_|                                                        |_|"
	 		 		 		 + "\n     |                                                            |"
	 		 		 		 + "\n     |      Se han encriptado " + numeroAviones + " aviones                           |"
	 		 		 		 + "\n     |_                                                          _|"
	 		 		 		 + "\n     |_|________________________________________________________|_|");
		}
	}
	public static void avionesDesencriptados(int numeroAviones) {
		if (numeroAviones == 10) {
			System.out.println("\n     ______________________________________________________________"
			 		 		 + "\n     |_|                                                        |_|"
			 		 		 + "\n     |                                                            |"
			 		 		 + "\n     |       C O N T R O L    D E    A E R O P U E R T O S        |"
			 		 		 + "\n     |_                                                          _|"
			 		 		 + "\n     |_|________________________________________________________|_|"
			 		 		 + "\n     |_|                                                        |_|"
			 		 		 + "\n     |                                                            |"
			 		 		 + "\n     |            C O N T R O L A D O R    A E R E O              |"
			 		 		 + "\n     |_                                                          _|"
			 		 		 + "\n     |_|________________________________________________________|_|"
			 		 		 + "\n     |_|                                                        |_|"
			 		 		 + "\n     |                                                            |"
			 		 		 + "\n     |      Se han desencriptado 10 aviones                       |"
			 		 		 + "\n     |_                                                          _|"
			 		 		 + "\n     |_|________________________________________________________|_|");
		}
		else {
			System.out.println("\n     ______________________________________________________________"
	 		 		 		 + "\n     |_|                                                        |_|"
	 		 		 		 + "\n     |                                                            |"
	 		 		 		 + "\n     |       C O N T R O L    D E    A E R O P U E R T O S        |"
	 		 		 		 + "\n     |_                                                          _|"
	 		 		 		 + "\n     |_|________________________________________________________|_|"
	 		 		 		 + "\n     |_|                                                        |_|"
	 		 		 		 + "\n     |                                                            |"
	 		 		 		 + "\n     |            C O N T R O L A D O R    A E R E O              |"
	 		 		 		 + "\n     |_                                                          _|"
	 		 		 		 + "\n     |_|________________________________________________________|_|"
	 		 		 		 + "\n     |_|                                                        |_|"
	 		 		 		 + "\n     |                                                            |"
	 		 		 		 + "\n     |      Se han desencriptado " + numeroAviones + " aviones                        |"
	 		 		 		 + "\n     |_                                                          _|"
	 		 		 		 + "\n     |_|________________________________________________________|_|");
		}
	}
	public static void noPuedesDescender() {
		
		System.out.println("\n     ______________________________________________________________"
		 		 		 + "\n     |_|                                                        |_|"
		 		 		 + "\n     |                                                            |"
		 		 		 + "\n     |       C O N T R O L    D E    A E R O P U E R T O S        |"
		 		 		 + "\n     |_                                                          _|"
		 		 		 + "\n     |_|________________________________________________________|_|"
		 		 		 + "\n     |_|                                                        |_|"
		 		 		 + "\n     |                                                            |"
		 		 		 + "\n     |       C O N T R O L A D O R    D E    A V I O N E S        |"
		 		 		 + "\n     |_                                                          _|"
		 		 		 + "\n     |_|________________________________________________________|_|"
		 		 		 + "\n     |_|                                                        |_|"
		 		 		 + "\n     |                                                            |"
		 		 		 + "\n     |      No puedes descender tan bajo.                         |"
		 		 		 + "\n     |_                                                          _|"
		 		 		 + "\n     |_|________________________________________________________|_|");
	}
}
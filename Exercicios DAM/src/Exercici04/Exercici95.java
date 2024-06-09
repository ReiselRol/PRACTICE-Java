package Exercici04;

import java.util.Scanner;

//Esta vez voy a quitar el enunciado del programma ya que me lo voy a currar mucho >:)

public class Exercici95 {

	public static void RespuestaIncorrecta(int numeroOpcion) {
		
		System.out.println("");
		int numeroRandom = (int) (Math.random() * 2), diferencia = 0;
		if (numeroRandom == 0) System.out.println("     ERROR: El numero " + numeroOpcion + " No esta en el rango de Opcines ( 1 - 8 ). Vuelva a Probar");
		else {
			
			if ( numeroOpcion < 1 ) {
				
				diferencia = -1 * (1 - numeroOpcion);
				System.out.println("     ERROR: El numero " + numeroOpcion + " esta por debajo de " + diferencia + " para ser la opcion mas baja ( 1 ). Vuelva a Probar");
				
			}
			else if (numeroOpcion == 0) System.out.println("     ERROR: El numero " + numeroOpcion + " no es ninguna opcion. Vuelva a Probar");
			else {
				
				diferencia = numeroOpcion - 11;
				System.out.println("     ERROR: El numero " + numeroOpcion + " esta por encima de " + diferencia + " para ser la opcion mas Alta ( 8 ). Vuelva a Probar");
				
			}
		}
		System.out.println("");
		
	}
	
	public static void RespuestaIncorrectaGA(int numeroOpcion, int limiteArray) {
		
		System.out.println("");
		int numeroRandom = (int) (Math.random() * 2), diferencia = 0;
		if (numeroRandom == 0) System.out.println("     ERROR: El numero " + numeroOpcion + " No esta en el rango de Opcines ( 1 - " + limiteArray + " ). Vuelva a Probar");
		else {
			
			if ( numeroOpcion < 1 ) {
				
				diferencia = -1 * (1 - numeroOpcion);
				System.out.println("     ERROR: El numero " + numeroOpcion + " esta por debajo de " + diferencia + " para ser la opcion mas baja ( 1 ). Vuelva a Probar");
				
			}
			else if (numeroOpcion == 0) System.out.println("     ERROR: El numero " + numeroOpcion + " no es ninguna opcion. Vuelva a Probar");
			else {
				
				diferencia = numeroOpcion - limiteArray;
				System.out.println("     ERROR: El numero " + numeroOpcion + " esta por encima de " + diferencia + " para ser la opcion mas Alta ( "+ limiteArray +" ). Vuelva a Probar");
				
			}
		}
		
	}
	
	public static Scanner entradaNumero = new Scanner(System.in), entradaPalabra = new Scanner(System.in); // Escaneres diferentes para que no pete el programa por culpa de los chapuzeros svaneres de MI####.
	public static int numeroAlumnos = 0;
	public static final int maximoDeAlumnos = 30 , maximoDeAssignaturas = 5, totalDatosAlumnos = 2, totalDatosAlssignatura = 2; //Constantes
	public static String datosAlumnos [] [] = new String [maximoDeAlumnos] [totalDatosAlumnos]; // Los datos ficticios a rellenar son : |Codigo ej: A12345678|Nombre|
	public static String datosAssignaturas [] [] = new String [maximoDeAssignaturas] [totalDatosAlssignatura]; // |Codigo Assignatura ej: A12345678| nombre al azar|
	public static String nombresRandom [] [] = {{"Estudio","Cultura","Sistema","Resolucion","Analisis","Astrologia","La Fisica","Comprension","Creacion","Virtualizacion"},{"de Videojuegos","del Data-Base","de HTML","de Sistemas","del Programacion","de XML","de Entorno de Comandas","de los Bytes","de los Bits","del Kernel"}};
	public static int datosNotas [] [] = new int [maximoDeAlumnos] [maximoDeAssignaturas]; // Los datos ficticios a rellenar son : |nota 1|nota 2|...|nota 5| nota 1 es de la assignatura 1 
	public static int alumnosIntroducidos = 0;
	
	public static void main(String[] args) {
		
		Inicializacion();
		int opcion = 0;
		boolean finalizado = false;
		do {
			
			MenuPrincipal();
			System.out.print("    > ");
			opcion = entradaNumero.nextInt();
			if ( (opcion > 11 ) || (opcion < 1) ) RespuestaIncorrecta(opcion);
			else if ( opcion == 7 ) {
				
				InsertarAss();
				
			}
			else if ( opcion == 8 ) {
				
				VerAss();
				
			}
			else if ( opcion == 9 ) {
				
				ModificarAss();
				
			}
			else if ( opcion == 11 ) {
				
				finalizado = true;
				
			}
		
			try {
				Thread.sleep(2000); //Esperar 2 segundos
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		} while (finalizado == false);
		
	}
	
	public static void Inicializacion() {
		
		int random1,random2;
		for (int repeticiones = 0 ; repeticiones < maximoDeAssignaturas ; repeticiones++) {
			
			datosAssignaturas [repeticiones] [0] = "A" + (int) (Math.random()*89999999 + 10000000);
			random1 = (int) (Math.random()*10);
			random2 = (int) (Math.random()*10);
			datosAssignaturas [repeticiones] [1] = nombresRandom [0] [random1] + " " + nombresRandom [1] [random2];
		}
		
	}
	
	public static void MenuPrincipal() {
		
		System.out.println("");
		System.out.println("     ____________________________________________________________________________");
		System.out.println("     |_|                                                                      |_|");
		System.out.println("     |                                                                          |");
		System.out.println("     |             N O T A S    R A M O N    R I O S   G O M E Z                |");
		System.out.println("     |_                                                                        _|");
		System.out.println("     |_|______________________________________________________________________|_|");
		System.out.println("     |_|                                                                      |_|");
		System.out.println("     |                                                                          |");
		System.out.println("     |             Que accion deseas realizar a tus alumnos:                    |");
		System.out.println("     |                                                                          |");
		System.out.println("     |             1.- Introducir Alumnos.                                      |");
		System.out.println("     |                                                                          |");
		System.out.println("     |             2.- Ver Alumnos.                                             |");
		System.out.println("     |                                                                          |");
		System.out.println("     |             3.- Modificar Datos de Alumnos.                              |");
		System.out.println("     |                                                                          |");
		System.out.println("     |             4.- Introducir Notas de Alumnos.                             |");
		System.out.println("     |                                                                          |");
		System.out.println("     |             5.- Ver Notas de Alumnos.                                    |");
		System.out.println("     |                                                                          |");
		System.out.println("     |             6.- Modificar Datos de Notas.                                |");
		System.out.println("     |                                                                          |");
		System.out.println("     |             7.- Introducir Assignaturas.                                 |");
		System.out.println("     |                                                                          |");
		System.out.println("     |             8.- Ver Assignaturas.                                        |");
		System.out.println("     |                                                                          |");
		System.out.println("     |             9.- Modificar Assignaturas.                                  |");
		System.out.println("     |                                                                          |");
		System.out.println("     |             10.- Ver Estadisticas de Alumnos.                            |");
		System.out.println("     |                                                                          |");
		System.out.println("     |             11.- Salir del Programa.                                     |");
		System.out.println("     |_                                                                        _|");
		System.out.println("     |_|______________________________________________________________________|_|");
		System.out.println("");
		
	}
	
	public static void VerAss() {
		
		final int totalespacios = 43;
		System.out.println("");
		System.out.println("     ____________________________________________________________________________");
		System.out.println("     |_|                                                                      |_|");
		System.out.println("     |                                                                          |");
		System.out.println("     |                                                                          |");
		System.out.println("     |     ________________________________________________________________     |");
		System.out.println("     |     |                |                                             |     |");
		System.out.println("     |     | Codigo Assign  | Nombre Assignatura                          |     |");
		System.out.println("     |     |________________|_____________________________________________|     |");
		int lenghtDatos [] = new int [datosAssignaturas.length];
		
		for ( int lineas = 0 ; lineas < datosAssignaturas.length ; lineas ++ ) {
			
			lenghtDatos [lineas] = datosAssignaturas [lineas] [1].length();
			
		}
		
		for ( int lineas = 0 ; lineas < datosAssignaturas.length ; lineas ++ ) {
			
			System.out.println("     |     |                |                                             |     |");
			System.out.print("     |     |  " + datosAssignaturas [lineas] [0]+ "     | " + datosAssignaturas [lineas] [1]);
			
			for (int espacios = 0 ; espacios < (totalespacios - lenghtDatos [lineas]); espacios ++ ) {
				
				System.out.print(" ");
				
			}
			System.out.print(" |     |\n");
			System.out.println("     |     |________________|_____________________________________________|     |");
			
		}
		System.out.println("     |                                                                          |");
		System.out.println("     |_                                                                        _|");
		System.out.println("     |_|______________________________________________________________________|_|");
		
	}
	
	public static void ModificarAss() {
		
		int opcion = 0;
		final int totalespacios = 43;
		System.out.println("");
		System.out.println("     ____________________________________________________________________________");
		System.out.println("     |_|                                                                      |_|");
		System.out.println("     |                                                                          |");
		System.out.println("     |                                                                          |");
		System.out.println("     |     ________________________________________________________________     |");
		System.out.println("     |     |                |                                             |     |");
		System.out.println("     |     | Codigo Assign  | Nombre Assignatura                          |     |");
		System.out.println("     |   __|________________|_____________________________________________|     |");
		int lenghtDatos [] = new int [datosAssignaturas.length];
		
		for ( int lineas = 0 ; lineas < datosAssignaturas.length ; lineas ++ ) {
			
			lenghtDatos [lineas] = datosAssignaturas [lineas] [1].length();
			
		}
		
		for ( int lineas = 0 ; lineas < datosAssignaturas.length ; lineas ++ ) {
			
			System.out.println("     |   | |                |                                             |     |");
			System.out.print("     |   |" + (lineas+1) + "|  " + datosAssignaturas [lineas] [0]+ "     | " + datosAssignaturas [lineas] [1]);
			
			for (int espacios = 0 ; espacios < (totalespacios - lenghtDatos [lineas]); espacios ++ ) {
				
				System.out.print(" ");
				
			}
			System.out.print(" |     |\n");
			System.out.println("     |   |_|________________|_____________________________________________|     |");
			
		}
		System.out.println("     |                                                                          |");
		System.out.println("     |         Introduce un numero del 1 - 5 para seleccionar cual              |");
		System.out.println("     |         quieres modificar                                                |");
		System.out.println("     |                                                                          |");
		System.out.println("     |_                                                                        _|");
		System.out.println("     |_|______________________________________________________________________|_|");
		boolean correcto = false;
		do {
			
			System.out.println("");
			System.out.print("    > ");
			opcion = entradaNumero.nextInt();
			if ( (opcion < 1) || (opcion > datosAssignaturas.length )) RespuestaIncorrectaGA(opcion, datosAssignaturas.length);
			else {
				
				System.out.println("\n     (i): Assignatura " + datosAssignaturas[ opcion - 1][0] + " con nombre de '"+ datosAssignaturas[ opcion - 1][1] +"' seleccionada Correctamente.");
				correcto = true;
				
			}
			
		} while (correcto == false);
		correcto = false;
		
		System.out.println("");
		System.out.println("     ____________________________________________________________________________");
		System.out.println("     |_|                                                                      |_|");
		System.out.println("     |                                                                          |");
		System.out.println("     |            Escriba el numero del nuevo codigo de assignatura             |");
		System.out.println("     |               tiene de ser de 8 digitos este nuevo numero                |");
		System.out.println("     |            (Si no quieres cambiar el codigo introduze un 0).             |");
		System.out.println("     |_                                                                        _|");
		System.out.println("     |_|______________________________________________________________________|_|");
		int opcionAux = opcion;
		do {
			
			System.out.println("");
			System.out.print("    > ");
			opcion = entradaNumero.nextInt();
			if ( opcion == 0) correcto = true;
			else if ( ( opcion < 10000000) || ( opcion > 99999999)) System.out.println("\n     ERROR: Recuerda que todo tiene de ser un numero, el primer numero no puede ser un 0 y debes introducir 8 digitos");
			else{
				
				System.out.println("\n     (i): El anterior codigo de la assignatura " + datosAssignaturas[ opcionAux - 1][0] + " Ahora es de 'A"+ opcion +"'.");
				correcto = true;
				datosAssignaturas [ opcionAux - 1][0] = "A" + opcion;
				
			}
			
		} while (correcto == false);
		correcto = false;
		
		System.out.println("");
		System.out.println("     ____________________________________________________________________________");
		System.out.println("     |_|                                                                      |_|");
		System.out.println("     |                                                                          |");
		System.out.println("     |           Escriba el nombre nuevo de la assignatura seleccionada         |");
		System.out.println("     |           tiene de ser como maximo 41 digitos este nuevo nombre          |");
		System.out.println("     |             (Si no quieres cambiar el codigo introduze un 0).            |");
		System.out.println("     |_                                                                        _|");
		System.out.println("     |_|______________________________________________________________________|_|");
		String nuevoNombre;
		
		do {
			
			System.out.println("");
			System.out.print("    > ");
			nuevoNombre = entradaPalabra.nextLine();
			if ( nuevoNombre.equalsIgnoreCase("0")) correcto = true;
			else if ( ( nuevoNombre.replace(" ", "") == "") || (nuevoNombre.equalsIgnoreCase("") || (nuevoNombre.length() > 41) ) )System.out.println("\n     ERROR: El nuevo nombre debe de ser como maximo de 41 caracteres.");
			else {
				
				System.out.println("\n     (i): El anterior nombre de la assignatura " + datosAssignaturas[ opcionAux - 1][1] + " Ahora es de '"+ nuevoNombre +"'.");
				correcto = true;
				datosAssignaturas [ opcionAux - 1][1] = nuevoNombre;
				
			}
			
		} while (correcto == false);
		
	}
	
	public static void InsertarAss() {
		
		System.out.println("");
		System.out.println("     ____________________________________________________________________________");
		System.out.println("     |_|                                                                      |_|");
		System.out.println("     |                                                                          |");
		System.out.println("     |          ATENCION: Insertar los nombres y codigos de las                 |");
		System.out.println("     |          Assignaturas sobreescribira las ya existentes                   |");
		System.out.println("     |                                                                          |");
		System.out.println("     |          Deseas continuar con el processo de insertar?                   |");
		System.out.println("     |                              ( S / N )                                   |");
		System.out.println("     |_                                                                        _|");
		System.out.println("     |_|______________________________________________________________________|_|");
		String nuevoNombre;
		boolean correcto = false , quieroSeguir = false;
		
		do {
			
			System.out.println("");
			System.out.print("    > ");
			nuevoNombre = entradaPalabra.next();
			if ( nuevoNombre.equalsIgnoreCase("S")) {
				
				correcto = true;
				quieroSeguir = true;
				System.out.println("\n     (i): Se va a comenzar con la Inserccion de nombres y codigos de Assignaturas");
				
			}
			else if ( nuevoNombre.equalsIgnoreCase("N")) {
				
				correcto = true;
				System.out.println("\n     (i): No se va a comenzar con la Inserccion de nombres y codigos de Assignaturas");
				
			}
			else {
				
				System.out.println("\n     ERROR: Debes Escribir o bien 'S' para si procesder o bien 'N' para no proceder");
				
			}
			
		} while (correcto == false);
		
		boolean finalizado = false;
		
		if (quieroSeguir) {
			
			for (int repeticiones = 0 ; repeticiones < datosAssignaturas.length ; repeticiones ++) {
				
				finalizado = false;
				do {
					
					int opcionAux = repeticiones;
					do {
						
						System.out.println("");
						System.out.print("    > ");
						repeticiones = entradaNumero.nextInt();
						if ( repeticiones == 0) correcto = true;
						else if ( ( repeticiones < 10000000) || ( repeticiones > 99999999)) System.out.println("\n     ERROR: Recuerda que todo tiene de ser un numero, el primer numero no puede ser un 0 y debes introducir 8 digitos");
						else{
							
							System.out.println("\n     (i): El anterior codigo de la assignatura " + datosAssignaturas[ opcionAux - 1][0] + " Ahora es de 'A"+ repeticiones +"'.");
							correcto = true;
							datosAssignaturas [ opcionAux - 1][0] = "A" + repeticiones;
							
						}
						
					} while (correcto == false);
					correcto = false;
					
					System.out.println("");
					System.out.println("     ____________________________________________________________________________");
					System.out.println("     |_|                                                                      |_|");
					System.out.println("     |                                                                          |");
					System.out.println("     |           Escriba el nombre nuevo de la assignatura seleccionada         |");
					System.out.println("     |           tiene de ser como maximo 41 digitos este nuevo nombre          |");
					System.out.println("     |             (Si no quieres cambiar el codigo introduze un 0).            |");
					System.out.println("     |_                                                                        _|");
					System.out.println("     |_|______________________________________________________________________|_|");
					String nuevoNombre1;
					
					do {
						
						System.out.println("");
						System.out.print("    > ");
						nuevoNombre1 = entradaPalabra.nextLine();
						if ( nuevoNombre1.equalsIgnoreCase("0")) correcto = true;
						else if ( ( nuevoNombre1.replace(" ", "") == "") || (nuevoNombre1.equalsIgnoreCase("") || (nuevoNombre1.length() > 41) ) )System.out.println("\n     ERROR: El nuevo nombre debe de ser como maximo de 41 caracteres.");
						else {
							
							System.out.println("\n     (i): El anterior nombre de la assignatura " + datosAssignaturas[ opcionAux - 1][1] + " Ahora es de '"+ nuevoNombre1 +"'.");
							correcto = true;
							datosAssignaturas [ opcionAux - 1][1] = nuevoNombre1;
							
						}
						
					} while (correcto == false);
					
				} while (finalizado == false);
				
			}
		}
	}
	public static void InsertarAl() {
		
		System.out.println("");
		System.out.println("     ____________________________________________________________________________");
		System.out.println("     |_|                                                                      |_|");
		System.out.println("     |                                                                          |");
		System.out.println("     |          ATENCION: Insertaras los datos y de nuevos alumnos              |");
		if (alumnosIntroducidos < 10) System.out.println("     |          la cuenta total que llevas es de " + alumnosIntroducidos +"                              |");
		else  System.out.println("     |          la cuenta total que llevas es de " + alumnosIntroducidos +"                             |");
		System.out.println("     |                                                                          |");
		System.out.println("     |          Deseas continuar con el processo de insertar?                   |");
		System.out.println("     |                              ( S / N )                                   |");
		System.out.println("     |_                                                                        _|");
		System.out.println("     |_|______________________________________________________________________|_|");
		String nuevoNombre;
		boolean correcto = false , quieroSeguir = false;
		
		do {
			
			System.out.println("");
			System.out.print("    > ");
			nuevoNombre = entradaPalabra.next();
			if ( nuevoNombre.equalsIgnoreCase("S")) {
				
				correcto = true;
				quieroSeguir = true;
				System.out.println("\n     (i): Se va a comenzar con la Inserccion de nombres y codigos de Assignaturas");
				
			}
			else if ( nuevoNombre.equalsIgnoreCase("N")) {
				
				correcto = true;
				System.out.println("\n     (i): No se va a comenzar con la Inserccion de nombres y codigos de Assignaturas");
				
			}
			else {
				
				System.out.println("\n     ERROR: Debes Escribir o bien 'S' para si procesder o bien 'N' para no proceder");
				
			}
			
		} while (correcto == false);
		
		boolean finalizado = false;
		
		
	}

}

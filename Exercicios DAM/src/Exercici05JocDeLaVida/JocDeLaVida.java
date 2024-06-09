package Exercici05JocDeLaVida;

import java.util.Scanner;

public class JocDeLaVida {

	public Scanner entradaValores = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Quitamos el Statico
		
		JocDeLaVida quitarStatic = new JocDeLaVida();
		quitarStatic.JDLV();
		
	}
	
	// JDLV Es el cuerpo del programa, donde se llamara al menu para saber que opcion hacer y se empezara una partida o se saldra del juego
	
	public void JDLV() {
		
		boolean finalizarJuego = false;
		int opcion = 0;
		do {
			
			opcion = Menu();
			if (opcion == 2) finalizarJuego = Saliendo();
			else finalizarJuego = Partida();
			
		} while (finalizarJuego == false);
		
	}
	
	//El procedimiento Menu dara un resultado de un INT que viene siendo la opcion seleccionada
	
	public int Menu() {
		
		//Decalararemos el valor maximo que hay en este menu y el minimo para luego pasarle a un metodo que revisara si esta dentro de ese rango
		
		final int MAX = 2;
		final int MIN = 1;
		
		System.out.println(" ");
		System.out.println("      ___________________________________________________________________________     ");
		System.out.println("      |_|                                                                     |_|     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |    00000 0   0 00000  0000  000      000   00000     0      000         |     ");
		System.out.println("      |      0   0   0 0___  0  _  0   0     0  00 0___      0     0   0        |     ");
		System.out.println("      |    0 0   0   0 0     0   0 0   0     0  00 0         0     00000        |     ");
		System.out.println("      |    000   00000 00000  000   000      000   00000     00000 0   0        |     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |                        0   0  00000  000     000                        |     ");
		System.out.println("      |                        0   0    0    0  00  0   0                       |     ");
		System.out.println("      |                         0 0     0    0  00  00000                       |     ");
		System.out.println("      |                          0    00000  000    0   0                       |     ");
		System.out.println("      |_                                                      Ramon Rios Gomez _|     ");
		System.out.println("      |_|_____________________________________________________________________|_|     ");
		System.out.println("      |_|                                                                     |_|     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |        Selecciona una de las siguientes opciones para continuar         |     ");
		System.out.println("      |        con el programa insertando un numero:                            |     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |        1.- Iniciar una Partida                                          |     ");
		System.out.println("      |        2.- Salir                                                        |     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |_                                                                       _|     ");
		System.out.println("      |_|_____________________________________________________________________|_|     ");
		
		int valorInt = 0;
		valorInt = inputValores(MIN,MAX);
		return valorInt;
	}
	
	//El metodo inputValores es un metodo que comprueba los limites que hay cuando introduces un numero, en el caso que da error de limites pues se pasa a otro metodo encargado de esto
	
	public int inputValores(int minimo, int maximo) {
		
		boolean introducidoCorrectamente = false;
		int valorIntroducido;
		do {
			
			System.out.print("\n      > ");
			valorIntroducido = entradaValores.nextInt();
			System.out.println(" ");
			if ( (valorIntroducido <= maximo) && (minimo <= valorIntroducido) ) introducidoCorrectamente = true;
			else {
				
				inputMalIntroducido(minimo,maximo,valorIntroducido);
				
			}
			
		} while (introducidoCorrectamente == false);
		
		return valorIntroducido;
		
	}
	
	//Este procedimiento se ejecuta cuando el metodo de inputValores salta con un error de limites, simplemente avisa al usuario de que lo esta haciendo mal
	
	public void inputMalIntroducido(int minimo, int maximo, int numero){

		
		int numeroAlAzar;
		numeroAlAzar = (int) (Math.random() * 3);
		if (numeroAlAzar == 0) System.out.println("      (E) El numero " + numero + " no es una de las opciones posibles. Por fabor introduce un numero del " + minimo + " al " + maximo + ".");
		else if (numeroAlAzar == 1) System.out.println("      (E) El numero " + numero + " esta fuera de los rangos ( " + minimo + " - " + maximo + " ). Por fabor introduce un numero del " + minimo + " al " + maximo + ".");
		else {
			
			int diferencia;
			if (numero < minimo) diferencia = minimo - numero;
			else diferencia = numero - maximo;
			System.out.println("      (E) El numero " + numero + "esta fuera del rango ( " + minimo + " - " + maximo + " ) por una diferencia de " + diferencia + " numeros. Por fabor introduce un numero del " + minimo + " al " + maximo + ".");
			
		}
		
	}

	//Este Metodo solo informa que se va ha cerrar el programa, devuelve un true para cambiar el booleano del 
	
	public boolean Saliendo() {
		
		System.out.println("      ___________________________________________________________________________     ");
		System.out.println("      |_|                                                                     |_|     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |            S A L I E N D O   D E L   P R O G R A M A   :)               |     ");
		System.out.println("      |_                                                                       _|     ");
		System.out.println("      |_|_____________________________________________________________________|_|     ");
		
		return true;
		
	}

	//Este es el segundo procedimiento jesucristo, Viene siendo el cuerpo del juego.
	
	public boolean Partida() {
		
		boolean finalizado = false;
		
		// Assignacion de la partida y sus valores ( tamaño de tablero y colocacion de las celulas)
		
		char [] [] tableroAux = AssignacionDeLaPartida();
		int [] reglas = AssignacionDeLasReglas();
		char [] [] tablero = new char[tableroAux.length] [tableroAux[0].length];
		CopiarTabla(tablero,tableroAux);
		MostrarTabla(tablero,tableroAux);
		do {
			
			ComprobacionDeCelulas(tablero,tableroAux,reglas);
			
				try {
					Thread.sleep(80);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			
		} while (finalizado == false);
		
		return true;
		
	}
	
	//Este metodo te mostrara el mismo menu dos veces donde deberas introducir el numero de columnas y el de filas
	
	public char [] [] AssignacionTamaños() {
		
		int repeticiones = 0;
		int valores [] = new int [2];
		final int MIN = 10;
		final int MAX = 100;
		
		do {
			
			System.out.println(" ");
			System.out.println("      ___________________________________________________________________________     ");
			System.out.println("      |_|                                                                     |_|     ");
			System.out.println("      |                                                                         |     ");
			System.out.println("      |     I N T R O D U C C I O N   D E  T A M A Ñ O   D E   T A B L A        |     ");
			System.out.println("      |_                                                                       _|     ");
			System.out.println("      |_|_____________________________________________________________________|_|     ");
			System.out.println("      |_|                                                                     |_|     ");
			System.out.println("      |                                                                         |     ");
			System.out.println("      |                                                                         |     ");
			System.out.println("      |        Ahora se introduciran dos numeros para dereteminar las           |     ");
			System.out.println("      |        Columnas (1) y las Filas (2). Procura no introducir              |     ");
			System.out.println("      |        valores mas grandes que 100 ni mas pequeños que 10.              |     ");
			System.out.println("      |                                                                         |     ");
			System.out.println("      |        Numero a Introducir (" + (repeticiones + 1) + ") :                                        |     ");
			System.out.println("      |                                                                         |     ");
			System.out.println("      |_                                                                       _|     ");
			System.out.println("      |_|_____________________________________________________________________|_|     ");
			
			valores [repeticiones] = inputValores(MIN,MAX);
			repeticiones++;
			
			
		} while (repeticiones != 2);
		
		char [] [] tablero = new char [valores[0]] [valores[1]];
		char [] [] tableroAux = new char [valores[0]] [valores[1]];
		
		for (int columnas = 0; columnas < tablero.length; columnas ++) {
			
			for (int filas = 0; filas < tablero[0].length; filas++){
					
				tableroAux [columnas] [filas] = ' ';
				
			}
		}
		
		CopiarTabla(tablero,tableroAux);
		char [][]nuevoTablero = ColocacionDeCelulas(tablero,tableroAux);
		
		return nuevoTablero;
		
	}

	//Copia el tablero Aux al normal
	
	public void CopiarTabla(char[][] tablero, char[][] tableroAux) {
		
		for (int columnas = 0; columnas < tablero.length; columnas ++) {
			
			for (int filas = 0; filas < tablero[0].length; filas++){
				
				tablero [columnas] [filas] = tableroAux [columnas] [filas];
				
			}
		}
		
	}
	
	//Este procedimiento es para tener mas claro como funciona la partida, simplemente llama a unos metodos/procedimientos que podia haber puesto arriba pero no he querido porque antes habian
	// mas de un procedimiento dentro de este.
	
	public char[][] AssignacionDeLaPartida () {
		
		return AssignacionTamaños(); 
		
	}
	
	//Simple Procedmiento que te pregunta con un menu como quieres hacer la colocacion y segun eso llamara a un procedimiento o a otro
	
	public char [][] ColocacionDeCelulas(char[][] tablero, char[][] tableroAux) {
		
		final int MAX = 2;
		final int MIN  = 1;
		
		System.out.println(" ");
		System.out.println("      ___________________________________________________________________________     ");
		System.out.println("      |_|                                                                     |_|     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |             C O L O C A C I O N   D E   C E L U L A S                   |     ");
		System.out.println("      |_                                                                       _|     ");
		System.out.println("      |_|_____________________________________________________________________|_|     ");
		System.out.println("      |_|                                                                     |_|     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |     Selecciona como deseas que las primeras celulas se coloquen         |     ");
		System.out.println("      |     en el tablero Introduciendo un numero para seleccionar una          |     ");
		System.out.println("      |     Opcion de las que hay:                                              |     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |     1.- Manual.                                                         |     ");
		System.out.println("      |     2.- Automatica.                                                     |     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |_                                                                       _|     ");
		System.out.println("      |_|_____________________________________________________________________|_|     ");
		
		int opcion = 0;
		opcion = inputValores(MIN,MAX);
		
		if (opcion == 1) CelulasManuales(tablero,tableroAux);
		else CelulasAuto(tablero,tableroAux);
		CopiarTabla(tablero,tableroAux);
		return tablero;
		
	}
	
	//Lleva la cuenta de las veces que se han introducido los valores de las celulas
	
	public void CelulasManuales(char[][] tablero, char[][] tableroAux) {
		
		final int numeroDeVeces = 5;
		int veces = 0;
		for (veces = 0; veces < numeroDeVeces; veces ++) CelulasColocadasManuales(tablero,tableroAux,veces);
		
	}
	
	//Colocacion de verdad de las celulas Manualmente introduciendo dos valores
	
	public void CelulasColocadasManuales(char[][] tablero, char[][] tableroAux, int veces) {
		
		//Limite de columnas
		
		final int MINC = 1;
		final int MAXC = tablero.length; 
		
		//Limite de filas
		
		final int MINF = 1;
		final int MAXF = tablero[0].length;
		boolean colocadoCorrectamente = false;
		
		veces ++;
		System.out.println(" ");
		System.out.println("      ___________________________________________________________________________     ");
		System.out.println("      |_|                                                                     |_|     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |    C O L O C A C I O N   D E   C E L U L A S   M A N U A L M E N T E    |     ");
		System.out.println("      |_                                                                       _|     ");
		System.out.println("      |_|_____________________________________________________________________|_|     ");
		System.out.println("      |_|                                                                     |_|     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |       Selecciona las cordenadas de la celula nº0 introduciendo          |     ");
		System.out.println("      |       Primero la columna donde esta y luego la fila:                    |     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |_                                                                       _|     ");
		System.out.println("      |_|_____________________________________________________________________|_|     ");
		do {
			
			System.out.println("");
			System.out.println("      (i) Inserta la posicion de la columnas (maximo de " + MAXC +").");
			int columna = inputValores(MINC,MAXC);
			System.out.println("");
			System.out.println("      (i) Inserta la posicion de la fila (maximo de " + MAXF +").");
			int fila = inputValores(MINF,MAXF);
			if (tableroAux [columna - 1] [fila - 1] == ' ') {
				
				tableroAux [columna - 1] [fila - 1] = '█';
				System.out.println("");
				System.out.println("      (i) Celula colocada correctamente en la posicion " + columna +" - " + fila +".");
				
				colocadoCorrectamente = true;
				
			}
			else System.out.println("\n      (E) No se puede introducir un celula donde ya existe una");
			
		} while (colocadoCorrectamente == false);
		
	}
	
	//Este es el procedimiento que se encarga de hacer la colocacion de forma automatica de las celulas, realmente te pedira cuantas poblaciones quiere, el que se encarga es ColocacionAuto()
	
	public void CelulasAuto(char[][] tablero, char[][] tableroAux) {
		
		// Por si queremos ver el chaos te dejo elejir del 1 al 3 gruitos de celulas
		
		final int numeroMaxDeGrupitos = 3;
		final int MIN = 1;
		
		System.out.println(" ");
		System.out.println("      ___________________________________________________________________________     ");
		System.out.println("      |_|                                                                     |_|     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |             C O L O C A C I O N   D E   C E L U L A S                   |     ");
		System.out.println("      |_                                                                       _|     ");
		System.out.println("      |_|_____________________________________________________________________|_|     ");
		System.out.println("      |_|                                                                     |_|     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |          Cuantas poblaciones quieres colocar ( 1 - 3) ?                 |     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |_                                                                       _|     ");
		System.out.println("      |_|_____________________________________________________________________|_|     ");
		
		int totalPoblaciones;
		totalPoblaciones = inputValores(MIN,numeroMaxDeGrupitos);
		
		for (int poblaciones = 0; poblaciones < totalPoblaciones; poblaciones++) ColocacionAuto(tablero, tableroAux);
		
	}
	
	//En este procedimiento hace la aleatoridad y colocacion de la poblacion de celula
	
	public void ColocacionAuto(char[][] tablero, char[][] tableroAux) {
		
		//Cogeremos un numero al azar de todas las casillas que existen en el tablero, si es un corner lo volveremos a intentar
		int	numeroAlAzar = 0;
		int	numeroAlAzar2 = 0;
		int dosDecisiones = 0;
		final int tamañoPoblacion = 5;
		boolean noSelected = false;
		
		do {
			
			numeroAlAzar = (int) (Math.random() * (tablero.length));
			numeroAlAzar2 = (int) (Math.random() * (tablero[0].length));
			
			if ( numeroAlAzar == 0 && numeroAlAzar2 == 0) {
				
				dosDecisiones = (int) (Math.random());
				
				if (dosDecisiones == 0) numeroAlAzar++;
				else numeroAlAzar2++;
				
			}
			else if ( numeroAlAzar == 0 && numeroAlAzar2 == (tablero[0].length - 1)) {
				
				dosDecisiones = (int) (Math.random());
				
				if (dosDecisiones == 0) numeroAlAzar++;
				else numeroAlAzar2--;
				
			}
			else if ( numeroAlAzar == ( tablero.length - 1) && numeroAlAzar2 == (tablero[0].length - 1)) {
				
				dosDecisiones = (int) (Math.random());
				
				if (dosDecisiones == 0) numeroAlAzar--;
				else numeroAlAzar2--;
				
			}
			else if ( numeroAlAzar == ( tablero.length - 1) && numeroAlAzar2 == 0) {
				
				dosDecisiones = (int) (Math.random());
				
				if (dosDecisiones == 0) numeroAlAzar--;
				else numeroAlAzar2++;
				
			}
			
			if (tableroAux [numeroAlAzar] [numeroAlAzar2] == ' ') {
	
				tableroAux [numeroAlAzar] [numeroAlAzar2] = '█';
				noSelected = true;
				
				
			}
			
		} while (noSelected == false);
		
		String posicion = ComprobarCasillas(numeroAlAzar,numeroAlAzar2,tablero,tableroAux);
		for (int repeticiones = 0;  repeticiones < (tamañoPoblacion - 1); repeticiones ++)SubColocacionRandom(posicion,numeroAlAzar,numeroAlAzar2,tablero,tableroAux);
		
	}
	
	//Un pequeño metodo para saber donde se encuentra la celula (la posicion)
	
	public String ComprobarCasillas(int columna, int fila, char[][] tablero, char[][] tableroAux) {
		
		//columnas = i     y     j = fila.
		if ((columna == 0) && (fila == 0)) return "CornerSL";
		else if ((columna == 0) && (fila == tablero[0].length - 1)) return "CornerIL";
		else if ((columna == tablero.length - 1) && (fila == 0)) return "CornerSR";
		else if ((columna == tablero.length - 1) && (fila == tablero[0].length - 1)) return "CornerIR";
		else if (columna == 0) return "LateralL";
		else if (columna == tablero.length - 1) return "LateralR";
		else if (fila == 0) return "Superior";
		else if (fila == tablero[0].length - 1) return "Inferior";
		else return "central";
		
	}
	
	//Dependiendo de la posicion donde se encuentre la celula hara una o otra cosa
	
	public void SubColocacionRandom(String posicion, int x, int y, char[][] tablero, char[][] tableroAux ) {
		
		int random = 0;
		boolean colocado = false;
		do {
			
			if (posicion.equalsIgnoreCase("LateralL")) {
				
				random = (int) (Math.random() * 5);
				if (random == 0) {
					
					if (tableroAux [x] [y - 1] == ' ') {
						
						tableroAux [x] [y - 1] = '█';
						colocado = true;
						
					}
					
				}
				else if (random == 1) {
					
					if (tableroAux [x + 1] [y - 1] == ' ') {
						
						tableroAux [x + 1] [y - 1] = '█';
						colocado = true;
						
					}
					
				}
				else if (random == 2) {
					
					if (tableroAux [x + 1] [y] == ' ') {
						
						tableroAux [x + 1] [y] = '█';
						colocado = true;
						
					}
					
				}
				else if (random == 3) {
					
					if (tableroAux [x] [y + 1] == ' ') {
						
						tableroAux [x] [y + 1] = '█';
						colocado = true;
						
					}
					
				}
				else if (random == 4) {
					
					if (tableroAux [x + 1] [y + 1] == ' ') {
						
						tableroAux [x + 1] [y + 1] = '█';
						colocado = true;
						
					}
					
				}
				
				
			}
			else if (posicion.equalsIgnoreCase("LateralR")) {
				
				random = (int) (Math.random() * 5);
				if (random == 0) {
					
					if (tableroAux [x] [y - 1] == ' ') {
						
						tableroAux [x] [y - 1] = '█';
						colocado = true;
						
					}
					
				}
				else if (random == 1) {
					
					if (tableroAux [x - 1] [y - 1] == ' ') {
						
						tableroAux [x - 1] [y - 1] = '█';
						colocado = true;
						
					}
					
				}
				else if (random == 2) {
					
					if (tableroAux [x - 1] [y] == ' ') {
						
						tableroAux [x - 1] [y] = '█';
						colocado = true;
						
					}
					
				}
				else if (random == 3) {
					
					if (tableroAux [x] [y + 1] == ' ') {
						
						tableroAux [x] [y + 1] = '█';
						colocado = true;
						
					}
					
				}
				else if (random == 4) {
					
					if (tableroAux [x - 1] [y + 1] == ' ') {
						
						tableroAux [x - 1] [y + 1] = '█';
						colocado = true;
						
					}
					
				}
				
			}
			else if (posicion.equalsIgnoreCase("Superior")) {
				
				random = (int) (Math.random() * 5);
				if (random == 0) {
					
					if (tableroAux [x - 1] [y] == ' ') {
						
						tableroAux [x - 1] [y] = '█';
						colocado = true;
						
					}
					
				}
				else if (random == 1) {
					
					if (tableroAux [x + 1] [y] == ' ') {
						
						tableroAux [x + 1] [y] = '█';
						colocado = true;
						
					}
					
				}
				else if (random == 2) {
					
					if (tableroAux [x - 1] [y + 1] == ' ') {
						
						tableroAux [x - 1] [y + 1] = '█';
						colocado = true;
						
					}
					
				}
				else if (random == 3) {
					
					if (tableroAux [x] [y + 1] == ' ') {
						
						tableroAux [x] [y + 1] = '█';
						colocado = true;
						
					}
					
				}
				else if (random == 4) {
					
					if (tableroAux [x + 1] [y + 1] == ' ') {
						
						tableroAux [x + 1] [y + 1] = '█';
						colocado = true;
						
					}
					
				}
				
			}
			else if (posicion.equalsIgnoreCase("Inferior")) {
				
				random = (int) (Math.random() * 5);
				if (random == 0) {
					
					if (tableroAux [x - 1] [y] == ' ') {
						
						tableroAux [x - 1] [y] = '█';
						colocado = true;
						
					}
					
				}
				else if (random == 1) {
					
					if (tableroAux [x + 1] [y] == ' ') {
						
						tableroAux [x + 1] [y] = '█';
						colocado = true;
						
					}
					
				}
				else if (random == 2) {
					
					if (tableroAux [x - 1] [y - 1] == ' ') {
						
						tableroAux [x - 1] [y - 1] = '█';
						colocado = true;
						
					}
					
				}
				else if (random == 3) {
					
					if (tableroAux [x] [y - 1] == ' ') {
						
						tableroAux [x] [y - 1] = '█';
						colocado = true;
						
					}
					
				}
				else if (random == 4) {
					
					if (tableroAux [x + 1] [y - 1] == ' ') {
						
						tableroAux [x + 1] [y - 1] = '█';
						colocado = true;
						
					}
					
				}
				
			}
			else if (posicion.equalsIgnoreCase("central")) {
				
				random = (int) (Math.random() * 8);
				if (random == 0) {
					
					if (tableroAux [x - 1] [y - 1] == ' ') {
						
						tableroAux [x - 1] [y - 1] = '█';
						colocado = true;
						
					}
					
				}
				else if (random == 1) {
					
					if (tableroAux [x] [y - 1] == ' ') {
						
						tableroAux [x] [y - 1] = '█';
						colocado = true;
						
					}
					
				}
				else if (random == 2) {
					
					if (tableroAux [x + 1] [y - 1] == ' ') {
						
						tableroAux [x + 1] [y - 1] = '█';
						colocado = true;
						
					}
					
				}
				else if (random == 3) {
					
					if (tableroAux [x - 1] [y] == ' ') {
						
						tableroAux [x - 1] [y] = '█';
						colocado = true;
						
					}
					
				}
				else if (random == 4) {
					
					if (tableroAux [x + 1] [y] == ' ') {
						
						tableroAux [x + 1] [y] = '█';
						colocado = true;
						
					}
					
				}
				else if (random == 5) {
					
					if (tableroAux [x - 1] [y + 1] == ' ') {
						
						tableroAux [x - 1] [y + 1] = '█';
						colocado = true;
						
					}
					
				}
				else if (random == 6) {
					
					if (tableroAux [x] [y + 1] == ' ') {
						
						tableroAux [x] [y + 1] = '█';
						colocado = true;
						
					}
					
				}
				else if (random == 7) {
					
					if (tableroAux [x + 1] [y + 1] == ' ') {
						
						tableroAux [x + 1] [y + 1 ] = '█';
						colocado = true;
						
					}
					
				}
				
			}
			
		} while (colocado == false);
		
		
	}

	//Este procedimiento te muestra la tabla
	
	public void MostrarTabla (char [][] tablero, char[][] tableroAux) {
		
		System.out.println(" ");
		
		System.out.print("\n      __________");
		for (int ciclos = 0; ciclos < tablero.length; ciclos++ )System.out.print("_");
		System.out.print("__________");
		
		System.out.print("\n      |_|       ");
		for (int ciclos = 0; ciclos < tablero.length; ciclos++ )System.out.print(" ");
		System.out.print("       |_|");
		
		System.out.print("\n      |         ");
		for (int ciclos = 0; ciclos < tablero.length; ciclos++ )System.out.print(" ");
		System.out.print("         |");
		
		System.out.print("\n      |        _");
		for (int ciclos = 0; ciclos < tablero.length; ciclos++ )System.out.print("_");
		System.out.print("_        |");
		
		for (int filas = 0; filas < tablero[0].length; filas ++) {
			
			System.out.print("\n      |        |");
			
			for (int columnas = 0; columnas < tablero.length; columnas++) System.out.print(tablero[columnas][filas]);
			
			System.out.print("|        |");
			
		}
		
		System.out.print("\n      |        |");
		for (int ciclos = 0; ciclos < tablero.length; ciclos++ )System.out.print("_");
		System.out.print("|        |");
		
		System.out.print("\n      |         ");
		for (int ciclos = 0; ciclos < tablero.length; ciclos++ )System.out.print(" ");
		System.out.print("         |");
		
		System.out.print("\n      |_        ");
		for (int ciclos = 0; ciclos < tablero.length; ciclos++ )System.out.print(" ");
		System.out.print("        _|");
		
		System.out.print("\n      |_|_______");
		for (int ciclos = 0; ciclos < tablero.length; ciclos++ )System.out.print("_");
		System.out.print("_______|_|");
		
	}

	//Aqui es donde se revisa una por una cada casilla y se modifica
	
	public void ComprobacionDeCelulas(char[][] tablero, char[][] tableroAux, int[] reglas) {
		
		String posicionActual;
		for (int filas = 0; filas < tableroAux[0].length; filas ++) {
			
			for (int columnas = 0; columnas < tableroAux.length; columnas ++) {
				
				posicionActual = ComprobarCasillas(columnas,filas,tablero,tableroAux);
				reglasCelulosa(posicionActual,tablero,tableroAux,columnas,filas,reglas);
				
				
			}
			
		}
		CopiarTabla(tablero,tableroAux);
		MostrarTabla(tablero,tableroAux);
		
	}
	
	// Procedimiento que pasa la cantidad de celulas vivas respecto ha esa posicion
	
	public void reglasCelulosa(String pos, char[][] tablero, char[][] tableroAux, int x, int y, int [] reglas) {
		
		int totalCelulosas = 0; 
		
		if (pos.equalsIgnoreCase("CornerSL")) {
			
			if (tablero [x + 1] [y] == '█') totalCelulosas++;
			if (tablero [x] [y + 1] == '█') totalCelulosas++;
			if (tablero [x + 1] [y + 1] == '█') totalCelulosas++;
			
		}
		else if (pos.equalsIgnoreCase("CornerSR")) {
			
			if (tablero [x - 1] [y] == '█') totalCelulosas++;
			if (tablero [x] [y + 1] == '█') totalCelulosas++;
			if (tablero [x - 1] [y + 1] == '█') totalCelulosas++;
			
		}
		else if (pos.equalsIgnoreCase("CornerIR")) {
			
			if (tablero [x - 1] [y] == '█') totalCelulosas++;
			if (tablero [x] [y - 1] == '█') totalCelulosas++;
			if (tablero [x - 1] [y - 1] == '█') totalCelulosas++;
			
		}
		else if (pos.equalsIgnoreCase("CornerIL")) {
			
			if (tablero [x + 1] [y] == '█') totalCelulosas++;
			if (tablero [x] [y - 1] == '█') totalCelulosas++;
			if (tablero [x + 1] [y - 1] == '█') totalCelulosas++;
			
		}
		else if (pos.equalsIgnoreCase("LateralL")) {
			
			if (tablero [x + 1] [y] == '█') totalCelulosas++;
			if (tablero [x] [y - 1] == '█') totalCelulosas++;
			if (tablero [x + 1] [y - 1] == '█') totalCelulosas++;
			if (tablero [x] [y + 1] == '█') totalCelulosas++;
			if (tablero [x + 1] [y + 1] == '█') totalCelulosas++;
			
		}
		else if (pos.equalsIgnoreCase("LateralR")) {
			
			if (tablero [x - 1] [y] == '█') totalCelulosas++;
			if (tablero [x] [y - 1] == '█') totalCelulosas++;
			if (tablero [x - 1] [y - 1] == '█') totalCelulosas++;
			if (tablero [x] [y + 1] == '█') totalCelulosas++;
			if (tablero [x - 1] [y + 1] == '█') totalCelulosas++;
			
		}
		else if (pos.equalsIgnoreCase("Superior")) {
			
			if (tablero [x - 1] [y] == '█') totalCelulosas++;
			if (tablero [x + 1] [y] == '█') totalCelulosas++;
			if (tablero [x - 1] [y + 1] == '█') totalCelulosas++;
			if (tablero [x] [y + 1] == '█') totalCelulosas++;
			if (tablero [x + 1] [y + 1] == '█') totalCelulosas++;
			
		}
		else if (pos.equalsIgnoreCase("Inferior")) {
			
			if (tablero [x - 1] [y] == '█') totalCelulosas++;
			if (tablero [x + 1] [y] == '█') totalCelulosas++;
			if (tablero [x - 1] [y - 1] == '█') totalCelulosas++;
			if (tablero [x] [y - 1] == '█') totalCelulosas++;
			if (tablero [x + 1] [y - 1] == '█') totalCelulosas++;
			
		}
		else if (pos.equalsIgnoreCase("central")){
			
			if (tablero [x - 1] [y - 1] == '█') totalCelulosas++;
			if (tablero [x] [y - 1] == '█') totalCelulosas++;
			if (tablero [x + 1] [y - 1] == '█') totalCelulosas++;
			if (tablero [x - 1] [y] == '█') totalCelulosas++;
			if (tablero [x + 1] [y] == '█') totalCelulosas++;
			if (tablero [x - 1] [y + 1] == '█') totalCelulosas++;
			if (tablero [x ] [y + 1] == '█') totalCelulosas++;
			if (tablero [x + 1] [y + 1] == '█') totalCelulosas++;
			
		}
		tableroAux [x] [y] = Sentencias(totalCelulosas,tablero,tableroAux,x,y,reglas);
		
	}
	
	//Funcion que sentencia la vida o la muerte de esa celula... buena suerte para ella...
	
	public char Sentencias(int cantidad, char[][] tablero, char [][] tableroAux, int x, int y, int [] reglas) {
		
		char estado = ' ';
		
		if (tablero [x] [y] != '█') {
			
			if (cantidad == reglas[0]) estado = '█';
			else estado = ' ';
			
		}
		else {
			
			if ((cantidad == reglas[1]) || (cantidad == reglas[2])) estado = '█';
			else estado = ' ';
			
		}
		
		return estado;
		
	}
	
	//Un metodo que devuelve una array donde estan las reglas con las que se quieren que el juego inicilize
	
	public int [] AssignacionDeLasReglas () {
		
		final int MINOPCION = 1;
		final int MAXOPCION = 2;
		final int MINSNACER = 0;
		final int MINSOBREVIVIR = 0;
		final int MAXSNACER = 8;
		
		System.out.println(" ");
		System.out.println("      ___________________________________________________________________________     ");
		System.out.println("      |_|                                                                     |_|     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |           C O L O C A C I O N   D E   L A S   R E G L A S               |     ");
		System.out.println("      |_                                                                       _|     ");
		System.out.println("      |_|_____________________________________________________________________|_|     ");
		System.out.println("      |_|                                                                     |_|     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |          Quieres modificar las reglas de las celulas?                   |     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |          1.- No                                                         |     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |          2.- Si                                                         |     ");
		System.out.println("      |                                                                         |     ");
		System.out.println("      |_                                                                       _|     ");
		System.out.println("      |_|_____________________________________________________________________|_|     ");
		
		int opcionSeleccionada = inputValores(MINOPCION,MAXOPCION);
		
		//Posicion 0 es la cantidad que se necesita para nacer, posicion 1 es el minimo para sobrevivir y posicion 2 es el maximo
		
		int [] reglasDelJuego = new int [3];
		reglasDelJuego[0] = 3;
		reglasDelJuego[1] = 2;
		reglasDelJuego[2] = 3;
		
		if (opcionSeleccionada == 2) {
			
			
			System.out.println(" ");
			System.out.println("      ___________________________________________________________________________     ");
			System.out.println("      |_|                                                                     |_|     ");
			System.out.println("      |                                                                         |     ");
			System.out.println("      |           C O L O C A C I O N   D E   L A S   R E G L A S               |     ");
			System.out.println("      |_                                                                       _|     ");
			System.out.println("      |_|_____________________________________________________________________|_|     ");
			System.out.println("      |_|                                                                     |_|     ");
			System.out.println("      |                                                                         |     ");
			System.out.println("      |                                                                         |     ");
			System.out.println("      |          Cuatas celulas vecinas necesitamos para Nacer?                 |     ");
			System.out.println("      |                                                                         |     ");
			System.out.println("      |_                                                                       _|     ");
			System.out.println("      |_|_____________________________________________________________________|_|     ");
			
			reglasDelJuego[0] = inputValores(MINSNACER,MAXSNACER);
			
			System.out.println(" ");
			System.out.println("      ___________________________________________________________________________     ");
			System.out.println("      |_|                                                                     |_|     ");
			System.out.println("      |                                                                         |     ");
			System.out.println("      |           C O L O C A C I O N   D E   L A S   R E G L A S               |     ");
			System.out.println("      |_                                                                       _|     ");
			System.out.println("      |_|_____________________________________________________________________|_|     ");
			System.out.println("      |_|                                                                     |_|     ");
			System.out.println("      |                                                                         |     ");
			System.out.println("      |                                                                         |     ");
			System.out.println("      |          Cuatas celulas vecinas (MINIMAS) necesitamos para Sobrevivir?  |     ");
			System.out.println("      |                                                                         |     ");
			System.out.println("      |_                                                                       _|     ");
			System.out.println("      |_|_____________________________________________________________________|_|     ");
			
			reglasDelJuego[1] = inputValores(MINSOBREVIVIR,MAXSNACER);

			System.out.println(" ");
			System.out.println("      ___________________________________________________________________________     ");
			System.out.println("      |_|                                                                     |_|     ");
			System.out.println("      |                                                                         |     ");
			System.out.println("      |           C O L O C A C I O N   D E   L A S   R E G L A S               |     ");
			System.out.println("      |_                                                                       _|     ");
			System.out.println("      |_|_____________________________________________________________________|_|     ");
			System.out.println("      |_|                                                                     |_|     ");
			System.out.println("      |                                                                         |     ");
			System.out.println("      |                                                                         |     ");
			System.out.println("      |          Cuatas celulas vecinas (MAXIMAS) necesitamos para Sobrevivir?  |     ");
			System.out.println("      |                                                                         |     ");
			System.out.println("      |_                                                                       _|     ");
			System.out.println("      |_|_____________________________________________________________________|_|     ");
			
			reglasDelJuego[2] = inputValores(reglasDelJuego[1],MAXSNACER);
			
			return reglasDelJuego;
			
		}
		else return reglasDelJuego;
				
	}
	
}
package Exercici03;
import java.util.Scanner;

public class Exercici80 {
	
	public static final int LIMITE = 40;
	public static char tablaLetras [] = new char[LIMITE] , tablaGrafico [] = new char[LIMITE];
	public static int tablaAsignar [] = new int[LIMITE] , tablaEstado [] = new int[LIMITE] , tablaTurnos [] = new int[LIMITE];
	public static int posicion = 0 , turnos1D = 0 , turnos2D = 0 , turnos = 0 , puntos = 0;
	public static int aleatorio = 0 , aleatorioTurno = 0 , limiteLargo = 0 , barcoPequeño = 0 , barcoMediano = 0 , barcoGrande = 0 , apuntar = 0 , toques = 14 , numeroauto;
	public static boolean asignados = false , diferente = false , hundido = false , barcoAsignado = false , partidaFinalizada = false , error = false , salirpartida = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("\n80. Fer un joc d'enfonsar la flota en un canal de 40 posicions(array 1 dimensió) on és situin\r\n"
				+ "\naleatoriament 5 vaixells (dos de mida 2, dos de mida 3, un de mida 4) no poden estar enganxats\r\n"
				+ "\n(s'ha de deixar una casella d'aigua entre mig) i no poden estar solapats. Per cada tirada l'usuari\r\n"
				+ "\nintroduirà una posició i l'aplicatiu li dirà tocat i la mida del vaixell tocat o aigua en cas contrari. Si\r\n"
				+ "\nel tocat provoca enfonsat ens haurà de dir tocat i enfonsat. Després de cada tirada haurà\r\n"
				+ "\nd'imprimir per pantalla una representació del taulell on T serà tocat, A serà aigua i X quan estigui\r\n"
				+ "\nenfonsat. Si no l'hem disparat un *. Quan tots estiguin enfonsats s'acabarà el programa i ens dirà\r\n"
				+ "\nquantes tirades hem fet. Es podrà sortir del programa si l'usuari introdueix el número 40.\r\n"
				+ "\nExemple impressió taulell de joc on s'ha disparat 14 vegades:\r\n"
				+ "\n|A|*|*|*|A|*|*|*|*|T|T|*|*|*|X|X|*|X|X|*|*|A|A|*|*|T|T|T|*|*|*|A|*|*|*|*|*|*|*|*");*/
		int opcionMenu = 0;
		Scanner entradaOpcionMenu = new Scanner(System.in);
		Scanner entradaApuntar = new Scanner(System.in);
		do {
			
			menu();
			opcionMenu = entradaOpcionMenu.nextInt();
			reseteoTablas();
			
			if ( opcionMenu == 1 ) {
				
				reseteoTablas();
				letraJugarPartida();
				
				do {
					
					if (turnos2D == 9) {
						
						turnos2D = 0;
						turnos1D ++;
						
					}
					else turnos2D ++;
					turnos++;
					letraTurno();
					mostrarTurno();
					do {
						
						apuntar = entradaApuntar.nextInt();
						if ( apuntar == 50 ) {
							
							salirpartida = true;
							diferente = true;
							
						}
						else if ( ( apuntar < 1 ) || ( apuntar > 40 ) ) respuestaPosicionErroneaLimites();
						else if ( apuntar == tablaTurnos[apuntar - 1]) respuestaPosicionErronea();
						else {
							
							diferente = true;
							cambioTabla();
						}
						
							
					} while ( (diferente == false) && (salirpartida == false));
					
					diferente = false;
					if (salirpartida == true) partidaFinalizada = true;
					
				} while ((partidaFinalizada == false));
				
				if (salirpartida == true) partidaFinalizada = false;
				if ((partidaFinalizada == true)) finalizacion();
				salirpartida = false;
			}
			
			if ( opcionMenu == 2 ) {
				
				reseteoTablas();
				letraJugarPartida();
				
				do {
					
					if (turnos2D == 9) {
						
						turnos2D = 0;
						turnos1D ++;
						
					}
					else turnos2D ++;
					turnos++;
					letraTurno();
					mostrarTurno();
					do {
						
						numeroauto = (int) (Math.random() * 40 + 1);
						if ( ( numeroauto < 1 ) || ( numeroauto > 40 ) ) respuestaPosicionErroneaLimites();
						else if ( numeroauto == tablaTurnos[numeroauto - 1]) respuestaPosicionErronea();
						else {
							
							apuntar = numeroauto;
							diferente = true;
							cambioTabla();
						}
						
							
					} while ( (diferente == false) && (salirpartida == false));
					
					diferente = false;
					if (salirpartida == true) partidaFinalizada = true;
					
				} while ((partidaFinalizada == false));
				
				if (salirpartida == true) partidaFinalizada = false;
				if ((partidaFinalizada == true)) finalizacion();
				salirpartida = false;
			}
			
		}while( (opcionMenu == 1) || opcionMenu == 2);
		
		
	}
	public static void menu() {
		
		System.out.println(" ");
		System.out.println("_____________________________________________________________________________________________________");
		System.out.println("|                                                                                                    |");
		System.out.println("|  00  00  00  00  00  00  0000    00  0000      00    000000    0000  00    000000  000000  000000  |");
		System.out.println("|  00  00  00  00  000 00  00  00  00  00  00    00    00  00    00    00    00  00    00    00  00  |");
		System.out.println("|  000000  00  00  00 000  00  00  00  0000      00    000000    0000  00    00  00    00    000000  |");
		System.out.println("|  00  00  000000  00  00  0000    00  00  00    0000  00  00    00    0000  000000    00    00  00  |");
		System.out.println("|                                                                                                    |");
		System.out.println("|                                        Hecho por : Ramon Rios                                      |");
		System.out.println("|____________________________________________________________________________________________________|");
		System.out.println(" ");
		System.out.println("    _____________________________________________________________________________________________");
		System.out.println("    |                                                                                            |");
		System.out.println("    |                                         M E N U                                            |");
		System.out.println("    |                                        _________                                           |");
		System.out.println("    |                                                                                            |");
		System.out.println("    |                Escoje una opción escribiendo un numero y dandole al enter                  |");
		System.out.println("    |                                                                                            |");
		System.out.println("    |                                       1 .-  JUGAR                                          |");
		System.out.println("    |                                                                                            |");
		System.out.println("    |                                       2 .-  PARTIDA AUTO                                   |");
		System.out.println("    |                                                                                            |");
		System.out.println("    |                                       3 .-  SALIR                                          |");
		System.out.println("    |                                                                                            |");
		System.out.println("    |____________________________________________________________________________________________|");
		System.out.println(" ");
		System.out.println(" ");
		
	}
	public static void letraJugarPartida () {
		
		System.out.println("");
		System.out.println("_____________________________________________________________________________________________________");
		System.out.println("|                                                                                                    |");
		System.out.println("|                                   P A R T I D A    E M P E Z A D A                                 |");
		System.out.println("|____________________________________________________________________________________________________|");
		System.out.println(" ");
		
	}
	public static void letraTurno () {
		
		System.out.println("_____________________________________________________________________________________________________");
		System.out.println("|                                                                                                    |");
		System.out.println("|                                   T U R N O    N U M E R O   :  " + turnos1D + " " + turnos2D + "                                |");
		System.out.println("|____________________________________________________________________________________________________|");
	}
	public static void reseteoTablas() {
		
		turnos1D = 0;
		turnos2D = 0;
		turnos = -1;
		barcoPequeño = 2;
		barcoMediano = 2;
		barcoGrande = 1;
		toques = 14;
		puntos = 0;
		for ( posicion = 0 ; posicion < LIMITE ; posicion ++) {
			
			tablaLetras[posicion] = '*';
			tablaEstado[posicion] = 0;
			tablaAsignar[posicion] = 0;
			tablaTurnos[posicion] = 0;
			tablaGrafico[posicion] = '~';
			
		}
		do{
			if (barcoGrande > 0) {

				barcoAsignado = false;
				do {
					
					aleatorio = (int) (Math.random() * 40);
					if ( aleatorio == 0 ) {
						
						if ( ( tablaAsignar[aleatorio] == 0 ) && ( tablaAsignar[aleatorio + 1 ] == 0 ) && ( tablaAsignar[aleatorio + 2] == 0 ) && ( tablaAsignar[aleatorio + 3] == 0 ) && ( tablaAsignar[aleatorio + 4] == 0 ) ) {
							
							tablaAsignar[aleatorio] = 1;
							tablaAsignar[aleatorio + 1] = 1;
							tablaAsignar[aleatorio + 2] = 1;
							tablaAsignar[aleatorio + 3] = 1;
							barcoAsignado = true;
							barcoGrande --;
							
						}
						
					}
					else if ( aleatorio == 36 ) {
						
						if ( ( tablaAsignar[aleatorio - 1] == 0 ) && ( tablaAsignar[aleatorio] == 0 ) && ( tablaAsignar[aleatorio + 1 ] == 0 ) && ( tablaAsignar[aleatorio + 2] == 0 ) && ( tablaAsignar[aleatorio + 3] == 0 ) ) {
							
							tablaAsignar[aleatorio] = 1;
							tablaAsignar[aleatorio + 1] = 1;
							tablaAsignar[aleatorio + 2] = 1;
							tablaAsignar[aleatorio + 3] = 1;
							barcoAsignado = true;
							barcoGrande --;
						}
						
					}
					else if ( ( aleatorio > 0 ) && ( aleatorio < 36 ) ) {
						
						if ( ( tablaAsignar[aleatorio - 1] == 0 ) && ( tablaAsignar[aleatorio] == 0 ) && ( tablaAsignar[aleatorio + 1 ] == 0 ) && ( tablaAsignar[aleatorio + 2] == 0 ) && ( tablaAsignar[aleatorio + 3] == 0 ) && ( tablaAsignar[aleatorio + 4] == 0 ) ) {
							
							tablaAsignar[aleatorio] = 1;
							tablaAsignar[aleatorio + 1] = 1;
							tablaAsignar[aleatorio + 2] = 1;
							tablaAsignar[aleatorio + 3] = 1;
							barcoAsignado = true;
							barcoGrande --;
						}
						
					}
					
					
				} while ( barcoAsignado == false);
				
			}
			else if (barcoMediano > 0) {

				barcoAsignado = false;
				do {
					
					aleatorio = (int) (Math.random() * 40);
					if ( aleatorio == 0 ) {
						
						if ( ( tablaAsignar[aleatorio] == 0 ) && ( tablaAsignar[aleatorio + 1 ] == 0 ) && ( tablaAsignar[aleatorio + 2] == 0 ) && ( tablaAsignar[aleatorio + 3] == 0 ) ) {
							
							tablaAsignar[aleatorio] = 1;
							tablaAsignar[aleatorio + 1] = 1;
							tablaAsignar[aleatorio + 2] = 1;
							barcoAsignado = true;
							barcoMediano --;
							
						}
						
					}
					else if ( aleatorio == 37 ) {
						
						if ( ( tablaAsignar[aleatorio - 1] == 0 ) && ( tablaAsignar[aleatorio] == 0 ) && ( tablaAsignar[aleatorio + 1 ] == 0 ) && ( tablaAsignar[aleatorio + 2] == 0 ) ) {
							
							tablaAsignar[aleatorio] = 1;
							tablaAsignar[aleatorio + 1] = 1;
							tablaAsignar[aleatorio + 2] = 1;
							barcoAsignado = true;
							barcoMediano --;
						}
						
					}
					else if ( ( aleatorio > 0 ) && ( aleatorio < 37 ) ) {
						
						if ( ( tablaAsignar[aleatorio - 1] == 0 ) && ( tablaAsignar[aleatorio] == 0 ) && ( tablaAsignar[aleatorio + 1 ] == 0 ) && ( tablaAsignar[aleatorio + 2] == 0 ) && ( tablaAsignar[aleatorio + 3] == 0 ) ) {
							
							tablaAsignar[aleatorio] = 1;
							tablaAsignar[aleatorio + 1] = 1;
							tablaAsignar[aleatorio + 2] = 1;
							barcoAsignado = true;
							barcoMediano --;
						}
						
					}
					
					
				} while ( barcoAsignado == false);
				
			}
			else if (barcoPequeño > 0) { 

				barcoAsignado = false;
				do {
					
					aleatorio = (int) (Math.random() * 40);
					if ( aleatorio == 0 ) {
						
						if ( ( tablaAsignar[aleatorio] == 0 ) && ( tablaAsignar[aleatorio + 1 ] == 0 ) && ( tablaAsignar[aleatorio + 2] == 0 ) ) {
							
							tablaAsignar[aleatorio] = 1;
							tablaAsignar[aleatorio + 1] = 1;
							barcoAsignado = true;
							barcoPequeño --;
							
						}
						
					}
					else if ( aleatorio == 38 ) {
						
						if ( ( tablaAsignar[aleatorio - 1] == 0 ) && ( tablaAsignar[aleatorio] == 0 ) && ( tablaAsignar[aleatorio + 1 ] == 0 ) ) {
							
							tablaAsignar[aleatorio] = 1;
							tablaAsignar[aleatorio + 1] = 1;
							barcoAsignado = true;
							barcoPequeño --;
						}
						
					}
					else if ( ( aleatorio > 0 ) && ( aleatorio < 37 ) ) {
						
						if ( ( tablaAsignar[aleatorio - 1] == 0 ) && ( tablaAsignar[aleatorio] == 0 ) && ( tablaAsignar[aleatorio + 1 ] == 0 ) && ( tablaAsignar[aleatorio + 2] == 0 ) && ( tablaAsignar[aleatorio + 3] == 0 ) ) {
							
							tablaAsignar[aleatorio] = 1;
							tablaAsignar[aleatorio + 1] = 1;
							barcoAsignado = true;
							barcoPequeño --;
						}
						
					}
					
					
				} while ( barcoAsignado == false);
				
			}
			
			if ( ( barcoPequeño == 0 ) && ( barcoMediano == 0 ) && ( barcoGrande == 0 ) ) asignados = true;
				
		} while ( asignados == false );
		
		asignados = false;
		
	}
	public static void mostrarTurno () {
		
													System.out.println("|                                                                                                    |");
													System.out.println("|          _________________________________________________________________________________         |");
													System.out.println("|          |                                                                               |         |");
													System.out.println("|          |     P O S I C I O N    N U M E R I C A    ( R E P R E .    L E T R A S )      |         |");
													System.out.println("|          |_______________________________________________________________________________|         |");
													System.out.println("|          |0|0|0|0|0|0|0|0|0|1|1|1|1|1|1|1|1|1|1|2|2|2|2|2|2|2|2|2|2|3|3|3|3|3|3|3|3|3|3|4|         |");
													System.out.println("|          |1|2|3|4|5|6|7|8|9|0|1|2|3|4|5|6|7|8|9|0|1|2|3|4|5|6|7|8|9|0|1|2|3|4|5|6|7|8|9|0|         |");
													System.out.println("|          |_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|         |");
													System.out.println("|          | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |         |");
													System.out.println("|          |" + tablaLetras[0] + "|" + tablaLetras[1] + "|" + tablaLetras[2] + "|" + tablaLetras[3] + "|" + tablaLetras[4] + "|" + tablaLetras[5] + "|" + tablaLetras[6] + "|" + tablaLetras[7] + "|" + tablaLetras[8] + "|" + tablaLetras[9] + "|" + tablaLetras[10] + "|" + tablaLetras[11] + "|" + tablaLetras[12] + "|" + tablaLetras[13] + "|" + tablaLetras[14] + "|" + tablaLetras[15] + "|" + tablaLetras[16] + "|" + tablaLetras[17] + "|" + tablaLetras[18] + "|" + tablaLetras[19] + "|" + tablaLetras[20] + "|" + tablaLetras[21] + "|" + tablaLetras[22] + "|" + tablaLetras[23] + "|" + tablaLetras[24] + "|" + tablaLetras[25] + "|" + tablaLetras[26] + "|" + tablaLetras[27] + "|" + tablaLetras[28] + "|" + tablaLetras[29] + "|" + tablaLetras[30] + "|" + tablaLetras[31] + "|" + tablaLetras[32] + "|" + tablaLetras[33] + "|" + tablaLetras[34] + "|" + tablaLetras[35] + "|" + tablaLetras[36] + "|" + tablaLetras[37] + "|" + tablaLetras[38] + "|" + tablaLetras[39] + "|         |");
													System.out.println("|          |_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|         |");
													System.out.println("|                                                                                                    |");
													System.out.println("|          _________________________________________________________________________________         |");
													System.out.println("|          |                                                                               |         |");
													System.out.println("|          |     P O S I C I O N    N U M E R I C A    ( R E P R E .    G R A F I C A )    |         |");
													System.out.println("|          |_______________________________________________________________________________|         |");
													System.out.println("|          |0|0|0|0|0|0|0|0|0|1|1|1|1|1|1|1|1|1|1|2|2|2|2|2|2|2|2|2|2|3|3|3|3|3|3|3|3|3|3|4|         |");
													System.out.println("|          |1|2|3|4|5|6|7|8|9|0|1|2|3|4|5|6|7|8|9|0|1|2|3|4|5|6|7|8|9|0|1|2|3|4|5|6|7|8|9|0|         |");
													System.out.println("|          |_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|         |");
													System.out.println("|          | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |         |");
													System.out.println("|          |" + tablaGrafico[0] + "|" + tablaGrafico[1] + "|" + tablaGrafico[2] + "|" + tablaGrafico[3] + "|" + tablaGrafico[4] + "|" + tablaGrafico[5] + "|" + tablaGrafico[6] + "|" + tablaGrafico[7] + "|" + tablaGrafico[8] + "|" + tablaGrafico[9] + "|" + tablaGrafico[10] + "|" + tablaGrafico[11] + "|" + tablaGrafico[12] + "|" + tablaGrafico[13] + "|" + tablaGrafico[14] + "|" + tablaGrafico[15] + "|" + tablaGrafico[16] + "|" + tablaGrafico[17] + "|" + tablaGrafico[18] + "|" + tablaGrafico[19] + "|" + tablaGrafico[20] + "|" + tablaGrafico[21] + "|" + tablaGrafico[22] + "|" + tablaGrafico[23] + "|" + tablaGrafico[24] + "|" + tablaGrafico[25] + "|" + tablaGrafico[26] + "|" + tablaGrafico[27] + "|" + tablaGrafico[28] + "|" + tablaGrafico[29] + "|" + tablaGrafico[30] + "|" + tablaGrafico[31] + "|" + tablaGrafico[32] + "|" + tablaGrafico[33] + "|" + tablaGrafico[34] + "|" + tablaGrafico[35] + "|" + tablaGrafico[36] + "|" + tablaGrafico[37] + "|" + tablaGrafico[38] + "|" + tablaGrafico[39] + "|         |");
													System.out.println("|          |_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|         |");
													System.out.println("|                                                                                                    |");
													System.out.println("|                                                                                                    |");
		       if ( (puntos < 10) && (puntos > -1) )System.out.println("|           Puntos : "+puntos+"                                                                               |");
         else if ( (puntos >= 100) || puntos < -10 )System.out.println("|           Puntos : "+puntos+"                                                                             |");
		else if ( (puntos < 100) || (puntos > -10) )System.out.println("|           Puntos : "+puntos+"                                                                              |");
												    System.out.println("|                                                                                                    |");
													System.out.println("|           Inserta un numero del 1 al 40 para adivinar donde esta el barco ( 50 es salir )          |");
													System.out.println("|                                                                                                    |");
													System.out.println("|____________________________________________________________________________________________________|");
													System.out.println(" ");
		
	}
	
	public static void cambioTabla () {
		
		apuntar--;
		tablaTurnos [apuntar] = apuntar + 1;
		if ( tablaAsignar[apuntar] == 1 && tablaLetras[apuntar] == '*') {
			
			toques --;
			tablaLetras[apuntar] = 'T';
			tablaGrafico[apuntar] = '=';
			tablaEstado[apuntar] = 1;
			
			System.out.println(" ");
			System.out.println("_____________________________________________________________________________________________________");
			System.out.println("|                                                                                                    |");
			System.out.println("|                               T O C A D O                    + 1 0  Puntos                         |");
			System.out.println("|____________________________________________________________________________________________________|");
			puntos = puntos + 10;
			
		}
		else if (tablaAsignar[apuntar] == 0 && tablaLetras[apuntar] == '*') {
			
			tablaLetras[apuntar] = 'A';
			System.out.println(" ");
			System.out.println("_____________________________________________________________________________________________________");
			System.out.println("|                                                                                                    |");
			System.out.println("|                               A G U A                          - 3  Puntos                         |");
			System.out.println("|____________________________________________________________________________________________________|");
			puntos = puntos - 3;
			
		}
		if (toques == 0) partidaFinalizada = true;
		for ( posicion = 0 ; posicion < LIMITE; posicion ++) {
			
			if ( ( (posicion == 0) && tablaLetras[posicion] == 'T') && (tablaLetras[posicion + 1] == 'T') ) {
				
				tablaLetras[posicion] = 'X';
				tablaLetras[posicion + 1] = 'X';
				tablaGrafico[posicion] = '<';
				tablaGrafico[posicion + 1] = '>';
				if (tablaLetras[posicion + 2] != 'T') barcoReContraHundido();
				if ( tablaLetras[posicion + 2] == 'T') {
					
					tablaLetras[posicion + 2] = 'X';
					tablaGrafico[posicion + 1] = '=';
					tablaGrafico[posicion + 2] = '>';
					if (tablaLetras[posicion + 3] != 'T') barcoReContraHundido();
					if (tablaLetras[posicion + 3] == 'T') {
						
						tablaLetras[posicion + 3] = 'X';
						tablaGrafico[posicion + 2] = '=';
						tablaGrafico[posicion + 3] = '>';
						barcoReContraHundido();
					}
					
				}
				
			}
			else if ( ( (posicion == 39) && tablaLetras[posicion] == 'T') && (tablaLetras[posicion - 1] == 'T') ) {
				
				tablaLetras[posicion] = 'X';
				tablaLetras[posicion - 1] = 'X';
				tablaGrafico[posicion] = '>';
				tablaGrafico[posicion - 1] = '<';
				if (tablaLetras[posicion - 2] != 'T') barcoReContraHundido();
				if ( tablaLetras[posicion - 2] == 'T') {
					
					tablaLetras[posicion - 2] = 'X';
					tablaGrafico[posicion - 1] = '=';
					tablaGrafico[posicion - 2] = '<';
					if (tablaLetras[posicion - 3] != 'T') barcoReContraHundido();
					if (tablaLetras[posicion - 3] == 'T') {
						
						tablaLetras[posicion - 3] = 'X';
						tablaGrafico[posicion - 2] = '=';
						tablaGrafico[posicion - 3] = '<';
						barcoReContraHundido();
					}
					
				}
				
			}
			else if ( (posicion > 0) && (posicion <= 37) && (tablaLetras[posicion] == 'T' ) && ( tablaAsignar[posicion - 1] == 0) && (tablaLetras[posicion + 1] == 'T' ) && ( tablaAsignar[posicion + 2] == 0)){
				
				tablaLetras[posicion] = 'X';
				tablaLetras[posicion + 1] = 'X';
				tablaGrafico[posicion] = '<';
				tablaGrafico[posicion + 1] = '>';
				barcoReContraHundido();
				
			}
			else if ( (posicion > 0)&& (posicion <= 36) && (tablaLetras[posicion] == 'T' ) && ( tablaAsignar[posicion - 1] == 0) && (tablaLetras[posicion + 1] == 'T' ) && (tablaLetras[posicion + 2] == 'T' ) && ( tablaAsignar[posicion + 3] == 0)){
				
				tablaLetras[posicion] = 'X';
				tablaLetras[posicion + 1] = 'X';
				tablaLetras[posicion + 2] = 'X';
				tablaGrafico[posicion] = '<';
				tablaGrafico[posicion + 1] = '=';
				tablaGrafico[posicion + 2] = '>';
				barcoReContraHundido();
				
			}
			else if ( (posicion > 0)&& (posicion <= 35) &&(tablaLetras[posicion] == 'T' ) && ( tablaAsignar[posicion - 1] == 0) && (tablaLetras[posicion + 1] == 'T' ) && (tablaLetras[posicion + 2] == 'T' ) && (tablaLetras[posicion + 3] == 'T' ) && ( tablaAsignar[posicion + 4] == 0)){
				
				tablaLetras[posicion] = 'X';
				tablaLetras[posicion + 1] = 'X';
				tablaLetras[posicion + 2] = 'X';
				tablaLetras[posicion + 3] = 'X';
				tablaGrafico[posicion] = '<';
				tablaGrafico[posicion + 1] = '=';
				tablaGrafico[posicion + 2] = '=';
				tablaGrafico[posicion + 3] = '>';
				barcoReContraHundido();
				
			}
			
		}
		
		
	}
	public static void respuestaPosicionErronea () {
		
		aleatorioTurno = (int) (Math.random() * 5);
		if ( aleatorioTurno == 0 ) System.out.println("\nERROR : Debes introducir un numero que no has introducido anteriormente\n");
		else if ( aleatorioTurno == 1 ) System.out.println("\nERROR : Tu numero introducido lo has usado antes, pon otro numero\n");
		else if ( aleatorioTurno == 2 ) System.out.println("\nERROR : Pero comandante, porque quieres atacar el mismo sitio ?? introduce un numero que no hayas usado anteriormente\n");
		else if ( aleatorioTurno == 3 ) System.out.println("\nERROR : Te ha gustado tanto que quieres repetir... introduce un numero que no hayas usado anteriormente\n");
		else if ( aleatorioTurno == 4 ) System.out.println("\nERROR : La cuestion es apuntar a una direccion desconocida de forma tactica comandante... introduce un numero que no hayas usado anteriormente\n");
		else System.out.println("\nERROR : El humano es el unico ser vivo que se tropieza con la misma piedra 2 veces... o  mas... introduce un numero que no hayas usado anteriormente\n");
		error = true;
		
	}
	public static void respuestaPosicionErroneaLimites () {
		
		aleatorioTurno = (int) (Math.random() * 5);
		if ( aleatorioTurno == 0 ) System.out.println("\nERROR : Debes introducir un numero entre el 1 y el 40\n");
		else if ( aleatorioTurno == 1 ) System.out.println("\nERROR : Tu numero esta fuera de los limites, debes introducir un numero entre el 1 y el 40\n");
		else if ( aleatorioTurno == 2 ) System.out.println("\nERROR : Comandante, nuestra guerra esta en este pais no en otro... debes introducir un numero entre el 1 y el 40\n");
		else if ( aleatorioTurno == 3 ) System.out.println("\nERROR : Estas intentando llegar donde nadie ha llegado, debes introducir un numero entre el 1 y el 40\n");
		else if ( aleatorioTurno == 4 ) System.out.println("\nERROR : Comandante, no todo el mundo es tu enemigo... debes introducir un numero entre el 1 y el 40\n");
		else System.out.println("\nERROR : No intentes ir a la dimension del reves... debes introducir un numero entre el 1 y el 40\n");
		error = true;
		
	}
	public static void barcoReContraHundido() {
		
		System.out.println("|                                                                                                    |");
		System.out.println("|                               H U N D I D O                  + 2 0  Puntos                         |");
		System.out.println("|____________________________________________________________________________________________________|");
		puntos = puntos + 20;
		
	}
	public static void finalizacion() {
													System.out.println("|                                                                                                    |");
													System.out.println("|          _________________________________________________________________________________         |");
													System.out.println("|          |                                                                               |         |");
													System.out.println("|          |     P O S I C I O N    N U M E R I C A    ( R E P R E .    L E T R A S )      |         |");
													System.out.println("|          |_______________________________________________________________________________|         |");
													System.out.println("|          |0|0|0|0|0|0|0|0|0|1|1|1|1|1|1|1|1|1|1|2|2|2|2|2|2|2|2|2|2|3|3|3|3|3|3|3|3|3|3|4|         |");
													System.out.println("|          |1|2|3|4|5|6|7|8|9|0|1|2|3|4|5|6|7|8|9|0|1|2|3|4|5|6|7|8|9|0|1|2|3|4|5|6|7|8|9|0|         |");
													System.out.println("|          |_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|         |");
													System.out.println("|          | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |         |");
													System.out.println("|          |" + tablaLetras[0] + "|" + tablaLetras[1] + "|" + tablaLetras[2] + "|" + tablaLetras[3] + "|" + tablaLetras[4] + "|" + tablaLetras[5] + "|" + tablaLetras[6] + "|" + tablaLetras[7] + "|" + tablaLetras[8] + "|" + tablaLetras[9] + "|" + tablaLetras[10] + "|" + tablaLetras[11] + "|" + tablaLetras[12] + "|" + tablaLetras[13] + "|" + tablaLetras[14] + "|" + tablaLetras[15] + "|" + tablaLetras[16] + "|" + tablaLetras[17] + "|" + tablaLetras[18] + "|" + tablaLetras[19] + "|" + tablaLetras[20] + "|" + tablaLetras[21] + "|" + tablaLetras[22] + "|" + tablaLetras[23] + "|" + tablaLetras[24] + "|" + tablaLetras[25] + "|" + tablaLetras[26] + "|" + tablaLetras[27] + "|" + tablaLetras[28] + "|" + tablaLetras[29] + "|" + tablaLetras[30] + "|" + tablaLetras[31] + "|" + tablaLetras[32] + "|" + tablaLetras[33] + "|" + tablaLetras[34] + "|" + tablaLetras[35] + "|" + tablaLetras[36] + "|" + tablaLetras[37] + "|" + tablaLetras[38] + "|" + tablaLetras[39] + "|         |");
													System.out.println("|          |_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|         |");
													System.out.println("|                                                                                                    |");
													System.out.println("|          _________________________________________________________________________________         |");
													System.out.println("|          |                                                                               |         |");
													System.out.println("|          |     P O S I C I O N    N U M E R I C A    ( R E P R E .    G R A F I C A )    |         |");
													System.out.println("|          |_______________________________________________________________________________|         |");
													System.out.println("|          |0|0|0|0|0|0|0|0|0|1|1|1|1|1|1|1|1|1|1|2|2|2|2|2|2|2|2|2|2|3|3|3|3|3|3|3|3|3|3|4|         |");
													System.out.println("|          |1|2|3|4|5|6|7|8|9|0|1|2|3|4|5|6|7|8|9|0|1|2|3|4|5|6|7|8|9|0|1|2|3|4|5|6|7|8|9|0|         |");
													System.out.println("|          |_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|         |");
													System.out.println("|          | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |         |");
													System.out.println("|          |" + tablaGrafico[0] + "|" + tablaGrafico[1] + "|" + tablaGrafico[2] + "|" + tablaGrafico[3] + "|" + tablaGrafico[4] + "|" + tablaGrafico[5] + "|" + tablaGrafico[6] + "|" + tablaGrafico[7] + "|" + tablaGrafico[8] + "|" + tablaGrafico[9] + "|" + tablaGrafico[10] + "|" + tablaGrafico[11] + "|" + tablaGrafico[12] + "|" + tablaGrafico[13] + "|" + tablaGrafico[14] + "|" + tablaGrafico[15] + "|" + tablaGrafico[16] + "|" + tablaGrafico[17] + "|" + tablaGrafico[18] + "|" + tablaGrafico[19] + "|" + tablaGrafico[20] + "|" + tablaGrafico[21] + "|" + tablaGrafico[22] + "|" + tablaGrafico[23] + "|" + tablaGrafico[24] + "|" + tablaGrafico[25] + "|" + tablaGrafico[26] + "|" + tablaGrafico[27] + "|" + tablaGrafico[28] + "|" + tablaGrafico[29] + "|" + tablaGrafico[30] + "|" + tablaGrafico[31] + "|" + tablaGrafico[32] + "|" + tablaGrafico[33] + "|" + tablaGrafico[34] + "|" + tablaGrafico[35] + "|" + tablaGrafico[36] + "|" + tablaGrafico[37] + "|" + tablaGrafico[38] + "|" + tablaGrafico[39] + "|         |");
													System.out.println("|          |_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|         |");
													System.out.println("|                                                                                                    |");
													System.out.println("|                                                                                                    |");
													System.out.println("|____________________________________________________________________________________________________|");
											        System.out.println("|                                                                                                    |");
											        System.out.println("|         F E L I C I D A D E S    L A    P A R T I D A    H A     F I N A L I Z A D O               |");
				       							    System.out.println("|                                                                                                    |");
		       if ( (puntos < 10) && (puntos > -1) )System.out.println("|           Puntos : "+puntos+"                                                                               |");
         else if ( (puntos >= 100) || puntos < -10 )System.out.println("|           Puntos : "+puntos+"                                                                             |");
		else if ( (puntos < 100) || (puntos > -10) )System.out.println("|           Puntos : "+puntos+"                                                                              |");
		       										System.out.println("|                                                                                                    |");
		       										System.out.println("|           Turnos necesitados : " + turnos1D + turnos2D + "                                                                  |");
													System.out.println("|____________________________________________________________________________________________________|");
													partidaFinalizada = false;
													
	}

}

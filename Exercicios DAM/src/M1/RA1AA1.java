package M1;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class RA1AA1 {

	public static final int LIMITEGRAFICO = 20;
	public static boolean opcionFinalizado = false , assignacionFinalizado = false , confirmacionFinalizada = false , cancelarAssignacionFinalizado = false ;
	public static boolean confirmacionConfirmada = false , quantumFinalizado = false , graficaFinalizado = false , columnasInferiores = false;
	public static boolean calculoRRFinalizado = false , mostrarGraficoRRFinalizado = false , calculosFinalizado = false , turnArroundEncontrado = false;
	public static int opcionMenu = 0 , limite = 0 , posicion = 0 , posicion2 = 0 , numeroPosicion = 0 , numeroAleatorio = 0 , numeroRealPosicion = 0;
	public static int quantum = 0 , total = 0 , limiteRR = 0 , limiteRRA = 0 , quantumA = 0 , limiteA = 0 , posicionRR = 0 , totalA = 0 , cuentaveces = 0;
	public static int pequeñin = 0, posicionReal = 0, posicion3 = 0;
	public static double mitjanaTA = 0, mitjanaE = 0;
	public static int calculoRRFinalizadoN = 0 , numeroPosicionGraficaA = 0 , limiteRRAA = 0 , centenares = 0 , limiteRRAC = 0;
	public static char tablaCaracter [];
	public static String tablaGrafica [][];
	public static int tablaRR [] , tablaGraficaRR[] , tablaGraficaRRCaracter[] , numeroPosicionGrafica[] , tablaRRC[] , turnAround[], timeWaited[], endTime[]; 
	public static int tablaRRCC [];
	public static char confirmacion = ' ' ;
	public static Scanner entradaLimite = new Scanner(System.in) , entradaConfirmacion = new Scanner(System.in) , entradaValor = new Scanner(System.in);
	public static Scanner entradaQuantum = new Scanner(System.in) , entradaOpcionMenu = new Scanner(System.in);
	public static DecimalFormat dosDigitos = new DecimalFormat("#.00");
	
	public static void main(String[] args) {
		
		do {
			
			menu();
			if ( opcionMenu == 1 ) {
				
				do {
					
					if ( assignacionFinalizado == false ){
						do {

							assignacionProcessos();
							
						} while ( assignacionFinalizado == false  && opcionFinalizado == false );

					}
					if ( graficaFinalizado == false && cancelarAssignacionFinalizado == false){
						do {

							graficaRR();
							
						} while ( graficaFinalizado == false);

					}
					if ( calculosFinalizado == false && cancelarAssignacionFinalizado == false){
						do {

							calculoRR();
							
						} while ( calculosFinalizado == false);

					}
					
				} while ( opcionFinalizado == false );
				
				
				opcionFinalizado = false;
				assignacionFinalizado = false;
				cancelarAssignacionFinalizado = false;
				graficaFinalizado = false;
				quantumFinalizado = false;
				calculosFinalizado = false;
				
			}
			else if ( opcionMenu == 2 ) {
				
				do {
					
					if ( assignacionFinalizado == false ){
						do {

							assignacionProcessos();
							
						} while ( assignacionFinalizado == false  && opcionFinalizado == false );

					}
					if ( graficaFinalizado == false && cancelarAssignacionFinalizado == false){
						do {

							graficaRR();
							
						} while ( graficaFinalizado == false);

					}
					if ( calculosFinalizado == false && cancelarAssignacionFinalizado == false){
						do {

							calculoRR();
							
						} while ( calculosFinalizado == false);

					}
					
				} while ( opcionFinalizado == false );
				
				
				opcionFinalizado = false;
				assignacionFinalizado = false;
				cancelarAssignacionFinalizado = false;
				graficaFinalizado = false;
				quantumFinalizado = false;
				calculosFinalizado = false;
				
			}
			
		} while ( ( opcionMenu == 1 ) || ( opcionMenu == 2 ) );
		
	}
	public static void menu() {
		
		
		System.out.println("     ____________________________________________________________________________________________________");
		System.out.println("     |                                                                                                  |");
		System.out.println("     |         0000     0000   00  00  00  00  00000     0000     0000   00000   000000  00  00         |");
		System.out.println("     |         00  00  00  00  00  00  000 00  00  00    00  00  00  00  00__00    00    000 00         |");
		System.out.println("     |         0000    00  00  00  00  00 000  00  00    0000    00  00  00  00    00    00 000         |");
		System.out.println("     |         00 000   0000    0000   00  00  0000      00 000   0000   00000   000000  00  00         |");
		System.out.println("     |                                                                                                  |");
		System.out.println("     |                                        Hecho por: Ramon Rios                                     |");
		System.out.println("     |__________________________________________________________________________________________________|");
		System.out.println(" ");
		System.out.println("          __________________________________________________________________________________________");
		System.out.println("          |                                                                                        |");
		System.out.println("          |                                         M E N Ú                                        |");
		System.out.println("          |                                        _________                                       |");
		System.out.println("          |                                                                                        |");
		System.out.println("          |              Escoje una opción escribiendo un numero y dandole al enter:               |");
		System.out.println("          |                                                                                        |");
		System.out.println("          |                                                                                        |");
		System.out.println("          |                         1 .-  Hacer Round Robin FCFS (First Come Fisrt Served)         |");
		System.out.println("          |                                                                                        |");
		System.out.println("          |                         2 .-  Hacer Round Robin SJF (Shortest Job First)               |");
		System.out.println("          |                                                                                        |");
		System.out.println("          |                         3 .-  Salir                                                    |");
		System.out.println("          |                                                                                        |");
		System.out.println("          |________________________________________________________________________________________|");
		System.out.println(" ");
		opcionMenu = entradaOpcionMenu.nextInt();
	}
	public static void assignacionProcessos () {
		
		limite = 0;
		preguntaAssignacion();
							  do { 
								  limite = entradaLimite.nextInt();
								  if ( limite == 0 ) {
									  
									  System.out.println("          __________________________________________________________________________________________");
									  System.out.println("          |                                                                                        |");
									  System.out.println("          |      Seguro que quieres salir ? ( Escribe Y para confirmar o N para no cofirmar)       |");
									  System.out.println("          |________________________________________________________________________________________|");
									  System.out.println(" ");
									  do {
										  
										  confirmacion = entradaConfirmacion.next().charAt(0);
										  if ( !( ( confirmacion == 'Y' ) || ( confirmacion == 'y' ) || ( confirmacion == 'N' ) || ( confirmacion == 'n' ) ) ) erroresConfirmacion();
										  else confirmacionConfirmada = true;
										  
									  } while ( confirmacionConfirmada == false );
									  confirmacionConfirmada = false;
									  if ( ( confirmacion == 'Y' ) || ( confirmacion == 'y') ) {
										  
										  opcionFinalizado = true;
										  cancelarAssignacionFinalizado = true; 
										  
									  }
									  if ( cancelarAssignacionFinalizado == false) preguntaAssignacion();
								  }
							  } while ( limite == 0 && cancelarAssignacionFinalizado == false );
							  if ( cancelarAssignacionFinalizado == false) {
								  
								  tablaRR = new int [limite];
								  tablaRRC = new int [limite];
								  tablaCaracter = new char [limite];
								  reseteoTabla();
								  
								  for (posicion = 0 ; posicion < limite ; posicion ++) {
									  
									    System.out.println(" ");
										System.out.println("          __________________________________________________________________________________________");
										System.out.println("          |                                                                                        |");
										System.out.println("          |             A S I G N A C I Ó N    ( V A L O R E S    D E   P R O C E S O S )          |");
										System.out.println("          |            ___________________________________________________________________         |");
										System.out.println("          |                                                                                        |");
																		
										for (posicion2 = 0 ; posicion2 < limite ; posicion2 ++) {
											
											numeroPosicion ++;
											if (tablaRR [posicion2] == 0) {
												
												if (numeroPosicion < 10) System.out.println("          |             P" + numeroPosicion + " = " + tablaCaracter [posicion2] + "                                                                     |");
												else System.out.println("          |             P" + numeroPosicion + " = " + tablaCaracter [posicion2] + "                                                                    |");
												
											}
											   else {
												   
												   if ( (numeroPosicion < 10 ) && tablaRR [posicion2] < 10) System.out.println("          |             P" + numeroPosicion + " = "+ tablaRR [posicion2] +"                                                                     |");
												   else if ((numeroPosicion >= 10 ) && tablaRR [posicion2] >= 10)System.out.println("          |             P" + numeroPosicion + " = "+ tablaRR [posicion2] +"                                                                   |");
												   else if ( (numeroPosicion >= 10 ))System.out.println("          |             P" + numeroPosicion + " = "+ tablaRR [posicion2] +"                                                                    |");
												   else if ( tablaRR [posicion2] >= 10)System.out.println("          |             P" + numeroPosicion + " = "+ tablaRR [posicion2] +"                                                                    |");
												   
												   
											   }
											   
										            System.out.println("          |                                                                                        |");
											
										}									
										
										numeroPosicion = 0;
										System.out.println("          |             La prioridad esta en el orden de los processos (pon processos de           |");
									    System.out.println("          |             Mas a Menos prioridad )                                                    |");
									    System.out.println("          |                                                                                        |");
										System.out.println("          |________________________________________________________________________________________|");
										System.out.println(" ");
										tablaRR [posicion] = entradaValor.nextInt();
										assignacionFinalizado = true;
										
								  }
								  
								  valoresAssignados();
								
							  }
							  
							  
		
	}
	public static void reseteoTabla() {
		
		
		for ( posicion = 0 ; posicion < limite ; posicion ++) {
			
			tablaRR [posicion] = 0;
			tablaRRC [posicion] = 0;
			tablaCaracter [posicion] = 'N';
			
		}
		numeroPosicionGrafica = new int [LIMITEGRAFICO];
		for ( posicion = 0 ; posicion < LIMITEGRAFICO ; posicion ++) {
			
			numeroPosicionGrafica[posicion] = numeroPosicionGrafica[posicion] + 1;
			
		}
		posicion = 0;
		
	}
	public static void erroresConfirmacion () {
		
		System.out.println(" ");
		numeroAleatorio = (int) (Math.random() * 2);
		if ( numeroAleatorio == 0) System.out.println("ERROR : Debes introducir una letra de Y para confirmar o N para no confirmar");
		else if ( numeroAleatorio == 1) System.out.println("ERROR : El caracter '" + confirmacion + "' no es la Y para confirmar o la N para no confirmar");
		System.out.println("");
	}
	public static void valoresAssignados () {
		
		System.out.println(" ");
		System.out.println("          __________________________________________________________________________________________");
		System.out.println("          |                                                                                        |");
		System.out.println("          |               V A L O R E S    D E   P R O C E S O S    A S S I G N A D O S            |");
		System.out.println("          |              _______________________________________________________________           |");
		System.out.println("          |                                                                                        |");
										
		for (posicion2 = 0 ; posicion2 < limite ; posicion2 ++) {
			
			numeroPosicion ++;
			if (tablaRR [posicion2] == 0) {
				
				if (numeroPosicion < 10) System.out.println("          |             P" + numeroPosicion + " = " + tablaCaracter [posicion2] + "                                                                     |");
				else System.out.println("          |             P" + numeroPosicion + " = " + tablaCaracter [posicion2] + "                                                                    |");
				
			}
			   else {
				   
				   if ( (numeroPosicion < 10 ) && tablaRR [posicion2] < 10) System.out.println("          |             P" + numeroPosicion + " = "+ tablaRR [posicion2] +"                                                                     |");
				   else if ((numeroPosicion >= 10 ) && tablaRR [posicion2] >= 10)System.out.println("          |             P" + numeroPosicion + " = "+ tablaRR [posicion2] +"                                                                   |");
				   else if ( (numeroPosicion >= 10 ))System.out.println("          |             P" + numeroPosicion + " = "+ tablaRR [posicion2] +"                                                                    |");
				   else if ( tablaRR [posicion2] >= 10)System.out.println("          |             P" + numeroPosicion + " = "+ tablaRR [posicion2] +"                                                                    |");
				   
				   
			   }
			   
		            System.out.println("          |                                                                                        |");
			
		}											
		
		numeroPosicion = 0;
		System.out.println("          |                                                                                        |");
		System.out.println("          |________________________________________________________________________________________|");
		total = 0;
		for ( posicion = 0 ; posicion < limite ; posicion++) {
			
			total = total + tablaRR [posicion];
			
		}
		totalA = total;
		do {
			
			totalA = totalA - 20;
			cuentaveces ++;
			
		} while ( totalA > 0 );
		total = 20 * cuentaveces;
		tablaGraficaRRCaracter = new int [total];
		limiteRR = 0;
		cuentaveces = 0;
		limiteRRA = total;
		quantum();
	}
	public static void quantum() {
		quantum = 0;
		System.out.println(" ");
        System.out.println("          __________________________________________________________________________________________");
        System.out.println("          |                                                                                        |");
        System.out.println("          |                       A S I G N A C I Ó N    D E    Q U A N T U M                      |");
        System.out.println("          |                      _____________________________________________                     |");
        System.out.println("          |                                                                                        |");
        System.out.println("          |             Introduce 'Q' numero de quantum que deseas :                               |");
        System.out.println("          |                                                                                        |");
        System.out.println("          |             'Q' = ?                                                                    |");
        System.out.println("          |                                                                                        |");
        System.out.println("          |________________________________________________________________________________________|");
        System.out.println(" ");
        quantum = entradaQuantum.nextInt();
        
	}
	public static void preguntaAssignacion() {
		
		              System.out.println(" ");
		              System.out.println("          __________________________________________________________________________________________");
		              System.out.println("          |                                                                                        |");
		              System.out.println("          |                                   A S I G N A C I Ó N                                  |");
		              System.out.println("          |                                  _____________________                                 |");
		              System.out.println("          |                                                                                        |");
		              System.out.println("          |             Introduce 'X' numero de processos que deseas analizar en este              |");
		              System.out.println("          |                                                                                        |");
if ( opcionMenu == 1 )System.out.println("          |             Round Robin FCFS (Fisrt Come Fisrt Served):                                |");
                 else System.out.println("          |             Round Robin SJF (Shortest Joined First):                                   |");
		              System.out.println("          |                                                                                        |");
		              System.out.println("          |             'X' = ?                                                                    |");
		              System.out.println("          |                                                                                        |");
		              System.out.println("          |________________________________________________________________________________________|");
		              System.out.println(" ");
		  
	}
	public static void graficaRR() {
		
		if ( opcionMenu == 1 ) calucloRRFCFS();
		else if ( opcionMenu == 2 ) calucloRRSJF();
		columnasInferiores = false;
		limiteRR = 0;
		
		do {
			
			System.out.println("          __________________________________________________________________________________________");
			System.out.println("          |                                                                                        |");
			System.out.println("          |                         G R A F I C A    D E    Q U A N T U M                          |");
			System.out.println("          |                        _______________________________________                         |");
			if ( ( columnasInferiores == true ) && ( limiteRR < 100) && ( limiteRR != 80) ) {
				
				for ( posicion = 0 ; posicion < LIMITEGRAFICO ; posicion ++) {
					
					numeroPosicionGrafica[posicion] = numeroPosicionGrafica[posicion] + limiteRRAA;
					if (limiteRR == 20) numeroPosicionGrafica[posicion] = numeroPosicionGrafica[posicion] + numeroPosicionGraficaA;
					numeroPosicionGraficaA ++;
				}
				System.out.println("          |            _____________________________________________________________               |");
				System.out.println("          |            |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |               |");
				System.out.println("          |            |" + numeroPosicionGrafica[0] + "|" + numeroPosicionGrafica[1] + "|" + numeroPosicionGrafica[2] + "|" + numeroPosicionGrafica[3] + "|" + numeroPosicionGrafica[4] + "|" + numeroPosicionGrafica[5] + "|" + numeroPosicionGrafica[6] + "|" + numeroPosicionGrafica[7] + "|" + numeroPosicionGrafica[8] + "|" + numeroPosicionGrafica[9] + "|" + numeroPosicionGrafica[10] + "|" + numeroPosicionGrafica[11] + "|" + numeroPosicionGrafica[12] + "|" + numeroPosicionGrafica[13] + "|" + numeroPosicionGrafica[14] + "|" + numeroPosicionGrafica[15] + "|" + numeroPosicionGrafica[16] + "|" + numeroPosicionGrafica[17] + "|" + numeroPosicionGrafica[18] + "|" + numeroPosicionGrafica[19] + "|               |");
				System.out.println("          |         ___|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|               |");
				numeroPosicionGraficaA = 0;
			}
			else if ( ( columnasInferiores == true ) && ( limiteRR == 80) ) {
				
				System.out.println("          |            _____________________________________________________________               |");
				System.out.println("          |            |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  | 1|               |");
				System.out.println("          |            |81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|00|               |");
				System.out.println("          |         ___|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|               |");
			}
			else if ( ( columnasInferiores == true ) && ( limiteRR == 100) ) {
				
				System.out.println("          |            _____________________________________________________________               |");
				System.out.println("          |            | 1| 1| 1| 1| 1| 1| 1| 1| 1| 1| 1| 1| 1| 1| 1| 1| 1| 1| 1| 1|               |");
				System.out.println("          |            |01|02|03|04|05|06|07|08|09|10|11|12|13|14|15|16|17|18|19|20|               |");
				System.out.println("          |         ___|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|               |");
			}
			else if ( ( columnasInferiores == true ) && ( limiteRR == 180) ) {
				
				System.out.println("          |            _____________________________________________________________               |");
				System.out.println("          |            | 1| 1| 1| 1| 1| 1| 1| 1| 1| 1| 1| 1| 1| 1| 1| 1| 1| 1| 1| 2|               |");
				System.out.println("          |            |81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|00|               |");
				System.out.println("          |         ___|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|               |");
			}
			else if ( ( columnasInferiores == true ) && ( limiteRR == 200) ) {
				
				System.out.println("          |            _____________________________________________________________               |");
				System.out.println("          |            | 2| 2| 2| 2| 2| 2| 2| 2| 2| 2| 2| 2| 2| 2| 2| 2| 2| 2| 2| 2|               |");
				System.out.println("          |            |01|02|03|04|05|06|07|08|09|10|11|12|13|14|15|16|17|18|19|20|               |");
				System.out.println("          |         ___|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|               |");
			}
			else if ( ( columnasInferiores == true ) && ( limiteRR >= 100) ) {
				
				for ( posicion = 0 ; posicion < LIMITEGRAFICO ; posicion ++) {
					
					numeroPosicionGrafica[posicion] = numeroPosicionGrafica[posicion] + limiteRRAA;
					if (limiteRRAC == 20) numeroPosicionGrafica[posicion] = numeroPosicionGrafica[posicion] + numeroPosicionGraficaA;
					numeroPosicionGraficaA ++;
				}
				System.out.println("          |            _____________________________________________________________               |");
				if ( centenares < 10 )System.out.println("          |            | " + centenares +"| " + centenares +"| " + centenares +"| " + centenares +"| " + centenares +"| " + centenares +"| " + centenares +"| " + centenares +"| " + centenares +"| " + centenares +"| " + centenares +"| " + centenares +"| " + centenares +"| " + centenares +"| " + centenares +"| " + centenares +"| " + centenares +"| " + centenares +"| " + centenares +"| " + centenares +"|               |");
				else System.out.println("          |            |" + centenares +"|" + centenares +"|" + centenares +"|" + centenares +"|" + centenares +"|" + centenares +"|" + centenares +"|" + centenares +"|" + centenares +"|" + centenares +"|" + centenares +"|" + centenares +"|" + centenares +"|" + centenares +"|" + centenares +"|" + centenares +"|" + centenares +"|" + centenares +"|" + centenares +"|" + centenares +"|               |");
				System.out.println("          |            |" + numeroPosicionGrafica[0] + "|" + numeroPosicionGrafica[1] + "|" + numeroPosicionGrafica[2] + "|" + numeroPosicionGrafica[3] + "|" + numeroPosicionGrafica[4] + "|" + numeroPosicionGrafica[5] + "|" + numeroPosicionGrafica[6] + "|" + numeroPosicionGrafica[7] + "|" + numeroPosicionGrafica[8] + "|" + numeroPosicionGrafica[9] + "|" + numeroPosicionGrafica[10] + "|" + numeroPosicionGrafica[11] + "|" + numeroPosicionGrafica[12] + "|" + numeroPosicionGrafica[13] + "|" + numeroPosicionGrafica[14] + "|" + numeroPosicionGrafica[15] + "|" + numeroPosicionGrafica[16] + "|" + numeroPosicionGrafica[17] + "|" + numeroPosicionGrafica[18] + "|" + numeroPosicionGrafica[19] + "|               |");
				System.out.println("          |         ___|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|               |");
				numeroPosicionGraficaA = 0;
			}
			else {
				columnasInferiores = true;
				System.out.println("          |            _____________________________________________________________               |");
				System.out.println("          |            |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |               |");
				System.out.println("          |            |01|02|03|04|05|06|07|08|09|10|11|12|13|14|15|16|17|18|19|20|               |");
				System.out.println("          |         ___|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|               |");
			}
			/*
			
			tablaCaracter[]
			
			*/
			
			for (posicion = 0 ; posicion < limite ; posicion ++) {
				
				numeroPosicion ++ ;
				if (numeroPosicion >= 10) {
					
					System.out.println("          |       __|  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |               |");
					System.out.println("          |       |_P" + numeroPosicion + "|" + tablaGrafica [posicion] [limiteRR] + "|" + tablaGrafica [posicion] [limiteRR + 1] + "|" + tablaGrafica [posicion] [limiteRR + 2] + "|" + tablaGrafica [posicion] [limiteRR + 3] + "|" + tablaGrafica [posicion] [limiteRR + 4] + "|" + tablaGrafica [posicion] [limiteRR + 5] + "|" + tablaGrafica [posicion] [limiteRR + 6] + "|" + tablaGrafica [posicion] [limiteRR + 7] + "|" + tablaGrafica [posicion] [limiteRR + 8] + "|" + tablaGrafica [posicion] [limiteRR + 9] + "|" + tablaGrafica [posicion] [limiteRR + 10] + "|" + tablaGrafica [posicion] [limiteRR + 11] + "|" + tablaGrafica [posicion] [limiteRR + 12] + "|" + tablaGrafica [posicion] [limiteRR + 13] + "|" + tablaGrafica [posicion] [limiteRR + 14] + "|" + tablaGrafica [posicion] [limiteRR + 15] + "|" + tablaGrafica [posicion] [limiteRR + 16] + "|" + tablaGrafica [posicion] [limiteRR + 17] + "|" + tablaGrafica [posicion] [limiteRR + 18] + "|" + tablaGrafica [posicion] [limiteRR + 19] + "|               |");
					System.out.println("          |         |__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|               |");
				
				}
				else {
					
					System.out.println("          |         |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |               |");
					System.out.println("          |         |P" + numeroPosicion + "|" + tablaGrafica [posicion] [limiteRR] + "|" + tablaGrafica [posicion] [limiteRR + 1] + "|" + tablaGrafica [posicion] [limiteRR + 2] + "|" + tablaGrafica [posicion] [limiteRR + 3] + "|" + tablaGrafica [posicion] [limiteRR + 4] + "|" + tablaGrafica [posicion] [limiteRR + 5] + "|" + tablaGrafica [posicion] [limiteRR + 6] + "|" + tablaGrafica [posicion] [limiteRR + 7] + "|" + tablaGrafica [posicion] [limiteRR + 8] + "|" + tablaGrafica [posicion] [limiteRR + 9] + "|" + tablaGrafica [posicion] [limiteRR + 10] + "|" + tablaGrafica [posicion] [limiteRR + 11] + "|" + tablaGrafica [posicion] [limiteRR + 12] + "|" + tablaGrafica [posicion] [limiteRR + 13] + "|" + tablaGrafica [posicion] [limiteRR + 14] + "|" + tablaGrafica [posicion] [limiteRR + 15] + "|" + tablaGrafica [posicion] [limiteRR + 16] + "|" + tablaGrafica [posicion] [limiteRR + 17] + "|" + tablaGrafica [posicion] [limiteRR + 18] + "|" + tablaGrafica [posicion] [limiteRR + 19] + "|               |");
					System.out.println("          |         |__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|               |");
					
				}
					
			}
			
			System.out.println("          |                                                                                        |");
			System.out.println("          |________________________________________________________________________________________|");
			limiteRR = limiteRR + 20;
			limiteRRAA = 20;
			limiteRRAC = limiteRRAC + 20;
			if ( ( limiteRRAC == 100 ) || ( limiteRRAC == 200 )|| ( limiteRRAC == 300 )|| ( limiteRRAC == 400 )|| ( limiteRRAC == 500 )|| ( limiteRRAC == 600 )|| ( limiteRRAC == 700 )|| ( limiteRRAC == 800 )|| ( limiteRRAC == 900 )) {
				
				centenares ++;
				limiteRRAC = 0;
				limiteRRAA = 0;
				for ( posicion = 0 ; posicion < LIMITEGRAFICO ; posicion ++) {
					
					numeroPosicionGrafica[posicion] = 1;
				}
			}
			numeroPosicion = 0;
			if (limiteRR == total) mostrarGraficoRRFinalizado = true;
			
		}while ( mostrarGraficoRRFinalizado == false );
		
		centenares = 0;
		limiteRR = 0;
		limiteRRAA = 20;
		limiteRRAC = 0;
		graficaFinalizado = true;
		columnasInferiores = false;
		numeroPosicionGraficaA = 0;
		mostrarGraficoRRFinalizado = false;
		
	}
	public static void calucloRRFCFS() {
		

		for (posicion = 0 ; posicion < limite ; posicion ++ ) {
			
			tablaRRC [posicion] = tablaRR [posicion];
		}
		
		do {
			
			quantumA = quantum;
			do {
				
				if ( tablaRRC [limiteA] == 0 || quantumA == 0) {
					
					do {
						
						limiteA ++;
						if (limiteA == limite) limiteA = 0;
						quantumA = quantum;
						
					} while (tablaRRC [limiteA] == 0);
					
				}
				tablaRRC [limiteA] = tablaRRC [limiteA] - 1;
				tablaGraficaRRCaracter [posicionRR] = limiteA + 1;
				posicionRR ++;
				quantumA -- ;
				
				
				for (posicion2 = 0 ; posicion2 < limite ; posicion2 ++) {
					
					if (tablaRRC [posicion2] != 0 ) calculoRRFinalizadoN ++;
					
				}
				
				if (calculoRRFinalizadoN == 0) calculoRRFinalizado = true;
				else calculoRRFinalizadoN = 0;
				
			} while ( calculoRRFinalizado == false );
			
			
		} while ( calculoRRFinalizado == false );
		
		calculoRRFinalizado = false;
		limiteA = 0;
		quantumA = 0;
		posicionRR = 0;
		
		tablaGrafica = new String [limite] [total];
		for ( posicion = 0 ; posicion < limite ; posicion ++ ) {
			
			for ( posicion2 = 0 ; posicion2 < total ; posicion2++) {
				
				if ( tablaGraficaRRCaracter [posicion2] == posicion + 1) tablaGrafica [posicion] [posicion2] = "XX";
				else tablaGrafica [posicion] [posicion2] = "  ";
				
			}
			
		}
	}
	public static void calucloRRSJF() {
		
		tablaRRCC = new int [limite];
		for (posicion = 0 ; posicion < limite ; posicion ++ ) {
			
			tablaRRC [posicion] = tablaRR [posicion];
			tablaRRCC [posicion] = tablaRR [posicion];
		}
		
		posicionReal = 0;
		
		do {
			
			do {
				
				if ( tablaRRC [limiteA] == 0 || quantumA == 0) {
					
					limiteA = 0;
					Arrays.sort(tablaRRC);
					quantumA = quantum;
					for (posicion = 0 ; posicion < limite ; posicion++) {
						
						if (tablaRRC [posicion] == 0) limiteA ++;
							
					}
					for (posicion3 = 0 ; posicion3 < limite ; posicion3 ++) {
						
						if ( tablaRRC [limiteA] == tablaRRCC [posicion3] ) posicionReal = posicion3;
						
					}
					
				}
				////////////////////////////en la tabla rrcc comparar para saber limiteA con la variable auxiliar limiteReal y apuntarlo bien en la de [][]
				tablaRRC [limiteA] = tablaRRC [limiteA] - 1;
				tablaRRCC [posicionReal] = tablaRRCC [posicionReal] - 1;
				tablaGraficaRRCaracter [posicionRR] = posicionReal + 1;
				posicionRR ++;
				quantumA -- ;
				////////////////////////////
				for (posicion2 = 0 ; posicion2 < limite ; posicion2 ++) {
					
					if (tablaRRC [posicion2] != 0 ) calculoRRFinalizadoN ++;
					
				}
				
				if (calculoRRFinalizadoN == 0) calculoRRFinalizado = true;
				else calculoRRFinalizadoN = 0;
				
			} while ( calculoRRFinalizado == false );
			
			
		} while ( calculoRRFinalizado == false );
		
		calculoRRFinalizado = false;
		limiteA = 0;
		quantumA = 0;
		posicionRR = 0;
		
		tablaGrafica = new String [limite] [total];
		for ( posicion = 0 ; posicion < limite ; posicion ++ ) {
			
			for ( posicion2 = 0 ; posicion2 < total ; posicion2++) {
				
				if ( tablaGraficaRRCaracter [posicion2] == posicion + 1) tablaGrafica [posicion] [posicion2] = "XX";
				else tablaGrafica [posicion] [posicion2] = "  ";
				
			}
			
		}
	}
	public static void calculoRR () {
		
		System.out.println(" ");
		turnAround = new int [limite];
		endTime = new int [limite];
		timeWaited = new int [limite];
		for ( posicion = 0 ; posicion < limite ; posicion ++) { 
			
			for ( posicion2 = total - 1; posicion2 > 0 ; posicion2 --) {
			
				if ( ( tablaGrafica [posicion] [posicion2] == "XX" ) && ( turnArroundEncontrado == false ) ) {
					
					turnAround [posicion] = posicion2 + 1;
					endTime [posicion] = posicion2 + 1;
					timeWaited [posicion] = ( posicion2 + 1 ) - tablaRR[posicion];
					turnArroundEncontrado = true;
					
				}
				
			}
			turnArroundEncontrado = false;
		}
		numeroPosicion = 0;
		System.out.println("          __________________________________________________________________________________________");
		System.out.println("          |                                                                                        |");
		System.out.println("          |                                T U R N    A R O U N D                                  |");
		System.out.println("          |                               ________________________                                 |");
		for ( posicion = 0 ; posicion < limite ; posicion ++) {
			
			numeroPosicion ++;
			System.out.println("          |                                                                                        |");
			if ( ( numeroPosicion < 10 ) && ( turnAround [posicion] < 10 ) ) System.out.println("          |             P" + numeroPosicion + " = " + turnAround [posicion] + "                                                                     |");
			else if ( ( numeroPosicion >= 10 ) && ( turnAround [posicion] >= 100 ) ) System.out.println("          |             P" + numeroPosicion + " = " + turnAround [posicion] + "                                                                  |");
			else if ( ( numeroPosicion < 10 ) && ( turnAround [posicion] >= 100 ) ) System.out.println("          |             P" + numeroPosicion + " = " + turnAround [posicion] + "                                                                   |");
			else if ( ( numeroPosicion >= 10 ) && ( turnAround [posicion] >= 10 ) ) System.out.println("          |             P" + numeroPosicion + " = " + turnAround [posicion] + "                                                                   |");
			else System.out.println("          |             P" + numeroPosicion + " = " + turnAround [posicion] + "                                                                    |");
			
		}
		numeroPosicion = 0;
		System.out.println("          |                                                                                        |");
		System.out.println("          |________________________________________________________________________________________|");
		System.out.println(" ");
		System.out.println("          __________________________________________________________________________________________");
		System.out.println("          |                                                                                        |");
		System.out.println("          |                                W A I T E D    T I M E                                  |");
		System.out.println("          |                               ________________________                                 |");
		for ( posicion = 0 ; posicion < limite ; posicion ++) {
			
			numeroPosicion ++;
			System.out.println("          |                                                                                        |");
			if ( ( numeroPosicion < 10 ) && ( timeWaited [posicion] < 10 ) ) System.out.println("          |             P" + numeroPosicion + " = " + timeWaited [posicion] + "                                                                     |");
			else if ( ( numeroPosicion >= 10 ) && ( timeWaited [posicion] >= 100 ) ) System.out.println("          |             P" + numeroPosicion + " = " + timeWaited [posicion] + "                                                                  |");
			else if ( ( numeroPosicion < 10 ) && ( timeWaited [posicion] >= 100 ) ) System.out.println("          |             P" + numeroPosicion + " = " + timeWaited [posicion] + "                                                                   |");
			else if ( ( numeroPosicion >= 10 ) && ( timeWaited [posicion] >= 10 ) ) System.out.println("          |             P" + numeroPosicion + " = " + timeWaited [posicion] + "                                                                   |");
			else System.out.println("          |             P" + numeroPosicion + " = " + timeWaited [posicion] + "                                                                    |");
			
		}
		numeroPosicion = 0;
		System.out.println("          |                                                                                        |");
		System.out.println("          |________________________________________________________________________________________|");
		System.out.println(" ");
		System.out.println("          __________________________________________________________________________________________");
		System.out.println("          |                                                                                        |");
		System.out.println("          |                                   E N D    T I M E                                     |");
		System.out.println("          |                                  __________________                                    |");
		for ( posicion = 0 ; posicion < limite ; posicion ++) {
			
			numeroPosicion ++;
			System.out.println("          |                                                                                        |");
			if ( ( numeroPosicion < 10 ) && ( endTime [posicion] < 10 ) ) System.out.println("          |             P" + numeroPosicion + " = " + endTime [posicion] + "                                                                     |");
			else if ( ( numeroPosicion >= 10 ) && ( endTime [posicion] >= 100 ) ) System.out.println("          |             P" + numeroPosicion + " = " + endTime [posicion] + "                                                                  |");
			else if ( ( numeroPosicion < 10 ) && ( endTime [posicion] >= 100 ) ) System.out.println("          |             P" + numeroPosicion + " = " + endTime [posicion] + "                                                                   |");
			else if ( ( numeroPosicion >= 10 ) && ( endTime [posicion] >= 10 ) ) System.out.println("          |             P" + numeroPosicion + " = " + endTime [posicion] + "                                                                   |");
			else System.out.println("          |             P" + numeroPosicion + " = " + endTime [posicion] + "                                                                    |");
			
		}
		numeroPosicion = 0;
		System.out.println("          |                                                                                        |");
		System.out.println("          |________________________________________________________________________________________|");
		System.out.println(" ");
		
		for (posicion = 0 ; posicion < limite ; posicion ++) {
			
			mitjanaTA = mitjanaTA + turnAround [posicion];
			mitjanaE = mitjanaE + timeWaited [posicion];
			
		}
		
		mitjanaTA = mitjanaTA / limite;
		mitjanaE = mitjanaE / limite;
		
		System.out.println("          __________________________________________________________________________________________");
		System.out.println("          |                                                                                        |");
		System.out.println("          |                                   M I T J A N A S                                      |");
		System.out.println("          |                                  _________________                                     |");
		System.out.println("          |                                                                                        |");
		if ( mitjanaTA >= 100 )System.out.println("          |             Tiempo de espera = " + dosDigitos.format(mitjanaTA) + "                                                  |");
		else if ( mitjanaTA >= 10 )System.out.println("          |             Tiempo de espera = " + dosDigitos.format(mitjanaTA) + "                                                   |");
		else System.out.println("          |             Tiempo de espera = " + dosDigitos.format(mitjanaTA) + "                                                    |");
		System.out.println("          |                                                                                        |");
		if ( mitjanaE >= 100 ) System.out.println("          |             Tiempo de 'Turn Around' = " + dosDigitos.format(mitjanaE) + "                                           |");
		else if ( mitjanaE >= 10 ) System.out.println("          |             Tiempo de 'Turn Around' = " + dosDigitos.format(mitjanaE) + "                                            |");
		else System.out.println("          |             Tiempo de 'Turn Around' = " + dosDigitos.format(mitjanaE) + "                                             |");
		System.out.println("          |                                                                                        |");
		System.out.println("          |________________________________________________________________________________________|");
		System.out.println(" ");
		calculosFinalizado = true;
		opcionFinalizado = true;
		
	}
}

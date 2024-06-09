package Oca;

import java.util.Scanner;

public class jocOca {

	public static final int LIMITE = 63;
	public static int numeroMover, dado1, dado2 , resultadoSumaDados , jugador , numeroJugadores = 2 , auxFor = 0 , Opcio = 0 , jugadorPouMarginado = 0, auxJugadorPouMarginado, alazar , cont = 0;
	public static int posicionJugador [] , turnosJugador [];
	public static boolean turnosJ[];
	public static Scanner e = new Scanner(System.in) , o = new Scanner(System.in) , entrada = new Scanner(System.in);
	public static String palabra = "" , auxGraf = "";
	public static String nombreJ [], tableroG[] = new String [LIMITE];
	public static boolean victoria = false , unSoloDado = false , mostradoPorPrimeraVez = false , programaFinalizado = false , pouOcupado = false , negativo = false;
	
	//El orden del programa (la raiz de todos los problemas es no tener un orden bien hecho, y mas si es seqüencial... )
	
	public static void main(String[] args) {
		
		//primero mostraremos el menu
		do {
			
			menu();
			
			//se hara una de las opciones siguientes si has seleccionado sus valores bien, si no tocara volver ha preguntar
			
			if (Opcio == 1) {
				
				// Antes de nada Pedimos los nombres de los jugadores
				
				nombres();
				resetTablero();
				
				//Hace las funciones de 'resetTurnos' y 'turnos' hasta que la partida finalize
				
				do {
					
					resetTurnos();
					turnos();
				
				} while (victoria == false);
				
				//reseteamos a false para las siguietes partidas
				
				victoria = false;
				
			}
			else if (Opcio == 3) {
				
				Saliendo();
				
			}
			else if (Opcio == 2) {
				
				Normas();
				
			}
				
		} while (programaFinalizado == false);
		
	}
	
	//Los numeros aleatorios y suma de posiciones (tambien el rebote)
	
	public static void dados() {
		
		unSoloDado = false;
		dado1 = (int) (Math.random() * 6 + 1);
		dado2 = (int) (Math.random() * 6 + 1);
		dadosG();
		resultadoSumaDados = dado1 + dado2;
		if (posicionJugador [jugador] >= 60) {
			
			posicionJugador [jugador] += dado1;
			unSoloDado = true;
			
		}
		else posicionJugador [jugador] += resultadoSumaDados;
		if (posicionJugador [jugador] > 63) {
			
			posicionJugador [jugador] = 63 - ( posicionJugador [jugador] - 63 );
			
		}
		
	}
	
	// El sistema que hace que se respeten los turnos entre jugadores
	
	public static void turnos() {

		for ( jugador = 0 ; jugador < numeroJugadores ; jugador ++ ) {
			
			do {
				
				//si los turnos son positivos entonces tira el jugador
				
				if ( turnosJugador [jugador] > 0 ) {
					
					//Para que se vea cuadrado el numero teniamos de mirar la longuitud de cadenas de estos strings para al mostrarlo, dependiendo de que largo sea, este mas centrado o menos,
					//Se podia hacer una operacion matematica para añadir a vase de prints espacios pero de esta forma no quedaria bien si ponemos algo mas largo que el cuadrado en si y,
					//como el equipo no se queria complicar mucho limitemos el numero de caracteres a 10 y pusimos una condicion por cada una de las 10 posibilidades sin contar un nombre de
					//0 porque el programa no te deja introducirlo.
					
					System.out.println("          _____________________________________________________________________________________________________          ");
					System.out.println("          |_|                                                                                               |_|          ");
					System.out.println("          |                                           Jugador nº '" + (jugador+1) + "'                                          |          ");
					
					if(nombreJ[jugador].length()==1) {
					//lenght 1
					System.out.println("          |_                                                " + nombreJ[jugador] + "                                                _|          ");
					}
					
					else if (nombreJ[jugador].length()==2) {
					//lenght 2
					System.out.println("          |_                                                " + nombreJ[jugador] + "                                               _|          ");
					}
					
					else if (nombreJ[jugador].length()==3) {
					//lenght 31
						
					System.out.println("          |_                                               " + nombreJ[jugador] + "                                               _|          ");
					}
					
					else if (nombreJ[jugador].length()==4) {
					//lenght 4
					System.out.println("          |_                                               " + nombreJ[jugador] + "                                              _|          ");
					}
					
					else if (nombreJ[jugador].length()==5) {
					//lenght 5
					System.out.println("          |_                                               " + nombreJ[jugador] + "                                             _|          ");
					}
					
					else if (nombreJ[jugador].length()==6) {
					//lenght 6
					System.out.println("          |_                                              " + nombreJ[jugador] + "                                             _|          ");
					}
					
					else if (nombreJ[jugador].length()==7) {
					//lenght 7
					System.out.println("          |_                                             " + nombreJ[jugador] + "                                             _|          ");
					}
					
					else if (nombreJ[jugador].length()==8) {
					//lenght 8
					System.out.println("          |_                                             " + nombreJ[jugador] + "                                            _|          ");
					}
					
					else if (nombreJ[jugador].length()==9) {
					//lenght 9
					System.out.println("          |_                                             " + nombreJ[jugador] + "                                           _|          ");
					}
					
					else if (nombreJ[jugador].length()==10) {
					//lenght 10
					System.out.println("          |_                                            " + nombreJ[jugador] + "                                                       ");
					}
					
					System.out.println("          |_|_______________________________________________________________________________________________|_|          ");
					System.out.println("");
				}
				
				//en el caso de que los turnos sean de 0 o inferior pues no mostraremos su nombre ni nada por el estilo.
				
				else System.out.print("");
				
				//Si los este jugador tiene turnos le diremos que escriba.
				
				if ( turnosJugador [jugador] > 0 ) {
					System.out.println("          _____________________________________________________________________________________________________          ");
					System.out.println("          |_|                                                                                               |_|          ");
					System.out.println("          |_                            Escribe a continuación 'tiro' para jugar                             _|          ");
					System.out.println("          |_|_______________________________________________________________________________________________|_|          ");
					System.out.println("                                                                                                                         ");
					System.out.print("          >> ");
				}
				else System.out.print("");
				
				//En el caso de que de que no tenga turnos pues no le diremos que ponga tiro, ya se lo pone el programa.
				
				if ( turnosJugador [jugador] > 0 ) {
					palabra = e.next();
					System.out.println(" ");
				}
				else palabra = "tiro";
				
				//Cuando la comanda puesta sea tiro.
				
				if ( palabra.equalsIgnoreCase("tiro") ) {
					
					// Y pueda tirar 
					
					if ( turnosJugador [jugador] > 0 ) {
						
						//Pedimos los numeros al azar y calculamos su nueva posicion.
						
						dados();
						
						//Esperamos 0.9 segundos para que vea los dados
						
						try {
							Thread.sleep(900);
						} catch (InterruptedException o) {
							o.printStackTrace();
						}
						System.out.println("\n");
						
						// y revisamos en que casilla esta actualmente por si es una especial
						
						casillas();
						
						//al poner tiro este jugador ya tendra permanentemente la tirada 1 acabada ( esta array nos va bien para la revision de la tiradas especiales 3-6 , 4-5
						// o viceversa )
						
						turnosJ[jugador] = true;
						
						//Mostramos hasta donde ha llegado
						
						System.out.println("          _____________________________________________________________________________________________________          ");
						System.out.println("          |_|                                                                                               |_|          ");
						System.out.println("          |                                                                                                   |          ");
						if ( posicionJugador[jugador] < 10) System.out.println("          |                           Avanzas hasta la casilla : "+ posicionJugador[jugador] +"                                            |          ");
						else System.out.println("          |                           Avanzas hasta la casilla : "+ posicionJugador[jugador] +"                                           |          ");
						System.out.println("          |_                                                                                                 _|          ");
						System.out.println("          |_|_______________________________________________________________________________________________|_|          ");
						
						System.out.println("");
						
						//En el caso de que sea una casilla positiva mostrara una respuesta positiva, en el caso contrario te mostrara una casilla negativa.
						
						if (negativo == false)respuestasPositivas();
						else respuestasNegativas();
						
						//Esperamos 1.3 segundos.
						
						try {
							Thread.sleep(1300);
						} catch (InterruptedException o) {
							o.printStackTrace();
						}
						
						//Mostramos El tablero.
						
						tablero();
						
						//Reiniciamos lo de las respuestas para saber si es negativa o no
						
						negativo = false;
						
						//Despues de todo lo anterior se le quita un turno de los que tenga el jugador.
						
						turnosJugador [jugador] --;
						System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
						System.out.println("");
						
						//En el caso que alguien gane sale de todos los bucles.
						
						if (victoria == true) break;
						
						
					}
					else turnosJugador [jugador] ++;
					if (victoria == true) break;
				}
				
				//Si la comanda que ha escrito es 'ayuda'.
				
				else if ( palabra.equalsIgnoreCase("ayuda") ) {
					
					//Mostrara el texto de ayuda de las comandas.
					
					Ayuda();
					
				}
				
				//Si la comanda que hha escrito es 'normas'.
				
				else if ( palabra.equalsIgnoreCase("normas") ) {
					
					//adivina que mostrara
					
					Normas();
				}
				
				//Si escribes la comanda de 'salir'.
				
				else if ( palabra.equalsIgnoreCase("salir") ) {
					
					//Pondra el booleano de victoria como true, saldra del for de los turnos y al salir de esta funcion se acabara la opcion numero 1.
					
					victoria = true;
					
				}
				
				//Comnada de trampas para poder hacer testeo
				
				else if ( palabra.equalsIgnoreCase("mover") ) {
					
					numeroMover = e.nextInt();
					posicionJugador[jugador] = numeroMover;
					casillas();
					System.out.println("          _____________________________________________________________________________________________________          ");
					System.out.println("          |_|                                                                                               |_|          ");
					System.out.println("          |                                                                                                   |          ");
					if ( posicionJugador[jugador] < 10) System.out.println("          |                           Avanzas hasta la casilla : "+ posicionJugador[jugador] +"                                            |          ");
					else System.out.println("          |                           Avanzas hasta la casilla : "+ posicionJugador[jugador] +"                                           |          ");
					System.out.println("          |_                                                                                                 _|          ");
					System.out.println("          |_|_______________________________________________________________________________________________|_|          ");
					
					System.out.println("");
					
					//En el caso de que sea una casilla positiva mostrara una respuesta positiva, en el caso contrario te mostrara una casilla negativa.
					
					if (negativo == false)respuestasPositivas();
					else respuestasNegativas();
					
					//Esperamos 1.3 segundos.
					
					try {
						Thread.sleep(1300);
					} catch (InterruptedException o) {
						o.printStackTrace();
					}
					
					//Mostramos El tablero.
					
					tablero();
					
					//Reiniciamos lo de las respuestas para saber si es negativa o no
					
					negativo = false;
					
					//Despues de todo lo anterior se le quita un turno de los que tenga el jugador.
					
					turnosJugador [jugador] --;
					System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
					System.out.println("");
					
				}
				
				//Si no has puesto ninguna de las comandas anteriores entonces te mostrara este error
				
				else {

					System.out.println("              ███                                                                                                        ");
					System.out.println("          ____███▒▒____________________________________________________________________________________________          ");
					System.out.println("          |_| ███▒▒                                                                                         |_|▒▒        ");
					System.out.println("          |_  ███▒▒    Escribe bien la comanda por favor ( escribe 'ayuda' para ver las comandas)            _|▒▒        ");
					System.out.println("          |_|_  ▒▒▒_________________________________________________________________________________________|_|▒▒        ");
					System.out.println("           ▒▒▒███▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒        ");
					System.out.println("              ███▒▒                                                                                                      ");	
					System.out.println("               ▒▒▒▒                                                                                                      ");
					System.out.println("                                                                                                                         ");
					
				}
				if (victoria == true) break;
				
			} while ( turnosJugador [jugador] > 0 );
			
			//resetea la palabra para que no sea tiro y debas escribirla porque si no se haria auto el juego.
			
			palabra = "";
			if (victoria == true) break;
		}
		
		
	}
	
	//Comprobacion de si las casillas donde esta el jugador son las siguientes
	
	public static void casillas() {

		// Un puñado de los siguientes ifs son los de la oca que te mueve 
		
			if (posicionJugador[jugador] == 5) {
				
				posicionJugador[jugador] = 9;
				ocaTiroToca();
				
			}
			else if ( (turnosJ[jugador] == true) && (posicionJugador[jugador] == 9) ) {
				
				ocaTiroToca();
				posicionJugador[jugador] = 14;
				
			}
			else if (posicionJugador[jugador] == 14) {
				
				ocaTiroToca();
				posicionJugador[jugador] = 18;
				
			}
			else if (posicionJugador[jugador] == 18) {
				
				ocaTiroToca();
				posicionJugador[jugador] = 23;
				
			}
			else if (posicionJugador[jugador] == 23) {
				
				ocaTiroToca();
				posicionJugador[jugador] = 27;
				
			}
			else if (posicionJugador[jugador] == 27) {
				
				ocaTiroToca();
				posicionJugador[jugador] = 32;

			}
			else if (posicionJugador[jugador] == 32) {
				
				ocaTiroToca();
				posicionJugador[jugador] = 36;

			}
			else if (posicionJugador[jugador] == 36) {
				
				ocaTiroToca();
				posicionJugador[jugador] = 41;
				
			}
			else if (posicionJugador[jugador] == 45) {
				
				ocaTiroToca();
				posicionJugador[jugador] = 50;
				
			}
			else if (posicionJugador[jugador] == 50) {
				
				ocaTiroToca();
				posicionJugador[jugador] = 54;
				
			}
			else if (posicionJugador[jugador] == 54) {
				
				ocaTiroToca();
				posicionJugador[jugador] = 59;
				
			}
			else if (posicionJugador[jugador] == 59) {
				
				ocaTiroToca();
				posicionJugador[jugador] = 63;
				
			}
			
			//Si estas en la posicion numero 6 
			
			else if (posicionJugador[jugador] == 6) {
				
				System.out.println("");
				
				System.out.println("          << Casella nº " + (posicionJugador[jugador]) +" De puente a puente y tiro porque me lleva la corriente. >>");
				System.out.println("");
				
				//Avanzas hasta la 12
				
				posicionJugador[jugador] = 12;
				
				//Te da una tirada mas
				
				turnosJugador [jugador] ++;
				System.out.println("                                                                                                                         ");
				System.out.println("                                                   █▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█                                                    ");
				System.out.println("                                                   █ 6              █                                                    ");
				System.out.println("                                                   █▒▒▒             █                                                    ");
				System.out.println("                                                   █                █                                                    ");
				System.out.println("                                                   █                █                                                    ");
				System.out.println("                                                   █   ▄████████▄   █                                                    ");
				System.out.println("                                                   █  ▄██      ██▄  █                                                    ");
				System.out.println("                                                   █▒▄██▒▒▒▒▒▒▒▒██▄▒█                                                    ");
				System.out.println("                                                   ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀                                                    ");
				System.out.println("");
				
			}
			else if (posicionJugador[jugador] == 12) {
				
				System.out.println("");
				System.out.println("          << Casella nº " + (posicionJugador[jugador]) +" De puente a puente y tiro porque me lleva la corriente. >>");
				System.out.println("");
				
				//Retrocedes hasta la 6
				
				posicionJugador[jugador] = 6;
				
				//te da una tirada mas
				
				turnosJugador [jugador] ++;
				System.out.println("                                                                                                                         ");
				System.out.println("                                                   █▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█                                                    ");
				System.out.println("                                                   █ 12             █                                                    ");
				System.out.println("                                                   █▒▒▒             █                                                    ");
				System.out.println("                                                   █                █                                                    ");
				System.out.println("                                                   █                █                                                    ");
				System.out.println("                                                   █   ▄████████▄   █                                                    ");
				System.out.println("                                                   █  ▄██      ██▄  █                                                    ");
				System.out.println("                                                   █▒▄██▒▒▒▒▒▒▒▒██▄▒█                                                    ");
				System.out.println("                                                   ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀                                                    ");
				System.out.println("");
				
			}
			
			//Si caes en la casilla numero 19
			
			else if (posicionJugador[jugador] == 19) {
				
				System.out.println("");
				System.out.println("          << Casella nº " + (posicionJugador[jugador]) +" Fonda >>");
				System.out.println("");
				
				//Le quitamos un turno y al hacer la tirada sera otro con lo cual le quedara un turno de espera ya que estara en la '-1'
				
				turnosJugador [jugador] --;
				
				//Assignamos el mensage para que sea negativo
				
				negativo = true;
				System.out.println("                                                                                                                         ");
				System.out.println("                                                   █▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█                                                    ");
				System.out.println("                                                   █ 19             █                                                    ");
				System.out.println("                                                   █▒▒▒  ▄████▄     █                                                    ");
				System.out.println("                                                   █   ▄████████▄   █                                                    ");
				System.out.println("                                                   █   ██▒▒▒▒▒▒██   █                                                    ");
				System.out.println("                                                   █   ▀████████▀   █                                                    ");
				System.out.println("                                                   █     ▀████▀     █                                                    ");
				System.out.println("                                                   █       ██       █                                                    ");
				System.out.println("                                                   ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀                                                    ");
				System.out.println("");
				
			}
			
			//Si caes en la casilla numero 31
			
			else if (posicionJugador[jugador] == 31) {
				
				System.out.println("");
				System.out.println("          << Casella nº " + (posicionJugador[jugador]) +" Pou >>");
				System.out.println("");
				
				//Le quitamos 2 turnos para que este en la '-2'
				
				turnosJugador [jugador] -= 2;
				System.out.println("                                                                                                                         ");
				System.out.println("                                                   █▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█                                                    ");
				System.out.println("                                                   █ 31             █                                                    ");
				System.out.println("                                                   █▒▒▒             █                                                    ");
				System.out.println("                                                   █                █                                                    ");
				System.out.println("                                                   █   ▄▄▄▄▄▄▄▄▄▄   █                                                    ");
				System.out.println("                                                   █ ▄▀▒▒▒▒▒▒▒▒▒▒▀▄ █                                                    ");
				System.out.println("                                                   █ ▀▄▒████████▒▄▀ █                                                    ");
				System.out.println("                                                   █   ▀▀▀▀▀▀▀▀▀▀   █                                                    ");
				System.out.println("                                                   ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀                                                    ");
				System.out.println("");
				
				//Aqui hacemos una auxiliar para recordar cual es el jugador que esta en el pozo.
				
				auxJugadorPouMarginado = jugadorPouMarginado;
				
				//Assignamos en la variable 'jugadorPouMarginado' el numero de jugador que ha caido
				
				jugadorPouMarginado = jugador;
				
				//Si el pozo esta ocupado
				
				if (pouOcupado) {
					
					//El auxiliado tiene un turno para poder tirar.
					
					turnosJugador[auxJugadorPouMarginado] = 1;
					
				}
				
				//Si Esta dentro de esta condicion significa que l pozo estara ocupado
				
				pouOcupado = true;
				
				//Obiamente ahora va un mensaje negativo
				
				negativo = true;
				
			}
			
			//Si caes en la casilla numero 52
			
			else if (posicionJugador[jugador] == 52) {
				
				System.out.println("");
				System.out.println("          << Casella nº " + (posicionJugador[jugador]) +" Presó >>");
				System.out.println("");
				
				//turnos -3 que mas tarde tendras los turnos en -3
				
				turnosJugador [jugador] -= 3;
				
				//NO ES POSITIVO IR A LA CARCEL, a no ser que trabajes en ella...
				
				negativo = true;
				System.out.println("                                                                                                                         ");
				System.out.println("                                                   █▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█                                                    ");
				System.out.println("                                                   █ 52             █                                                    ");
				System.out.println("                                                   █▒▒▒             █                                                    ");
				System.out.println("                                                   █                █                                                    ");
				System.out.println("                                                   █  ▄▀▀▄   ▄▀▀    █                                                    ");
				System.out.println("                                                   █  ▀▄▄▀▄ ▄▀▄▄▀   █                                                    ");
				System.out.println("                                                   █       ▀        █                                                    ");
				System.out.println("                                                   █                █                                                    ");
				System.out.println("                                                   ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀                                                    ");
				System.out.println("");
				
			}
			
			//Si caes en la casilla numero 42
			
			else if (posicionJugador[jugador] == 42) {
				
				System.out.println("");
				System.out.println("          << Casella nº " + (posicionJugador[jugador]) +" Laberint >>");
				System.out.println("");
				
				//Vuelve a la posicion 39
				
				posicionJugador[jugador] = 39;
				negativo = true;
				System.out.println("                                                                                                                         ");
				System.out.println("                                                   █▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█                                                    ");
				System.out.println("                                                   █ 42             █                                                    ");
				System.out.println("                                                   █▒▒▒             █                                                    ");
				System.out.println("                                                   █▄▄▄█ ▄          █                                                    ");
				System.out.println("                                                   █ ▄ █ █          █                                                    ");
				System.out.println("                                                   █ █ █ ▀▀█        █                                                    ");
				System.out.println("                                                   █ █ ▀▀▀ █   █ █  █                                                    ");
				System.out.println("                                                   █ █ ▀▀▀▀▀▀▀▀▀ █  █                                                    ");
				System.out.println("                                                   ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀                                                    ");
				System.out.println("");
				
			}
			
			//Si caes en la casilla numero 58
			
			else if (posicionJugador[jugador] == 58) {
				
				System.out.println("");
				System.out.println("          << Casella nº " + (posicionJugador[jugador]) +" Mort >>");
				System.out.println("");
				
				//A comenzar de 0 mi rey
				
				posicionJugador[jugador] = 0;
				negativo = true;
				System.out.println("                                                                                                                         ");
				System.out.println("                                                   █▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█                                                    ");
				System.out.println("                                                   █ 58    ▄▄▄      █                                                    ");
				System.out.println("                                                   █▒▒▒ ▄███████▄   █                                                    ");
				System.out.println("                                                   █    █▀▀███▀▀█   █                                                    ");
				System.out.println("                                                   █    █▄▄█▀█▄▄█   █                                                    ");
				System.out.println("                                                   █    ██▀█▀█▀██   █                                                    ");
				System.out.println("                                                   █  █▄ ▀ █ █ ▀ ▄█ █                                                    ");
                System.out.println("                                                   █   ▀█▄     ▄█▀  █                                                    ");
				System.out.println("                                                   █     ▀██▄██▀    █                                                    ");
				System.out.println("                                                   ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀                                                    ");
				System.out.println("");
				
			}
			
			//Las combinaciones de 3-6 y si es la primera tirada de la partida que hace ese jugador
			
			else if (turnosJ[jugador] == false && ( (dado1 == 3 && dado2 == 6) || (dado2 == 3 && dado1 == 6) ) ) {
				
				System.out.println("");
				System.out.println("          << Casella nº " + (posicionJugador[jugador]) +" Daus (3-6) >>");
				System.out.println("");
				
				// /tp a la 26
				
				posicionJugador[jugador] = 26;
				System.out.println("                                                   █▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█                                                    ");
				System.out.println("                                                   █ "+ posicionJugador[jugador] + "             █                                                    ");
				System.out.println("                                                   █▒▒▒             █                                                    ");
				System.out.println("                                                   █                █                                                    ");
				System.out.println("                                                   █                █                                                    ");
				System.out.println("                                                   █                █                                                    ");
				System.out.println("                                                   █                █                                                    ");
				System.out.println("                                                   █                █                                                    ");
				System.out.println("                                                   ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀                                                    ");
				System.out.println("");
				
			}
			
			//Las combinaciones de 4-5 y si es la primera tirada de la partida que hace ese jugador
			
			else if (turnosJ[jugador] == false && ( (dado1 == 4 && dado2 == 5) || (dado2 == 4 && dado1 == 5) )) {
				
				System.out.println("");
				System.out.println("          << Casella nº " + (posicionJugador[jugador]) +" Daus (4-5) >>");
				System.out.println("");
				
				//Coloca al jugador que ha llegado ha esta casilla a la 53
				
				posicionJugador[jugador] = 53;
				System.out.println("                                                   █▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█                                                    ");
				System.out.println("                                                   █ "+ posicionJugador[jugador] + "             █                                                    ");
				System.out.println("                                                   █▒▒▒             █                                                    ");
				System.out.println("                                                   █                █                                                    ");
				System.out.println("                                                   █                █                                                    ");
				System.out.println("                                                   █                █                                                    ");
				System.out.println("                                                   █                █                                                    ");
				System.out.println("                                                   █                █                                                    ");
				System.out.println("                                                   ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀                                                    ");
				System.out.println("");
				
			}
			
			//Aqui solo mostrara las casillas vacias con el numero y dependiendo de la posicion la linea numero 2 tine un espacio mas o uno menos para que cuadre la casilla
			
			else {
				
				if (posicionJugador[jugador] < 10) {
					
					System.out.println("                                                   █▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█                                                    ");
					System.out.println("                                                   █ "+ posicionJugador[jugador] + "              █                                                    ");
					System.out.println("                                                   █▒▒▒             █                                                    ");
					System.out.println("                                                   █                █                                                    ");
					System.out.println("                                                   █                █                                                    ");
					System.out.println("                                                   █                █                                                    ");
					System.out.println("                                                   █                █                                                    ");
					System.out.println("                                                   █                █                                                    ");
					System.out.println("                                                   ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀                                                    ");
					System.out.println("");
					
					}
				else {
					
					System.out.println("                                                   █▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█                                                    ");
					System.out.println("                                                   █ "+ posicionJugador[jugador] + "             █                                                    ");
					System.out.println("                                                   █▒▒▒             █                                                    ");
					System.out.println("                                                   █                █                                                    ");
					System.out.println("                                                   █                █                                                    ");
					System.out.println("                                                   █                █                                                    ");
					System.out.println("                                                   █                █                                                    ");
					System.out.println("                                                   █                █                                                    ");
					System.out.println("                                                   ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀                                                    ");
					System.out.println("");
					
				}
				
			}
			
			//Tengo que comentar algo??
			
			if (posicionJugador[jugador] == 63 ) {
				
				System.out.println("");
				System.out.println("           << El jugador " + (jugador + 1) + " ha guanyat! >>");
				System.out.println("");
				
				//Ponemos la variable de victoria como true para que salga del for y del bucle de la partida.
				
				victoria = true;
				System.out.println("                                                                                                                         ");
				System.out.println("                                                   █▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█                                                    ");
				System.out.println("                                                   █ 63      ▒▒▒▒▒▒ █                                                    ");
				System.out.println("                                                   █▒▒▒     ▒▒▒▒▒▒▒▒█                                                    ");
				System.out.println("                                                   █                █                                                    ");
				System.out.println("                                                   █                █                                                    ");
				System.out.println("                                                   █   ▄██▄▄        █                                                    ");
				System.out.println("                                                   █   ██▀          █                                                    ");
				System.out.println("                                                   ████▄██▄▒▒▒▒▒▒▒▒▒█                                                    ");
				System.out.println("                                                   ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀                                                    ");
				System.out.println("");
				
			}
		
	}
	
	// los turnos se tienen de sumar si has llegado a 0, si es negativo no se suma nada, eso ya los hace turnos();
	
	//Explicacion de como va el array de turnos :
	
	//     - jugador tiene 1 o mas: puede hacer el 'tiro'.
	//     - jugador tiene 0 o mas: Se le acabo el turno con lo cual pasamos al siguiente jugador.
	//     - jugador tiene -1 o menos: Se tiene de esperar, cada vez que le toca se le suma 1.
	
	public static void resetTurnos() {
		
		for (auxFor = 0 ; auxFor < numeroJugadores ; auxFor++ ) {
			
			if ( turnosJugador [ auxFor ] == 0) turnosJugador [ auxFor ] += 1;
			
		}
		
	}
	
	// Una simple funcion/metodo que se ha creado para no repetir esta linea cada vez en cada if de la oca
	
	public static void ocaTiroToca() {
		
		System.out.println("");
		System.out.println("          << Casella nº " + (posicionJugador[jugador] ) +" De oca en oca y tiro porque me toca. >>");
		System.out.println("");
		turnosJugador [jugador] ++;
		
		//Dependiendo de si la posicion de la oca es (superior o igual) o inferior a 10 mostraremos un cuadrado o otro, aunque parezca el mismo el de arriba tiene en la segunda linea
		//un espacio mas para que no descuadre el cuadrado
		
		if (posicionJugador[jugador] < 10) {
			
			System.out.println("                                                   █▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█                                                    ");
			System.out.println("                                                   █ " + posicionJugador[jugador] + "              █                                                    ");
			System.out.println("                                                   █▒▒▒             █                                                    ");
			System.out.println("                                                   █                █                                                    ");
			System.out.println("                                                   █                █                                                    ");
			System.out.println("                                                   █   ▄██▄▄        █                                                    ");
			System.out.println("                                                   █   ██▀          █                                                    ");
			System.out.println("                                                   ████▄██▄         █                                                    ");
			System.out.println("                                                   ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀                                                    ");
			
		}
		else {
			
			System.out.println("                                                   █▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█                                                    ");
			System.out.println("                                                   █ " + posicionJugador[jugador] + "             █                                                    ");
			System.out.println("                                                   █▒▒▒             █                                                    ");
			System.out.println("                                                   █                █                                                    ");
			System.out.println("                                                   █                █                                                    ");
			System.out.println("                                                   █   ▄██▄▄        █                                                    ");
			System.out.println("                                                   █   ██▀          █                                                    ");
			System.out.println("                                                   ████▄██▄         █                                                    ");
			System.out.println("                                                   ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀                                                    ");
			
		}
		System.out.println("");
		
	}
	
	// representacion grafica de puro arte, la Agustina es una artista
	
	public static void menu() {
		
		System.out.println("");
		System.out.println("           ___________________________________________________________________________________________________           ");
		System.out.println("          |_|                                                                                               |_|          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |           ▄██▄▄                                                                     ▄██▄▄         |          ");
		System.out.println("          |  ▄▄█████▄ ██▀                                                              ▄▄█████▄ ██▀           |          ");
		System.out.println("          | ▀█████████▄██▄                                                            ▀█████████▄██▄          |          ");
		System.out.println("          |▒▒▒▀██████████▀▒▒▒ ▒▒                                                     ▒▒▒▒▀██████████▀▒▒▒      |          ");
		System.out.println("          | ▒▒▒▒▒█▄█▄▄▒▒▒▒▒                                                           ▒▒▒▒▒█▄█▄▄▒▒▒▒▒         |          ");
		System.out.println("          |    ▒▒▒▒▒▒▒▒▒▒                                                                ▒▒▒▒▒▒▒▒▒▒           |          ");
		System.out.println("          |      ▒▒▒                                                                        ▒▒▒▒▒▒            |          ");
		System.out.println("          |                         ███████████       ███████████▒         ███████▒▒                          |          ");
		System.out.println("          |                         ███▒    ███▒▒     ███▒                ███▒  ███▒▒         ▒▒▒▒            |          ");
		System.out.println("          |     ▄██▄▄               ███▒    ███▒▒     ███▒                ███▒  ███▒▒          ▒▒             ▄██▄▄      ");
		System.out.println("       ▄▄█████▄ ██▀                 ███▒    ███▒▒     ███▒               ███▒    ███▒▒              ▄▄█████▄ ██▀         ");
		System.out.println("      ▀█████████▄██▄                ███▒    ███▒▒     ███▒               ███████████▒▒             ▀█████████▄██▄        ");
		System.out.println("   ▒▒▒▒▒▀██████████▀▒▒              ███▒    ███▒▒     ███▒              ███▒▒▒▒▒▒▒███▒▒        ▒▒▒▒▒▒▀██████████▀▒▒▒▒    ");
		System.out.println("      ▒▒▒▒▒█▄█▄▄▒▒▒▒▒               ███▒    ███▒▒     ███▒              ███▒      ███▒▒          ▒▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒       ");
		System.out.println("        ▒▒▒▒▒▒▒▒▒▒                  ███████████▒▒     ███████████▒      ███▒      ███▒▒              ▒▒▒▒▒▒▒▒▒▒▒▒        ");
		System.out.println("          |▒▒▒                       ▒▒▒▒▒▒▒▒▒▒▒▒       ▒▒▒▒▒▒▒▒▒▒       ▒▒▒       ▒▒▒▒                  ▒▒▒▒ |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |                           ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒                        |          ");
		System.out.println("          |              ▒ ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒          ▒▒  |          ");
		System.out.println("          |                   ▒▒▒▒▒▒▒▒ ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒                       |          ");
		System.out.println("          |                           ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒           ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒                       |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |                                Hecho por: Ramon Rios, Marti Rodriguez,                            |          ");
		System.out.println("          |_                                Agustina Birentzawaig y Joel Sanchez                             _|          ");
		System.out.println("          |_|_______________________________________________________________________________________________|_|          ");
		System.out.println("");
		
		//Esperaremos 2 segundos la primera vez que se muestra el menu para que se pueda apreciar esta obra de arte que hay arriba
		
		if (mostradoPorPrimeraVez == false) {
			
			//lo siguiente hace esperar 2 segundos antes de que se ejecute aunq no es eso realmente lo que hace, si lo tengo bien entendido esta buscando errores durante
			//esos dos segundos y guardandolos en la variable 'o'. Resumen lo usamos para esperar 2 segundos. 
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException o) {
				o.printStackTrace();
			}
			mostradoPorPrimeraVez = true;
		}
		System.out.println("");
		System.out.println("              __________________________________________________________________________________________");
		System.out.println("              |_|                                                                                    |_|");
		System.out.println("              |                                         M E N U                                        |");
		System.out.println("              |                                      _____________                                     |");
		System.out.println("              |                                                                                        |");
		System.out.println("              |                                                                                        |");
		System.out.println("              |                                        1. Jugar                                        |");
		System.out.println("              |                                                                                        |");
		System.out.println("              |                                        2. Reglas                                       |");
		System.out.println("              |                                                                                        |");
		System.out.println("              |                                        3. Salir                                        |");
		System.out.println("              |_                                                                                      _|");
		System.out.println("              |_|____________________________________________________________________________________|_|");
		System.out.println("");
		System.out.print("              >> ");
		Opcio = o.nextInt();

	}
	
	//Este es el testamento que explica las normas
	
	public static void Normas() {
		
		System.out.println("");
		System.out.println("          ____________________________________________________________________________________________________           ");
		System.out.println("          |_|                                                                                               |_|          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |                                        R E G L A M E N T O                                        |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |                           Sigue las intrucciones para disfrutar del juego                         |          ");
		System.out.println("          |                                      ______________________                                       |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            Comienza el juego                                                                      |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            1 .- Ingresa por pantalla el número de jugadores que participarán (Recuerda:           |          ");
		System.out.println("          |            deben ser entre 2 y 4)                                                                 |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            2 .- Debes respetar el orden de tiro en todo momento. Cada vez que un jugador          |          ");
		System.out.println("          |            debe tirar los dados, se solicitará su nombre por pantalla.                            |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            3 .- Cada casilla tiene sus propias reglas, debes seguirlas al pie de la               |          ");
		System.out.println("          |            letra.                                                                                 |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            4 .- La partida finalizará al llegar a la casilla 63                                   |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            5 .- Desde la primer casilla hasta la número 60, los jugadores utilizarán dos          |          ");
		System.out.println("          |            para avanzar, a menos que se especifique lo contrario.                                 |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            6 .- Al llegar a la casilla 60 y hasta la 63, se utilizará un unico dado para          |          ");
		System.out.println("          |            avanzar.                                                                               |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            7 .- Para realizar cada tirada, el jugador deberá escribir “Tiro” y se                 |  ▄██▄▄   ");
		System.out.println("          |            imprimirá por pantalla el número sacado.                                         ▄▄█████▄ ██▀     ");
		System.out.println("          |                                                                                             ▀█████████▄██▄   ");
		System.out.println("          |                                                                                           ▒▒▒▒▀██████████▀▒▒▒");
		System.out.println("          |                                                                                             ▒▒▒▒▒█▄█▄▄▒▒▒▒▒  ");
		System.out.println("          |            Reglas de las casillas                                                               ▒▒▒▒▒▒▒▒▒    ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            5 .- Oca: Al caer al ganso, se avanza hasta la siguiente casilla donde está            |          ");
		System.out.println("          |            dibujado un ganso y se vuelve a tirar.                                                 |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            6 .- Puente: Si se cae a una casilla de puente, se va hasta la otra casilla            |          ");
		System.out.println("          |            de puente y se vuelve a echar.                                                         |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            9 .- Oca: Al caer al ganso, se avanza hasta la siguiente casilla donde está            |          ");
		System.out.println("          |            dibujado un ganso y se vuelve a tirar.                                                 |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            12.- Puente: Si se cae a una casilla de puente, se va hasta la otra casilla            |          ");
		System.out.println("          |            de puente y se vuelve a echar.                                                         |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            14.- Oca: Al caer al ganso, se avanza hasta la siguiente casilla donde está            |          ");
		System.out.println("          |            dibujado un ganso y se vuelve a tirar.                                                 |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            18.- Oca: Al caer al ganso, se avanza hasta la siguiente casilla donde está            |          ");
		System.out.println("          |            dibujado un ganso y se vuelve a tirar.                                                 |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            19.- Mesón: Una jugada sin moverse.                                                    |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            23.- Oca: Al caer al ganso, se avanza hasta la siguiente casilla donde está            |          ");
		System.out.println("          |            dibujado un ganso y se vuelve a tirar.                                                 |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            26.- Dados 3-6: Si sacamos un 3-6 en el primer tirón, avanzamos hasta aquí.            |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            27.- Oca: Al caer al ganso, se avanza hasta la siguiente casilla donde está            |          ");
		System.out.println("          |            dibujado un ganso y se vuelve a tirar.                                                 |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            31.- Pozo: Dos jugadas sin moverse. Si otro jugador se cae, se sale al                 |          ");
		System.out.println("          |            siguiente turno.                                                                       |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            32.- Oca: Al caer al ganso, se avanza hasta la siguiente casilla donde está            |          ");
		System.out.println("          |            dibujado un ganso y se vuelve a tirar.                                                 |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            36.- Oca: Al caer al ganso, se avanza hasta la siguiente casilla donde está            |          ");
		System.out.println("          |            dibujado un ganso y se vuelve a tirar.                                                 |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            41.- Oca: Al caer al ganso, se avanza hasta la siguiente casilla donde está            |          ");
		System.out.println("          |            dibujado un ganso y se vuelve a tirar.                                                 |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            42.- Laberinto: Se vuelve a la casilla 39.                                             |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            45.- Oca: Al caer al ganso, se avanza hasta la siguiente casilla donde está            |          ");
		System.out.println("          |            dibujado un ganso y se vuelve a tirar.                                                 |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            50.- Oca: Al caer al ganso, se avanza hasta la siguiente casilla donde está            |          ");
		System.out.println("          |            dibujado un ganso y se vuelve a tirar.                                                 |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            52.- Cárcel: El jugador no puede moverse hasta que pasen tres turnos.                  |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            53.- Dados 4-5: Si sacamos un 4-5 a la primera tirada, avanzamos hasta aquí.           |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            54.- Oca: Al caer al ganso, se avanza hasta la siguiente casilla donde está            |          ");
		System.out.println("          |            dibujado un ganso y se vuelve a tirar.                                                 |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            58.- La muerte: Se vuelve al principio del recorrido.                                  |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            59.- Oca: Al caer al ganso, avanza al Jardin de la oca y ¡Gana el juego!               |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |            63.- Jardín de la oca: El primer jugador en llegar ¡gana!                              |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |▄██▄▄                                                                                              |          ");
		System.out.println("  ▄▄█████▄ ██▀                               Y   A H O R A   ¡ A   J U G A R !                                |          ");
		System.out.println("  ▀█████████▄██▄                                                                                              |          ");
		System.out.println("▒▒▒▒▀██████████▀▒▒▒▒                                                                                          |          ");
		System.out.println("  ▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                           _|          ");
		System.out.println("    ▒▒▒▒▒▒▒▒▒▒▒▒____________________________________________________________________________________________|_|          ");
		System.out.println("      ▒▒▒ ▒▒ ▒                                                                                                           ");
		System.out.println("                                                                                                                         ");
		System.out.println("");
		
		//Volvemos ha esperar 2 segundos para que se de cuenta que se han puesto
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	public static void nombres() {
		
		//Motramos entorno grafico...
		
		System.out.println("                                                                                                                         ");
		System.out.println("                                                              ▄██▄▄                                                      ");
		System.out.println("                                                     ▄▄█████▄ ██▀                                                        ");
		System.out.println("                                                    ▀█████████▄██▄                                                       ");
		System.out.println("                                                   ▒▒▒▒▀██████████▀▒▒▒                                                   ");
		System.out.println("          __________________________________________▒▒▒▒▒█▄█▄▄▒▒▒▒▒____________________________________________          ");
		System.out.println("          |_|                                          ▒▒▒▒▒▒▒▒▒▒                                           |_|          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |                                  L I S T O   P A R A   J U G A R                                  |          ");
		System.out.println("          |                                            ¡Comencemos!                                           |          ");
		System.out.println("          |_                                                                                                 _|          ");
		System.out.println("          |_|_______________________________________________________________________________________________|_|          ");
		System.out.println("");
		System.out.println("          _____________________________________________________________________________________________________          ");
		System.out.println("          |_|                                                                                               |_|          ");
		System.out.println("          |_                         Ingresa a continuación el número de jugadores                           _|          ");
		System.out.println("          |_|_______________________________________________________________________________________________|_|          ");
		System.out.println("");
		numeroJugadores = 0;
		
		//Pedmios el numero de jugadores deseados
		
		System.out.print("          >> ");
		numeroJugadores=entrada.nextInt();
		
		//En el caso de que sea inferior a 2 o superior de 4, mantendra preguntando el numero porque la condicion de while es 'true'
		
		while (numeroJugadores<2||numeroJugadores>4) {
		
			
				System.out.println("              ███                                                                                                        ");
				System.out.println("          ____███▒▒____________________________________________________________________________________________           ");
				System.out.println("          |_| ███▒▒                                                                                         |_|▒▒        ");
				System.out.println("          |_  ███▒▒        Error al ingresar número de jugadores. El número debe ser entre 2 y 4             _|▒▒        ");
				System.out.println("          |_|_  ▒▒▒_________________________________________________________________________________________|_|▒▒        ");
				System.out.println("           ▒▒▒███▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒        ");
				System.out.println("              ███▒▒                                                                                                      ");	
				System.out.println("               ▒▒▒▒                                                                                                      ");	
				System.out.println("                                                                                                                         ");	
				System.out.println("                                                                                                                         ");
				System.out.println("          _____________________________________________________________________________________________________          ");
				System.out.println("          |_|                                                                                               |_|          ");
				System.out.println("          |_                         Ingresa a continuación el número de jugadores                           _|          ");
				System.out.println("          |_|_______________________________________________________________________________________________|_|          ");
				System.out.println("                                                                                                                         ");
				
			numeroJugadores=entrada.nextInt();

		}
		
		//Le ponemos un limite a los arrays iniciados al principio segun el numero de jugadores
		
		posicionJugador = new int [numeroJugadores];
		turnosJugador = new int [numeroJugadores];
		nombreJ = new String [numeroJugadores];
		turnosJ = new boolean [numeroJugadores];
		cont = 0;
		
		//Llenamos el Array de 'turnosJ' a false, nosotros sabemos que es la primera tirada de dados de ese jugador gracias a este array, a la que tira dados
		//Este array dependiendo del jugador vuelve a true y las condiciones de dados 3 6 o 4 5 se cumplen si son false.
		
		for (auxFor = 0 ; auxFor < numeroJugadores; auxFor++ ) {
			
			turnosJ [auxFor] = false; 
			
		}
		
		//Mostraremos un menu el numero de veces que jugadores hay
		for (cont=0; cont<numeroJugadores; cont++) {
			
			System.out.println("          _____________________________________________________________________________________________________           ");
			System.out.println("          |_|                                                                                               |_|          ");
			System.out.println("          |                                          ¡ G E N I A L !                                          |          ");
			System.out.println("          |                                      ______________________                                       |          ");
			System.out.println("          |                                                                                                   |          ");
			System.out.println("          |                                                                                                   |          ");
			System.out.println("          |                                 Ingresa el nombre del Jugador " + (cont+1) +":                                  |          ");
			System.out.println("          |                                                                                                   |          ");
			System.out.println("          |_                                                                                                 _|          ");
			System.out.println("          |_|_______________________________________________________________________________________________|_|          ");
			System.out.println("");
			System.out.print("          >> ");
			
			//jugador 0 = 1, jugador 1 = 2... Empezamos a apuntar los nombres de los jugadores
			
			nombreJ[cont] = e.next();
			System.out.println("");
			
			//Revisamos antes de saltar al nombre del siguiente jugador si el nombre es superior de 10 caracteres, se debe a que causa problemas con el entorno grafico
			//Tambien tenemos en cuenta por si no rellenas el nombre.
			
			while (nombreJ[cont].length()>10 && (!nombreJ[cont].equalsIgnoreCase(""))) {
				
				
				System.out.println("              ███                                                                                                        ");
				System.out.println("          ____███▒▒____________________________________________________________________________________________           ");
				System.out.println("          |_| ███▒▒                                                                                         |_|▒▒        ");
				System.out.println("          |_  ███▒▒                   Error al ingresar el nombre. Máximo 10 carácteres                      _|▒▒        ");
				System.out.println("          |_|_  ▒▒▒_________________________________________________________________________________________|_|▒▒        ");
				System.out.println("           ▒▒▒███▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒        ");
				System.out.println("              ███▒▒                                                                                                      ");	
				System.out.println("               ▒▒▒▒                                                                                                      ");	
				System.out.println("                                                                                                                         ");	
				System.out.println("                                                                                                                         ");
				System.out.println("          _____________________________________________________________________________________________________          ");
				System.out.println("          |_|                                                                                               |_|          ");
				System.out.println("          |                                 Ingresa el nombre del Jugador " + (cont+1) +":                                  |          ");
				System.out.println("          |_|_______________________________________________________________________________________________|_|          ");
				System.out.println("                                                                                                                         ");
				System.out.print("          >> ");
				nombreJ[cont] = e.nextLine();
			}
		}
		
	}
	
	//En esta funcion, revisamos los dos dados y la posicion de los jugadores para mostrarle los dados que salen en modo grafico.
	
	public static void dadosG() {
		
			if (posicionJugador[jugador] >= 60) {
					if (dado1 == 1) {
					System.out.println("                                                                                                                         ");
					System.out.println("                                                      █▀▀▀▀▀▀▀▀▀█                                                        ");
					System.out.println("                                                      █         █                                                        ");
					System.out.println("                                                      █    ▄    █                                                        ");
					System.out.println("                                                      █         █                                                        ");
					System.out.println("                                                      █         █                                                        ");
					System.out.println("                                                      ▀▀▀▀▀▀▀▀▀▀▀                                                        ");
					}
					else if (dado1 == 2) {
					System.out.println("                                                                                                                         ");
					System.out.println("                                                      █▀▀▀▀▀▀▀▀▀█                                                        ");
					System.out.println("                                                      █      ▄  █                                                        ");
					System.out.println("                                                      █         █                                                        ");
					System.out.println("                                                      █  ▄      █                                                        ");
					System.out.println("                                                      █         █                                                        ");
					System.out.println("                                                      ▀▀▀▀▀▀▀▀▀▀▀                                                        ");
					}
					else if (dado1 == 3) {
					System.out.println("                                                                                                                         ");
					System.out.println("                                                      █▀▀▀▀▀▀▀▀▀█                                                        ");
					System.out.println("                                                      █      ▄  █                                                        ");
					System.out.println("                                                      █    ▄    █                                                        ");
					System.out.println("                                                      █  ▄      █                                                        ");
					System.out.println("                                                      █         █                                                        ");
					System.out.println("                                                      ▀▀▀▀▀▀▀▀▀▀▀                                                        ");
					}
					else if (dado1 == 4) {
					System.out.println("                                                                                                                         ");
					System.out.println("                                                      █▀▀▀▀▀▀▀▀▀█                                                        ");
					System.out.println("                                                      █  ▄   ▄  █                                                        ");
					System.out.println("                                                      █         █                                                        ");
					System.out.println("                                                      █  ▄   ▄  █                                                        ");
					System.out.println("                                                      █         █                                                        ");
					System.out.println("                                                      ▀▀▀▀▀▀▀▀▀▀▀                                                        ");
					}
					else if (dado1 == 5) {
					System.out.println("                                                                                                                         ");
					System.out.println("                                                      █▀▀▀▀▀▀▀▀▀█                                                        ");
					System.out.println("                                                      █  ▄   ▄  █                                                        ");
					System.out.println("                                                      █    ▄    █                                                        ");
					System.out.println("                                                      █  ▄   ▄  █                                                        ");
					System.out.println("                                                      █         █                                                        ");
					System.out.println("                                                      ▀▀▀▀▀▀▀▀▀▀▀                                                        ");
					}
					else if (dado1 == 6) {
					System.out.println("                                                                                                                         ");
					System.out.println("                                                      █▀▀▀▀▀▀▀▀▀█                                                        ");
					System.out.println("                                                      █  ▄   ▄  █                                                        ");
					System.out.println("                                                      █  ▄   ▄  █                                                        ");
					System.out.println("                                                      █  ▄   ▄  █                                                        ");
					System.out.println("                                                      █         █                                                        ");
					System.out.println("                                                      ▀▀▀▀▀▀▀▀▀▀▀                                                        ");
					System.out.println("                                                                                                                         ");
					}
				}
			
			//Jugar con dos dados
			
			else {
				if (dado1 == 1) {
					if (dado2 == 1) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            █    ▄    █         █    ▄    █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 2) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █         █         █      ▄  █                                              ");
					System.out.println("                                            █    ▄    █         █         █                                              ");
					System.out.println("                                            █         █         █  ▄      █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 3) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █         █         █      ▄  █                                              ");
					System.out.println("                                            █    ▄    █         █    ▄    █                                              ");
					System.out.println("                                            █         █         █  ▄      █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 4) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █         █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █    ▄    █         █         █                                              ");
					System.out.println("                                            █         █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 5) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █         █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █    ▄    █         █    ▄    █                                              ");
					System.out.println("                                            █         █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 6) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █         █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █    ▄    █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
				}
				else if (dado1 == 2) {
					if (dado2 == 1) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █      ▄  █         █         █                                              ");
					System.out.println("                                            █         █         █    ▄    █                                              ");
					System.out.println("                                            █  ▄      █         █         █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 2) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █      ▄  █         █      ▄  █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            █  ▄      █         █  ▄      █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 3) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █      ▄  █         █      ▄  █                                              ");
					System.out.println("                                            █         █         █    ▄    █                                              ");
					System.out.println("                                            █  ▄      █         █  ▄      █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 4) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █      ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            █  ▄      █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 5) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █      ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █    ▄    █                                              ");
					System.out.println("                                            █  ▄      █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 6) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █      ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █  ▄      █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
				}
				else if (dado1 == 3) {
					if (dado2 == 1) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █      ▄  █         █         █                                              ");
					System.out.println("                                            █    ▄    █         █    ▄    █                                              ");
					System.out.println("                                            █  ▄      █         █         █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 2) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █      ▄  █         █      ▄  █                                              ");
					System.out.println("                                            █    ▄    █         █         █                                              ");
					System.out.println("                                            █  ▄      █         █  ▄      █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 3) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █      ▄  █         █      ▄  █                                              ");
					System.out.println("                                            █    ▄    █         █    ▄    █                                              ");
					System.out.println("                                            █  ▄      █         █  ▄      █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 4) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █      ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █    ▄    █         █         █                                              ");
					System.out.println("                                            █  ▄      █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 5) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █      ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █    ▄    █         █    ▄    █                                              ");
					System.out.println("                                            █  ▄      █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 6) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █      ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █    ▄    █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █  ▄      █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
				}
				else if (dado1 == 4) {
					if (dado2 == 1) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █  ▄   ▄  █         █         █                                              ");
					System.out.println("                                            █         █         █    ▄    █                                              ");
					System.out.println("                                            █  ▄   ▄  █         █         █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 2) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █  ▄   ▄  █         █      ▄  █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄      █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 3) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █  ▄   ▄  █         █      ▄  █                                              ");
					System.out.println("                                            █         █         █    ▄    █                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄      █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 4) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 5) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █    ▄    █                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 6) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
				}
				else if (dado1 == 5) {
					if (dado2 == 1) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █  ▄   ▄  █         █         █                                              ");
					System.out.println("                                            █    ▄    █         █    ▄    █                                              ");
					System.out.println("                                            █  ▄   ▄  █         █         █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 2) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █  ▄   ▄  █         █      ▄  █                                              ");
					System.out.println("                                            █    ▄    █         █         █                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄      █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 3) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █  ▄   ▄  █         █      ▄  █                                              ");
					System.out.println("                                            █    ▄    █         █    ▄    █                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄      █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 4) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █    ▄    █         █         █                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 5) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █    ▄    █         █    ▄    █                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 6) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █    ▄    █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
				}
				else if (dado1 == 6) {
					if (dado2 == 1) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █  ▄   ▄  █         █         █                                              ");
					System.out.println("                                            █  ▄   ▄  █         █    ▄    █                                              ");
					System.out.println("                                            █  ▄   ▄  █         █         █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 2) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █  ▄   ▄  █         █      ▄  █                                              ");
					System.out.println("                                            █  ▄   ▄  █         █         █                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄      █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 3) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █  ▄   ▄  █         █      ▄  █                                              ");
					System.out.println("                                            █  ▄   ▄  █         █    ▄    █                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄      █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 4) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █  ▄   ▄  █         █         █                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 5) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █  ▄   ▄  █         █    ▄    █                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
					else if (dado2 == 6) {
					System.out.println("                                            █▀▀▀▀▀▀▀▀▀█         █▀▀▀▀▀▀▀▀▀█                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █  ▄   ▄  █         █  ▄   ▄  █                                              ");
					System.out.println("                                            █         █         █         █                                              ");
					System.out.println("                                            ▀▀▀▀▀▀▀▀▀▀▀         ▀▀▀▀▀▀▀▀▀▀▀                                              ");
					}
				}
			}
		
	}
	
	//En la siguiente elejimos una respuesta de 12 (positivas) para mostrarla.
	
public static void respuestasPositivas() {
		
		// Con la variable 'alazar' conseguimos un numero del 0 al 11 y dependiendo del numero te mostrara un mensage u otro.
	
		alazar = (int) (Math.random() * 12);
		if ( alazar == 0 ) {
			
			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <      Lo estas haciendo muy bien      |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
			
		}
		else if ( alazar == 1 ) { 

			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <             ¡Qué Suerte!             |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
			
		}else if ( alazar == 2 ) { 

			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <          ¡Progresas rápido!          |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
			
		}else if ( alazar == 3 ) { 

			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <            ¡Buen trabajo!            |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
			
		}else if ( alazar == 4 ) { 

			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <       Cada vez estás más cerca       |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
			
		}else if ( alazar == 5 ) { 

			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <         Casi llegas a la meta        |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
			
		}else if ( alazar == 6 ) { 

			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <           ¡Eres increíble!           |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
			
		}else if ( alazar == 7 ) { 

			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <    ¿Cuánto tiempo llevas jugando?    |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
			
		}else if ( alazar == 8 ) { 

			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <    ¡Con cada tirada te acercas más!  |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
			
		}else if ( alazar == 9 ) { 

			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <         ¡Venga que ya llegas!        |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
			
		}else if ( alazar == 10 ) { 

			System.out.println("                                           __________________________________________                                                                                              ");
			System.out.println("                                   ▄██▄▄   |                                        |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <   Parece que tengas una flor en el culo |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |________________________________________|                                                           ");
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
			
		}else {

			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <                ¡Ole!                 |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
			
		}
		
	}

	//En la siguiente elejimos una respuesta de 12 (negativas) para mostrarla.

	public static void respuestasNegativas() {
		
		// Con la variable 'alazar' conseguimos un numero del 0 al 13 y dependiendo del numero te mostrara un mensage u otro.
		
		alazar = (int) (Math.random() * 13);
		if ( alazar == 0 ) {
			
			System.out.println("Que pringao !!");
			

			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <             ¡Que pring@#!            |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
			
		}
		else if ( alazar == 1 ) {
			
			System.out.println("Pero que mala leche " + nombreJ[jugador] + " !!");

			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <         ¡Pero que mala leche!        |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
			
		}
		else if ( alazar == 2 ) {
			

			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <    Mi abuela va mas rapida que tu    |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                                   ");
			
		}
		else if ( alazar == 3 ) {
			
			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <      ¡Acelera! Acumulas polvo.       |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
			
		}
		else if ( alazar == 4 ) {
			
			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <    El juego consiste en avanzar ;).  |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
			
		}
		else if ( alazar == 5 ) {
				
			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <      Yo con el ala tiro mejor!       |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");				
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
				
			}
		else if ( alazar == 6 ) {
			
			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <    No sabía que se podía hacer peor  |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");				
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
				
			}
		else if ( alazar == 7 ) {
			
			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <    ¿Quieres que tire por tí?         |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");				
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
				
			}
		else if ( alazar == 8 ) {
			
			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <   Para un tiro así dejale a otro     |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");				
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
				
			}
		else if ( alazar == 9 ) {
			
			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <    ¿Necesitas un dado trucado?       |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");				
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
				
			}
		else if ( alazar == 10 ) {
			
			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <    ¿De verdad le pones empeño?       |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");				
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
				
			}
		else if ( alazar == 11 ) {
			
			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <    ¡Otra vez será! O no...  >:)      |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");				
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
				
			}
		else if ( alazar == 12 ) {
			
			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <    Mi tatarabuelo tiraba mejor       |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");				
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
				
			}
		else {
			
			System.out.println("                                           _______________________________________                                                                                                 ");
			System.out.println("                                   ▄██▄▄   |                                     |                                                           ");
			System.out.println("                          ▄▄█████▄ ██▀    <       JAJAJA CUAK JA CUAK JAJA       |                                                           ");
			System.out.println("                          ▀█████████▄██▄   |_____________________________________|                                                           ");
			System.out.println("                      ▒▒▒▒▒▒▀██████████▀                                                                                                     ");
			System.out.println("                        ▒▒▒▒▒▒█▄█▄▄▒▒▒▒▒▒                                                                                                    ");
			System.out.println("                            ▒▒▒▒▒▒▒▒▒▒                                                                                                       ");
			System.out.println("                                                                                                                         ");
		}
		
	}
	public static void Saliendo() {
		
		//Esta funcion muestra entorno grafico de el programa cerrandose.
		
		System.out.println("");
		System.out.println("              __________________________________________________________________________________________");
		System.out.println("              |_|                                                                                    |_|");
		System.out.println("              |                                     S A L I E N D O                                    |");
		System.out.println("              |                                      _____________                                     |");
		System.out.println("              |                                                                                        |");
		System.out.println("              |                                               ▄██▄▄                                    |");
		System.out.println("              |                                      ▄▄█████▄ ██▀                                      |");
		System.out.println("              |                                     ▀█████████▄██▄                                     |");
		System.out.println("              |                                 ▒▒▒▒▒▒▀██████████▀▒▒▒▒▒▒                               |");
		System.out.println("              |                                    ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒                                  |");
		System.out.println("              |_                                                                                      _|");
		System.out.println("              |_|____________________________________________________________________________________|_|");
		
		//Al tener esta booleana como true hace que al volver el menu se cierre el programa por la condicion del do while
		
		programaFinalizado = true;

		
	}

	//la funcion de resetTablero pone todo el array grafico de string que muestra los jugadores con 4 espacio por cada posicion para que no se descuadre el primer turno y borrar otras
	//antes de empezar de nuevas. Esta se ejecuta cada vez que el jugador decide comenzar una partida seleccionando la opcion numero 1 , despues de seleccionar los nombres.
	
	public static void resetTablero() {
		
		for ( auxFor = 0 ; auxFor < LIMITE ; auxFor ++ ) {
			
			tableroG [auxFor] = "    ";
			
		}
		
	}
	
	//La funcion que muestra el tablero y los jugadores
	
	public static void tablero() {
		
		//Esta fue la parte que mas nos costo, antes de mostrar el tablero revisa cada posicion quien hay dependiendo de los jugadores para que no de error de 'Out of Bounds', Hicimos una
		//Auxiliar que almacena un espacio en la cadena de caracteres si ese jugador no esta, o almacenabamos su numero de jugador si si esta en esa posicion
		
		for (auxFor = 0; auxFor < LIMITE; auxFor++) {
			
			//LIMITE = 63 de las casillas que hay siendo la 1 la posicion 0 y la 63 la posicion 62
			//reiniciamos el auxiliar por cada casilla que miramos,
			
			auxGraf = "";
				
				if (numeroJugadores == 2) {
					
					if ((posicionJugador[0] - 1) == auxFor) auxGraf = auxGraf + '1';
					else auxGraf = auxGraf + ' ';
					if ((posicionJugador[1] - 1) == auxFor) auxGraf = auxGraf + '2';
					else auxGraf = auxGraf + ' ';
					auxGraf = auxGraf + ' ' + ' ';
				
				}
				else if (numeroJugadores == 3) {
					
					if ((posicionJugador[0] - 1) == auxFor) auxGraf = auxGraf + '1';
					else auxGraf = auxGraf + ' ';
					if ((posicionJugador[1] - 1) == auxFor) auxGraf = auxGraf + '2';
					else auxGraf = auxGraf + ' ';
					if ((posicionJugador[2] - 1) == auxFor) auxGraf = auxGraf + '3';
					else auxGraf = auxGraf + ' ';
					auxGraf = auxGraf + ' ';
				
				}
				else if (numeroJugadores == 4) {
					
					if ((posicionJugador[0] - 1) == auxFor) auxGraf = auxGraf + '1';
					else auxGraf = auxGraf + ' ';
					if ((posicionJugador[1] - 1) == auxFor) auxGraf = auxGraf + '2';
					else auxGraf = auxGraf + ' ';
					if ((posicionJugador[2] - 1) == auxFor) auxGraf = auxGraf + '3';
					else auxGraf = auxGraf + ' ';
					if ((posicionJugador[3] - 1) == auxFor) auxGraf = auxGraf + '4';
					else auxGraf = auxGraf + ' ';
				
				}
				
				//Despues de apuntar los espacios con cnumeros o espacion lo ponemos en la casilla este string.
				
				tableroG[auxFor] = auxGraf;		
				
		}
		
		//Legado de la Agustina Sol, la beta del tablero eran filas de 7 pero hicimos el cambio de hacerlas de 9 para no hacer mucho "Scroll" con el raton
		
		System.out.println("");
		System.out.println("█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█");
		System.out.println("█ 1              █ 2              █ 3              █ 4              █ 5              █ 6              █ 7              █ 8              █ 9              █");
		System.out.println("█▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █");
		System.out.println("█                █                █                █                █                █                █                █                █                █");
		System.out.println("█      " + tableroG [0] +"      █      " + tableroG [1] +"      █      " + tableroG [2] +"      █      " + tableroG [3] +"      █      " + tableroG [4] +"      █      " + tableroG [5] + "      █     " + tableroG [6] +"       █      " + tableroG [7] +"      █      " + tableroG [8] +"      █");
		System.out.println("█                █                █                █                █   ▄██▄▄        █   ▄████████▄   █                █                █   ▄██▄▄        █");
		System.out.println("█                █                █                █                █   ██▀          █  ▄██      ██▄  █                █                █   ██▀    ▄   ▄ █");
		System.out.println("█             █▄ █                █                █                ████▄██▄         █▒▄██▒▒▒▒▒▒▒▒█▀▄▒█                █                ████▄██▄    ▀▄▀  █");
		System.out.println("█▀▀▀▀▀▀▀▀▀▀▀▀▀██▀▄▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█");
		System.out.println("█ 18          ▀  █ 17             █ 16             █ 15             █ 14             █ 13             █ 12             █ 11             █ 10             █");
		System.out.println("█▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █");
		System.out.println("█                █                █                █                █                █                █                █                █                █");
		System.out.println("█      " + tableroG [17] +"      █      " + tableroG [16] +"      █      " + tableroG [15] +"      █      " + tableroG [14] +"      █      " + tableroG [13] +"      █      " + tableroG [12] + "      █     " + tableroG [11] +"       █      " + tableroG [10] +"      █      " + tableroG [9] +"      █");
		System.out.println("█   ▄██▄▄        █                █                █                █   ▄██▄▄        █                █   ▄████████▄   █                █                █");
		System.out.println("█   ██▀    ▄   ▄ █                █                █                █   ██▀          █                █  ▄██      ██▄  █                █                █");
		System.out.println("████▄██▄    ▀▄▀  █                █                █                ████▄██▄         █                █▒▄██▒▒▒▒▒▒▒▒█▀▄▒█                █            ▄█  █");
		System.out.println("█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀ ▀██▀▀█");
		System.out.println("█ 19             █ 20             █ 21             █ 22             █ 23             █ 24             █ 25             █ 26             █ 27          ▀  █");	
		System.out.println("█▒▒▒  ▄████▄     █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █");	
		System.out.println("█   ▄████████▄   █                █                █                █                █                █                █                █                █");	
		System.out.println("█   ██▒"+ tableroG [18] +"▒██   █      "+ tableroG [19] +"      █      "+ tableroG [20] +"      █      "+ tableroG [21] +"      █      "+ tableroG [22] +"      █      "+ tableroG [23] +"      █      "+ tableroG [24] +"      █      "+ tableroG [25] +"      █      "+ tableroG [26] +"      █");	
		System.out.println("█   ▀████████▀   █                █                █                █   ▄██▄▄        █                █                █                █   ▄██▄▄        █");	
		System.out.println("█     ▀████▀     █                █                █                █   ██▀          █                █                █                █   ██▀    ▄   ▄ █");	
		System.out.println("█       ██    █▄ █                █                █                ████▄██▄         █                █                █                ████▄██▄    ▀▄▀  █");	
		System.out.println("█▀▀▀▀▀▀▀▀▀▀▀▀▀██▀▄▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█");	
		System.out.println("█ 36          ▀  █ 35             █ 34             █ 33             █ 32             █ 31             █ 30             █ 29             █ 28             █");	
		System.out.println("█▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █");	
		System.out.println("█                █                █                █                █                █                █                █                █                █");	
		System.out.println("█      " + tableroG [35] +"      █      "+ tableroG [34] +"      █      "+ tableroG [33] +"      █      "+ tableroG [32] +"      █      "+ tableroG [31] +"      █   ▄▄▄"+ tableroG [30] +"▄▄▄   █      "+ tableroG [29] +"      █      "+ tableroG [28] +"      █      "+ tableroG [27] +"      █");	
		System.out.println("█   ▄██▄▄        █                █                █                █   ▄██▄▄        █ ▄▀▒▒▒▒▒▒▒▒▒▒▀▄ █                █                █                █");	
		System.out.println("█   ██▀    ▄   ▄ █                █                █                █   ██▀          █ ▀▄▒████████▒▄▀ █                █                █                █");	
		System.out.println("████▄██▄    ▀▄▀  █                █                █                ████▄██▄         █   ▀▀▀▀▀▀▀▀▀▀   █                █                █            ▄█  █");	
		System.out.println("█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀ ▀██▀▀█");	
		System.out.println("█ 37             █ 38             █ 39             █ 40             █ 41             █ 42             █ 43             █ 44             █ 45          ▀  █");	
		System.out.println("█▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █");
		System.out.println("█                █                █                █                █                █▄▄▄▄ ▄          █                █                █                █");
		System.out.println("█      "+ tableroG [36] +"      █      "+ tableroG [37] +"      █      "+ tableroG [38] +"      █      "+ tableroG [39] +"      █      "+ tableroG [40] +"      █ ▄ █ █"+ tableroG [41] +"      █      "+ tableroG [42] +"      █      "+ tableroG [43] +"      █      "+ tableroG [44] +"      █");
		System.out.println("█                █                █                █                █   ▄██▄▄        █ █ █ ▀▀█        █                █                █   ▄██▄▄        █");
		System.out.println("█                █                █                █                █   ██▀          █ █ ▀▀▀ █        █                █                █   ██▀    ▄   ▄ █");
		System.out.println("█             █▄ █                █                █                ████▄██▄         █ █ ▀▀▀▀▀▀       █                █                ████▄██▄    ▀▄▀  █");
		System.out.println("█▀▀▀▀▀▀▀▀▀▀▀▀▀██▀▄▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█");
		System.out.println("█ 54          ▀  █ 53             █ 52             █ 51             █  50            █ 49             █ 48             █ 47             █ 46             █");
		System.out.println("█▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █");
		System.out.println("█                █                █                █                █                █                █                █                █                █");
		System.out.println("█      "+ tableroG [53] +"      █      "+ tableroG [52] +"      █  ▄▀▀▄"+ tableroG [51] +"▀▀    █      "+ tableroG [50] +"      █      "+ tableroG [49] +"      █      " + tableroG [48] + "      █      "+ tableroG [47] +"      █      "+ tableroG [46] +"      █      "+ tableroG [45] +"      █");
		System.out.println("█   ▄██▄▄        █                █  ▀▄▄▀▄ ▄▀▄▄▀   █                █   ▄██▄▄        █                █                █                █                █");
		System.out.println("█   ██▀    ▄   ▄ █                █       ▀        █                █   ██▀          █                █                █                █                █");
		System.out.println("████▄██▄    ▀▄▀  █                █                █                ████▄██▄         █                █                █                █            ▄█  █");
		System.out.println("█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█▀▀▀▀▀▀▀▀▀▀ ▀██▀▀█");
		System.out.println("█ 55             █ 56             █ 57             █ 58    ▄▄▄      █ 59             █ 60             █ 61             █ 62             █ 63      ▒▒▒▒▀▒ █");
		System.out.println("█▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒ ▄███████▄   █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒             █▒▒▒     ▒▒▒▒▒▒▒▒█");
		System.out.println("█                █                █                █    █▀▀███▀▀█   █                █                █                █                █                █");
		System.out.println("█                █                █                █    █▄▄█▀█▄▄█   █                █                █                █                █                █");
		System.out.println("█      "+ tableroG [54] +"      █      "+ tableroG [55] +"      █      "+ tableroG [56] +"      █    ██▀█▀█▀██   █      "+ tableroG [58] +"      █      "+ tableroG [59] +"      █      "+ tableroG [60] +"      █      "+ tableroG [61] +"      █      "+ tableroG [62] +"      █");
		System.out.println("█                █                █                █  █▄ ▀ █ █ ▀ ▄█ █   ▄██▄▄        █                █                █                █   ▄██▄▄        █");
		System.out.println("█                █                █                █   ▀█▄     ▄█▀  █   ██▀          █                █                █                █   ██▀          █");
		System.out.println("█             █▄ █                █                █     ▀██▄██▀    ████▄██▄         █                █                █                ████▄██▄▒▒▒▒▒▒▒▒▒█");
		System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀██▀ ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
		System.out.println("              ▀                                                                                                                                           ");
		System.out.println("");
		
	}
	
	//Texto que muestra la ayuda de las comandas por si alguien no las sabe
	
	public static void Ayuda() {
		
		System.out.println("");
		System.out.println("          _____________________________________________________________________________________________________          ");
		System.out.println("          |_|                                                                                               |_|          ");
		System.out.println("          |                                            A Y U D A                                              |          ");
		System.out.println("          |                                           ___________                                             |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |         - 'tiro' : Lanzas los dados.                                                              |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |         - 'ayuda' : Muestra todas las comandas posibles.                                          |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |         - 'normas' : Muestra las reglas del juego (por si se le olvida a alguien).                |          ");
		System.out.println("          |                                                                                                   |          ");
		System.out.println("          |         - 'salir' : Acabas instantaneamente la partida.                                           |          ");
		System.out.println("          |_                                                                                                 _|          ");
		System.out.println("          |_|_______________________________________________________________________________________________|_|          ");
		System.out.println("                                                                                                                         ");
		
	}

}
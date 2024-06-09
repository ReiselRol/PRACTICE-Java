package Exercici04;

import java.util.Scanner;

public class Exercici93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n93.Fer un algoritme on l'usuari haurà d'anar introduint de manera aleatòria, indicant fila i\r\n"
				+ "\ncolumna, de números enters. S'haurà de validar que estigui dins dels marges de la columna i\r\n"
				+ "\nque no es pot introduir un valor en la casella on ja s'havia introduït un valor prèviament.\r\n"
				+ "\nFinalment s'haurà de dir quantes caselles per cada fila tenen valors introduïts.");
		
		//Me tomare como que este ejercicio el valor 0 no es un valor
		
		int tablero [] [] = new int [10] [10];
		int filas = 0, columnas = 0, total = 0;
		boolean filaCorrecta = false, columnaCorrecta = false, terminado = false;
		Scanner entradaNumero = new Scanner(System.in);
		do {
			
			do {
				
				System.out.println("\nIntroduce el numero de fila  (1 - 10) :\n");
				filas = entradaNumero.nextInt();
				filas --;
				if ( ( filas > tablero.length ) || ( filas < 0 )) {
					
					System.out.println("\nEl valor introducido es erroneo, intentelo de nuevo.");
					
				}
				else filaCorrecta = true;
				
			} while ( filaCorrecta == false);
			do {
				
				System.out.println("\nIntroduce el numero de Columna  (1 - 10) :\n");
				columnas = entradaNumero.nextInt();
				columnas --;
				if ( ( columnas > tablero[0].length ) || ( columnas < 0 )) {
					
					System.out.println("\nEl valor introducido es erroneo, intentelo de nuevo.");
					
				}
				else columnaCorrecta = true;
				
			} while ( columnaCorrecta == false);
			
			if ( tablero [filas] [columnas] == 0 ) {
				
				System.out.println("\nQue valor deseas introducir en la posicion [" + ( filas + 1 ) + "] [" + ( columnas + 1 ) + "] (si introduces 0, la assignacion de valores terminara) :\n");
				tablero [filas] [columnas] = entradaNumero.nextInt();
				
			}
			else System.out.println("\nLa posicion [" + ( filas + 1 ) + "] [" + ( columnas + 1 ) + "] ya esta assignada, prueba con otra posicion.");
			if (tablero [filas] [columnas] == 0) terminado = true;
			
		} while ( terminado == false );
		
		for (filas = 0 ; filas < tablero.length ; filas ++) {
			
			for (columnas = 0 ; columnas < tablero[0].length ; columnas ++) {
				
				total += tablero [filas] [columnas];
				
			}
			
		}
		
		System.out.println("\nEl total de los valores introducidos es de : " + total);
	}

}

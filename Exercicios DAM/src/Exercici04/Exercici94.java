package Exercici04;

import java.util.Scanner;

public class Exercici94 {

	public static void main(String[] args) {
		// TODO
		System.out.println("\n94.Introduir números en una matriu de 10x10 de enters. Després l’usuari anirà indicant fila i\r\n"
				+ "\ncolumna i el que s’haurà de fer es eliminar el contingut de la casella indicada però\r\n"
				+ "\narrossegant cap a l’esquerra totes les caselles següents. Finalitzarem quan l’usuari indiqui la\r\n"
				+ "\ncoordenada 0,0 i mostrarem el contingut de la matriu al finalitzar l’algoritme.");
		
		int tablero [][] = new int [10][10];
		Scanner entradaValor = new Scanner(System.in);
		System.out.println("\n               _________________________________");
		System.out.println("               |                               |");
		for ( int fila = 0 ; fila < 10 ; fila ++) {
			
			System.out.print("               | ");
			for ( int columnas = 0 ; columnas < 10 ; columnas ++) {
				
				tablero [fila] [columnas] = (int) (Math.random() * 5);
				System.out.print(tablero [fila] [columnas] + "  ");
				
			}
			System.out.print("|");
			System.out.println();
			
		}
		System.out.println("               |_______________________________|");
		System.out.println("\n\nSelecciona la fila: \n");
		int F = entradaValor.nextInt();
		System.out.println("\nSelecciona la columna: \n");
		int C = entradaValor.nextInt();
		if ((F < 11 && F > 0) && (C < 11 && C > 0)) {
			
			for ( int i = (C - 1) ; i < 10 ; i++) {
				
				if (i < 9) tablero [F - 1] [i] = tablero [F - 1] [i + 1];
				else tablero [F - 1] [i] = 0;
				
			}
			System.out.println("\n               _________________________________");
			System.out.println("               |                               |");
			for ( int fila = 0 ; fila < 10 ; fila ++) {
				
				System.out.print("               | ");
				for ( int columnas = 0 ; columnas < 10 ; columnas ++) {
					
					System.out.print(tablero [fila] [columnas] + "  ");
					
					}
					System.out.print("|");
					System.out.println();
				
				}
				System.out.println("               |_______________________________|");
	
		}
		else System.out.println("\nLos valores introducidos no cumplen requisitos como, ser cordenadas posibles en la tabla");
	}

}

package Exercici04;

import java.util.Scanner;

public class Exercici88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n88.Donada una taula de dos dimensions de 10 x 10 de reals omplir la taula amb números i\r\n"
				+ "\nposteriorment calcular la suma dels seus elements.\r\n");
		int tablaSumar [] [] = new int [10] [10];
		boolean terminar = false;
		int total = 0, lineas = 0, columnas = 0;
		Scanner entradaNumero = new Scanner(System.in);
		for (lineas = 0 ; lineas < 10 ; lineas++) {
			
			for (columnas = 0 ; columnas < 10 ; columnas++) {
				
				System.out.println("\nVes introduciendo numeros para sumar el total, para dejar de sumar introduzca 0 (cantidad maxima de 100).\n");
				tablaSumar [lineas] [columnas] = entradaNumero.nextInt();
				if ( tablaSumar [lineas] [columnas] == 0 ) terminar = true;
				else total += tablaSumar [lineas] [columnas];
				if (terminar) break;
				
			}
			
			if (terminar) break;
			
		}
		System.out.println("\nLa suma total de todos los numeros introducidos es de : " + total);
	}

}

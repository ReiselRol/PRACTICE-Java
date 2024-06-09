package Exercici07;

import java.util.Scanner;

public class Exercici2 {

	public static Scanner entradaValores = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int resolucion = miraCartes();
		System.out.println("\nLa resolucion de las cartas es de: " + resolucion);
		

	}
	private static int preguntarValores (int numeroLista) {
		
		numeroLista += 1;
		System.out.println("\nIntroduce el valor de la carta numero " + numeroLista + ": \n");
		int numero = entradaValores.nextInt();
		return numero;
		
	}
	public static int miraCartes() {
		
		final int CANTIDADCARTAS = 2;
		int [] cartas = new int [CANTIDADCARTAS];
		
		assignarValoresCartas(cartas);
		
		return reglasDeCartas(cartas);
		
	}
	private static void assignarValoresCartas (int [] cartas) {
		
		for (int numeroCarta = 0; numeroCarta < cartas.length ; numeroCarta ++) {
			
			cartas [numeroCarta] = preguntarValores(numeroCarta);
			
		}
		
	}
	private static int reglasDeCartas(int [] cartas) {
		
		if ( fueraRangoNumerico(cartas) == true ) return -1;
		else if ( cartasIguales(cartas) == true ) return 0;
		else if ( cartasConsecutivas(cartas) == true ) return 1;
		else return 2;
		
	}
	private static boolean fueraRangoNumerico( int [] cartes ) {
		
		boolean resolucionRegla = false;
		
		for ( int cadaCarta = 0; cadaCarta < cartes.length; cadaCarta ++) {
			
			if ( (cartes [cadaCarta] < 1) || (cartes [cadaCarta] > 10) ) resolucionRegla = true;
			
		}
		
		return resolucionRegla;
		
	}
	private static boolean cartasIguales( int [] cartas) {
		
		boolean resolucionRegla = true;
		
		for ( int cadaCarta = 0; cadaCarta < ( cartas.length - 1 ); cadaCarta ++) {
			
			if ( !(cartas [cadaCarta] == cartas [cadaCarta + 1]) ) resolucionRegla = false;
			
		}
		
		return resolucionRegla;
		
	}
	private static boolean cartasConsecutivas( int [] cartas ) {
		
		boolean resolucionRegla = true;
		
		for ( int cadaCarta = 0; cadaCarta < ( cartas.length - 1 ); cadaCarta ++) {
			
			if ( !((cartas[cadaCarta] == (cartas[cadaCarta + 1] - 1)) || (cartas[cadaCarta] == (cartas[cadaCarta + 1] + 1))) ) resolucionRegla = false;
			
		}
		
		return resolucionRegla;
		
	}

}
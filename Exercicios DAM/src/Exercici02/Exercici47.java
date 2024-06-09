package Exercici02;
import java.util.Scanner;

public class Exercici47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("47. Feu un programa que ens escrigui si un número N enter que hem llegit és primer (es considera que un número es\r\n"
				+ "\nprimer només si és divisible per ell i la unitat, per tant per saber si és primer un número cal buscar si té algun\r\n"
				+ "\ndivisor des de 2 fins a la meitat d'ell mateix).\n");
		int numero = 1 , calculo = 1;
		boolean noPrimo = false;
		do {
			
			System.out.println("\nIngresa un numero que quieras (superior a 0 y entero) y este programa te hara la validacion de si es un numero entero\n");
			Scanner entradaNumero = new Scanner(System.in);
			numero = entradaNumero.nextInt();
			if ( numero <= 0 ) System.out.println("\nDebes introduccir uno mas grande a 0 no mas pequeño");
			for (int divisor = 2; divisor <= (numero / 2 ) ; divisor ++) {
				
				calculo = numero % divisor;
				if ( calculo == 0 ) noPrimo = true;
			}
			if (noPrimo == false) System.out.println("\nEl numero " + numero + " era un numero Primo");
			else System.out.println("\nEl numero " + numero + " NO era un numero Primo");
			
		} while ( numero <= 0 );
	}
}

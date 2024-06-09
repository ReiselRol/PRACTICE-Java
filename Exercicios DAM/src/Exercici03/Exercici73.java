package Exercici03;
import java.util.Scanner;

public class Exercici73 {

	public static final int LIMITE = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n73.Escriure un algoritme que permeti calcular el quadrat dels 100 primer números enters i a\n"
				+ "\ncontinuació els vagi guardant en una taula");
		int tabla[] = new int [LIMITE] , posicion = 0 , numero = 0;
		for ( posicion = 0 ; posicion < LIMITE; posicion++) {
			
			tabla [posicion] = (posicion + 1) * (posicion + 1); 
			
		}
		Scanner entradaNumero = new Scanner(System.in);
		do {
			
			System.out.println("\nIntroduce un numero del 1 al 100 que quieras ver su numero cuadrado, en el caso de que\n" 
				+ "\nquieras salir pon un numero deiferente del 1 al 100\n");
			numero = entradaNumero.nextInt();
			if ( ( numero <= 100 ) && (numero >= 1 ) ) System.out.println("\nEl cuadrado del numero " + numero + " es el " + tabla[numero - 1]);
			
			
		} while ( ( numero <= 100 ) && (numero >= 1 ) );
		
	}

}

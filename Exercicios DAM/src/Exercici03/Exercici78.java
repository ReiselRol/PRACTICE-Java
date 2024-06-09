package Exercici03;
import java.util.Scanner;



public class Exercici78 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n78. Donada una taula de N posicions anar demanant a l‟usuari un conjunt de números enters. Cada\r\n"
				+ "\nvegada que s‟introdueixi un número el programa haurà de dir si aquest número ja l‟havia\r\n"
				+ "\nintroduït i quantes vegades l‟ha introduït en total");
		System.out.println("\nIntroduce cuantos valores deseas añadir:\n");
		Scanner entradaLimite = new Scanner(System.in);
		Scanner entradaNumero = new Scanner(System.in);
		int limite = entradaLimite.nextInt() , posicion = 0 , posicion2 = 0 , veces = 0;
		int tabla[] = new int [limite];
		for( posicion = 0 ; posicion < limite ; posicion++ ) {
			
			System.out.println("\nIntroduce un Numero Entero:\n");
			tabla[posicion] = entradaNumero.nextInt();
			for ( posicion2 = 0 ; posicion2 <= posicion ; posicion2++ ) {
				
				if ( ( tabla [posicion] == tabla [posicion2] ) && ( posicion2 != posicion)) veces++;
				
				
			}
			if ( veces == 1 ) {
				
				System.out.println("\nEl numero " + tabla[posicion] + " ha sido introducido ya " + veces + " vez");
				veces ++;
				System.out.println("\ntotal de " + tabla[posicion] + " introducidos: " + veces);
				
			}
					
			else if ( veces > 1 ) {
				
				System.out.println("\nEl numero " + tabla[posicion] + " ha sido introducido ya " + veces + " veces");
				veces ++;
				System.out.println("\ntotal de " + tabla[posicion] + " introducidos: " + veces);
				
			}
			else {
				
				System.out.println("\nEl numero " + tabla[posicion] + " no ha sido introducido antes");
				veces ++;
				System.out.println("\ntotal de " + tabla[posicion] + " introducidos: " + veces);
				
			}
			veces = 0;
			
		}
	}

}

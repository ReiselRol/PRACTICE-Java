package Exercici02;
import java.util.Scanner;

public class Exercici39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n39. Visualitzar un quadrat de N asteriscs, sent N un valor entrat per"
				+ "\nteclat. Exemple per N= 5"
				+ "\n\n* * * * *\r\n"
				+ "\n* * * * *\r\n"
				+ "\n* * * * *\r\n"
				+ "\n* * * * *\r\n"
				+ "\n* * * * *");
		System.out.println("\nIngresa el numero de elementos que hara de ancho y de alto la tabla\n");
		Scanner entradaNumero = new Scanner(System.in);
		int numero = entradaNumero.nextInt() , columnas = 0 , filas = 0 ;
		System.out.println("");
		while ( numero != filas) {
			
			while (numero != columnas) {
				
				System.out.print(" * ");
				columnas ++;
				
			}
			
			if (numero != filas) {
			
				columnas = 0;
				System.out.println("\n");
				filas ++;
				
			}
			
			
		}
	}

}

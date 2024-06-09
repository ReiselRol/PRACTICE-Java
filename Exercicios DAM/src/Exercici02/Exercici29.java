package Exercici02;
import java.util.Scanner;

public class Exercici29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n29. Visualitzar el 20 primers nombres naturals amb els següents esquemes: a) mentre b) repetir i c) per.");
		int opcion , numero;
		numero = 1;
		do {
			System.out.println("\nSeleccione una de las siguientes opciones :");
			System.out.println("\n       - ( 1 ) opcion A [ a) = mentre ]");
			System.out.println("\n       - ( 2 ) opcion B [ b) = repetir ]");
			System.out.println("\n       - ( 3 ) opcion C [ c) = per ]");
			System.out.println("\n       - ( 4 ) Salir\n");
			Scanner entradaOpcion = new Scanner(System.in);
			opcion = entradaOpcion.nextInt();
			if ( opcion == 1) { 
				
				System.out.println("\nHas seleccionado la opcion 1 (con el mentre que es el While)\n");
				while ( numero <= 20) {
					
					System.out.println(numero);
					numero = numero + 1;
				}
				numero = 1;
				
			}
			else if ( opcion == 2 ) {
				
				System.out.println("\nHas seleccionado la opcion 2 (con el repetir que es el Do While)\n");
				do {
					
					System.out.println(numero);
					numero ++;
					
				} while (numero <= 20);
				numero = 1;
				
			}
			else if ( opcion == 3) {
				
				System.out.println("\nHas seleccionado la opcion 3 (con el per que es el For)\n");
				for ( int comptador =  1 ; comptador <=20 ; comptador = comptador + 1 ) {
					
					System.out.println(numero);
					numero ++;
					
				}
				numero = 1;
				
			}
		} while ( opcion != 4 );
	}

}

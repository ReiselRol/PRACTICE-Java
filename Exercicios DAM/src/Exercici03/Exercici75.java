package Exercici03;
import java.util.Scanner;

public class Exercici75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n75. Realitzar un algoritme que donada una taula de N elements, canviï cada element parell per\r\n"
				+ "\nl‟element senar anterior. Si la taula té un nombre imparell d‟elements l‟últim no es canvia amb\r\n"
				+ "\nningú. Finalment, mostrar per pantalla la taula modificada.");
		System.out.println("\nIntroduce el numero de valores que deseas almacenar:\r\n");
		Scanner entradaLimite = new Scanner(System.in);
		Scanner entradaNumero = new Scanner(System.in);
		int limite = entradaLimite.nextInt() , posicion = 0 , numero = 0;
		boolean impar = false;
		if ( limite % 2 == 1 ) impar = true;
		int tabla [] = new int[limite];
		if (impar == false) {
			
			for (posicion = 0 ; posicion < limite ; posicion++) {
				
				System.out.println("\nIntroduce uno de los valores deseados:\n");
				numero = entradaNumero.nextInt();
				if ( numero % 2 == 0 ) numero --;
				tabla[posicion] = numero;
				
			}
			
		}
		else {
			
			for (posicion = 0 ; posicion < limite ; posicion++) {
				
				if ( limite - 1 == posicion ) {
				
					System.out.println("\nIntroduce uno de los valores deseados:\n");
					tabla[posicion] = entradaNumero.nextInt();
				
				}
				else {
					
					System.out.println("\nIntroduce uno de los valores deseados:\n");
					numero = entradaNumero.nextInt();
					if ( numero % 2 == 1 ) numero --;
					tabla[posicion] = numero;
				}
			}
			
		}
		System.out.println("\nAhora se te mostraran los resultados de tu lista, han sido modificados los numero pares\r\n"
							+ "\ny si la lista tiene una cantidad impar de elementos, el ultimo no sera modificado.\n");
		for (posicion = 0 ; posicion < limite ; posicion++) {
			
			System.out.println(tabla[posicion]);
			
		}
		
	}
}

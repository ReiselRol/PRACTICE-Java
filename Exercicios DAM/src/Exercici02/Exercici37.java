package Exercici02;
import java.util.Scanner;

public class Exercici37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("37. Visualitzar els N primers nombres imparells positius, sent N un valor entrat per teclat.");
		int numero , impares = 1 , fila = 0;
		do {
		
			System.out.println("\nIngresa un numero de impares que deses ver desde el 0 y sin contarlo\n");
			Scanner entradaNumero = new Scanner(System.in);
			numero = entradaNumero.nextInt();
			if (numero > 0) {
				System.out.println("\nEstos son los " + numero + " numeros impares desde el 0\n");
				while (numero != 0) {
					
					if (fila != 6) {
						
						System.out.print(" " +impares + " ");
						fila ++;
						
					}
					else {
						
						System.out.println(" " +impares + "\n");
						fila = 0;
					}
					impares = impares +2;
					numero --;
				}
				
			}
			else System.out.println("\nHe dicho que ingreses un numero desde el 0, es decir superior a cero y tambien sin superarlo");
			
		} while (numero < 0);
	}

}

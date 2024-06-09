package Exercici00;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n16.	Volem fer un programa que ens serveixi per fer truites de patates per a N persones. Per fer-ho,\n" + 
		"\na l’inici del programa ens preguntarà per quantes persones la volem. Per calcular-ho haurem de seguir les dades que trobem\n" + 
		"\na internet relatives als ingredients per fer una truita per a 4 persones https://www.pequerecetas.com/receta/tortilla-de-patatas/\n");
		System.out.println("\nIngresa el numero de presonas a las que quieres hacer tu receta\n");
		Scanner entradaPersonas = new Scanner(System.in);
		int personas = entradaPersonas.nextInt();
		double patatas = ( 0.5 / 4 ) * personas;
		int huevos =  (personas * 5 ) / 4;
		double cebollas = personas / 4;
		System.out.println("\n\n               I N G R E D I E N T E S\n\n");
		System.out.println("     - Patatas necesarias para " + personas + " personas: " + patatas + " Kgs\n");
		System.out.println("     - Huevos  necesarias para " + personas + " personas: " + huevos + "\n");
		System.out.println("     - Cebollas necesarias para " + personas + " personas: " + cebollas + "\n");
		System.out.println("     - Sal necesarias para " + personas + " personas: 'al gusto'\n");
		System.out.println("     - Aceite de oliva necesarias para " + personas + " personas: 'al gusto'\n");
		
	}

}

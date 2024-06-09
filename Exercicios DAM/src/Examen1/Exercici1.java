package Examen1;

import java.util.Scanner;

public class Exercici1 {

	public static void main(String[] args) {
		// TODO 
		final int totalAmigos = 3;
		Scanner entradaNombre = new Scanner(System.in), entradaValor = new Scanner(System.in);
		String AmigosN [] = new String[totalAmigos]; //Nombre de los amigos
		int AmigosC [] = new int[totalAmigos]; // Cantidad de unidades de cada uno de los 3
		double MitjanaC1 [] = new double[totalAmigos]; //Medias de cada uno de los 3
		int TotalA1 [] = new int[totalAmigos]; //Total de cada uno de los 3
		int gastadoMas = 0, gastadoMenos = 0, masRico = 0, masHumilde = 0;
		
		
		for (int i = 0; i < totalAmigos; i++) {
			
			System.out.print("\nEntra el nombre del amigo " + ( i + 1 ) + ": ");
			AmigosN [i] = entradaNombre.next();
			System.out.print("\n\nCuantas cosas a comprado ?: ");
			AmigosC [i] = entradaValor.nextInt();
			
			for (int iv2 = 0; iv2 < AmigosC [i]; iv2++) {
				
				System.out.print("\n\nEntra el valor de la compra " + ( iv2 + 1 ) +": ");
				TotalA1 [i] += entradaValor.nextInt();
				MitjanaC1 [i] += TotalA1 [i];
				
			}
			
			MitjanaC1 [i] = TotalA1 [i];
			MitjanaC1 [i] =  (MitjanaC1 [i] / AmigosC [i]);
			
			System.out.println("\n-----");
			
		}
		
		System.out.println("\nResumen Final");
		
		for (int i = 0; i < totalAmigos; i++) {
			
			System.out.println("\n" + AmigosN [i] +" ha comprado " + AmigosC [i] + " cosas");
			System.out.println("\nEn total ha gastado: " + TotalA1 [i]);
			System.out.println("\nLa mitjana de compras es de " + MitjanaC1 [i]);
			System.out.println("\n\n---\n");
			
		}
		
		for (int i = 0; i < totalAmigos; i++) {
			
			if ( gastadoMas < TotalA1 [i] ) {
				masRico = i;
				gastadoMas = TotalA1 [i];
			}
			if (i == 0 ) gastadoMenos = TotalA1 [i];
			if ( gastadoMenos > TotalA1 [i] ) {
				masHumilde = i;
				gastadoMenos = TotalA1 [i];
			}
			
		}
		System.out.println("\nEl que mas ha gastado es : " + AmigosN [masRico]);
		System.out.println("\nEl que menos ha gastado es : " + AmigosN [masHumilde]);
		
	}

}

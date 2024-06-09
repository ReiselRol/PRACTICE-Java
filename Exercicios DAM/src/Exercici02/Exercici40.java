package Exercici02;
import java.util.Scanner;

public class Exercici40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n40. Fer un algorisme que escrigui el triangle de Floyd. Inicialment llegirem un número N enter que representarà el\r\n"
				+ "\nnúmero de files a escriure.\r\n"
				+ "\nExemple per N=4\r\n"
				+ "\n\n1\r\n"
				+ "\n2 3\r\n"
				+ "\n4 5 6\r\n"
				+ "\n7 8 9 10\r\n");
		
		int filas = 0 , numeroMostrado =  0 , numero = 0 , columnas;
		System.out.println("");
		do {
			
			System.out.println("\nIntroduce el numero de linias que quieres ver\n");
			Scanner entradaNumero = new Scanner(System.in);
			numero = entradaNumero.nextInt();
			System.out.println("");
			
			while ( (numero != filas ) && ( numero > 0 )) {
				
					filas ++;
					
					for (columnas = 0 ; columnas != filas ; columnas ++ ) {
						
						numeroMostrado ++ ; 
						System.out.print(numeroMostrado + " ");
						
					}
					
					columnas = 0;
					System.out.print("\n");
				
			}
			
			numeroMostrado = 0;
			
		} while ( numero < 0 );
			
	}

}

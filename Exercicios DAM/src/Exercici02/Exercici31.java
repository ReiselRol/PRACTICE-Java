package Exercici02;
import java.util.Scanner;

public class Exercici31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n31. Introduir un import en euros enter i indicar el número mínim de bitllets i monedes que li correspon.\r\n"
				+ "\nBitllets i monedes : 500, 200, 100, 50, 20, 10, 5, 2, 1. (165€ son 1 de 100, 1 de 50, 1 de 10 i 1 de 5)");
		System.out.println("\nIngresa el numero del importe\n");
		Scanner entradaImporte = new Scanner(System.in);
		int importe = entradaImporte.nextInt() , contador = 0 , billete500 = 0 , billete200 = 0 , billete100 = 0 , billete50 = 0 , billete20 = 0 , billete10 = 0 , billete5 = 0 , moneda2 = 0 , moneda1 = 0;
		int importeAuxiliar = importe;
		while ( contador <= 8 ) {
			
			switch ( contador ) {
			
			case 0 :
				billete500 = importe / 500;
				importe = importe % 500;
				contador ++;
				break;
			case 1 :
				billete200 = importe / 200;
				importe = importe % 200;
				contador ++;
				break;
			case 2 :
				billete100 = importe / 100;
				importe = importe % 100;
				contador ++;
				break;
			case 3 : 
				billete50 = importe / 50;
				importe = importe % 50;
				contador ++;
				break;
			case 4 :
				billete20 = importe / 20;
				importe = importe % 20;
				contador ++;
				break;
			case 5 :
				billete10 = importe / 10;
				importe = importe % 10;
				contador ++;
				break;
			case 6 : 
				billete5 = importe / 5;
				importe = importe % 5;
				contador ++;
				break;
			case 7 : 
				moneda2 = importe / 2;
				importe = importe % 2;
				contador ++;
				break;
			case 8 :
				moneda1 = importe / 1;
				importe = importe % 1;
				contador ++;
				break;
			}
			
		}
		System.out.println("\nEl importe de " + importeAuxiliar + " se puede dividir en estos billetes:");
		if ( billete500 != 0 ) System.out.println("\n     - Billetes de 500 : " + billete500 );
		if ( billete200 != 0 ) System.out.println("\n     - Billetes de 200 : " + billete200 );
		if ( billete100 != 0 ) System.out.println("\n     - Billetes de 100 : " + billete100 );
		if ( billete50 != 0 ) System.out.println("\n     - Billetes de 50 : " + billete50 );
		if ( billete20 != 0 ) System.out.println("\n     - Billetes de 20 : " + billete20 );
		if ( billete10 != 0 ) System.out.println("\n     - Billetes de 10 : " + billete10 );
		if ( billete5 != 0 ) System.out.println("\n     - Billetes de 5 : " + billete5 );
		if ( moneda2 != 0 ) System.out.println("\n     - Monedas de 2 : " + moneda2 );
		if ( moneda1 != 0 ) System.out.println("\n     - Monedas de 1 : " + moneda1 );
	}

}

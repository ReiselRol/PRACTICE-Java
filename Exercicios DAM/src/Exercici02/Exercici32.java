package Exercici02;
import java.util.Scanner;
import java.math.RoundingMode;

public class Exercici32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n32. Introduir un import en euros real i indicar el número mínim de bitllets i monedes que li correspon.\r\n"
				+ "\nBitllets i monedes : 500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.01.");
		System.out.println("\nIngresa el numero del importe\n");
		Scanner entradaImporte = new Scanner(System.in);
		double importe = entradaImporte.nextDouble() , billete500 = 0 , billete200 = 0 , billete100 = 0 , billete50 = 0 , billete20 = 0 , billete10 = 0 , billete5 = 0 , moneda2 = 0 , moneda1 = 0 , centimo50 = 0 , centimo20 = 0 , centimo10 = 0 , centimo5 = 0 , centimo2 = 0 , centimo1 = 0;
		int contador = 0;
		double importeAuxiliar = importe;
		while ( contador <= 14 ) {
			
			switch ( contador ) {
			
			case 0 :
				billete500 = (int) importe / 500;
				importe = importe % 500;
				contador ++;
				break;
			case 1 :
				billete200 = (int) importe / 200;
				importe = importe % 200;
				contador ++;
				break;
			case 2 :
				billete100 = (int) importe / 100;
				importe = importe % 100;
				contador ++;
				break;
			case 3 : 
				billete50 = (int) importe / 50;
				importe = importe % 50;
				contador ++;
				break;
			case 4 :
				billete20 = (int) importe / 20;
				importe = importe % 20;
				contador ++;
				break;
			case 5 :
				billete10 = (int) importe / 10;
				importe = importe % 10;
				contador ++;
				break;
			case 6 : 
				billete5 = (int) importe / 5;
				importe = importe % 5;
				contador ++;
				break;
			case 7 : 
				moneda2 = (int) importe / 2;
				importe = importe % 2;
				contador ++;
				break;
			case 8 :
				moneda1 = (int) importe / 1;
				importe = importe % 1;
				contador ++;
				break;
			case 9 :
				centimo50 = (int) (importe / 0.5);
				importe = importe % 0.5;
				contador ++;
				break;
			case 10 :
				centimo20 = (int) (importe / 0.2);
				importe = importe % 0.2;
				contador ++;
				break;
			case 11 :
				centimo10 = (int) (importe / 0.1);
				importe = importe % 0.1;
				contador ++;
				break;
			case 12 :
				centimo5 = (int) (importe / 0.05);
				importe = importe % 0.05;
				contador ++;
				break;
			case 13 :
				centimo2 = (int) (importe / 0.02);
				importe = importe % 0.02;
				contador ++;
				break;
			case 14 :
				centimo1 = (int) (importe / 0.01);
				importe = importe % 0.01;
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
		if ( moneda2 != 0 ) System.out.println("\n     - Monedas de 2 euro : " + moneda2 );
		if ( moneda1 != 0 ) System.out.println("\n     - Monedas de 1 euro : " + moneda1 );
		if ( centimo50 != 0 ) System.out.println("\n     - Monedas de 50 centimos: " + centimo50 );
		if ( centimo20 != 0 ) System.out.println("\n     - Monedas de 20 centimos: " + centimo20 );
		if ( centimo10 != 0 ) System.out.println("\n     - Monedas de 10 centimos: " + centimo10 );
		if ( centimo5 != 0 ) System.out.println("\n     - Monedas de 5 centimos: " + centimo5 );
		if ( centimo2 != 0 ) System.out.println("\n     - Monedas de 2 centimos: " + centimo2 );
		if ( centimo1 != 0 ) System.out.println("\n     - Monedas de 1 centimos: " + centimo1 );
	}

}

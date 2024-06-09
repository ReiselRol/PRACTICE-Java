package Exercici07;

import java.util.Scanner;

public class Exercici4 {
	
	public static Scanner entradaValores = new Scanner(System.in);

	public static void main(String[] args) {
		
		double temperatura = preguntarValores();
		String resolucion = colorMap(temperatura);
		System.out.println(resolucion);
		
	}
	
	private static double preguntarValores () {
		
		System.out.println("\nIntroduce la temperatura actual: \n");
		double numero = entradaValores.nextInt();
		return numero;
		
	}
	private static String colorMap (double temperatura) {
		
		if (temperatura < 15) {
			
			if (temperatura < 10) {
				
				if (temperatura < 5) {
					
					if (temperatura < 0) return "Blanc";
					else return "Violeta";
				}
				else return "BlauFosc";
				
			}
			else return "BlauClar";
			
		}
		else return "Verd";
	}

}
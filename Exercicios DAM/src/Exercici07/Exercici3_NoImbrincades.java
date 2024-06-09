package Exercici07;

import java.util.Scanner;

public class Exercici3_NoImbrincades {
	
	//Este es el SI IMBRINCADO
	
	public static Scanner entradaValores = new Scanner(System.in);

	public static void main(String[] args) {

		String resolucion = client();
		System.out.println("\nEste cliente es: " + resolucion);
		
	}
	private static int preguntarValores () {
		
		System.out.println("\nIntroduce el valor de dinero del cliente: \n");
		int numero = entradaValores.nextInt();
		return numero;
		
	}
	private static String client() {
		
		int dineroCliente = preguntarValores();
		return rangoEconomicoCliente(dineroCliente);
		
	}
	private static String rangoEconomicoCliente(int dineroCliente) {
		
		if (dineroCliente < 1000) {
			
			if (dineroCliente < 0) {
				
				if (dineroCliente > -1000) return "Apurat";
				else return "Moros";
				
			}
			else return "Precari";
		}
		else return "Solvent";
		
	}

}
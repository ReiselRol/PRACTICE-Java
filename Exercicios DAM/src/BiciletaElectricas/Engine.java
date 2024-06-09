package BiciletaElectricas;

import java.util.Scanner;

public class Engine {

	public static Scanner entradaValores = new Scanner(System.in);
	
	public static int entrarInt(int MAX, int MIN) {
		
		boolean intruCorrectamente = false;
		int valor;
		
		do {
			
			System.out.print("\n\n  >> ");
			valor = entradaValores.nextInt();
			if ((valor >= MIN) && (valor <= MAX)) intruCorrectamente = true;
			else System.out.println("\nIngresa un valor que sea des del " + MIN + " (incluyendolo) hasta el " + MAX + " (incluyendolo)");
			
		} while (intruCorrectamente == false);
		
		return valor;
		
	}
	public static String entrarString() {
		
		String valor;
		System.out.print("\n\n  >> ");
		valor = entradaValores.next();
		return valor;
		
	}
	
}

package Exercici00;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n7.	Introduir els anys d’ una persona i obtenir l’ equivalent en dies i segons");
		System.out.println("\nIntroduce la edad la cual deseas calcular su equivalentes en dias y en segundos\n");
		Scanner entradaAños = new Scanner(System.in);
		int Años = entradaAños.nextInt();
		
		if (Años >= 4) {
			
			int CalculoDiasViciestos = ( Años * 365 ) + ( Años / 4 );
			int CalculoSegundosViciestos = CalculoDiasViciestos * 3600 * 24;
			System.out.println("\nLos dias equivalentes a " + Años + " años es de " + CalculoDiasViciestos + " dias y\n");
			System.out.println("Los segundos equivalentes a " + Años + " años es de " + CalculoSegundosViciestos + " segundos");
			System.out.println("\nTeniendo en cuenta los años viciestos");
			
		}
		
		else {

			int CalculoDias = ( Años * 365 );
			int CalculoSegundos = CalculoDias * 3600 * 24;
			System.out.println("\nLos dias equivalentes a " + Años + " años es de " + CalculoDias + " dias y\n");
			System.out.println("Los segundos equivalentes a " + Años + " años es de " + CalculoSegundos + " segundos");
		
		}
	
	}

}

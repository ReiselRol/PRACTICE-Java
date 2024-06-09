package Exercici01;
import java.util.Scanner;

public class Exercici22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n22. Fer un algorisme que serveixi tant per calcular l’àrea d’un rectangle com el perímetre\r\n"
				+ "\nd’un rectangle. Se li demanarà a l’usuari el valor dels dos costats i quina operació vol\r\n"
				+ "\nrealitzar(A- àrea i P-perímetre) mostrant el resultat segons l’opció indicada per\r\n"
				+ "\nl’usuari.\r\n"
				+ "\n");
		System.out.println("\nIngresa el valor de el costado mas largo del rectangulo 'A'\n");
		Scanner entradaA = new Scanner(System.in);
		int a = entradaA.nextInt() , calculoArea , calculoPerimetro;
		System.out.println("\nIngresa el valor de el costado mas corto del rectangulo 'B'\n");
		Scanner entradaB = new Scanner(System.in);
		int b = entradaB.nextInt();
		System.out.println("\nAhora selecciona una de las opciones que deses con su correspondiente letra de esa opción\n");
		System.out.println("     - A. Calcular el area con los valores introducidos anteriormente\n");
		System.out.println("     - P. Calcular el perimetro con los valores introducidos anteriormente\n");
		Scanner entradaLetra = new Scanner(System.in);
		char Letra = entradaLetra.next().charAt(0);
		if ( Letra == 'A' || Letra == 'a' ) {
			
			calculoArea = a * b;
			System.out.println("\nLa formula del area de un ractangulo es igual a:");
			System.out.println("\n     Ar = Costado1 * Costado2");
			System.out.println("\n     Ar = A * B");
			System.out.println("\n     Ar = " + a + " * " + b);
			System.out.println("\n     Ar = " + calculoArea);
			System.out.println("\nEl area del rectangulo es de " + calculoArea);
			
		}
		else if ( Letra == 'P' || Letra == 'p' ) {
			
			calculoPerimetro = a * 2 + b * 2;
			System.out.println("\nLa formula del perimetro de un ractangulo es igual a:");
			System.out.println("\n     Ar = 2 x Costado1 + 2 x Costado2");
			System.out.println("\n     Ar = 2 x A + 2 x B");
			System.out.println("\n     Ar = 2 x " + a + " + 2 x " + b);
			System.out.println("\n     Ar = " + calculoPerimetro);
			System.out.println("\nEl perimetro del rectangulo es de " + calculoPerimetro);
			
		}
	}

}

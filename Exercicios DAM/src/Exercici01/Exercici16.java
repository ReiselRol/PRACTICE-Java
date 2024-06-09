package Exercici01;
import java.util.Scanner;

public class Exercici16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n16. Introduir dos números per teclat i indicar quin és més gran dels dos.");
		System.out.println("\nIntroduce el primer numero que lo llamaremos 'A'\n");
		Scanner entradaA = new Scanner(System.in);
		int a = entradaA.nextInt();
		System.out.println("\nIntroduce el primer numero que lo llamaremos 'B'\n");
		Scanner entradaB = new Scanner(System.in);
		int b = entradaB.nextInt();
		if ( a > b) System.out.println("\nEl numero " + a + " que equivale al valor A es mas grande que " + b + " que equivale al valor B");
		else if ( a < b) System.out.println("\nEl numero " + b + " que equivale al valor B es mas grande que " + a + " que equivale al valor A");
		else System.out.println("\nLos dos valores que son A = " + a + " y B = " + b + " Son dos valores identicos");
	}

}

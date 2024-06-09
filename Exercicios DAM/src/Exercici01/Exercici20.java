package Exercici01;
import java.util.Scanner;

public class Exercici20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n20. Introduir 3 números i a continuació que els escrigui ordenats de major a menor.");
		System.out.println("\nIntroduce el Valor de 'A'\n");
		Scanner entradaA = new Scanner(System.in);
		int a = entradaA.nextInt();
		System.out.println("\nIntroduce el Valor de 'B'\n");
		Scanner entradaB = new Scanner(System.in);
		int b = entradaB.nextInt();
		System.out.println("\nIntroduce el Valor de 'C'\n");
		Scanner entradaC = new Scanner(System.in);
		int c = entradaC.nextInt();
		if (a > b && b > c) System.out.println("\nEl orden de mayor a menor es:\n\n     Valor 'A' = " + a + "\n\n     Valor 'B' = " + b + "\n\n     Valor 'C' = " + c);
		else if (a > c && c > b) System.out.println("\nEl orden de mayor a menor es:\n\n     Valor 'A' = " + a + "\n\n     Valor 'C' = " + c + "\n\n     Valor 'B' = " + b);
		else if (b > a && a > c) System.out.println("\nEl orden de mayor a menor es:\n\n     Valor 'B' = " + b + "\n\n     Valor 'A' = " + a + "\n\n     Valor 'C' = " + c);
		else if (b > c && c > a) System.out.println("\nEl orden de mayor a menor es:\n\n     Valor 'B' = " + b + "\n\n     Valor 'C' = " + c + "\n\n     Valor 'A' = " + a);
		else if (c > b && b > a) System.out.println("\nEl orden de mayor a menor es:\n\n     Valor 'C' = " + c + "\n\n     Valor 'B' = " + b + "\n\n     Valor 'A' = " + a);
		else System.out.println("\nEl orden de mayor a menor es:\n\n     Valor 'C' = " + c + "\n\n     Valor 'A' = " + a + "\n\n     Valor 'B' = " + b);
	}

}

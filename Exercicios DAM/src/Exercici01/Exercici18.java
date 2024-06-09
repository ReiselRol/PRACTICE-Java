package Exercici01;
import java.util.Scanner;

public class Exercici18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n18. Introduir 4 números i dir si la suma dels dos primers és més gran, igual o més petit que la suma dels 2 següents.");
		System.out.println("\nIntroduce el primer valor 'A'\n");
		Scanner entradaA = new Scanner(System.in);
		int a = entradaA.nextInt();
		System.out.println("\nIntroduce el segundo valor 'B'\n");
		Scanner entradaB = new Scanner(System.in);
		int b = entradaB.nextInt() , calculoAB;
		System.out.println("\nIntroduce el tercer valor 'C'\n");
		Scanner entradaC = new Scanner(System.in);
		int c = entradaC.nextInt();
		System.out.println("\nIntroduce el cuarto valor 'D'\n");
		Scanner entradaD = new Scanner(System.in);
		int d = entradaD.nextInt() , calculoCD;
		calculoAB = a + b;
		calculoCD = c + d;
		if (calculoAB > calculoCD) {
			
			System.out.println("\nLa suma de los valores 'A' = " + a + " y del valor 'B' = " + b + " que equivale a " + calculoAB + " es superior a");
			System.out.println("\nLa suma de los valores 'C' = " + c + " y del valor 'D' = " + d + " que equivale a " + calculoCD);
			
		}
		else if (calculoAB < calculoCD) {
			
			System.out.println("\nLa suma de los valores 'A' = " + a + " y del valor 'B' = " + b + " que equivale a " + calculoAB + " es inferior a");
			System.out.println("\nLa suma de los valores 'C' = " + c + " y del valor 'D' = " + d + " que equivale a " + calculoCD);
			
		}
		else if (calculoAB == calculoCD) {
			
			System.out.println("\nLa suma de los valores 'A' = " + a + " y del valor 'B' = " + b + " que equivale a " + calculoAB + " es igual a");
			System.out.println("\nLa suma de los valores 'C' = " + c + " y del valor 'D' = " + d + " que equivale a " + calculoCD);
			
		}
	}

}

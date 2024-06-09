package Exercici00;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n13.	A partir d’un valor X , calcular el valor d’ aquest polinomi X3 + 3X2 + 7X +7");
		System.out.println("\nIntroduce el valor de X para hacer esta equación\n");
		Scanner entradaX = new Scanner(System.in);
		int X = entradaX.nextInt();
		int calculo = ( X * X * X ) + 3 * ( X * X ) + 7 * ( X ) + 7; 
		System.out.println("\n     X3 + 3X2 + 7X + 7 = ?");
		System.out.println("\n     ( X x X x X ) + 3 x ( X x X ) + 7 x ( X ) + 7 = ?");
		System.out.println("\n     ( " + X + " x " + X + " x " + X + " ) + 3 x ( " + X + " x " + X + " ) + 7 x ( " + X + " ) + 7 = ?");
		System.out.println("\n     " + calculo + " = X");
		System.out.println("\nEl resultado de este polinomio es de " + calculo);
	}

}

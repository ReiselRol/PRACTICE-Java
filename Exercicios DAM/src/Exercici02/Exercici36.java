package Exercici02;
import java.util.Scanner;

public class Exercici36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n36. Introduir dos nombres N i M i dir quins són els múltiples de N més petits que M.");
		System.out.println("\nIngresa el numero 'N'\n");
		Scanner entradaN = new Scanner(System.in);
		int n = entradaN.nextInt();
		System.out.println("\nIngresa el numero 'M'\n");
		Scanner entradaM = new Scanner(System.in);
		int m = entradaM.nextInt() , calculo = 1 , numero = 0;
		System.out.println("\nLos multiples de " + n + " mas pequeños que " + m + " són :\n");
		while (m > numero) {
			numero ++;
			calculo = n % numero;
			if (calculo == 0) System.out.println("     - El numero " + numero);
		}
		numero = 0;
		calculo = 0;
		System.out.println("\nLos numeros de " + n + " que se consiguen dividiendo " + m +" y son mas pequeños que " + m + " són :\n");
		while (m > calculo) {
			calculo = calculo + numero;
			if ( (calculo != 0 ) && (calculo != m) && (calculo < m) ) System.out.println("     - El numero " + calculo);
			numero = 1;
			numero = numero * n;
		}
	}

}

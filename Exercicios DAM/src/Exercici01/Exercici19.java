package Exercici01;
import java.util.Scanner;

public class Exercici19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nElaborar un programa que determini en una variable MIN el més petit dels valors de 3 variables A,B,C");
		System.out.println("\nAhora  deberas de ingresar tres valores que son 'A' , 'B' y 'C' y te diremos cual es el menor");
		System.out.println("\nIntroduzca el valor de 'A'\n");
		Scanner entradaA = new Scanner(System.in);
		int a = entradaA.nextInt() , min;
		System.out.println("\nIntroduzca el valor de 'B'\n");
		Scanner entradaB = new Scanner(System.in);
		int b = entradaB.nextInt();
		System.out.println("\nIntroduzca el valor de 'C'\n");
		Scanner entradaC = new Scanner(System.in);
		int c = entradaC.nextInt();
		if (a < b && a < c) {
			
			min = a;
			System.out.println("\nEl valor mas pequeños entre A = " + a + ", el B = " + b + " y el C = " + c + ", es el valor A");
			System.out.println("\nAhora el valor min es igual al que A = " + a);
			System.out.println("\nMin = " + min);
		}
		else if (b < a && b < c ) {
			
			min = b;
			System.out.println("\nEl valor mas pequeños entre A = " + a + ", el B = " + b + " y el C = " + c + ", es el valor B");
			System.out.println("\nAhora el valor min es igual al que B = " + b);
			System.out.println("\nMin = " + min);
		}
		else {
			
			min = c;
			System.out.println("\nEl valor mas pequeños entre A = " + a + ", el B = " + b + " y el C = " + c + ", es el valor C");
			System.out.println("\nAhora el valor min es igual al que C = " + c);
			System.out.println("\nMin = " + min);
			
		}
	}

}

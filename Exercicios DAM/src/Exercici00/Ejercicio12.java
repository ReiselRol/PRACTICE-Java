package Exercici00;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n12.	Si tenim tres variables A,B i C. Intercanviar els valors de la següent manera:");
		System.out.println("\nIntroduce el valor de A\n");
		Scanner entradaA = new Scanner(System.in);
		int A = entradaA.nextInt();
		System.out.println("\nIntroduce el valor de B\n");
		Scanner entradaB = new Scanner(System.in);
		int B = entradaB.nextInt();
		System.out.println("\nIntroduce el valor de C\n");
		Scanner entradaC = new Scanner(System.in);
		int C = entradaC.nextInt();
		System.out.println("\n Los valores recogidos sin cambiar son 'A' es igual a " + A + ", 'B' es igual a " + B + " y 'C' es igual a " + C);
		int auxiliar;
		auxiliar = B;
		B = A;
		A = C;
		C = auxiliar;
		System.out.println("Ahora los valores han sido cammbiados y son 'A' es igual a " + A + ", 'B' es igual a " + B + " y 'C' es igual a " + C);
	}

}

package Exercici00;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n8.	Intercanviar els valors de dues variables prèviament introduïdes");
		System.out.println("\nEn esta actividad podras dos valores 'seran A y B' y lo que hara es que uno sea el otro");
		System.out.println("\nLa consola no muestra el procedimiento a si que tendra de tener fe");
		System.out.println("\nIntroduce el primer numero 'Sera el valor A'\n");
		Scanner entradaA = new Scanner(System.in);
		int A = entradaA.nextInt();
		System.out.println("\nIntroduce el segundo numero 'Sera el valor B'\n");
		Scanner entradaB = new Scanner(System.in);
		int B = entradaB.nextInt();
		System.out.println("Los valores posterior mente puestos son que 'A' es igual a " + A + " y que 'B' es igual a " + B + "\n");
		int ayudaCambio = A;
		A = B;
		B = ayudaCambio;
		System.out.println("\nSin enmbargo ahora los valores se han cambiado entre si y 'A' ahora es " + A + " y 'B' es ahora " + B );
	}

}

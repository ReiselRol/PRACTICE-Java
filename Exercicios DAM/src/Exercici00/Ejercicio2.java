package Exercici00;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n2.	Introduir dos números i calcular la seva suma\n");
		System.out.println("En este ejercicio se tiene que ingresar dos numeros 'A' y 'B'\n");
		System.out.println("Ingresa el primer numero 'el numero A'\n");
		Scanner entradaA = new Scanner(System.in);
		int A = entradaA.nextInt();
		System.out.println("\nPara proseguir insterta el segundo numero 'el numero B'\n");
		Scanner entradaB = new Scanner(System.in);
		int B = entradaB.nextInt();
		int calculo = A + B;
		System.out.println("\nEl calculo del numero A ( " + A + " ) mas el numero B ( " + B + " ) es de " + calculo);
	}
	
}

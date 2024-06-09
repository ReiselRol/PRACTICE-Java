package Exercici01;
import java.util.Scanner;

public class Exercici15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n15.	Introduir un número i visualitzar si és positiu, negatiu o neutre.");
		System.out.println("\nIntroduce un numero cualquiera:\n");
		Scanner entradaNumero = new Scanner(System.in);
		int numero = entradaNumero.nextInt();
		if (numero == 0) System.out.println("\nEl numero " + numero + " es un numero neutro es decir es 0");
		else if (numero > 0) System.out.println("\nEl numero " + numero + " es un numero positivo, es decir es superior a 0");
		else System.out.println("\nEl numero " + numero + " es un numero negativo, es decir es inferior a 0");
	}

}

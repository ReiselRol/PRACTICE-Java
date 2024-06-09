package Exercici02;
import java.util.Scanner;

public class Exercici38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n38. Calcular el factorial d'un nombre demanat per teclat. Exemple: 5! = 5*4*3*2*1");
		System.out.println("\nIngresa el numero que deseas ejecutarle factorial");
		Scanner entradaNumero = new Scanner(System.in);
		System.out.println("");
		int numero = entradaNumero.nextInt() , total = 1;
		int auxiliar = numero;
		do {
			total = total * numero;
			numero --;
		} while (numero != 1);
		System.out.println("\nEl factorial del numero " + auxiliar + " es de " + total);
	}

}

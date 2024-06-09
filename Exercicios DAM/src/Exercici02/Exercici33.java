package Exercici02;
import java.util.Scanner;

public class Exercici33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n33. Calcular la suma d'una seqüència de nombres introduïts per teclat. El sistema anirà demanant nombres fins que\r\n"
				+ "\nintroduïm un 0.\r\n");
		System.out.println("\nIngrese los numeros que deseas sumar y cuando no deses sumar inserta un 0");
		int numero , calculo = 0 , numeroSuma = -1;
		do {
			
			System.out.println("\nIngresa un numero :\n");
			Scanner entradaNumero = new Scanner(System.in);
			numero = entradaNumero.nextInt();
			calculo = calculo + numero;
			numeroSuma ++;
			
		} while (numero != 0);
		System.out.println("\nEl total de las " + numeroSuma + " sumas es de : " + calculo);
	}

}

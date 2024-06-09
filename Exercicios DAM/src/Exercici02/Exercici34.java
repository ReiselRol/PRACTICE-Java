package Exercici02;
import java.util.Scanner;

public class Exercici34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n34. Calcular la mitjana aritmètica d'una seqüència de nombres introduïts per teclat. El sistema anirà demanant\r\n"
				+ "\nnombres fins que introduïm un 0.");
		System.out.println("\nIngrese los numeros que deseas calcular la mediana y cuando no deses sumar inserta un 0");
		int numero , numeroSuma = -1;
		double calculo = 0;
		do {
			
			System.out.println("\nIngresa un numero :\n");
			Scanner entradaNumero = new Scanner(System.in);
			numero = entradaNumero.nextInt();
			calculo = calculo + numero;
			numeroSuma ++;
			
		} while (numero != 0);
		calculo = calculo / numeroSuma;
		System.out.println("\nLa mitjana aritmètica de las " + numeroSuma + " numeros es de : " + calculo);
	}

}

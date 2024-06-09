package Exercici02;
import java.util.Scanner;

public class Exercici35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n35. Trobar el valor més gran, més petit i la mitjana aritmètica d'una seqüència de nombres introduïts per teclat. El\r\n"
				+ "\nsistema anirà demanant nombres fins que introduïm un 0.\r\n");
		System.out.println("\nIngrese los numeros que deseas calcular la mediana y otras cosas y cuando no deses sumar inserta un 0");
		int numero = 0, numeroSuma = -1 , numeroAntiguo , numeroGrande = 0 , numeroPequeño = 0;
		double calculo = 0;
		do {
			
			System.out.println("\nIngresa un numero :\n");
			Scanner entradaNumero = new Scanner(System.in);
			numeroAntiguo = numero;
			numero = entradaNumero.nextInt();
			calculo = calculo + numero;
			numeroSuma ++;
			if ( numeroPequeño == 0 ) {
				
				numeroPequeño = numero;
				
			}
			else if ( numeroGrande == 0 ) {
				
				numeroGrande = numero;
				
			}
			else if ( numeroAntiguo < numero && numeroGrande < numero ) {
				
				numeroGrande = numero;
				
			}
			else if ( (numeroAntiguo > numero && numeroPequeño > numero ) && numero != 0) {
				
				numeroPequeño = numero;
				
			}
			
		} while (numero != 0);
		calculo = calculo / numeroSuma;
		System.out.println("\nLa mitjana aritmètica de las " + numeroSuma + " numeros es de : " + calculo);
		System.out.println("\nEl numero mas pequeño es de : " + numeroPequeño);
		System.out.println("\nEl numero mas grande es de : " + numeroGrande);
	}

}

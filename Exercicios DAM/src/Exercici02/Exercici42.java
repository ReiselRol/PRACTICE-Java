package Exercici02;
import java.util.Scanner;

public class Exercici42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n42. Fer un programa per entrar (caràcter a caràcter) un text (no buit) del que hem de dir el número de A’s que hi\r\n"
				+ "\nha. El text s'acaba quan s'entra un asterisc ‘*’.");
		System.out.println("\nIngresa una palabra caracter a caracter, si deseas dejar de escribir insterta el caracter '*'");
		char introduceletras;
		String palabra ="";
		int nCaracter = 0 , cuentaA = 0;
		do {
			nCaracter ++ ;
			System.out.println("\nIngresa el caracater numero " + nCaracter + " de tu palabra\n");
			Scanner entradaIntroduceletras = new Scanner(System.in);
			introduceletras = entradaIntroduceletras.next().charAt(0);
			if (introduceletras != '*') palabra = palabra + introduceletras;
			if ( ( introduceletras == 'a') || ( introduceletras == 'A') ) cuentaA ++ ;
			
		} while (introduceletras != '*');
		System.out.println("\nEl numero de letras de 'A' que hay en la palabra '" + palabra + "' es de " + cuentaA);
	}

}

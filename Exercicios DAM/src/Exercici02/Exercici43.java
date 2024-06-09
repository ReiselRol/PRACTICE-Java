package Exercici02;
import java.util.Scanner;

public class Exercici43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n43. Ídem anterior però ara heu de dir el nombre de caràcters diferents de A.\r\n");
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
			if ( ( introduceletras != 'a') && ( introduceletras != 'A') && (introduceletras != '*') ) cuentaA ++ ;
			
		} while (introduceletras != '*');
		System.out.println("\nEl numero de letras diferentes de 'A' que hay en la palabra '" + palabra + "' es de " + cuentaA);
	}

}

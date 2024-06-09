package Exercici02;
import java.util.Scanner;

public class Exercici45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n45. Igual que l’exercici 42 però cal comptar la seqüència dels dos caràcters ‘LA’.");
		System.out.println("\nIngresa una palabra caracter a caracter, si deseas dejar de escribir insterta el caracter '*'");
		char introduceletras , introduceletrasAuxiliar='a';
		String palabra ="";
		int nCaracter = 0 , cuentaA = 0;
		do {
			nCaracter ++ ;
			System.out.println("\nIngresa el caracater numero " + nCaracter + " de tu palabra\n");
			Scanner entradaIntroduceletras = new Scanner(System.in);
			introduceletras = entradaIntroduceletras.next().charAt(0);
			if (introduceletras != '*') palabra = palabra + introduceletras;
			if ( ( ( introduceletrasAuxiliar == 'l') || (introduceletrasAuxiliar == 'L') ) && ( ( introduceletras == 'a') || ( introduceletras == 'A') ) ) cuentaA ++ ;
			introduceletrasAuxiliar = introduceletras;
			
		} while (introduceletras != '*');
		System.out.println("\nEl numero de combinaciones de letras 'LA' que hay en la palabra '" + palabra + "' es de " + cuentaA);
	}

}

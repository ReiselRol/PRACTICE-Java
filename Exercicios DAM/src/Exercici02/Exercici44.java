package Exercici02;
import java.util.Scanner;

public class Exercici44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n44. Ídem anterior però ara heu de comptar les vocals que hi ha en el text, tant majúscules com minúscules.");
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
			if ( ( introduceletras == 'a') || ( introduceletras == 'A') || ( introduceletras == 'e') || ( introduceletras == 'E') || ( introduceletras == 'i') || ( introduceletras == 'I') || ( introduceletras == 'o') || ( introduceletras == 'O') || ( introduceletras == 'u') || ( introduceletras == 'U') ) cuentaA ++ ;
			
		} while (introduceletras != '*');
		System.out.println("\nEl numero vocales que hay en la palabra '" + palabra + "' es de " + cuentaA);
	}

}

package Exercici01;
import java.util.Scanner;

public class Exercici26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n26. Donats dos enters c1 i c2 que representen números de cartes, imprimeix per\r\n"
				+ "pantalla -1, 0, 1 o 2 segons les següents regles:\r\n"
				+ "\n\n     - Si alguna de les cartes no està entre 1 i 10, imprimeix -1\r\n"
				+ "\n     - Si les cartes són iguals, imprimeix 0\r\n"
				+ "\n     - Si les dues cartes són consecutives, en qualsevol ordre, imprimeix 1\r\n"
				+ "\n     - Si no són consecutives, imprimeix 2\r\n"
				+ "\n     - Les regles s’han d’aplicar en l’ordre donat, és a dir, si les cartes són iguals però\r\n"
				+ "\n       no estan entre 1 i 10, el programa imprimirà -1 i no 0.\r\n");
		System.out.println("\nEscoge el numero de la primera carta 'preferible entre el 1 i el 10\n");
		Scanner entradaPrimeraCarta = new Scanner(System.in);
		int primeraCarta = entradaPrimeraCarta.nextInt();
		System.out.println("\nEscoge el numero de la segunda carta 'preferible entre el 1 i el 10\n");
		Scanner entradaSegundaCarta = new Scanner(System.in);
		int segundaCarta = entradaSegundaCarta.nextInt();
		if ( ( segundaCarta <= 10 && segundaCarta >= 0) && ( primeraCarta <= 10 && primeraCarta >= 0) ) {
			
			if ( ( segundaCarta != primeraCarta ) ) {
				
				if ( ( segundaCarta == primeraCarta +1 ) || (segundaCarta == primeraCarta -1) ) {
				
					System.out.println("\nResultado de 1");	
	
				}
				else System.out.println("\nResultado de 2");
				
			}
			else System.out.println("\nResultado de 0");
			
		}
		else System.out.println("\nResultado de -1");
	}

}

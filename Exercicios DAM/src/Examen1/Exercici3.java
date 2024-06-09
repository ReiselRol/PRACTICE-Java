package Examen1;

import java.util.Scanner;

public class Exercici3 {

	public static void main(String[] args) {
		// TODO
		Scanner entradaPalabra = new Scanner(System.in);
		int letraEncontradas = 0, palabras = 0 , letrasRestantes = 30;
		boolean partidaFinalizada = false , palabraEncontrada = false, next = false;
		char deposito [] = new char [30], depositoCopia [] = new char [30];
		String palabra = "";
		
		for ( int i = 0 ; i < deposito.length; i++) {
			
			deposito [i] = (char) (Math.random()*26+'a');
			
		}
		do {
			
			System.out.println("Diposito:\n");
			
			for ( int i = 0 ; i < deposito.length; i++) {
				
				System.out.print(deposito [i] +", ");
				depositoCopia [i] = deposito [i];
				
			}
			
			System.out.println("\n> Que palabra quieres formar?\n");
			palabra = entradaPalabra.next();
			letraEncontradas = palabra.length();
			
			if ( !palabra.equalsIgnoreCase("stop")) {
				
				for ( int i = 0 ; i < palabra.length(); i++) {
					
					for (int iv2 = 0; iv2 < depositoCopia.length ; iv2++) {
						
						if ( ( palabra.charAt(i) == depositoCopia[iv2] ) && next == false) {
							
							depositoCopia[iv2] = '_';
							letraEncontradas --;
							next = true;
							
						}
						
					}
					
					next = false;
					if (letraEncontradas == 0) palabraEncontrada = true;
					else palabraEncontrada = false;
					
				}
				
				if (palabraEncontrada) {
					
					System.out.println("\nLa palabra se puede formar!");
					palabras ++;
					letrasRestantes -= palabra.length();
					for ( int i = 0 ; i < deposito.length ; i++) {
						
						deposito[i] = depositoCopia[i];
						
					}
					
				}
				else System.out.println("\nLa palabra NO se puede formar!");
				
			}
			else partidaFinalizada = true;
			
			
		} while (partidaFinalizada == false);
		System.out.println("Has conseguido formar " + palabras + " palabras y te han sobrado " + letrasRestantes + " letras.");
	}

}

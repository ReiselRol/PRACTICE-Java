package Exercici02;
import java.util.Scanner;

public class Exercici46 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n46. Igual que els exercicis anteriors però ara compteu el número de mots/paraules ‘LA’ (penseu que es considera\r\n"
				+ "\nque acaba una paraula quan darrera hi ha un espai o signe de puntuació). Només cal controlar els següents\r\n"
				+ "\nsignes de puntuació (. , ; )\r\n"
				+ "\nEx: La Laura parlava amb la seva companya de classe.\r\n"
				+ "\nSortida: 2\r\n");
		System.out.println("\nIngresa una palabra caracter a caracter, si deseas dejar de escribir insterta el caracter '*'");
		String introduceletras;
		boolean unoMas = false;
		String palabra = "" , intentoLA = "";
		int nCaracter = 0 , cuentaLA = 0, flagEmpieza = 0 , numeroLetraLA = 0 , comprobador = 0 , numeroLetra = 0 , puedeSer = 1;
		do {
			nCaracter ++ ;
			System.out.println("\nIngresa el caracater numero " + nCaracter + " de tu palabra\n");
			Scanner entradaIntroduceletras = new Scanner(System.in);
			introduceletras = entradaIntroduceletras.nextLine();
			if (numeroLetra != 0) {
				
				if ( ( introduceletras.equals(" ") ) || ( introduceletras.equals(",") ) || ( introduceletras.equals(";") ) || ( introduceletras.equals(".") )) flagEmpieza = 1;
				if ( ( flagEmpieza == 1 ) && ( intentoLA == "") ) {
					
					comprobador ++;
					intentoLA = intentoLA + introduceletras;
					
				}
				if ( ( numeroLetraLA == 1 ) && ( ( introduceletras.equals("L") ) || ( introduceletras.equals("l") ) ) ) {
					
					comprobador ++;
					intentoLA = intentoLA + introduceletras;
					
				}
				else if ( ( numeroLetraLA == 1 ) && ( ( !introduceletras.equals("L") ) || ( !introduceletras.equals("l") ) ) ) {
					
					flagEmpieza = 0;
					numeroLetraLA = 0;
					intentoLA = "";
					
				}
				if ( ( numeroLetraLA == 2 ) && ( ( introduceletras.equals("A") ) || ( introduceletras.equals("a") ) ) ) {
					
					comprobador ++;
					intentoLA = intentoLA + introduceletras;
					
				}
				else if ( ( numeroLetraLA == 2 ) && ( ( !introduceletras.equals("A") ) || ( !introduceletras.equals("a") ) ) ) {
					
					flagEmpieza = 0;
					numeroLetraLA = 0;
					intentoLA = "";
					
				}
				if ( ( numeroLetraLA == 3 ) && ( ( introduceletras.equals(" ") ) || ( introduceletras.equals(",") ) || ( introduceletras.equals(";") ) || ( introduceletras.equals(".") ) ) ) {
					
					flagEmpieza = 0;
					cuentaLA ++;
					intentoLA = "";
					
				}
				else if ( ( numeroLetraLA == 3 ) && ( ( !introduceletras.equals(" ") ) || ( !introduceletras.equals(",") ) || ( !introduceletras.equals(";") ) || ( !introduceletras.equals(".") ) ) ) {
					
					flagEmpieza = 0;
					numeroLetraLA = 0;
					intentoLA = "";
					
				}
				if ( comprobador == 1) {
					
					numeroLetraLA ++ ;
					comprobador -- ;
					
				}
				
			}
			if (puedeSer == 1) {
				

				if  ( (numeroLetra == 0) && ( ( introduceletras.equals("L") ) || ( introduceletras.equals("l") ) ) ) {
					
					puedeSer ++;
					
				}
				if ( (numeroLetra == 1) && ( ( introduceletras.equals("A") ) || ( introduceletras.equals("a") ) ) ) {
					
					puedeSer ++;
					
				}
				if ( (numeroLetra == 2) && ( ( introduceletras.equals(" ") ) || ( introduceletras.equals(".") ) || ( introduceletras.equals(",") ) || ( introduceletras.equals(";") ) ) ) {
					
					cuentaLA ++;
					
				}
					puedeSer --;
				
			}
			numeroLetra ++;
			if (introduceletras.equals("*")) palabra = palabra + introduceletras;
			
		} while ( !introduceletras.equals("*"));
		if ( introduceletras.equals("*") || numeroLetraLA == 3) cuentaLA ++;
		System.out.println("\nEl numero de palabras 'LA' que hay en la frase '" + palabra + "' es de " + cuentaLA);
		System.out.println(intentoLA);
	}

}

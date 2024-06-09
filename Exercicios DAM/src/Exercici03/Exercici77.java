package Exercici03;
import java.util.Scanner;

public class Exercici77 {

	public static final int NUMEROCARACTERES = 28;
	
	/*
	 - 00 = a	- 10 = j	- 20 = s
	 - 01 = b	- 11 = k	- 21 = t
	 - 02 = c	- 12 = l	- 22 = u
	 - 03 = ç	- 13 = m	- 23 = v
	 - 04 = d	- 14 = n	- 24 = w
	 - 05 = e	- 15 = ñ	- 25 = x
	 - 06 = f	- 16 = o	- 26 = y
	 - 07 = g	- 17 = p	- 27 = z
	 - 08 = h	- 18 = k
	 - 09 = i	- 19 = r
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n77. Anar introduint caràcters pel teclat d‟una frase finalitzada amb punt. Després caldrà dir quantes\r\n"
				+ "\nlletres de tot l'abecedari s'han introduït. ('a'-'z')");
		char letra = ' ';
		String frase = "";
		System.out.println("\nIntroduce la frase que deseas escribir, CARACTER A CARACTER , y si deseas terminar introduce el '.' :");
		int tabla [] = new int [NUMEROCARACTERES] , cuantas = 0 , posicion = 0;
		Scanner entradaCaracter = new Scanner(System.in);
		do {
			
			System.out.println("\nIntroduce un caracter (para finalizar introduce el '.' ):\n");
			letra = entradaCaracter.next().charAt(0);
			frase = frase + letra;
			if ( (letra == 'a') || (letra == 'A') || (letra == 'à') || (letra == 'á') || (letra == 'À') || (letra == 'Á') ) tabla [0]++;
			else if ( (letra == 'b') || (letra == 'B') ) tabla [1]++;
			else if ( (letra == 'c') || (letra == 'C') ) tabla [2]++;
			else if ( (letra == 'ç') || (letra == 'Ç') ) tabla [3]++;
			else if ( (letra == 'd') || (letra == 'D') ) tabla [4]++;
			else if ( (letra == 'e') || (letra == 'E') || (letra == 'è') || (letra == 'é') || (letra == 'È') || (letra == 'É') ) tabla [5]++;
			else if ( (letra == 'f') || (letra == 'F') ) tabla [6]++;
			else if ( (letra == 'g') || (letra == 'G') ) tabla [7]++;
			else if ( (letra == 'h') || (letra == 'H') ) tabla [8]++;
			else if ( (letra == 'i') || (letra == 'I') || (letra == 'ì') || (letra == 'í') || (letra == 'Ì') || (letra == 'Í') || (letra == 'ï') || (letra == 'Ï') ) tabla [9]++;
			else if ( (letra == 'j') || (letra == 'J') ) tabla [10]++;
			else if ( (letra == 'k') || (letra == 'K') ) tabla [11]++;
			else if ( (letra == 'l') || (letra == 'L') ) tabla [12]++;
			else if ( (letra == 'm') || (letra == 'M') ) tabla [13]++;
			else if ( (letra == 'n') || (letra == 'N') ) tabla [14]++;
			else if ( (letra == 'ñ') || (letra == 'Ñ') ) tabla [15]++;
			else if ( (letra == 'o') || (letra == 'O') || (letra == 'ò') || (letra == 'ó') || (letra == 'Ò') || (letra == 'Ó') ) tabla [16]++;
			else if ( (letra == 'p') || (letra == 'P') ) tabla [17]++;
			else if ( (letra == 'q') || (letra == 'Q') ) tabla [18]++;
			else if ( (letra == 'r') || (letra == 'R') ) tabla [19]++;
			else if ( (letra == 's') || (letra == 'S') ) tabla [20]++;
			else if ( (letra == 't') || (letra == 'T') ) tabla [21]++;
			else if ( (letra == 'u') || (letra == 'U') || (letra == 'ù') || (letra == 'ú') || (letra == 'Ù') || (letra == 'Ú') || (letra == 'ü') || (letra == 'Ü') ) tabla [22]++;
			else if ( (letra == 'v') || (letra == 'V') ) tabla [23]++;
			else if ( (letra == 'w') || (letra == 'W') ) tabla [24]++;
			else if ( (letra == 'x') || (letra == 'X') ) tabla [25]++;
			else if ( (letra == 'y') || (letra == 'Y') ) tabla [26]++;
			else if ( (letra == 'z') || (letra == 'Z') ) tabla [27]++;
			
		} while (letra != '.');
		System.out.println("\nEn la frase de '" + frase + "' Se han encontrado las siguientes letras:");
		if ( (tabla [0] > 0) || (tabla [5] > 0) || (tabla [9] > 0) || (tabla [16] > 0) || (tabla [22] > 0)) System.out.println("\n\nVocales:");
		else System.out.println("\n\nNo hay Vocales");
		if ( tabla [0] > 0) System.out.println("\n- A : " + tabla [0]);
		if ( tabla [5] > 0) System.out.println("\n- E : " + tabla [5]);
		if ( tabla [9] > 0) System.out.println("\n- I : " + tabla [9]);
		if ( tabla [16] > 0) System.out.println("\n- O : " + tabla [16]);
		if ( tabla [22] > 0) System.out.println("\n- U : " + tabla [22]);
		if ( (tabla [1] > 0) || (tabla [2] > 0) || (tabla [3] > 0) || (tabla [4] > 0) || (tabla [6] > 0) || (tabla [7] > 0) || (tabla [8] > 0) || (tabla [10] > 0) || (tabla [11] > 0) || (tabla [12] > 0) || (tabla [13] > 0) || (tabla [14] > 0) || (tabla [15] > 0) || (tabla [17] > 0) || (tabla [18] > 0) || (tabla [19] > 0) || (tabla [20] > 0) || (tabla [21] > 0) || (tabla [23] > 0) || (tabla [24] > 0) || (tabla [25] > 0) || (tabla [26] > 0) || (tabla [27] > 0)) System.out.println("\n\nConsonantes:");
		else System.out.println("\n\nNo hay Consonantes");
		if ( tabla [1] > 0) System.out.println("\n- B : " + tabla [1]);
		if ( tabla [2] > 0) System.out.println("\n- C : " + tabla [2]);
		if ( tabla [3] > 0) System.out.println("\n- Ç : " + tabla [3]);
		if ( tabla [4] > 0) System.out.println("\n- D : " + tabla [4]);
		if ( tabla [6] > 0) System.out.println("\n- F : " + tabla [6]);
		if ( tabla [7] > 0) System.out.println("\n- G : " + tabla [7]);
		if ( tabla [8] > 0) System.out.println("\n- H : " + tabla [8]);
		if ( tabla [10] > 0) System.out.println("\n- J : " + tabla [10]);
		if ( tabla [11] > 0) System.out.println("\n- K : " + tabla [11]);
		if ( tabla [12] > 0) System.out.println("\n- L : " + tabla [12]);
		if ( tabla [13] > 0) System.out.println("\n- M : " + tabla [13]);
		if ( tabla [14] > 0) System.out.println("\n- N : " + tabla [14]);
		if ( tabla [15] > 0) System.out.println("\n- Ñ : " + tabla [15]);
		if ( tabla [17] > 0) System.out.println("\n- P : " + tabla [17]);
		if ( tabla [18] > 0) System.out.println("\n- Q : " + tabla [18]);
		if ( tabla [19] > 0) System.out.println("\n- R : " + tabla [19]);
		if ( tabla [20] > 0) System.out.println("\n- S : " + tabla [20]);
		if ( tabla [21] > 0) System.out.println("\n- T : " + tabla [21]);
		if ( tabla [23] > 0) System.out.println("\n- V : " + tabla [23]);
		if ( tabla [24] > 0) System.out.println("\n- W : " + tabla [24]);
		if ( tabla [25] > 0) System.out.println("\n- X : " + tabla [25]);
		if ( tabla [26] > 0) System.out.println("\n- Y : " + tabla [26]);
		if ( tabla [27] > 0) System.out.println("\n- Z : " + tabla [27]);
		for (posicion = 0 ; posicion < NUMEROCARACTERES ; posicion++) {
			
			if ( tabla [posicion] > 0) cuantas ++;
			
		}
		System.out.println("\nHay un total de " + cuantas + " letras diferentes");
	}

}

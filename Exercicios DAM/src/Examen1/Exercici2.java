package Examen1;

import java.util.Scanner;

public class Exercici2 {

	public static void main(String[] args) {
		// TODO 
		boolean finalizado = false , introducido = false , palabraIntro = false, ingles = false , catalan = false, castellano = false, existePalabra = false, diccionarioExiste = false;
		String Catalan [] = { "Casa" , "Cotxe" , "Ocell" , "Cadira" , "Pilota"};
		String Castellano [] = { "Casa" , "Coche" , "Pajaro" , "Silla" , "Pelota"};
		String Ingles [] = { "House" , "Car" , "Bird" , "Chair" , "Ball"};
		char letra [] = new char [2];
		Scanner entradaValor = new Scanner(System.in);
		String palabra = "";
		int pos = 0;
		do {
			
			System.out.println("\nEntra idioma origen (i) Inglés, (c) Catalan, (e) Español; o introduce (s para salir)");
			letra [0]= entradaValor.next().charAt(0);
			if ( ( letra [0] == 's' ) || ( letra [0] == 'S') ) finalizado = true;
			if ( ( letra [0] != 'i' ) && ( letra [0] != 'I' ) && ( letra [0] != 'e' ) && ( letra [0] != 'E' ) && ( letra [0] != 'c' ) && ( letra [0] != 'C' ) && ( letra [0] != 's' ) && ( letra [0] != 'S' ) ) System.out.println("El valor introducido no esta como caracter");
			else introducido = true;
			if (introducido && finalizado == false) {
				
				if (letra [0] == 'i' || letra [0] == 'I') ingles = true;
				else ingles = false;
				if (letra [0] == 'c' || letra [0] == 'C') catalan = true;
				else catalan = false;
				if (letra [0] == 'e' || letra [0] == 'E') castellano = true;
				else castellano = false;
				do {
					
					System.out.println("Escriba una palabra que deseas traducir:");
					palabra = entradaValor.next();
					
					if (castellano) {
						
						for ( int i = 0 ; i < Castellano.length; i ++) {
							
							if ( palabra.equalsIgnoreCase(Castellano[i]) ) {
								
								existePalabra = true;
								pos = i;
								
							}
							
						}
						
					}
					else if (catalan) {
						
						for ( int i = 0 ; i < Catalan.length; i ++) {
							
							if ( palabra.equalsIgnoreCase(Catalan[i]) ) {
								
								existePalabra = true;
								pos = i;
								
							}
							
						}
						
					}
					else if (ingles) {
						
						for ( int i = 0 ; i < Ingles.length; i ++) {
							
							if ( palabra.equalsIgnoreCase(Ingles[i]) ) {
								
								existePalabra = true;
								pos = i;
								
							}
							
						}
						
					}
					if (existePalabra) palabraIntro = true;
					else System.out.println("\nEsa palabra no existe, vuelva a probar.");
					
					
				} while (palabraIntro == false && finalizado == false);
				
				introducido = false;
				palabraIntro = false;
				
				do {
					
					System.out.println("\nEntra idioma Al que quieres traducir (i) Inglés, (c) Catalan, (e) Español; o introduce (s para salir)");
					letra [1]= entradaValor.next().charAt(0);
					if ( ( letra [1] == 's' ) || ( letra [1] == 'S') ) finalizado = true;
					if ( ( letra [1] != 'i' ) && ( letra [1] != 'I' ) && ( letra [1] != 'e' ) && ( letra [1] != 'E' ) && ( letra [1] != 'c' ) && ( letra [1] != 'C' ) && ( letra [1] != 's' ) && ( letra [1] != 'S' ) ) System.out.println("El valor introducido no esta como caracter");
					else introducido = true;
					if (introducido) {
						
						if (letra [1] == 'i' || letra [1] == 'I') ingles = true;
						else ingles = false;
						if (letra [1] == 'c' || letra [1] == 'C') catalan = true;
						else catalan = false;
						if (letra [1] == 'e' || letra [1] == 'E') castellano = true;
						else castellano = false;
						
						if (ingles) {
							
							System.out.println("\nLa traduccion al Ingles es : " + Ingles [pos]);
							diccionarioExiste = true;
							
						}
						else if (castellano) {
							
							System.out.println("\nLa traduccion al Español es : " + Castellano [pos]);
							diccionarioExiste = true;
							
						}
						else if (ingles) {
							
							System.out.println("\nLa traduccion al Catalan es : " + Catalan [pos]);
							diccionarioExiste = true;
							
						}
						
					}
					introducido = false;
					
				} while (diccionarioExiste == false && finalizado == false);
				
				diccionarioExiste = false;
				
			}
			
		}while(finalizado == false);

	}

}

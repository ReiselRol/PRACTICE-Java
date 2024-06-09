package GestionadorVehiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class Interf {

	private static String tapaCorner = "____";
	private static String cornerSI = "|_| ";
	private static String cornerSIBD = "_| ";
	private static String bordeIzquierdo = "|   ";
	private static String cornerII1 = "|_  ";
	private static String cornerII2 = "|_|_";
	private static String cornerID1 = "  _|";
	private static String cornerID2 = "_|_|";
	private static String cornerII1BD = "_  ";
	private static String cornerII2BD = "_|_";
	private static String cornerSD = " |_|";
	private static String bordeDerecho = "   |";
	private static String tapa = "_";
	private static String entradaValores = " > ";
	private static String entradaErrores = " [!]";
	
	public static void print (String string) {
		
		int longuitud = string.length();
		tapaSimple(longuitud);
		System.out.print(bordeIzquierdo + string + bordeDerecho + "\n");
		taponSimple(longuitud);
		
	}
	public static void print (String string, int tabulacion) {
		
		int longuitud = string.length();
		String tabular = "";
		for (int i = 0; i < tabulacion; i++) tabular += " ";
		tapaSimple(longuitud, tabular);
		System.out.print(tabular + bordeIzquierdo + string + bordeDerecho + "\n");
		taponSimple(longuitud, tabular);
		
	}
	public static void printAdv (String string) {
		
		final int longuitudMaxima = 39;
		String fraseAuxiliar = "";
				
		ArrayList<String> frases = new ArrayList<String>();
		
		for (int i = 0 ; i < string.length(); i++) {
			
			
			if (!(frases.size() > 0 && string.charAt(i) == ' ' && fraseAuxiliar == ""))fraseAuxiliar += string.charAt(i);
			
			if ( ((fraseAuxiliar.length() >= longuitudMaxima) && ( string.charAt(i) == ' ') ) || ( i == string.length() - 1)) {
				
				frases.add(fraseAuxiliar);
				fraseAuxiliar = "";
				
			}
			
		}
		int longuitud = longuitudMaxima(frases);
		
		tapaSimple(longuitud);
		for (int i = 0; i < frases.size(); i++) {
			
			System.out.print(bordeIzquierdo + frases.get(i));
			for(int j = 0; j < ( longuitud - frases.get(i).length() ); j++)System.out.print(" ");
			System.out.print(bordeDerecho + "\n");
			
		}
		taponSimple(longuitud);
		
		
	}
	public static void printAdv (String string, int tabulacion) {
		
		final int longuitudMaxima = 39;
		String fraseAuxiliar = "";
		String tabular = "";
		for (int i = 0; i < tabulacion; i++) tabular += " ";
		
		ArrayList<String> frases = new ArrayList<String>();
		
		for (int i = 0 ; i < string.length(); i++) {
			
			if (!(frases.size() > 0 && string.charAt(i) == ' ' && fraseAuxiliar == ""))fraseAuxiliar += string.charAt(i);
			
			if ( ((fraseAuxiliar.length() >= longuitudMaxima) && ( string.charAt(i) == ' ') ) || ( i == string.length() - 1)) {
				
				frases.add(fraseAuxiliar);
				fraseAuxiliar = "";
				
			}
			
		}
		
		int longuitud = longuitudMaxima(frases);
		
		tapaSimple(longuitud,tabular);
		for (int i = 0; i < frases.size(); i++) {
			
			System.out.print(tabular + bordeIzquierdo + frases.get(i));
			for(int j = 0; j < ( longuitud - frases.get(i).length() ); j++)System.out.print(" ");
			System.out.print(bordeDerecho + "\n");
			
		}
		taponSimple(longuitud,tabular);
		
		
	}
	public static void printAdv (String string, int tabulacion, int longuitudMaxima) {
		
		if (longuitudMaxima == 0) longuitudMaxima = 39;
		String fraseAuxiliar = "";
		String tabular = "";
		for (int i = 0; i < tabulacion; i++) tabular += " ";
		
		ArrayList<String> frases = new ArrayList<String>();
		
		for (int i = 0 ; i < string.length(); i++) {
			
			if (!(frases.size() > 0 && string.charAt(i) == ' ' && fraseAuxiliar == ""))fraseAuxiliar += string.charAt(i);
			
			if ( ((fraseAuxiliar.length() >= longuitudMaxima) && ( string.charAt(i) == ' ') ) || ( i == string.length() - 1)) {
				
				frases.add(fraseAuxiliar);
				fraseAuxiliar = "";
				
			}
			
		}
		
		int longuitud = longuitudMaxima(frases);
		
		tapaSimple(longuitud,tabular);
		for (int i = 0; i < frases.size(); i++) {
			
			System.out.print(tabular + bordeIzquierdo + frases.get(i));
			for(int j = 0; j < ( longuitud - frases.get(i).length() ); j++)System.out.print(" ");
			System.out.print(bordeDerecho + "\n");
			
		}
		taponSimple(longuitud,tabular);
		
		
	}
	public static void printList (String [] palabras) {
		
		int longuitud = longuitudMaxima(palabras) + 2;
		tapaSimple(longuitud);
		for(int i = 0; i < palabras.length; i++) {
			
			System.out.print(bordeIzquierdo + "- " + palabras[i]);
			for(int j = 0; j < ( longuitud - palabras[i].length() - 2); j++)System.out.print(" ");
			System.out.print(bordeDerecho + "\n");
			
			}
		taponSimple(longuitud);
	}
	public static void printMenu (String [] palabras) {
		
		int longuitud = longuitudMaxima(palabras) + 2 + String.valueOf(palabras.length).length();
		tapaSimple(longuitud);
		for(int i = 0; i < palabras.length; i++) {
			
			System.out.print(bordeIzquierdo + (i + 1) + "- " + palabras[i]);
			for(int j = 0; j < ( longuitud - palabras[i].length() - (String.valueOf(i + 1)).length() - 2); j++)System.out.print(" ");
			System.out.print(bordeDerecho + "\n");
			
			}
		taponSimple(longuitud);
	}
	public static void printList (String [] palabras, int tabulacion) {
		
		String tabular = "";
		for (int i = 0; i < tabulacion; i++) tabular += " ";
		int longuitud = longuitudMaxima(palabras) + 2;
		tapaSimple(longuitud,tabular);
		for(int i = 0; i < palabras.length; i++) {
			
			System.out.print(tabular + bordeIzquierdo + "- " + palabras[i]);
			for(int j = 0; j < ( longuitud - palabras[i].length() - 2); j++)System.out.print(" ");
			System.out.print(bordeDerecho + "\n");
			
			}
		taponSimple(longuitud,tabular);
	}
	
	public static void printMenu (String [] palabras, int tabulacion) {
		
		String tabular = "";
		for (int i = 0; i < tabulacion; i++) tabular += " ";
		int longuitud = longuitudMaxima(palabras) + 2 + String.valueOf(palabras.length).length();
		tapaSimple(longuitud,tabular);
		for(int i = 0; i < palabras.length; i++) {
			
			System.out.print(tabular + bordeIzquierdo + (i + 1) + "- " + palabras[i]);
			for(int j = 0; j < ( longuitud - palabras[i].length() - (String.valueOf(i + 1)).length() - 2); j++)System.out.print(" ");
			System.out.print(bordeDerecho + "\n");
			
			}
		taponSimple(longuitud,tabular);
	}
	
	public static void printListAdv(String [] palabras) {
		
		ArrayList<String> frases = new ArrayList<String>();
		final int longuitudMaxima = 39;
		String fraseAuxiliar = "";
		for (int palabra = 0; palabra < palabras.length; palabra ++) {
			
			for (int i = 0 ; i < palabras[palabra].length(); i++) {
				
				if( i == 0) fraseAuxiliar = "- ";
				if (!(frases.size() > 0 && palabras[palabra].charAt(i) == ' ' && fraseAuxiliar == "")) fraseAuxiliar += palabras[palabra].charAt(i);
				
				if ( ((fraseAuxiliar.length() >= longuitudMaxima) && ( palabras[palabra].charAt(i) == ' ') ) || ( i == palabras[palabra].length() - 1)) {
					
					frases.add(fraseAuxiliar);
					fraseAuxiliar = "  ";
					
				}
				
			}
		}
		
		int longuitud = longuitudMaxima(frases);
		
		
		tapaSimple(longuitud);
		for(int i = 0; i < frases.size(); i++) {
			
			System.out.print(bordeIzquierdo + frases.get(i));
			for(int j = 0; j < ( longuitud - frases.get(i).length()); j++)System.out.print(" ");
			System.out.print(bordeDerecho + "\n");
			
			}
		taponSimple(longuitud);
		
	}
	
	public static void printListAdv(String [] palabras, int tabulacion) {
		
		String tabular = "";
		for (int i = 0; i < tabulacion; i++) tabular += " ";
		ArrayList<String> frases = new ArrayList<String>();
		final int longuitudMaxima = 39;
		String fraseAuxiliar = "";
		for (int palabra = 0; palabra < palabras.length; palabra ++) {
			
			for (int i = 0 ; i < palabras[palabra].length(); i++) {
				
				if( i == 0) fraseAuxiliar = "- ";
				if (!(frases.size() > 0 && palabras[palabra].charAt(i) == ' ' && fraseAuxiliar == "")) fraseAuxiliar += palabras[palabra].charAt(i);
				
				if ( ((fraseAuxiliar.length() >= longuitudMaxima) && ( palabras[palabra].charAt(i) == ' ') ) || ( i == palabras[palabra].length() - 1)) {
					
					frases.add(fraseAuxiliar);
					fraseAuxiliar = "  ";
					
				}
				
			}
		}
		
		int longuitud = longuitudMaxima(frases);
		
		
		tapaSimple(longuitud,tabular);
		for(int i = 0; i < frases.size(); i++) {
			
			System.out.print(tabular+bordeIzquierdo + frases.get(i));
			for(int j = 0; j < ( longuitud - frases.get(i).length()); j++)System.out.print(" ");
			System.out.print(bordeDerecho + "\n");
			
			}
		taponSimple(longuitud,tabular);
		
	}
	public static void printListAdv(String [] palabras, int tabulacion, int longuitudMaxima) {
		
		String tabular = "";
		for (int i = 0; i < tabulacion; i++) tabular += " ";
		ArrayList<String> frases = new ArrayList<String>();
		if (longuitudMaxima == 0) longuitudMaxima = 39;
		String fraseAuxiliar = "";
		for (int palabra = 0; palabra < palabras.length; palabra ++) {
			
			for (int i = 0 ; i < palabras[palabra].length(); i++) {
				
				if( i == 0) fraseAuxiliar = "- ";
				if (!(frases.size() > 0 && palabras[palabra].charAt(i) == ' ' && fraseAuxiliar == "")) fraseAuxiliar += palabras[palabra].charAt(i);
				
				if ( ((fraseAuxiliar.length() >= longuitudMaxima) && ( palabras[palabra].charAt(i) == ' ') ) || ( i == palabras[palabra].length() - 1)) {
					
					frases.add(fraseAuxiliar);
					fraseAuxiliar = "  ";
					
				}
				
			}
		}
		
		int longuitud = longuitudMaxima(frases);
		
		
		tapaSimple(longuitud,tabular);
		for(int i = 0; i < frases.size(); i++) {
			
			System.out.print(tabular+bordeIzquierdo + frases.get(i));
			for(int j = 0; j < ( longuitud - frases.get(i).length()); j++)System.out.print(" ");
			System.out.print(bordeDerecho + "\n");
			
			}
		taponSimple(longuitud,tabular);
		
	}
	
	public static String title (String string) {
		
		String titulado = "";
		for (int i = 0; i < string.length(); i++) {
			
			if (string.charAt(i) == ' ' ) titulado += "    ";
			else titulado += string.charAt(i) + " ";
			
		}
		return titulado.toUpperCase();
		
	}
	
	public static int qInt() {
		
		int valor;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\n" + entradaValores);
		
		while ((!scanner.hasNextInt())){
			
			System.out.println("\n" + entradaErrores + "Debes introducir un Integer.");
			System.out.print("\n" + entradaValores);
			scanner.next();
			
		}
		
		valor = scanner.nextInt();
		System.out.println("");
		
		return valor;
		
	}
	
	public static int qInt(int tabulacion) {
		
		String tabular = "";
		if (tabulacion < 1) tabulacion = 1;
		for (int i = 0; i < tabulacion - 1; i++) tabular += " ";
		int valor;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\n" + tabular + entradaValores);
		
		while ((!scanner.hasNextInt())){
			
			System.out.println("\n"+ tabular + entradaErrores + "Debes introducir un Integer.");
			System.out.print("\n"+ tabular + entradaValores);
			scanner.next();
			
		}
		
		valor = scanner.nextInt();
		System.out.println("");
		
		return valor;
		
	}
	
	public static int qInt(int tabulacion, int min, int max) {
		
		if (max < min) {
			
			int Auxiliar = min;
			min = max;
			max = Auxiliar;
		}
		String tabular = "";
		if (tabulacion < 1) tabulacion = 1;
		for (int i = 0; i < tabulacion - 1; i++) tabular += " ";
		int valor;
		Scanner scanner = new Scanner(System.in);
		do {
			
			System.out.print("\n" +  tabular + entradaValores);
			
			while ((!scanner.hasNextInt())){
				
				System.out.println("\n" + tabular + entradaErrores + "Debes introducir un Integer.");
				System.out.print("\n"+ tabular + entradaValores);
				scanner.next();
				
			}
			
			valor = scanner.nextInt();
			
			if (valor < min) System.out.println("\n" + tabular + entradaErrores + "Debes introducir un numero superior a " + min);
			else if (valor > max) System.out.println("\n" + tabular + entradaErrores + "Debes introducir un numero inferior a " + max);
			
		} while (!(valor <= max && valor >= min));
		
		System.out.println("");
		
		return valor;
		
	}
	
	public static int qInt(int min, int max) {
		
		if (max < min) {
			
			int Auxiliar = min;
			min = max;
			max = Auxiliar;
		}
		int valor;
		Scanner scanner = new Scanner(System.in);
		do {
			
			System.out.print("\n"  + entradaValores);
			
			while ((!scanner.hasNextInt())){
				
				System.out.println("\n"  + entradaErrores + "Debes introducir un Integer.");
				System.out.print("\n" + entradaValores);
				scanner.next();
				
			}
			
			valor = scanner.nextInt();
			
			if (valor < min) System.out.println("\n" + entradaErrores + "Debes introducir un numero superior a " + min);
			else if (valor > max) System.out.println("\n" + entradaErrores + "Debes introducir un numero inferior a " + max);
			
		} while (!(valor <= max && valor >= min));
		
		System.out.println("");
		
		return valor;
		
	}
	
	public static double qDouble() {
		
		double valor;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\n" + entradaValores);
		
		while ((!scanner.hasNextDouble())){
			
			System.out.println("\n" + entradaErrores + "Debes introducir un Double.");
			System.out.print("\n" + entradaValores);
			scanner.next();
			
		}
		
		valor = scanner.nextDouble();
		System.out.println("");
		
		return valor;
		
	}
	
	public static double qDouble(int tabulacion) {
		
		String tabular = "";
		if (tabulacion < 1) tabulacion = 1;
		for (int i = 0; i < tabulacion - 1; i++) tabular += " ";
		double valor;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\n" + tabular + entradaValores);
		
		while ((!scanner.hasNextDouble())){
			
			System.out.println("\n"+ tabular + entradaErrores + "Debes introducir un Double.");
			System.out.print("\n"+ tabular + entradaValores);
			scanner.next();
			
		}
		
		valor = scanner.nextDouble();
		System.out.println("");
		
		return valor;
		
	}
	
	public static double qDouble(int min, int max) {
		
		if (max < min) {
			
			int Auxiliar = min;
			min = max;
			max = Auxiliar;
		}
		double valor;
		Scanner scanner = new Scanner(System.in);
		do {
			
			System.out.print("\n"  + entradaValores);
			
			while ((!scanner.hasNextDouble())){
				
				System.out.println("\n"  + entradaErrores + "Debes introducir un Double.");
				System.out.print("\n" + entradaValores);
				scanner.next();
				
			}
			
			valor = scanner.nextDouble();
			
			if (valor < min) System.out.println("\n" + entradaErrores + "Debes introducir un numero superior a " + min);
			else if (valor > max) System.out.println("\n" + entradaErrores + "Debes introducir un numero inferior a " + max);
			
		} while (!(valor <= max && valor >= min));
		
		System.out.println("");
		
		return valor;
		
	}
	
	public static double qDouble(int tabulacion, int min, int max) {
		
		if (max < min) {
			
			int Auxiliar = min;
			min = max;
			max = Auxiliar;
		}
		String tabular = "";
		if (tabulacion < 1) tabulacion = 1;
		for (int i = 0; i < tabulacion - 1; i++) tabular += " ";
		double valor;
		Scanner scanner = new Scanner(System.in);
		do {
			
			System.out.print("\n" +  tabular + entradaValores);
			
			while ((!scanner.hasNextDouble())){
				
				System.out.println("\n" + tabular + entradaErrores + "Debes introducir un Double.");
				System.out.print("\n"+ tabular + entradaValores);
				scanner.next();
				
			}
			
			valor = scanner.nextDouble();
			
			if (valor < min) System.out.println("\n" + tabular + entradaErrores + "Debes introducir un numero superior a " + min);
			else if (valor > max) System.out.println("\n" + tabular + entradaErrores + "Debes introducir un numero inferior a " + max);
			
		} while (!(valor <= max && valor >= min));
		
		System.out.println("");

		
		return valor;
		
	}
	
	public static String qString() {
		
		String valor;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\n" + entradaValores);
		
		valor = scanner.next();
		System.out.println("");
		
		return valor;
		
	}
	
	public static String qString(int tabulacion) {
		
		String tabular = "";
		if (tabulacion < 1) tabulacion = 1;
		for (int i = 0; i < tabulacion - 1; i++) tabular += " ";
		
		String valor;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\n" + tabular + entradaValores);
		
		valor = scanner.next();
		System.out.println("");
		
		return valor;
		
	}
	
											// // // // // P R O C E D M I E N T O S    P R I V A D O S // // // // //
	
	private static void tapaSimple(int longuitud) {
		
		System.out.println("");
		
		System.out.print(tapaCorner);
		for (int i = 0; i < longuitud; i++) System.out.print(tapa);
		System.out.print(tapaCorner + "\n");
		
		System.out.print(cornerSI);
		for (int i = 0; i < longuitud; i++) System.out.print(" ");
		System.out.print(cornerSD + "\n");
		
		System.out.print(bordeIzquierdo);
		for (int i = 0; i < longuitud; i++) System.out.print(" ");
		System.out.print(bordeDerecho + "\n");
		
	}
	private static void tapaSimple(int longuitud, String tabular) {
		
		System.out.println("");
		
		System.out.print(tabular + tapaCorner);
		for (int i = 0; i < longuitud; i++) System.out.print(tapa);
		System.out.print(tapaCorner + "\n");
		
		System.out.print(tabular + cornerSI);
		for (int i = 0; i < longuitud; i++) System.out.print(" ");
		System.out.print(cornerSD + "\n");
		
		System.out.print(tabular + bordeIzquierdo);
		for (int i = 0; i < longuitud; i++) System.out.print(" ");
		System.out.print(bordeDerecho + "\n");
		
	}
	private static void taponSimple (int longuitud) {
		
		System.out.print(cornerII1);
		for (int i = 0; i < longuitud; i++) System.out.print(" ");
		System.out.print(cornerID1 + "\n");
		
		System.out.print(cornerII2);
		for (int i = 0; i < longuitud; i++) System.out.print(tapa);
		System.out.print(cornerID2 + "\n");
		
	}
	private static void taponSimple (int longuitud, String tabular) {
		
		System.out.print(tabular + cornerII1);
		for (int i = 0; i < longuitud; i++) System.out.print(" ");
		System.out.print(cornerID1 + "\n");
		
		System.out.print(tabular + cornerII2);
		for (int i = 0; i < longuitud; i++) System.out.print(tapa);
		System.out.print(cornerID2 + "\n");
		
	}
	private static int longuitudMaxima (ArrayList<String> palabras) {
		
		int longuitud = 0;
		
		for (int i = 0; i < palabras.size(); i++) {
			
			if (palabras.get(i).length() > longuitud) longuitud = palabras.get(i).length();
			
		}
		
		return longuitud;
		
	}
	private static int longuitudMaxima (String [] palabras) {
		
		int longuitud = 0;
		
		for (int i = 0; i < palabras.length; i++) {
			
			if (palabras[i].length() > longuitud) longuitud = palabras[i].length();
			
		}
		
		return longuitud;
		
	}
	
}
class I extends Interf {}
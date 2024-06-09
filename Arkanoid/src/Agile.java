

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

@SuppressWarnings({"resource","unused","deprecation","unchecked"})
public class Agile {

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
	
	public static void guardarJSON(String nombreJson, ArrayList<AgileJSON> informacion) {
		
		JSONParser parser = new JSONParser();
		
		try {
			
			FileReader fileReader = new FileReader(nombreJson);
			JSONArray jArray = (JSONArray) parser.parse(fileReader);
			JSONObject json = new JSONObject();
			for (int i = 0; i < informacion.size(); i++) {
				
				if (informacion.get(i).getTipoDato() == 'i' || informacion.get(i).getTipoDato() == 'I') {
					
					json.put(informacion.get(i).getNombrePropiedad(), Integer.parseInt(informacion.get(i).getDato()));
					
				}
				else if (informacion.get(i).getTipoDato() == 's' || informacion.get(i).getTipoDato() == 'S') {
					
					json.put(informacion.get(i).getNombrePropiedad(), informacion.get(i).getDato());
					
				}
				else if (informacion.get(i).getTipoDato() == 'c' || informacion.get(i).getTipoDato() == 'C') {
					
					json.put(informacion.get(i).getNombrePropiedad(), informacion.get(i).getDato().charAt(0));
					
				}
				else if (informacion.get(i).getTipoDato() == 'd' || informacion.get(i).getTipoDato() == 'D') {
					
					json.put(informacion.get(i).getNombrePropiedad(), Double.parseDouble(informacion.get(i).getDato()));
					
				}
				
			}
			
			jArray.add(json);
			FileWriter nombre = new FileWriter(nombreJson);
			nombre.write(jArray.toJSONString());
			nombre.flush();
			nombre.close();
			
		} catch (IOException | ParseException e) {
			
			e.printStackTrace();
			System.err.println("\nESP: Si no funciona es porque no le estas indicando bien la ruta"
						   + "\nrecuerdo que la ruta se indica como ejemplo lo siguiente:"
						   + "\n'src/nombre-del-paquete-si-tienes/nombre-del-archivo.json'");
		}
		
	}
	
	public static void guardarJSON(String nombreJson, AgileObjJSON informacion) {
		
		JSONParser parser = new JSONParser();
		
		try {
			
			FileReader fileReader = new FileReader(nombreJson);
			JSONArray jArray = (JSONArray) parser.parse(fileReader);
			JSONObject json = new JSONObject();
			for (int i = 0; i < informacion.getDatos().size(); i++) {
				
				if (informacion.getDatos().get(i).getTipoDato() == 'i' || informacion.getDatos().get(i).getTipoDato() == 'I') {
					
					json.put(informacion.getDatos().get(i).getNombrePropiedad(), Integer.parseInt(informacion.getDatos().get(i).getDato()));
					
				}
				else if (informacion.getDatos().get(i).getTipoDato() == 's' || informacion.getDatos().get(i).getTipoDato() == 'S') {
					
					json.put(informacion.getDatos().get(i).getNombrePropiedad(), informacion.getDatos().get(i).getDato());
					
				}
				else if (informacion.getDatos().get(i).getTipoDato() == 'c' || informacion.getDatos().get(i).getTipoDato() == 'C') {
					
					json.put(informacion.getDatos().get(i).getNombrePropiedad(), informacion.getDatos().get(i).getDato().charAt(0));
					
				}
				else if (informacion.getDatos().get(i).getTipoDato() == 'd' || informacion.getDatos().get(i).getTipoDato() == 'D') {
					
					json.put(informacion.getDatos().get(i).getNombrePropiedad(), Double.parseDouble(informacion.getDatos().get(i).getDato()));
					
				}
				
			}
			
			jArray.add(json);
			FileWriter nombre = new FileWriter(nombreJson);
			nombre.write(jArray.toJSONString());
			nombre.flush();
			nombre.close();
			
		} catch (IOException | ParseException e) {
			
			e.printStackTrace();
			System.err.println("\nESP: Si no funciona es porque no le estas indicando bien la ruta"
						   + "\nrecuerdo que la ruta se indica como ejemplo lo siguiente:"
						   + "\n'src/nombre-del-paquete-si-tienes/nombre-del-archivo.json'");
		}
		
	}
	
	public static void guardarJSON(String nombreJson, AgileCObjJSON informacion) {
		
		JSONParser parser = new JSONParser();
		
		try {
			
			FileReader fileReader = new FileReader(nombreJson);
			JSONArray jArray = (JSONArray) parser.parse(fileReader);
			JSONObject json = new JSONObject();
			for (int i = 0; i < informacion.getDatosSimples().size(); i++) {
				
				if (informacion.getDatosSimples().get(i).getTipoDato() == 'i' || informacion.getDatosSimples().get(i).getTipoDato() == 'I') {
					
					json.put(informacion.getDatosSimples().get(i).getNombrePropiedad(), Integer.parseInt(informacion.getDatosSimples().get(i).getDato()));
					
				}
				else if (informacion.getDatosSimples().get(i).getTipoDato() == 's' || informacion.getDatosSimples().get(i).getTipoDato() == 'S') {
					
					json.put(informacion.getDatosSimples().get(i).getNombrePropiedad(), informacion.getDatosSimples().get(i).getDato());
					
				}
				else if (informacion.getDatosSimples().get(i).getTipoDato() == 'c' || informacion.getDatosSimples().get(i).getTipoDato() == 'C') {
					
					json.put(informacion.getDatosSimples().get(i).getNombrePropiedad(), informacion.getDatosSimples().get(i).getDato().charAt(0));
					
				}
				else if (informacion.getDatosSimples().get(i).getTipoDato() == 'd' || informacion.getDatosSimples().get(i).getTipoDato() == 'D') {
					
					json.put(informacion.getDatosSimples().get(i).getNombrePropiedad(), Double.parseDouble(informacion.getDatosSimples().get(i).getDato()));
					
				}
				
			}
			
			for (int j = 0; j < informacion.getObjetos().size(); j++ ) {
				
				JSONArray jsonComplex = new JSONArray();
				
				for (int i = 0; i < informacion.getObjetos().get(j).getDatos().size(); i++) {
					
					if (informacion.getObjetos().get(j).getDatos().get(i).getTipoDato() == 'i' || informacion.getObjetos().get(j).getDatos().get(i).getTipoDato() == 'I') {
						
						jsonComplex.add(Integer.parseInt(informacion.getObjetos().get(j).getDatos().get(i).getDato()));
						
					}
					else if (informacion.getObjetos().get(j).getDatos().get(i).getTipoDato() == 's' || informacion.getObjetos().get(j).getDatos().get(i).getTipoDato() == 'S') {
						
						jsonComplex.add(informacion.getObjetos().get(j).getDatos().get(i).getDato());
						
					}
					else if (informacion.getObjetos().get(j).getDatos().get(i).getTipoDato() == 'c' || informacion.getObjetos().get(j).getDatos().get(i).getTipoDato() == 'C') {
						
						jsonComplex.add( informacion.getObjetos().get(j).getDatos().get(i).getDato().charAt(0));
						
					}
					else if (informacion.getObjetos().get(j).getDatos().get(i).getTipoDato() == 'd' || informacion.getObjetos().get(j).getDatos().get(i).getTipoDato() == 'D') {
						
						jsonComplex.add(Double.parseDouble(informacion.getObjetos().get(j).getDatos().get(i).getDato()));
						
					}
					
					json.put(informacion.getObjetos().get(j).getNombre(),jsonComplex);
					
				}
				
			}
			
			jArray.add(json);
			FileWriter nombre = new FileWriter(nombreJson);
			nombre.write(jArray.toJSONString());
			nombre.flush();
			nombre.close();
			
		} catch (IOException | ParseException e) {
			
			e.printStackTrace();
			System.err.println("\nESP: Si no funciona es porque no le estas indicando bien la ruta"
						   + "\nrecuerdo que la ruta se indica como ejemplo lo siguiente:"
						   + "\n'src/nombre-del-paquete-si-tienes/nombre-del-archivo.json'");
		}
		
	}
	
	public static void guardarMultiplesJSON(String nombreJson, ArrayList<AgileObjJSON> informacion) {
		
		for (int i = 0; i < informacion.size(); i++) guardarJSON(nombreJson, informacion.get(i));
		
	}
	
	public static void lecturaJSON(String nombreJson, String...NombreElementos) throws IOException, ParseException {
		
		JSONParser parser = new JSONParser();	 
		FileReader reader = new FileReader(nombreJson);
        JSONArray array = (JSONArray) parser.parse(reader);
        
        for (Object obj : array) {
        	
        	JSONObject jsonObject = (JSONObject) obj;
        	
        	for (String elemento : NombreElementos) {
        			
            		System.out.println(elemento + ": " + jsonObject.get(elemento));
        		
        	}
        	
        	System.out.println();
        	
        }
	
	}
	
	public static void lecturaJSON(String nombreJson, ArrayList<String> elementosSimples, String...elementosObjetos ) throws IOException, ParseException {
		
		JSONParser parser = new JSONParser();	 
		FileReader reader = new FileReader(nombreJson);
        JSONArray array = (JSONArray) parser.parse(reader);
        
        for (Object obj : array) {
        	
        	JSONObject jsonObject = (JSONObject) obj;
        	
        	for (String elemento : elementosSimples) {
        			
            		System.out.println(elemento + ": " + jsonObject.get(elemento));
        		
        	}
        	
        	for (int i = 0; i < elementosObjetos.length; i++) {
        		
        		String dato = elementosObjetos[i] + ": [ ";
        		
        		JSONArray jArray = (JSONArray) jsonObject.get(elementosObjetos[i]);
        		Iterator<String> iterator = jArray.iterator();
        		
        		while(iterator.hasNext()) {
        			
        			dato += String.valueOf(iterator.next());
        			if (iterator.hasNext()) dato += " , ";
        		}
        		dato += " ]";
        		System.out.println(dato);
        		
        		
        	}
        	
        	System.out.println();
        	
        }
	
	}
	
	public static ArrayList<String> getSortedJSON(String nombreJson, String elementoComparar, String...NombreElementos) throws IOException, ParseException {
		
		ArrayList<String> datos = new ArrayList<String>();
		
		JSONParser parser = new JSONParser();	 
		FileReader reader = new FileReader(nombreJson);
        JSONArray array = (JSONArray) parser.parse(reader);
        array.sort(new Comparator<JSONObject>() {
        	
        	public int compare(JSONObject o1, JSONObject o2) {
               
        		int puntos1 = Integer.parseInt(o1.get(elementoComparar).toString());
        		int puntos2 = Integer.parseInt(o2.get(elementoComparar).toString());
        		
                return Integer.compare(puntos2, puntos1);
                
            }
        });
        
        for (Object obj : array) {
        	
        	JSONObject jsonObject = (JSONObject) obj;
        	
        	for (String elemento : NombreElementos) {
        			
        			String dato = String.valueOf(jsonObject.get(elemento));
            		datos.add(dato);
        		
        	}
        	
        }
		
		return datos;
		
	}
	
	public static ArrayList<String> getJSON(String nombreJson, String...NombreElementos) throws IOException, ParseException {
		
		ArrayList<String> datos = new ArrayList<String>();
		
		JSONParser parser = new JSONParser();	 
		FileReader reader = new FileReader(nombreJson);
        JSONArray array = (JSONArray) parser.parse(reader);
        
        for (Object obj : array) {
        	
        	JSONObject jsonObject = (JSONObject) obj;
        	
        	for (String elemento : NombreElementos) {
        			
        			String dato = String.valueOf(jsonObject.get(elemento));
            		datos.add(dato);
        		
        	}
        	
        }
		
		return datos;
		
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
class AgileJSON {
	
	private String nombrePropiedad;
	private String dato;
	private char tipoDato;
	
	public AgileJSON () {
		
	}
	
	public AgileJSON (String nombrePropiedad, String dato, char tipoDato) {
		
		this.setNombrePropiedad(nombrePropiedad);
		this.setDato(dato);
		this.setTipoDato(tipoDato);
		
	}

	public String getNombrePropiedad() {
		return nombrePropiedad;
	}

	public void setNombrePropiedad(String nombrePropiedad) {
		this.nombrePropiedad = nombrePropiedad;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public char getTipoDato() {
		return tipoDato;
	}

	public void setTipoDato(char tipoDato) {
		this.tipoDato = tipoDato;
	}
	
}
class AgileObjJSON {
	
	private ArrayList<AgileJSON> datos = new ArrayList<AgileJSON>();
	private String nombre;
	
	public AgileObjJSON() {
		
	}
	
	public AgileObjJSON(String nombre) {
		
		this.setNombre(nombre);
		
	}
	
	public AgileObjJSON(String nombre, ArrayList<AgileJSON> datos) {
		
		this.setNombre(nombre);
		this.datos = datos;
		
	}
	
	public AgileObjJSON(ArrayList<AgileJSON> datos) {
		
		this.datos = datos;
		
	}
	
	public AgileObjJSON(ArrayList<AgileJSON> datos, String nombre) {
		
		this.setNombre(nombre);
		this.datos = datos;
		
	}

	public ArrayList<AgileJSON> getDatos() {
		return datos;
	}

	public void setDatos(ArrayList<AgileJSON> datos) {
		this.datos = datos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
class AgileCObjJSON{
	
	private ArrayList<AgileJSON> datosSimples = new ArrayList<AgileJSON>();
	private ArrayList<AgileObjJSON> objetos = new ArrayList<AgileObjJSON>();
	
	public ArrayList<AgileJSON> getDatosSimples() {
		return datosSimples;
	}
	
	public void setDatosSimples(ArrayList<AgileJSON> datosSimples) {
		this.datosSimples = datosSimples;
	}
	
	public ArrayList<AgileObjJSON> getObjetos() {
		return objetos;
	}
	
	public void setObjetos(ArrayList<AgileObjJSON> objetos) {
		this.objetos = objetos;
	}
	
}
package ExamenesFretaCFGM;

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
	
	public static void guardarJSON(String archivo, AgileJSONObj datosAGuardar) throws IOException, ParseException {
		
		JSONParser parser = new JSONParser();
		
		FileReader fileReader = new FileReader(archivo);
		
		JSONObject json = (JSONObject) parser.parse(fileReader);
		
		for (int i = 0; i < datosAGuardar.getPropiedades().size(); i++) {
			
			if (datosAGuardar.getPropiedades().get(i).getTipoDato() == 'I' || datosAGuardar.getPropiedades().get(i).getTipoDato() == 'i') {
				
				json.put(datosAGuardar.getPropiedades().get(i).getNombrePropiedad() ,Integer.parseInt(datosAGuardar.getPropiedades().get(i).getDato()));
			
			}
			else if (datosAGuardar.getPropiedades().get(i).getTipoDato() == 'S' || datosAGuardar.getPropiedades().get(i).getTipoDato() == 's') {
				
				json.put(datosAGuardar.getPropiedades().get(i).getNombrePropiedad(), datosAGuardar.getPropiedades().get(i).getDato());
				
			}
			else if (datosAGuardar.getPropiedades().get(i).getTipoDato() == 'C' || datosAGuardar.getPropiedades().get(i).getTipoDato() == 'c') {
				
				json.put(datosAGuardar.getPropiedades().get(i).getNombrePropiedad() ,datosAGuardar.getPropiedades().get(i).getDato().charAt(0));
				
			}
			else if (datosAGuardar.getPropiedades().get(i).getTipoDato() == 'D' || datosAGuardar.getPropiedades().get(i).getTipoDato() == 'd') {
				
				json.put(datosAGuardar.getPropiedades().get(i).getNombrePropiedad() ,Double.parseDouble(datosAGuardar.getPropiedades().get(i).getDato()));
				
			}
			
		}
		
		for (int i = 0; i < datosAGuardar.getDatosSimple().size(); i++) {
			
			JSONObject jsonAux = construirObjetoSimple(datosAGuardar.getDatosSimple().get(i));
			json.put(datosAGuardar.getDatosSimple().get(i).getNombre() ,jsonAux);
			
		}
		
		for (int i = 0; i < datosAGuardar.getDatosArraySimple().size(); i++) {
			
			JSONArray jsonAux = construirArraySimple(datosAGuardar.getDatosArraySimple().get(i));
			json.put(datosAGuardar.getDatosArraySimple().get(i).getNombre() ,jsonAux);
			
		}
		
		for (int i = 0; i < datosAGuardar.getDatosArrayOjetos().size(); i++) {
			
			JSONArray jsonAux = construirArrayObjetos(datosAGuardar.getDatosArrayOjetos().get(i));
			json.put(datosAGuardar.getDatosArrayOjetos().get(i).getNombre() ,jsonAux);
			
		}
		
		FileWriter escribano = new FileWriter(archivo);
		escribano.write(json.toJSONString());
		escribano.flush();
		escribano.close();
		
	}
	
	public static String searchJSON(String archivo, String...direccion) throws IOException, ParseException {
		
		String resultadoBusqueda = "";
		String [] direccionBusqueda = new String [direccion.length];
		int i = 0;
		
		for (String elemento : direccion) {
			
			direccionBusqueda[i] = elemento;
			i++;
			
		}
		
		JSONParser parser = new JSONParser();
		FileReader fileReader = new FileReader(archivo);
		JSONObject json = (JSONObject) parser.parse(fileReader);
		
		if (direccionBusqueda.length == 2) resultadoBusqueda = "" + json.get(direccionBusqueda[0]);
		else resultadoBusqueda = busquedaRecursiva(json, direccionBusqueda);
		
		
		return resultadoBusqueda;
		
	}
	
	public static int searchSizeJSON(String archivo, String...direccion) throws IOException, ParseException {
		
		int resultadoBusqueda = 0;
		String [] direccionBusqueda = new String [direccion.length];
		int i = 0;
		for (String elemento : direccion) {
			
			direccionBusqueda[i] = elemento;
			i++;
			
		}
		JSONParser parser = new JSONParser();
		FileReader fileReader = new FileReader(archivo);
		JSONObject json = (JSONObject) parser.parse(fileReader);
		
		if (direccion.length == 2) {
			
			JSONArray nuevoJson = (JSONArray) json.get(direccionBusqueda[0]);
			resultadoBusqueda = nuevoJson.size();
			
		}
		else resultadoBusqueda = busquedaSizeRecursiva(json, direccionBusqueda);
		
		
		return resultadoBusqueda;
		
	}
	
											// // // // // P R O C E D M I E N T O S    P R I V A D O S // // // // //
	
	private static String busquedaRecursiva(JSONObject objJSON, String[]direccion) {
		
		String elemento = direccion[0];
		String tipo = direccion[1];
		String resultado = "";
		
		if (direccion.length == 2) {
						
			resultado = "" + objJSON.get(elemento);
			
		}
		else {
			
			String [] nuevaDireccion = new String[direccion.length - 2];
			for (int i = 0; i < nuevaDireccion.length; i++) nuevaDireccion[i] = direccion[i + 2];
			
			if (tipo.equalsIgnoreCase("O")) {
				
				JSONObject nuevoJson = (JSONObject) objJSON.get(elemento);
				resultado = busquedaRecursiva(nuevoJson, nuevaDireccion);
				
			}
			else {
				
				JSONArray nuevoJson = (JSONArray) objJSON.get(elemento);
				resultado = busquedaRecursiva(nuevoJson, nuevaDireccion);
				
			}
			
		}
		
		return resultado;
		
	}
	
	private static String busquedaRecursiva(JSONArray objJSON, String[]direccion) {
		
		int elemento = Integer.parseInt(direccion[0]);
		String tipo = direccion[1];
		String resultado = "";
		
		if (direccion.length == 2) {
			
			Object aux = objJSON.get(0);
			resultado = "" + (String) aux;
			
		}
		else {
			
			String [] nuevaDireccion = new String[direccion.length - 2];
			for (int i = 0; i < nuevaDireccion.length; i++) nuevaDireccion[i] = direccion[i + 2];
			
			if (tipo.equalsIgnoreCase("O")) {
				
				JSONObject nuevoJson = (JSONObject) objJSON.get(elemento);
				resultado = busquedaRecursiva(nuevoJson, nuevaDireccion);
				
			}
			else {
				
				JSONArray nuevoJson = (JSONArray) objJSON.get(elemento);
				resultado = busquedaRecursiva(nuevoJson, nuevaDireccion);
				
			}
			
		}
		
		return resultado;
		
		
	}
	
	private static int busquedaSizeRecursiva(JSONObject objJSON, String[]direccion) {
		
		String elemento = direccion[0];
		String tipo = direccion[1];
		int resultado = 0;
			
		String [] nuevaDireccion = new String[direccion.length - 2];
		for (int i = 0; i < nuevaDireccion.length; i++) nuevaDireccion[i] = direccion[i + 2];
		
		if (tipo.equalsIgnoreCase("O")) {
			
			JSONObject nuevoJson = (JSONObject) objJSON.get(elemento);
			resultado = busquedaSizeRecursiva(nuevoJson, nuevaDireccion);
			
		}
		else {
			
			JSONArray nuevoJson = (JSONArray) objJSON.get(elemento);
			resultado = busquedaSizeRecursiva(nuevoJson, nuevaDireccion);
			
		
		}
	
		return resultado;
		
	}
	
	private static int busquedaSizeRecursiva(JSONArray objJSON, String[]direccion) {
		
		int elemento = Integer.parseInt(direccion[0]);
		String tipo = direccion[1];
		int resultado = 0;
		
		if (direccion.length == 2) {
			
			resultado = objJSON.size();
			
		}
		else {
			
			String [] nuevaDireccion = new String[direccion.length - 2];
			for (int i = 0; i < nuevaDireccion.length; i++) nuevaDireccion[i] = direccion[i + 2];
			
			if (tipo.equalsIgnoreCase("O")) {
				
				JSONObject nuevoJson = (JSONObject) objJSON.get(elemento);
				resultado = busquedaSizeRecursiva(nuevoJson, nuevaDireccion);
				
			}
			else {
				
				JSONArray nuevoJson = (JSONArray) objJSON.get(elemento);
				resultado = busquedaSizeRecursiva(nuevoJson, nuevaDireccion);
				
			}
			
		}
		
		return resultado;
		
		
	}
	
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
	private static JSONArray construirArraySimple(AgileArrayJSON agileJsonArray) {
		
		JSONArray jsonArray = new JSONArray();
		
		for (int i = 0; i < agileJsonArray.getDatos().size(); i++) {
			
			if (agileJsonArray.getDatos().get(i).getTipoDato() == 'I' || agileJsonArray.getDatos().get(i).getTipoDato() == 'i') {
			
				jsonArray.add(Integer.parseInt(agileJsonArray.getDatos().get(i).getDato()));
			
			}
			else if (agileJsonArray.getDatos().get(i).getTipoDato() == 'S' || agileJsonArray.getDatos().get(i).getTipoDato() == 's') {
				
				jsonArray.add(agileJsonArray.getDatos().get(i).getDato());
				
			}
			else if (agileJsonArray.getDatos().get(i).getTipoDato() == 'C' || agileJsonArray.getDatos().get(i).getTipoDato() == 'c') {
				
				jsonArray.add(agileJsonArray.getDatos().get(i).getDato().charAt(0));
				
			}
			else if (agileJsonArray.getDatos().get(i).getTipoDato() == 'D' || agileJsonArray.getDatos().get(i).getTipoDato() == 'd') {
				
				jsonArray.add(Double.parseDouble(agileJsonArray.getDatos().get(i).getDato()));
				
			}
			
		}
		
		return jsonArray;
		
	}
	
	private static JSONArray construirArrayObjetos(AgileObjectArrayJSON agileJsonArray) {
		
		
		JSONArray jsonArray = new JSONArray();
		
		for (int i = 0; i < agileJsonArray.getDatos().size(); i++) {
			
			
			jsonArray.add(construirObjetoSimple(agileJsonArray.getDatos().get(i)));
			
		}
		
		return jsonArray;
		
	}
	
	private static JSONObject construirObjetoSimple(AgileJSON agileJson) {
		
		JSONObject jsonObject = new JSONObject();
		
		for (int i = 0; i < agileJson.getDatos().size(); i++) {
			
			if (agileJson.getDatos().get(i).getTipoDato() == 'I' || agileJson.getDatos().get(i).getTipoDato() == 'i') {
				
				jsonObject.put(agileJson.getDatos().get(i).getNombrePropiedad() ,Integer.parseInt(agileJson.getDatos().get(i).getDato()));
			
			}
			else if (agileJson.getDatos().get(i).getTipoDato() == 'S' || agileJson.getDatos().get(i).getTipoDato() == 's') {
				
				jsonObject.put(agileJson.getDatos().get(i).getNombrePropiedad() ,agileJson.getDatos().get(i).getDato());
				
			}
			else if (agileJson.getDatos().get(i).getTipoDato() == 'C' || agileJson.getDatos().get(i).getTipoDato() == 'c') {
				
				jsonObject.put(agileJson.getDatos().get(i).getNombrePropiedad() ,agileJson.getDatos().get(i).getDato().charAt(0));
				
			}
			else if (agileJson.getDatos().get(i).getTipoDato() == 'D' || agileJson.getDatos().get(i).getTipoDato() == 'd') {
				
				jsonObject.put(agileJson.getDatos().get(i).getNombrePropiedad() ,Double.parseDouble(agileJson.getDatos().get(i).getDato()));
				
			}
			
		}
		
		for (int i = 0; i < agileJson.getDatosComplejos().size(); i++) jsonObject.put(agileJson.getDatosComplejos().get(i).getNombre(),construirObjetoSimple(agileJson.getDatosComplejos().get(i)));
		for (int i = 0; i < agileJson.getDatosArraySimple().size(); i++) {
			
			JSONArray jsonArray = construirArraySimple(agileJson.getDatosArraySimple().get(i));
			jsonObject.put(agileJson.getDatosArraySimple().get(i).getNombre() ,jsonArray);
			
		}
		
		for (int i = 0; i < agileJson.getDatosArraySimple().size(); i++) {
			
			JSONArray jsonArray = construirArrayObjetos(agileJson.getDatosArrayObjetos().get(i));
			jsonObject.put(agileJson.getDatosArrayObjetos().get(i).getNombre() ,jsonArray);
			
		}
		
		
		return jsonObject;
		
	}
	
}

									//	//	//	//	//	Classes extras	//	//	//	//	//

class AgilePropiedadJSON {
	
	private String nombrePropiedad;
	private String dato;
	private char tipoDato;
	
	public AgilePropiedadJSON () {
		
	}
	
	public AgilePropiedadJSON (String nombrePropiedad, String dato, char tipoDato) {
		
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
class AgileJSON {
	
	private ArrayList<AgilePropiedadJSON> datos = new ArrayList<AgilePropiedadJSON>();
	private ArrayList<AgileJSON> datosComplejos = new ArrayList<AgileJSON>();
	private ArrayList<AgileArrayJSON> datosArraySimple = new ArrayList<AgileArrayJSON>();
	private ArrayList<AgileObjectArrayJSON> datosArrayObjetos = new ArrayList<AgileObjectArrayJSON>();
	private String nombre;
	
	public AgileJSON() {
		
	}
	
	public AgileJSON(String nombre) {
		
		this.setNombre(nombre);
		
	}
	
	public AgileJSON(String nombre, ArrayList<AgilePropiedadJSON> datos) {
		
		this.setNombre(nombre);
		this.datos = datos;
		
	}
	
	public AgileJSON(ArrayList<AgilePropiedadJSON> datos) {
		
		this.datos = datos;
		
	}
	
	public AgileJSON(ArrayList<AgilePropiedadJSON> datos, String nombre) {
		
		this.setNombre(nombre);
		this.datos = datos;
		
	}

	public ArrayList<AgilePropiedadJSON> getDatos() {
		return datos;
	}

	public void setDatos(ArrayList<AgilePropiedadJSON> datos) {
		this.datos = datos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<AgileJSON> getDatosComplejos() {
		return datosComplejos;
	}

	public void setDatosComplejos(ArrayList<AgileJSON> datosComplejos) {
		this.datosComplejos = datosComplejos;
	}

	public ArrayList<AgileArrayJSON> getDatosArraySimple() {
		return datosArraySimple;
	}

	public void setDatosArraySimple(ArrayList<AgileArrayJSON> datosArraySimple) {
		this.datosArraySimple = datosArraySimple;
	}

	public ArrayList<AgileObjectArrayJSON> getDatosArrayObjetos() {
		return datosArrayObjetos;
	}

	public void setDatosArrayObjetos(ArrayList<AgileObjectArrayJSON> datosArrayObjetos) {
		this.datosArrayObjetos = datosArrayObjetos;
	}
	
}
class AgileArrayJSON{
	
	private String nombre;
	private ArrayList<AgilePropiedadJSON> datos = new ArrayList<AgilePropiedadJSON>();
	
	public AgileArrayJSON() {
		
	}
	
	public AgileArrayJSON(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<AgilePropiedadJSON> getDatos() {
		return datos;
	}
	public void setDatos(ArrayList<AgilePropiedadJSON> datos) {
		this.datos = datos;
	}
	
	
}
class AgileObjectArrayJSON{
	
	private String nombre;
	private ArrayList<AgileJSON> datos = new ArrayList<AgileJSON>();
	
	public AgileObjectArrayJSON() {
		
	}
	
	public AgileObjectArrayJSON(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<AgileJSON> getDatos() {
		return datos;
	}
	public void setDatos(ArrayList<AgileJSON> datos) {
		this.datos = datos;
	}
	
	
}
class AgileJSONObj {
	
	private String NombreObjeto;
	private ArrayList<AgilePropiedadJSON> propiedades = new ArrayList<AgilePropiedadJSON>();
	private ArrayList<AgileJSON> datosSimple = new ArrayList<AgileJSON>();
	private ArrayList<AgileArrayJSON> datosArraySimple = new ArrayList<AgileArrayJSON>();
	private ArrayList<AgileObjectArrayJSON> datosArrayOjetos = new ArrayList<AgileObjectArrayJSON>();
	
	public String getNombreObjeto() {
		return NombreObjeto;
	}
	
	public void add(AgileJSON datoSimple) {
		
		this.datosSimple.add(datoSimple);
		
	}
	
	public void addA(AgileArrayJSON datoSimple) {
		
		this.datosArraySimple.add(datoSimple);
		
	}
	
	public void addO(AgileObjectArrayJSON datoSimple) {
		
		this.datosArrayOjetos.add(datoSimple);
		
	}
	
	public AgileJSON get(int indice) {
		
		return this.datosSimple.get(indice);
		
	}
	
	public AgileObjectArrayJSON getO(int indice) {
		
		return this.datosArrayOjetos.get(indice);
		
	}
	
	public AgileArrayJSON getC(int indice) {
		
		return this.datosArraySimple.get(indice);
		
	}
	
	public void setNombreObjeto(String nombreObjeto) {

		NombreObjeto = nombreObjeto;
		
	}

	public ArrayList<AgileJSON> getDatosSimple() {
		
		return datosSimple;
		
	}

	public void setDatosSimple(ArrayList<AgileJSON> datosSimple) {
		
		this.datosSimple = datosSimple;
		
	}

	public ArrayList<AgileArrayJSON> getDatosArraySimple() {
		
		return datosArraySimple;
		
	}

	public void setDatosArraySimple(ArrayList<AgileArrayJSON> datosArraySimple) {
		
		this.datosArraySimple = datosArraySimple;
		
	}

	public ArrayList<AgileObjectArrayJSON> getDatosArrayOjetos() {
		
		return datosArrayOjetos;
		
	}

	public void setDatosArrayOjetos(ArrayList<AgileObjectArrayJSON> datosArrayOjetos) {
		
		this.datosArrayOjetos = datosArrayOjetos;
		
	}

	public ArrayList<AgilePropiedadJSON> getPropiedades() {
		return propiedades;
	}

	public void setPropiedades(ArrayList<AgilePropiedadJSON> propiedades) {
		this.propiedades = propiedades;
	}
	
}
package Aeronautica;

import java.util.ArrayList;
import java.util.Scanner;

public class Engine {
	
	public static Scanner entradaValores = new Scanner(System.in);	
	public static int entradaInt (int max, int min) {
		
		int numero;
		boolean introducidoCorrectamente = false;
		
		do {
			
			System.out.print("\n\n  >> ");
			numero = entradaValores.nextInt();
			
			if ( ( numero <= max ) && (numero >= min) ) introducidoCorrectamente = true;
			else System.err.print("\n [E] El numero introducido ( " + numero + " ) no esta en el rango de ( " + min + " - " + max + " ) contando estos valores. Vuelve a intentarlo");
			
		} while ( introducidoCorrectamente == false);
		
		return numero;
		
	}
	public static int entradaInt (int min) {
		
		int numero;
		boolean introducidoCorrectamente = false;
		
		do {
			
			System.out.print("\n\n  >> ");
			numero = entradaValores.nextInt();
			
			if ( (numero >= min) ) introducidoCorrectamente = true;
			else System.err.print("\n [E] El numero introducido ( " + numero + " ) no essuperior al minimo ( " + min + " ). Vuelve a intentarlo");
			
		} while ( introducidoCorrectamente == false);
		
		return numero;
		
	}
	public static int entradaInt () {
		
		int numero;

			
			System.out.print("\n\n  >> ");
			numero = entradaValores.nextInt();
			
		return numero;
		
	}
	public static String entradaString () {
		
		String cadenaDeCaracteres;
		System.out.print("\n\n  >> ");
		cadenaDeCaracteres = entradaValores.next();
		return cadenaDeCaracteres;
		
	}
	public static int calcularLongMaxString(ArrayList<Avion> aviones) {
		
		int [] datosAComparar = new int [7];
		int numeroMaximoLongitud = 11;
		
		datosAComparar[0] = calcularLongMarca(aviones);
		datosAComparar[1] = calcularLongModelo(aviones);
		datosAComparar[2] = calcularLongMatricula(aviones);
		datosAComparar[3] = calcularLongCoordenadasX(aviones);
		datosAComparar[4] = calcularLongCoordenadasY(aviones);
		datosAComparar[5] = calcularAltura(aviones);
		datosAComparar[6] = calcularVelocidad(aviones);
		
		for (int i = 0; i < datosAComparar.length; i++) {
			
			if (numeroMaximoLongitud < datosAComparar[i]) numeroMaximoLongitud = datosAComparar[i];
			
		}
		
		return numeroMaximoLongitud;
		
	}
	public static int calcularLongModelo(ArrayList<Avion> aviones) {
		
		int numeroMaximo = 0;
		int numeroAComparar;
		
		for (int i = 0; i < aviones.size(); i++) {
			
			numeroAComparar = aviones.get(i).getModelo().length();
			if (numeroMaximo < numeroAComparar) numeroMaximo = numeroAComparar;
			
		}
		
		return numeroMaximo;
	}
	public static int calcularLongMarca(ArrayList<Avion> aviones) {
		
		int numeroMaximo = 0;
		int numeroAComparar;
		
		for (int i = 0; i < aviones.size(); i++) {
			
			numeroAComparar = aviones.get(i).getMarca().length();
			if (numeroMaximo < numeroAComparar) numeroMaximo = numeroAComparar;
			
		}
		
		return numeroMaximo;
	}
	public static int calcularLongMatricula(ArrayList<Avion> aviones) {
		
		int numeroMaximo = 0;
		int numeroAComparar;
		
		for (int i = 0; i < aviones.size(); i++) {
			
			numeroAComparar = aviones.get(i).getMatricula().length();
			if (numeroMaximo < numeroAComparar) numeroMaximo = numeroAComparar;
			
		}
		
		return numeroMaximo;
	}
	public static int calcularLongCoordenadasX(ArrayList<Avion> aviones) {
		
		int numeroMaximo = 0;
		int numeroAComparar;
		
		for (int i = 0; i < aviones.size(); i++) {
			
			numeroAComparar = String.valueOf(aviones.get(i).getCordenadas().getX()).length();
			if (numeroMaximo < numeroAComparar) numeroMaximo = numeroAComparar;
			
		}
		
		return numeroMaximo;
	}
	public static int calcularLongCoordenadasY(ArrayList<Avion> aviones) {
		
		int numeroMaximo = 0;
		int numeroAComparar;
		
		for (int i = 0; i < aviones.size(); i++) {
			
			numeroAComparar = String.valueOf(aviones.get(i).getCordenadas().getY()).length();
			if (numeroMaximo < numeroAComparar) numeroMaximo = numeroAComparar;
			
		}
		
		return numeroMaximo;
	}
	public static int calcularAltura(ArrayList<Avion> aviones) {
		
		int numeroMaximo = 0;
		int numeroAComparar;
		
		for (int i = 0; i < aviones.size(); i++) {
			
			numeroAComparar = String.valueOf(aviones.get(i).getCordenadas().getAltura()).length();
			if (numeroMaximo < numeroAComparar) numeroMaximo = numeroAComparar;
			
		}
		
		return numeroMaximo;
	}
	public static int calcularVelocidad(ArrayList<Avion> aviones) {
		
		int numeroMaximo = 0;
		int numeroAComparar;
		
		for (int i = 0; i < aviones.size(); i++) {
			
			numeroAComparar = String.valueOf(aviones.get(i).getVelocitat()).length();
			if (numeroMaximo < numeroAComparar) numeroMaximo = numeroAComparar;
			
		}
		
		return numeroMaximo;
	}
	public static void añadirAvionRandom(ArrayList<Avion> aviones) {
		
		String marcasDisponibles [] = {"Kupra", "Dacia", "Renault", "No se Marcas Aviones", "Honda", "Tesla", "Fiat"};
		String origenDisponibles [] = {"BCN","MDR"};
		String destinosDisponibles [] = {"FRN","ITL"};
		String modelosDisponibles [] = {"207", "Alfa", "Model M", "Acuatics", "No Acuatics", "Flyeador", "Bird", "Multipla"};
		char diccionarioLetras [] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '-'};
		
		int numeroAlAzar = (int)(Math.random() * marcasDisponibles.length);
		String marca = marcasDisponibles[numeroAlAzar];
		
		numeroAlAzar = (int)(Math.random() * modelosDisponibles.length);
		String modelo = modelosDisponibles[numeroAlAzar];
		
		numeroAlAzar = (int)(Math.random() * origenDisponibles.length);
		String origen = origenDisponibles[numeroAlAzar];
		
		numeroAlAzar = (int)(Math.random() * destinosDisponibles.length);
		String destino = destinosDisponibles[numeroAlAzar];
		
		boolean motores = (((int)(Math.random() * 10)) < 8) ? true : false;
		boolean trenAterrizage = (((int)(Math.random() * 10)) < 8) ? false : true;
		
		int velocidad = (int)(Math.random() * 300);
		int tripulantes = (int)(Math.random() * 10 + 2);
		int capacidad = (int)(Math.random() * 150 + 4);
		int autonomias = (int)(Math.random() * 5500 + 400); 
		
		String matricula = "";
		
		int longitudMatricula = (int)(Math.random() * 3 + 5);
		
		for (int i = 0; i < longitudMatricula; i++) {
			
			if ( (int)(Math.random() * 3) < 1 ) matricula += (int)(Math.random() * 10);
			else {
				numeroAlAzar = ((int)(Math.random() * diccionarioLetras.length));
				matricula += diccionarioLetras[numeroAlAzar];
			}
			
		}
		
		Cordenada cordenada = new Cordenada((int)(Math.random() * 100), (int)(Math.random() * 100), (int)(Math.random() * 3000));
		
		Avion avion = new Avion(matricula, marca, modelo, capacidad, tripulantes, origen, destino, cordenada, autonomias, trenAterrizage, motores, velocidad);
		aviones.add(avion);
		
	}

}
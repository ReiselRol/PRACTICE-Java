package ExamenHerencia;

import java.util.ArrayList;
import java.util.Scanner;

public class Upisoft {

	public ArrayList<Personage> personages = new ArrayList<Personage>();
	public Scanner entradaValores = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Upisoft a = new Upisoft();
		a.principal();

	}
	
	public void principal() {
		
		boolean finalizado = false;
		int opcion = 0;
		
		do {
			
			System.out.println("\n\n1. Exit"
							 + "\n2. Insert data"
							 + "\n3. Show data in console"
							 + "\n4. Fight between factions"
							 + "\n5. Insert random data");
			System.out.print("Choose an option:?_");
			opcion = entradaValores.nextInt();
			System.out.println(" ");
			
			if (opcion == 1) finalizado = true;
			else if (opcion == 2) insertData();
			else if (opcion == 3) showData();
			else if (opcion == 4) fight();
			else if (opcion == 5) insertRandomData();
			
		} while (!finalizado);
		
	}
	
	public void showData() {
		
		if (personages.size() == 0) {
			
			System.out.println("\nNo hay personages por mostrar, porfabor introduzca uno");
			
		}
		else {
			
			for (int personage = 0; personage < personages.size(); personage++) personages.get(personage).mostrarInfo();
			
		}
		
	}
	
	public void insertData() {
		
		int raza, idFaccion, tenacidad = 0;
		double magia = 0;
		boolean primeraVezEnCiclo = true, inteligencia = false;
		
		do {
			
			if (primeraVezEnCiclo)System.out.print("\nChoose race ( 1-Human 2-Orc 3-Elf): ");
			raza = entradaValores.nextInt();
			
			if ( !( raza == 1 || raza == 2 || raza == 3 ) ) System.out.println("\nWrong race id, please choose one number of the next options ( 1-Human 2-Orc 3-Elf)");
			
			primeraVezEnCiclo = false;
			
		} while ( !( raza == 1 || raza == 2 || raza == 3 ) );
		
		primeraVezEnCiclo = true;
		
		do {
			
			if (primeraVezEnCiclo)System.out.print("\nChoose faction (1-Alliance 2-Horde): ");
			idFaccion = entradaValores.nextInt();
			
			if ( ( idFaccion < 1 ) && ( idFaccion > 2 ) ) System.out.print("\nWrong faction id, please choose one number of the next options (1-Alliance 2-Horde)");
			
			primeraVezEnCiclo = false;
			
		} while ( ( idFaccion < 1 ) && ( idFaccion > 2 ) );
		
		String faccion = (idFaccion == 1) ? "Alliance" : "Horde";
		System.out.print("Name: ");
		String nombre = entradaValores.next();
		primeraVezEnCiclo = true;
		
		if (raza == 1) {
			
			String respuesta = "";
			
			do {
				
				if(primeraVezEnCiclo)System.out.print("\nInteligencia (Si/No): ");
				respuesta = entradaValores.next();
				
				if (!(respuesta.equalsIgnoreCase("Si") || respuesta.equalsIgnoreCase("No"))) System.out.print("\nWrong reply, please write Si or No.");
					
				primeraVezEnCiclo = false;
				
			} while (!(respuesta.equalsIgnoreCase("Si") || respuesta.equalsIgnoreCase("No")));
			
			inteligencia = ( respuesta.equalsIgnoreCase("Si") ) ? true : false ;
			
		}
		else if (raza == 2) {
			
			do {
				
				if(primeraVezEnCiclo)System.out.println("\nTenacidad (1-3): ");
				tenacidad = entradaValores.nextInt();
				
				if (!(tenacidad > 0 && tenacidad < 4)) System.out.print("\nWrong tenacity level, please choose one number of the next options (1-3)");
				
				primeraVezEnCiclo = false;
				
			} while (!(tenacidad > 0 && tenacidad < 4));
			
		}
		else if (raza == 3) {
			
			do {
				
				if(primeraVezEnCiclo)System.out.println("\nMagia (0-0.99): ");
				magia = entradaValores.nextDouble();
				
				if (!(magia >= 0 && magia <= 0.99)) System.out.print("\nWrong magic level, please choose one number of the next options (0-0.99)");
				
				primeraVezEnCiclo = false;
				
			} while (!(magia >= 0 && magia <= 0.99));
			
		}
		
		int numeroDeArmas, ataquePoder;
		System.out.print("\nAttack power: ");
		ataquePoder = entradaValores.nextInt();
		primeraVezEnCiclo = true;
		
		do {
			
			if(primeraVezEnCiclo)System.out.print("\nHow many weapons (1-10): ");
			numeroDeArmas = entradaValores.nextInt();
			
			if (!(numeroDeArmas > 0 && numeroDeArmas <= 10)) System.out.print("\nWrong numero De Armas, please choose one number of the next options (1-10)");
			
			primeraVezEnCiclo = false;
			
		} while (!(numeroDeArmas > 0 && numeroDeArmas <= 10));
		
		Arma armas [] = new Arma[numeroDeArmas];
		
		for (int numeroArma = 0; numeroArma < numeroDeArmas; numeroArma++) {
			
			Arma arma = new Arma();
			System.out.print("\nWeapon " + (numeroArma + 1) + " Name: ");
			arma.setNombre(entradaValores.next());
			System.out.print("\nWeapon " + (numeroArma + 1) + " Attack Power: ");
			arma.setAtaquePoder(entradaValores.nextInt());
			armas[numeroArma] = arma;
			
		}
		
		if (raza == 1) {
			
			Humano personage = new Humano(nombre, ataquePoder, armas, faccion, inteligencia);
			personages.add(personage);
			
		}
		else if (raza == 2) { 
			
			Orco personage = new Orco(nombre, ataquePoder, armas, faccion, tenacidad);
			personages.add(personage);
			
		}
		else {
			
			Elfo personage = new Elfo(nombre, ataquePoder, armas, faccion, magia);
			personages.add(personage);
			
		}
		
	}
	
	public void fight () {
		
		if (personages.size() == 0) {
			
			System.out.println("\nNo hay personages por mostrar, porfabor introduzca uno");
			
		}
		else {
			
			int alianza = 0, horda = 0;
			
			for (int personage = 0; personage < personages.size(); personage ++) {
				
				if (personages.get(personage).getFaccion().equalsIgnoreCase("Alliance")) alianza += personages.get(personage).mediaPoder();
				else horda += personages.get(personage).mediaPoder(); 
				
			}
			
			System.out.println("\nThe faction Alliance has " + alianza + " of power attack"
							 + "\nThe faction Horde has " + horda + " of power attack.");
			
			if (alianza == horda) System.out.println("Its a draw between Alliance and Horde!.");
			else if (alianza > horda) System.out.println("Alliance Win!.");
			else System.out.println("Horde Win!.");
			
		}
	}
	
	public void insertRandomData() {
		
		final String [] nombres = {"Carles", "Marmi", "Jan", "Toni", "Reisel", "Sir Bonet"};
		final String [] armasNombre = { "Arkhalis", "Espada Terra", "Filo-Miau"};
		String nombre = nombres[(int)(Math.random() * nombres.length)];
		int raza = (int)(Math.random() * 3 + 1);
		int poder = (int)(Math.random() * 1000 + 1);
		int numeroArma = (int)(Math.random() * 10 + 1);
		int numeroRandom = (int)(Math.random() * 10 + 1);
		Arma [] armas = new Arma[numeroArma];
		for (int i = 0; i < numeroArma; i++) armas[i] = new Arma(armasNombre[(int)(Math.random() * armasNombre.length)],(int)(Math.random() * 100 + 1));
		String faccion = ( numeroRandom < 5) ? "Alliance" : "Horde";
		numeroRandom = (int)(Math.random() * 10 + 1);
		if (raza == 1) {
			
			boolean inteligencia = (numeroRandom < 5) ? true : false;
			Humano personage = new Humano(nombre, poder, armas, faccion, inteligencia);
			personages.add(personage);
			
		}
		else if (raza == 2) { 
			
			int tenacidad = (int)(Math.random() * 3 + 1);
			Orco personage = new Orco(nombre, poder, armas, faccion, tenacidad);
			personages.add(personage);
			
		}
		else {
			
			double magia = Math.random() * 1;
			Elfo personage = new Elfo(nombre, poder, armas, faccion, magia);
			personages.add(personage);
			
		}
		
		
	}

}

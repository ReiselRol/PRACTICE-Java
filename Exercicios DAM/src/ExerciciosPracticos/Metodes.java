package ExerciciosPracticos;

import java.util.Scanner;

public class Metodes {

	//Var Globales
	
	public Scanner e = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Metodes e = new Metodes();
		e.principal();
		
	}
	
	public void principal () {
		
		int x = 0, y = 0, resultat = 0, opcio = 0;
		
		do {
			
			System.out.println("1.-Suma");
			System.out.println("2.-Resta");
			System.out.println("3.-Salir");
			opcio = e.nextInt();
			
			if (opcio == 1 || opcio == 2) {
				
				x = demanaValors();
				y = demanaValors();
				resultat = Calcul(x,y,opcio);
				System.out.println("Resultado: " + resultat);
				
			}
			
			System.out.println("");
			
		} while(opcio != 3);
		
	}
	
	public int demanaValors() {
		
		System.out.println("Valor?");
		int Valor = e.nextInt();
		return Valor;
		
	}
	
	public int Calcul(int Valor1, int Valor2, int opcion) {
		
		int calcul = 0;
		if (opcion == 1) calcul = Valor1 + Valor2;
		else if (opcion == 2) calcul = Valor1 - Valor2;
		return calcul;
		
	}

}

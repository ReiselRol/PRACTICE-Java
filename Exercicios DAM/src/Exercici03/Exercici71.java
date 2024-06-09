package Exercici03;
import java.util.Scanner;

public class Exercici71 {

	public static void main(String[] args) {
		
		System.out.println("\n71.Donada una taula de n elements d‟enters introduïts per l‟usuari, fer un algoritme que ens digui la\n"
				+ "\nsuma total dels elements de la taula.");
		System.out.println("\nCuantos valores te interesa introducir?\n");
		Scanner entradaLimite = new Scanner(System.in);
		int limite = entradaLimite.nextInt() , calculo = 0 , posicion ;
		int  tabla[] = new int [limite];
		Scanner entradaNumero = new Scanner(System.in);
		for ( posicion = 0 ; posicion < limite ; posicion++ ) {
			
			System.out.println("\nIntroduce un numero :\n");
			tabla [posicion] = entradaNumero.nextInt();
			calculo = calculo + tabla [posicion];
			
		}
		System.out.println("\nLa suma de los valores introducidos es de: " + calculo);
	}

}

package Exercici03;
import java.util.Scanner;

public class Exercici72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n72.Donada una taula de n elements enters introduïts per l‟usuari, fer un algoritme que ens indiqui "
				+ "\nquants d‟aquests són negatius i quants no. El zero es considera neutre.");
		System.out.println("\nCuantos numeros quieres revisar?\n");
		Scanner entradaLimite = new Scanner(System.in);
		int limite = entradaLimite.nextInt() , negativos = 0 , posicion = 0;
		int tabla [] = new int[limite];
		Scanner entradaNumero = new Scanner(System.in);
		for (posicion = 0 ; posicion < limite ; posicion++) {
			
			System.out.println("\nIntroduce el numero:\n");
			tabla [posicion] = entradaNumero.nextInt();
			if ( tabla [posicion] < 0 ) negativos ++;
			
		}
		System.out.println("\nDe los numero anteriores introducidos hay " + negativos + " negativos");
	}

}

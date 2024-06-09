package Exercici03;
import java.util.Scanner;

public class Exercici76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n76. Tenim N temperatures guardades en una taula, Calcular la mitja i obtenir el número de\r\n"
				+ "\ntemperatures més grans o iguals a la mitja.");
		System.out.println("\nCuantas temperaturas deseas introducir?\n");
		Scanner entradaLimite = new Scanner(System.in);
		Scanner entradaNumero = new Scanner(System.in);
		int limite = entradaLimite.nextInt() , posicion = 0 , orden = 0;
		double tabla [] = new double[limite]  , media = 0;
		String grados = "ºC" , numero = "";
		for (posicion = 0 ; posicion < limite ; posicion ++ ) {
			
			orden ++;
			System.out.println("\nIntroduce el valor numero " + orden + " de grados\n");
			tabla[posicion] = entradaNumero.nextDouble();
			media = media + tabla[posicion];
			if (limite - 1 == posicion ) media = media / limite;
			
		}
		System.out.println("\nLa media de los datos introducidos es de: " + media + grados + ". Los datos superiores a\r\n"
				+ "\nla media de '" + media + grados + "' son:\n");
		for (posicion = 0 ; posicion < limite ; posicion ++ ) {
			
			if (tabla[posicion] >= media ) System.out.println(tabla[posicion] + grados);
			
		}
	}

}

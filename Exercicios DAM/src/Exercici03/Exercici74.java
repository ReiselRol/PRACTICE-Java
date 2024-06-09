package Exercici03;
import java.util.Scanner;

public class Exercici74 {

	public static void main(String[] args) {

		System.out.println("\n74.Realitzar un algoritme que ens permeti entrar n nombres enters en una taula i a continuació que \n"
				+ "\ninverteixi la taula (el primer element passa a l‟últim introduït, el segon al penúltim,...). Una \r\n"
				+ "\nvegada invertida la taula mostrar-la per pantalla.");
		System.out.println("\nCuantos numeros vas a introducir?\n");
		Scanner entradaLimite = new Scanner(System.in);
		Scanner entradaNumero = new Scanner(System.in);
		
		//Variables de INT
		
		int limite = entradaLimite.nextInt() , limite2 = limite , posicion = 0 , numero; //Las Variables de tipo INT
		int tabla[] = new int [limite] ,  tablaInv[] = new int [limite]; //Las Arrays
		for (posicion = 0 ; posicion < limite ; posicion++ ) { //Assignacion de los numeros en las tablas
			limite2--;
			System.out.println("\nIntroduce un numero:\n");
			numero = entradaNumero.nextInt();
			tabla[posicion] = numero;
			tablaInv[limite2] = numero;
				
		}
		System.out.println("\nEsta es tu lista de numeros Insertada:\n");
		for (posicion = 0 ; posicion < limite ; posicion++) {
			
			System.out.println(tabla[posicion]);
			
		}
		System.out.println("\nAhora te he invertido la lista y se ve asi:\n");
		for (posicion = 0 ; posicion < limite ; posicion++) {
			
			tabla[posicion] = tablaInv[posicion];
			System.out.println(tabla[posicion]);
			
		}
	}

}

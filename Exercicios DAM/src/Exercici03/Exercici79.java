package Exercici03;
import java.util.Scanner;

public class Exercici79 {

	public static final int limite = 20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n79. Es necessita un aplicatiu on es pugui introduir el codi postal d‟habitants de 20 poblacions\r\n"
				+ "\ncatalanes. Tindrem 1000 habitants. Es calcularà el valor de forma aleatòria per cada habitant\r\n"
				+ "\nenregistrat. Finalment es demana que es digui el nom de la població amb més habitants i el\r\n"
				+ "\nnúmero d‟habitants que té, així com la mitja d‟habitants de les 20 poblacions. Les poblacions\r\n"
				+ "\ns‟anomenen “Població1”, “Població2”, “Població3”, etc.\r\n");
		System.out.println("\nCuantos Habitantes en total quieres (El ejercicio pide 1000, introduce eso si deseas 100\r\n"
				+"\no la cantidad que tu quieras siempre que el numero sea un numero entero)?\n");
		Scanner entradaTotal = new Scanner(System.in);
		int totalHabitantes = entradaTotal.nextInt(), posicion = 0 , veces = 1 , media = 0 , numero = 0 , cual = 0 , cualTabla;
		/*
		 0 = poblacion 1
		 1 = poblacion 2... 
		 */
		int poblaciones [] = new int [limite];
		/*
		 0 = poblacion 1
		 1 = poblacion 2... 
		 */
		int cuidadanos [] = new int [limite];
		Scanner entradaPoblacion = new Scanner(System.in);
		for ( posicion = 0 ; posicion < limite ; posicion ++) {
			
			System.out.println("\nIntroduce el codigo postal de la Cuidad " + veces + ":\n");
			poblaciones[posicion] = entradaPoblacion.nextInt();
			veces ++;
			
		}
		veces = 0;
		posicion = 0;
		do {
			
			posicion = (int) (Math.random() * 20);
			cuidadanos [posicion] ++;
			veces ++;
			
		}while (veces != totalHabitantes);
		veces = 1;
		System.out.println("\nCuidades introducidas:\n");
		for ( posicion = 0 ; posicion < limite ; posicion ++) {
			
			System.out.println("(Cuidad " + veces + ") Codigo Postal: '" + poblaciones[posicion] + "', Numero de Habitantes: " + cuidadanos[posicion]);
			veces ++;
			
		}
		veces = 0;
		for ( posicion = 0 ; posicion < limite ; posicion ++) {
			
			veces ++;
			if (cuidadanos[posicion] > numero) {
				
				numero = cuidadanos[posicion];
				cual = veces;
				
			}
			
		}
		cualTabla = cual - 1;
		veces = 1;
		media = totalHabitantes / limite;
		System.out.println("\n\nCaracteristicas sobre las cuidades:");
		System.out.println("\n- Total de Habitantes: " + totalHabitantes);
		System.out.println("\n- Media de Habitantes: " + media);
		System.out.println("\n- Cuidad con mas habitantes: (Cuidad " + cual + ") Codigo Postal: '" + poblaciones[cualTabla] + "', Numero de Habitantes: " + cuidadanos[cualTabla]);
	}

}

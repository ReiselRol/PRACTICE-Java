package Exercici00;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n10.	Si haguéssiu invertit 100 euros en Bitcoins en els seus inicis..... com de rics serieu ara?.");
		System.out.println("\nEste programa te preguntara que cantidad de inversion deberias haber hecho para tener ese dinero en la actualidad");
		System.out.println("\nIngresa el dinero que desearias o quieres saber su valor actual en Bitcoins\n");
		Scanner entradaIngreso = new Scanner(System.in);
		double Ingreso = entradaIngreso.nextDouble();
		double precioBitcoin = Ingreso * 20079.55; // 20079.55 es el precio de la bitcoin y para hacer una variable que no quieres cambiar y se calcula simplemente no hagas variable XD
		/*
		Tambien se podria hacer esto no?
		
		double bitcoinValor = 20079.55;
		double precioBitcoin = Ingreso * bitcoinValor;
		
		 pero de esa forma me he ahorrado 1 linia.
		*/
		double precioBitcoinEnunciado = 100 * 20079.55;
		System.out.println("\nEl valor de el ingreso  introduciodo '"+ Ingreso + "' es de " + precioBitcoin + "\n");
		System.out.println("En el caso del enunciado si hubiesemos invertido 100 Euros en sus inicios tendriamos " + precioBitcoinEnunciado);
		
	}

}

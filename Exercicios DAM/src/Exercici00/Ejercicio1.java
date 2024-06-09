package Exercici00;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n1.	Calcular l’àrea d’ un cercle. Fórmula : pi*r2 \n");
		double pi = 3.141632;
		System.out.println("Introduce el numero cuanto mide el radio\n");
		Scanner preguntaR = new Scanner(System.in);
		double r = preguntaR.nextDouble();
		double calculo =  ( pi * ( r * r ) );
		System.out.println("\nEl area del circulo es igual a:\n\n     " + pi + "... x " + r + "^2 = " + calculo);
	}

}

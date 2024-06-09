package Exercici00;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n9.	Realitzar un algorisme perquè calculi l’àrea d’un triangle");
		System.out.println("\nEn esta actividad te preguntare que base y que altura tiene el trangulo y te dire su area");
		System.out.println("\nCuanto mide la base del triangulo que quieres saber su area?\n");
		Scanner entradaBase = new Scanner(System.in); 
		int Base = entradaBase.nextInt();
		System.out.println("\nCuanto mide la altura del triangulo que quieres saber su area?\n");
		Scanner entradaAltura = new Scanner(System.in); 
		int Altura = entradaBase.nextInt();
		System.out.println("\nUna vez que tenemos la altura " + Altura + " y la base de " + Base + " podemos aplicar la formula de su area:");
		System.out.println("\n          Area Triangulo = ( Base x Altura ) / 2");
		System.out.println("\n          Area Triangulo = ( " + Base + " x " + Altura + " ) / 2");
		int Area = ( Base * Altura ) / 2;
		System.out.println("\n          Area Triangulo = " + Area);
	}

}

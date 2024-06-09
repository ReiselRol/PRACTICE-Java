package Exercici00;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n5.	Fes un programet que demani la nota de tres exàmens i ens faci la mitjana resultant. Les qualificacions poden tenir decimals.");
		System.out.println("\nIngresa la nota del primer examen\n");
		Scanner entradaNota1 = new Scanner(System.in);
		double nota1 = entradaNota1.nextDouble();
		System.out.println("\nIngresa la nota del segundo examen\n");
		Scanner entradaNota2 = new Scanner(System.in);
		double nota2 = entradaNota2.nextDouble();
		System.out.println("\nIngresa la nota del tercer examen\n");
		Scanner entradaNota3 = new Scanner(System.in);
		double nota3 = entradaNota3.nextDouble();
		double media = ( ( nota1 + nota2 + nota3 ) / 3 );
		System.out.println("\nLa media de los tres examenes comentados anteriormente ' que son, el primer examen es de " + nota1 + ", el segundo examen " + nota2 + " y el tercer examen " + nota3 + " ' es de " + media);
	}

}

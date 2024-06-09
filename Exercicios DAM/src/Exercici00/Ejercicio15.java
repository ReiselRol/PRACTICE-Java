package Exercici00;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n15.	Demanar un número enter que signifiqui una quantitat d’euros i digui la descomposició en bitllets de 5,10,20,50 i 100.");
		System.out.println("\nIngresa ese numero que deseas descomponer en billetes\n");
		Scanner entradaNumero = new Scanner(System.in);
		int Numero = entradaNumero.nextInt();
		int billete100 = Numero / 100; //1
		int billete50 = ( Numero - ( 100 * billete100 ) ) / 50;
		int billete20 = ( Numero - ( 100 * billete100 ) - ( 50 * billete50 ) ) / 20; 
		int billete10 = ( Numero - ( 100 * billete100 ) - ( 50 * billete50 ) - ( 20 * billete20 ) ) / 10;
		int billete5 = ( Numero - ( 100 * billete100 ) - ( 50 * billete50 ) - ( 20 * billete20 ) - ( 10 * billete10 ) ) / 5;
		int moneda2 = ( Numero - ( 100 * billete100 ) - ( 50 * billete50 ) - ( 20 * billete20 ) - ( 10 * billete10 ) - ( 5 * billete5 ) ) / 2;
		int moneda1 = ( Numero - ( 100 * billete100 ) - ( 50 * billete50 ) - ( 20 * billete20 ) - ( 10 * billete10 ) - ( 5 * billete5 ) - ( 2 * moneda2 ) );
		System.out.println("\n El numero que has ingresado " + Numero + " se puede descomponer por:");
		System.out.println("\n     -Monedas de 1: se necesitan " + moneda1);
		System.out.println("\n     -Monedas de 2: se necesitan " + moneda2);
		System.out.println("\n     -Billetes de 5: se necesitan " + billete5);
		System.out.println("\n     -Billetes de 10: se necesitan " + billete10);
		System.out.println("\n     -Billetes de 20: se necesitan " + billete20);
		System.out.println("\n     -Billetes de 50: se necesitan " + billete50);
		System.out.println("\n     -Billetes de 100: se necesitan " + billete100);
	}

}

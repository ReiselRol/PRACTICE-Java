package Exercici00;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n14.	Demanar un número enter que signifiqui una quantitat d’euros i digui quants bitllets de 5, 10, 20,50 i 100 son equivalents");
		System.out.println("\nIngresa un numero para hacer diferentes calculo (numero entero)\n");
		Scanner entradaNumero = new Scanner(System.in);
		int Numero = entradaNumero.nextInt();
		int billete5 = Numero / 5;
		int billete10 = Numero / 10;
		int billete20 = Numero / 20;
		int billete50 = Numero / 50;
		int billete100 = Numero / 100;
		System.out.println("\n El numero que has ingresado " + Numero + " se puede calcular en diferentes billetes por:");
		System.out.println("\n     -Billetes de 5: se necesitan " + billete5);
		System.out.println("\n     -Billetes de 10: se necesitan " + billete10);
		System.out.println("\n     -Billetes de 20: se necesitan " + billete20);
		System.out.println("\n     -Billetes de 50: se necesitan " + billete50);
		System.out.println("\n     -Billetes de 100: se necesitan " + billete100);
	}

}

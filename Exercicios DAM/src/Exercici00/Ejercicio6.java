package Exercici00;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n6.	Introduir un import i un descompte en tant per cent. Calcular l’import  net.");
		System.out.println("\nPara comenzar introduce primero el importe que deseas\n");
		Scanner entradaImporte = new Scanner(System.in);
		double importe = entradaImporte.nextDouble();
		System.out.println("\nPara continuar introduce el descuento que deseas en tanto porciento\n");
		Scanner entradaDescuento = new Scanner(System.in);
		int descuento = entradaDescuento.nextInt();
		double calculo = ( importe - ( importe * ( descuento / 100 ) ) );
		System.out.println("\nTu importe de " + importe + " si le hacemos un descuento del " + descuento + "% el precio final seria de " + calculo);
		
		}

}

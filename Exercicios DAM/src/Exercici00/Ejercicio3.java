package Exercici00;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n3.	Introduir un import i calcular què ha de pagar si li fem 20% de descompte.");
		System.out.println("\nEn este ejericio tu pondras en importe y ests programita te hara el calculo de ese importe como si tubiera un descuento del 20%");
		System.out.println("\nIngresa el numero de el costo del importe que deseas calcular con dicho descuento\n");
		Scanner entradaimporte = new Scanner(System.in);
		double importe = entradaimporte.nextDouble();
		double descuento = ( importe - ( importe * 0.2));
		System.out.println("\nEl descuento que le harian del 20% a tu importe de " + importe + " seria un valor de " + descuento);
	}

}

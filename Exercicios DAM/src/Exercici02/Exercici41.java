package Exercici02;
import java.util.Scanner;

public class Exercici41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n41. Fer un programa per dividir dos números enters M i N pel mètode de restes successives. Donar com a resultats el\r\n"
				+ "\nquocient i el residu.\r\n");
		System.out.println("\nIngresaras dos valores que seran el 'N' dividido por el 'M'");
		System.out.println("\nIngresa el valor de 'N'\n");
		Scanner entradaN = new Scanner(System.in);
		int n = entradaN.nextInt();
		System.out.println("\nIngresa el valor de 'M' (debe ser mas pequeño que 'N')\n");
		Scanner entradaM = new Scanner(System.in);
		int m = entradaM.nextInt() , total = 0 , nVeces = 0 , auxiliarT = 1;
		boolean finalizado = false;
		System.out.println("");
		total = n;
		while ( total >= m ) {
			
				auxiliarT = total;
				total = total - m;
				System.out.println("     " + auxiliarT + " - " + m + " = " + total + "\n");
				nVeces ++ ;
			
		}
		System.out.println("El numero " + n + " puede ser dividido por " + m + " en total de veces de : " + nVeces);
	}

}

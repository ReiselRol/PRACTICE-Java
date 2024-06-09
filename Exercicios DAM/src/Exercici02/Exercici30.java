package Exercici02;
import java.util.Scanner;

public class Exercici30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n30. Visualitzar el següent sèrie tants elements com l’usuari indiqui:\r\n"
				+ "\n1 2\r\n"
				+ "\n2 4\r\n"
				+ "\n3 6\r\n"
				+ "\n4 8\r\n"
				+ "\n5 10\r\n"
				+ "\n. .\r\n"
				+ "\nn n*2");
		System.out.println("\nIntroduzca e valor de 'n':\n");
		Scanner entradaN = new Scanner(System.in);
		int n = entradaN.nextInt() , fila = 1 , calculo = 1;
		for (int comptador = 1 ; comptador <= n ; comptador ++) {
			
			calculo = fila * 2;
			System.out.println("\n" + fila + " " + calculo);
			fila ++;
			
		}
	}

}

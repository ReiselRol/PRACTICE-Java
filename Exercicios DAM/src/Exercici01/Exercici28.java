package Exercici01;
import java.util.Scanner;

public class Exercici28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n28. Calcular l'import que un treballador rep en el repartiment anual de beneficis si\r\n"
				+ "\naquest se li assigna com un percentatge del seu salari mensual que depèn de\r\n"
				+ "\nla seva antiguitat en l'empresa d'acord amb la taula:\r\n");
		System.out.println("\nTemps Percentatge\r\n"
				+ "\nMenos de 1 año. 5% del salario\r\n"
				+ "\n1 año o más y menos de 2 años. 7% del salario\r\n"
				+ "\n2 años o más y menos de 5 años. 10% del salario\r\n"
				+ "\n5 años o más y menos de 10 años. 15% del salario\r\n"
				+ "\n10 años o más. 20% del salari\n");
		System.out.println("\nIngresa el salario anual del trabajador\n");
		Scanner entradaSalario = new Scanner(System.in);
		double salario = entradaSalario.nextDouble() , calculo;
		System.out.println("\nIngresa los años que lleva el trabajador trabajando\n");
		Scanner entradaAño = new Scanner(System.in);
		int año = entradaSalario.nextInt();
		if ( año < 1 ) {
			
			calculo = ( salario * 1.05 ) * 14;
			System.out.println("ese año pagaras " + calculo + ", porque te pagaran 14 pagas porque supuestamente la empresa te quiere");
			
		}
		else if (año >= 1 && año < 2) {
			
			calculo = ( salario * 1.07 ) * 14;
			System.out.println("ese año pagaras " + calculo + ", porque te pagaran 14 pagas porque supuestamente la empresa te quiere");
			
		}
		else if (año >= 2 && año < 5) {
			
			calculo = ( salario * 1.1 ) * 14;
			System.out.println("ese año pagaras " + calculo + ", porque te pagaran 14 pagas porque supuestamente la empresa te quiere");
			
		}
		else if (año >= 5 && año < 10) {
			
			calculo = ( salario * 1.15 ) * 14;
			System.out.println("ese año pagaras " + calculo + ", porque te pagaran 14 pagas porque supuestamente la empresa te quiere");
			
		}
		else if (año > 10) {
			
			calculo = ( salario * 1.20 ) * 14;
			System.out.println("ese año pagaras " + calculo + ", porque te pagaran 14 pagas porque supuestamente la empresa te quiere");
			
		}
	}

}

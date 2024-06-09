package Exercici01;
import java.util.Scanner;

public class Exercici27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n27. Determinar la quantitat de diners que rebrà un treballador per concepte de les\r\n"
				+ "\nhores extres treballades en una empresa, sabent que quan les hores de treball\r\n"
				+ "\nexcedeixen de 40, la resta es consideren hores extres i que aquestes es\r\n"
				+ "\npaguen al doble d'una hora normal quan no excedeixin de 8; si les hores\r\n"
				+ "\nextres excedeixen de 8 es paguen les primeres 8 al doble del que paguen les\r\n"
				+ "\nhores normals i la resta al triple.");
		System.out.println("\nIntroduce cuantas horas ha trabajado\n");
		Scanner entradaHoras = new Scanner(System.in);
		int horas = entradaHoras.nextInt();
		System.out.println("\nIntroduce cuanto dinero ha pagado por cada hora normal\n");
		Scanner entradaDineroHora = new Scanner(System.in);
		double dineroHora = entradaDineroHora.nextInt() , calculo;
		if ( horas <= 40 ) {
			
			calculo = dineroHora * horas;
			System.out.println("\nEste trabajador cobraria un salario de " + calculo);
			
		}
		else if ( horas > 40 && horas <= 48 ) {
			
			calculo = ( dineroHora * 40 ) + ( 2 * dineroHora * ( horas - 40 ) );
			System.out.println("\nEste trabajador cobraria un salario de " + calculo);
			
		}
		else {
			
			calculo = ( dineroHora * 40 ) + ( 2 * dineroHora * 8 ) + ( 3 * dineroHora * ( horas - 48 ) );
			System.out.println("\nEste trabajador cobraria un salario de " + calculo);
			
		}
	}

}

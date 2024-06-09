package Exercici01;
import java.util.Scanner;

public class Exercici23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nDemanar una nota numèrica a l'usuari i mostrar un text o un altre segons el rang de\r\n"
				+ "valors dins del qual es troba la nota:\r\n"
				+ "\n• Si és major o igual que 9 i menor o igual que 10, la nota és d’“Excel·lent”.\r\n"
				+ "\n• Si és major i igual que 6,5 però estrictament menor que 9, la nota és “Notable”.\r\n"
				+ "\n• Si és major i igual que 5 però estrictament menor que 6,5, la nota és “Suficient”.\r\n"
				+ "\n• Si no és cap dels casos anteriors, la nota és de “Suspès”.\r\n"
				+ "\n");
		double numero;
		do {
			
			System.out.println("\nIntroduzca un numero del 0 al 10\n");
			Scanner entradaNumero = new Scanner(System.in);
			numero = entradaNumero.nextDouble();
			if ( numero >= 9 && numero <= 10 ) System.out.println("\nLa nota " + numero + " és d’“Excel·lent”");
			else if ( numero >= 6.5 && numero < 9 ) System.out.println("\nLa nota " + numero + " és d’“Notable”");
			else if ( numero >= 5 && numero < 6.5 ) System.out.println("\nLa nota " + numero + " és d’“Suficient”");
			else if ( numero > 10 || numero < 0) System.out.println("\nVuelve a ingresar el numero MENOR O IGUAL A 10 Y MAYOR O IGUAL A 0, porfa... Que el Numero " + numero + "No incumple esos requisitos\n");
			else System.out.println("\nLa nota " + numero + " és d’“Suspès”");
			
		} while ( numero > 10 || numero < 0 );
	}

}

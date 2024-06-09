package Exercici01;
import java.util.Scanner;

public class Exercici24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n24. L’ordinador pensa un número entre 1 i 10, l’usuari l’intenta encertar, si és així mostrar\r\n"
				+ "\nun missatge d’enhorabona en cas contrari indicar que ha fallat.");
		int numero , numeroAleatorio , opcionAleatoria;
		do {
			
			System.out.println("\nIntroduce un numero del 1 al 10 ha ver si aciertas el numero aleatorio\n");
			Scanner entradaNumero = new Scanner(System.in);
			numero = entradaNumero.nextInt();
			numeroAleatorio = (int) (Math.random() * 10 + 1);
			if ( numero == numeroAleatorio ) System.out.println("\nEnhorabuena :) !! el numero introducido ha sido " + numero + " y el numero a adivinar era " + numeroAleatorio + "\n\nEres un crack");
			else {
				opcionAleatoria = (int) (Math.random() * 5 + 1);
				if ( opcionAleatoria == 1) System.out.println("\nLo siento mucho pero has fallado :'( , el numero que has puesto es " + numero + " y el que debias acertar era de " + numeroAleatorio + "\n\nVuelve a probar suerte");
				else if ( opcionAleatoria == 2) System.out.println("\nHas perdido esta batalla pero NO LA GUERRA !! , el numero que has puesto es " + numero + " y el que debias acertar era de " + numeroAleatorio + "\n\nVuelve a probar suerte");
				else if ( opcionAleatoria == 3) System.out.println("\nLa probabilidad existe y no esta de tu parte :/ , el numero que has puesto es " + numero + " y el que debias acertar era de " + numeroAleatorio + "\n\nVuelve a probar suerte");
				else if ( opcionAleatoria == 4) System.out.println("\nEl signo del zodiaco ha vuelto a fallar , el numero que has puesto es " + numero + " y el que debias acertar era de " + numeroAleatorio + "\n\nVuelve a probar suerte");
				else System.out.println("\nNo siempre se gana y te ha tocado perder, el numero que has puesto es " + numero + " y el que debias acertar era de " + numeroAleatorio + "\n\nVuelve a probar suerte");
			}
		
		} while ( numero != numeroAleatorio );
	}

}

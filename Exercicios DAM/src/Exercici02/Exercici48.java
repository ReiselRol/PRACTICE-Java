package Exercici02;
import java.util.Scanner;

public class Exercici48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n48. L’ordinador pensa un número entre 1 i 10, l’usuari l’intenta encertar, si és així mostrar un missatge\r\n"
				+ "\nd’enhorabona en cas contrari indicar que ha fallat. L’usuari disposa de 3 oportunitats i en cada número introduït\r\n"
				+ "\nens indicarà si és més gran o més petit del número que ha indicat l’usuari");
		int numero = 0 , numeroAleatorio = 1 , opcionAleatoria , intentos = 3;
		do {
			
			do { 
				
				System.out.println("\nIntroduce un numero del 1 al 10 ha ver si aciertas el numero aleatorio (Intentos restantes '" + intentos + "')\n");
				Scanner entradaNumero = new Scanner(System.in);
				numero = entradaNumero.nextInt();
				numeroAleatorio = (int) (Math.random() * 10 + 1);
				if ( numero == numeroAleatorio ) System.out.println("\nEnhorabuena :) !! el numero introducido ha sido " + numero + " y el numero a adivinar era " + numeroAleatorio + "\n\nEres un crack");
				else {
					intentos --;
					opcionAleatoria = (int) (Math.random() * 5 + 1);
					if ( opcionAleatoria == 1 && intentos == 0) System.out.println("\nLo siento mucho pero has fallado :'( , el numero que has puesto es " + numero + " y el que debias acertar era de " + numeroAleatorio + "\n\nVuelve a probar suerte");
					else if ( opcionAleatoria == 2 && intentos == 0) System.out.println("\nHas perdido esta batalla pero NO LA GUERRA !! , el numero que has puesto es " + numero + " y el que debias acertar era de " + numeroAleatorio + "\n\nVuelve a probar suerte");
					else if ( opcionAleatoria == 3 && intentos == 0) System.out.println("\nLa probabilidad existe y no esta de tu parte :/ , el numero que has puesto es " + numero + " y el que debias acertar era de " + numeroAleatorio + "\n\nVuelve a probar suerte");
					else if ( opcionAleatoria == 4 && intentos == 0) System.out.println("\nEl signo del zodiaco ha vuelto a fallar , el numero que has puesto es " + numero + " y el que debias acertar era de " + numeroAleatorio + "\n\nVuelve a probar suerte");
					else if ( opcionAleatoria == 5 && intentos == 0) System.out.println("\nNo siempre se gana y te ha tocado perder, el numero que has puesto es " + numero + " y el que debias acertar era de " + numeroAleatorio + "\n\nVuelve a probar suerte");
					if ( intentos == 0 ) intentos = 3;
					
				}
				
			} while (intentos != 0);
			
		} while ( numero != numeroAleatorio);
		
	}

}

package Exercici00;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n4.	Demanar el nom de l’usuari per teclat i que l’ordinador el saludi a posteriori.");
		System.out.println("\nEn este ejercicio se saluda a la persona que se escribe");
		System.out.println("\nPor fabor escribe tu nombre\n");
		Scanner ingresarNombre = new Scanner(System.in);
		String nombre = ingresarNombre.next();
		System.out.println("\nMuy buenas mi estimado " + nombre);
	}

}

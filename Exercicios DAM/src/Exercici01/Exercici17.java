package Exercici01;
import java.util.Scanner;

public class Exercici17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n17. Llegir un número pel teclat, si aquest és més gran de 20 mostrar com a resultat el número elevat a dos en cas contrari mostrar com a resultat el número elevat a 3.");
		System.out.println("\nIntroduce el numero deseado:\n");
		Scanner entradaNumero = new Scanner(System.in);
		int numero = entradaNumero.nextInt() , calculo;
		if (numero > 20) {
			
			calculo = numero * numero;
			System.out.println("\nEl resultado es de " + calculo + " ya que el numero " + numero + " es superior a 20");
			
		}
		else if (numero < 20){
			
			calculo = numero * numero * numero;
			System.out.println("\nEl resultado es de " + calculo + " ya que el numero " + numero + " es inferior a 20");
			
		}
		else System.out.println("\nEl resultado es igual al numero introducido ' " + numero + " ' porque a la opcion de que equivalga a 20 no se ha especificado nada");
	}

}

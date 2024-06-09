package Exercici01;
import java.util.Scanner;

public class Exercici21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n21. Introduir quatre caràcters per formar una contrasenya. La contrasenya només pot\r\n"
				+ "\nestar formada per números i lletres. Si s’introdueix algun altre caràcter, donarà error i\r\n"
				+ "\nel programa finalitzarà. Si tot ha estat introduit correctament mostrarem “contrasenya\r\n"
				+ "\nvàlida”\n");
		System.out.println("\nIntroduce un el primer caracter\n");
		Scanner entradaPrimerCaracter = new Scanner(System.in);
		char primeroCaracter = entradaPrimerCaracter.next().charAt(0);
		if ( ( primeroCaracter >= 65 && 90 >= primeroCaracter ) || ( primeroCaracter >= 48 && 57 >= primeroCaracter ) || ( primeroCaracter >= 97 && 122 >= primeroCaracter ) ) {
			
			System.out.println("\nIntroduce un el segundo caracter\n");
			Scanner entradaSegundoCaracter = new Scanner(System.in);
			char segundoCaracter = entradaSegundoCaracter.next().charAt(0);
			if ( ( segundoCaracter >= 65 && 90 >= segundoCaracter ) || ( segundoCaracter >= 48 && 57 >= segundoCaracter ) || ( segundoCaracter >= 97 && 122 >= segundoCaracter ) ) {
				
				System.out.println("\nIntroduce un el tercer caracter\n");
				Scanner entradaTerceroCaracter = new Scanner(System.in);
				char terceroCaracter = entradaTerceroCaracter.next().charAt(0);
				if ( ( terceroCaracter >= 65 && 90 >= terceroCaracter ) || ( terceroCaracter >= 48 && 57 >= terceroCaracter ) || ( terceroCaracter >= 97 && 122 >= terceroCaracter ) ) {
					
					System.out.println("\nIntroduce un el cuarto caracter\n");
					Scanner entradaCuartoCaracter = new Scanner(System.in);
					char cuartoCaracter = entradaCuartoCaracter.next().charAt(0);
					if ( ( cuartoCaracter >= 65 && 90 >= cuartoCaracter ) || ( cuartoCaracter >= 48 && 57 >= cuartoCaracter ) || ( cuartoCaracter >= 97 && 122 >= cuartoCaracter ) ) {
						
						System.out.println("\nLa contraseña " + primeroCaracter + segundoCaracter + terceroCaracter + cuartoCaracter + " se ha introducido correctamente");
					}
					else System.out.println("\nError de syntaxis");
				}
				else System.out.println("\nError de syntaxis");
			}
			else System.out.println("\nError de syntaxis");
			
		}
		else System.out.println("\nError de syntaxis");
	}

}

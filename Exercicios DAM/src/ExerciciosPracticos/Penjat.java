package ExerciciosPracticos;

import java.util.Scanner;

public class Penjat {

	public static int IntroducirValor(int limite) {
		
		boolean valorSeleccionado = false;
		int numero;
		
		do {
			
			System.out.print("\n     > ");
			numero = entradaValor.nextInt();
			if ( (numero > limite) || (numero < 0) ) ValorMalIntroducido(numero,limite);
			else valorSeleccionado = true;
			
		} while ( valorSeleccionado == false);
		return numero;
		
	}
	public static char IntroducirCaracter() {
		
		char letra;
			
			System.out.print("\n     > ");
			letra = entradaCaracter.next().charAt(0);
		
		return letra;
		
	}
	public static void ValorMalIntroducido(int numero, int limite) {
		
		System.out.println("");
		int numeroAlAzar = (int) (Math.random() * 4 + 1);
		if ( numeroAlAzar == 0) System.out.print("\n     (!) El numero seleccionado para elejir opcion no esta como opcion.");
		else if ( numeroAlAzar == 1) System.out.print("\n     (!) Mira atentamente que opciones puedes seleccionar ( en total hay " + limite +").");
		else if ( numeroAlAzar == 2) System.out.print("\n     (!) El valor insertado no es correcto a la opcion pensada.");
		else if ( numeroAlAzar == 3) System.out.print("\n     (!) A surgido un error, tu numero '" + numero + "' no esta en rango de ( 1 - " + limite +" ).");
		else if ( numeroAlAzar == 4) {
		
			int diferencia = 0;
			
			if ( numero > limite) {
				
				diferencia = numero - limite;
				System.out.print("\n     (!) Valor incorrecto, tu valor '" + numero + "' esta a '" + diferencia + "' para estar en el rango de ( 1 - " + limite + " ).");
				
			}
			else if ( numero == 0 ) System.out.print("\n     (!) El 0 o es una opcion... Seamos positivos.");
			else {
				
				diferencia = 1 - numero;
				System.out.print("\n     (!) Valor incorrecto, tu valor '" + numero + "' esta a '" + diferencia + "' para estar en el rango de ( 1 - " + limite + " ).");
			}
			
		}
		System.out.print(" Vuelve a Intentarlo.\n");
		
	}
	
	public static Scanner entradaValor = new Scanner(System.in) , entradaCaracter = new Scanner(System.in);
	public static String listaDePalabras []= { "Gato" , "Perro" , "Persona" , "Casa" , "Barco" , "Rojo" , "Flor" , "Nigger" , "Agua" , "Patera" , "Africa" , "Comida" , "JesuCarles" };
	
	public static void main(String[] args) {
		// TODO
		
		int opcion = 0;
		final int NUMERODEOPCIONES = 2;
		boolean programaTerminado = false ;
		
		do {
			
			menu();
			opcion = IntroducirValor(NUMERODEOPCIONES);
			if ( opcion == 2 ) programaTerminado = true;
			else if ( opcion == 1 ) Partida();
			
		} while (programaTerminado == false);
	}
	
	public static void menu() {
		/* Aqui tenemos una plantilla UwU
		System.out.println("     ___________________________________________________________");
		System.out.println("     |_|                                                     |_|");
		System.out.println("     |                                                         |");
		System.out.println("     |                                                         |");
		System.out.println("     |_                                                       _|");
		System.out.println("     |_|_____________________________________________________|_|");
		*/
		
		System.out.println("     ___________________________________________________________");
		System.out.println("     |_|                                                     |_|");
		System.out.println("     |                                                         |");
		System.out.println("     |             00   00  00  0  000  000  000               |");
		System.out.println("     |             0_0  0_  0 0 0  _0   0_0   0                |");
		System.out.println("     |             0    0_  0  00  00   0 0   0                |");
		System.out.println("     |_                                            Ramon R.   _|");
		System.out.println("     |_|_____________________________________________________|_|");
		System.out.println("     |_|                                                     |_|");
		System.out.println("     |                                                         |");
		System.out.println("     |               Elige una de las siguientes               |");
		System.out.println("     |               Opciones escribiendo un numero:           |");
		System.out.println("     |                                                         |");
		System.out.println("     |                   1.- Jugar Partida                     |");
		System.out.println("     |                                                         |");
		System.out.println("     |                   2.- Salir                             |");
		System.out.println("     |_                                                       _|");
		System.out.println("     |_|_____________________________________________________|_|");
	}
	
	public static void Partida() {
		
		String PalabraMagica[] = new String [2]; // En la posicion 0 guardamos la palabra y en la posicion 1 guardamos los espacios
		PalabraMagica [0] = listaDePalabras [(int) (Math.random() * listaDePalabras.length)]; //Hacemos los espacios en en la posicion 1
		PalabraMagica [1] = "";
		for (int fila = 0 ; fila < PalabraMagica[0].length() ; fila ++) PalabraMagica[1] += " ";
		int intentos = 5, turnos = 0;
		char letra;
		boolean partidaFinalizada = false, letraEncontrada = false;
		String palabraAux = "" , letraAux = "" , letraAux2 = "";
		
		do {
			
			turnos ++;
			tablero(PalabraMagica[1].length() , PalabraMagica[1], turnos, intentos);
			System.out.println("");
			letraAux = "";
			letra = IntroducirCaracter();
			letraAux += letra;
			
			for (int i = 0 ; i < PalabraMagica[0].length() ; i++) {
				
				letraAux2 += PalabraMagica[0].charAt(i);
				
				if ( letraAux.equalsIgnoreCase(letraAux2)) {
					
					letraEncontrada = true;
					palabraAux += letra;
					
				}
				else palabraAux += PalabraMagica[1].charAt(i);
				letraAux2 = "";
				
			}
			PalabraMagica [1] = palabraAux;
			palabraAux = "";
			
			if (letraEncontrada == false) intentos --;
			else letraEncontrada = false;
			if ( ( intentos == 0 )  ) partidaFinalizada = true;
			if ( PalabraMagica [0].equalsIgnoreCase(PalabraMagica [1])) {
				
				tablero(PalabraMagica[1].length() , PalabraMagica[1], turnos, intentos);
				partidaFinalizada = true;
				System.out.println("\n");
				
			}
			
		} while(partidaFinalizada == false);
		
	}
	
	public static void tablero(int repeticiones, String Palabra, int turnos, int errores) {
		
		int divisible = repeticiones % 2, medio;
		if (divisible == 0) medio = repeticiones / 2;
		else medio = ( repeticiones + 1 ) / 2;
		medio --;
		
		System.out.print("\n     ");
		System.out.print("_____");
		for (int veces = 0; veces < repeticiones; veces ++) System.out.print("_____");
		System.out.print("_____");
		
		System.out.print("\n     ");
		System.out.print("|_|  ");
		for (int veces = 0; veces < repeticiones; veces ++) System.out.print("     ");
		System.out.print("  |_|");
		
		System.out.print("\n     ");
		System.out.print("|    ");
		for (int veces = 0; veces < repeticiones; veces ++) {
			
			if (veces == medio) {
				
				if (turnos < 10) System.out.print(" T " + turnos + " ");
				else System.out.print(" T " + turnos);
				
			}
			else if (veces == repeticiones - 1 ) System.out.print(" E:" + errores +" ");
			else System.out.print("     ");
			
		}
		System.out.print("    |");
		
		System.out.print("\n     ");
		System.out.print("|    ");
		for (int veces = 0; veces < repeticiones; veces ++) System.out.print("     ");
		System.out.print("    |");
		
		System.out.print("\n     ");
		System.out.print("|_   ");
		for (int veces = 0; veces < repeticiones; veces ++) System.out.print("     ");
		System.out.print("   _|");
		
		System.out.print("\n     ");
		System.out.print("|_|__");
		for (int veces = 0; veces < repeticiones; veces ++) System.out.print("_____");
		System.out.print("__|_|");
		
		System.out.print("\n     ");
		System.out.print("|_|  ");
		for (int veces = 0; veces < repeticiones; veces ++) System.out.print("     ");
		System.out.print("  |_|");
		
		System.out.print("\n     ");
		System.out.print("|    ");
		for (int veces = 0; veces < repeticiones; veces ++) System.out.print("     ");
		System.out.print("    |");
		
		System.out.print("\n     ");
		System.out.print("|    ");
		for (int veces = 0; veces < repeticiones; veces ++) System.out.print("  " + Palabra.charAt(veces) + "  ");
		System.out.print("    |");
		
		System.out.print("\n     ");
		System.out.print("|    ");
		for (int veces = 0; veces < repeticiones; veces ++) System.out.print(" ___ ");
		System.out.print("    |");
		
		System.out.print("\n     ");
		System.out.print("|    ");
		for (int veces = 0; veces < repeticiones; veces ++) System.out.print("     ");
		System.out.print("    |");
		
		System.out.print("\n     ");
		System.out.print("|_   ");
		for (int veces = 0; veces < repeticiones; veces ++) System.out.print("     ");
		System.out.print("   _|");
		
		System.out.print("\n     ");
		System.out.print("|_|__");
		for (int veces = 0; veces < repeticiones; veces ++) System.out.print("_____");
		System.out.print("__|_|");
		
	}

}

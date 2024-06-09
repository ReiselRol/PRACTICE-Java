package Exercici04;

public class Exercici91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n91.Fer un algoritme per transposar una matriu de 10x10");
		
		//Todos los numeros se generaran de forma automatica 
		
		final int Int = 10;
		int tablero [] [] = new int [Int] [Int] , tableroTranspuesto [] [] = new int [Int] [Int];
		int fila = 0, columnas = 0;
		System.out.println("\nTablero no transpuesto:\n");
		System.out.println("               _________________________________");
		System.out.println("               |                               |");
		for ( fila = 0 ; fila < 10 ; fila ++) {
			
			System.out.print("               | ");
			for ( columnas = 0 ; columnas < 10 ; columnas ++) {
				
				tablero [fila] [columnas] = (int) (Math.random() * 10);
				System.out.print(tablero [fila] [columnas] + "  ");
				
			}
			System.out.print("|");
			System.out.println();
			
		}
		System.out.println("               |_______________________________|");
		System.out.println("\n\nTablero transpuesto:\n");
		System.out.println("               _________________________________");
		System.out.println("               |                               |");
		for ( fila = 0 ; fila < 10 ; fila ++) {
			
			System.out.print("               | ");
			for ( columnas = 0 ; columnas < 10 ; columnas ++) {
				
				tableroTranspuesto [fila] [columnas] = tablero [columnas] [fila];
				System.out.print(tableroTranspuesto [fila] [columnas] + "  ");
				
			}
			System.out.print("|");
			System.out.println();
			
		}
		System.out.println("               |_______________________________|");
	}

}

package Exercici04;

public class Exercici92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n92.Fer un algoritme que sumi dues matrius i mostri el resultat per pantalla.");
		final int Int = 10;
		int tablero [] [] = new int [Int] [Int] , segundoTablero [] [] = new int [Int] [Int];
		int fila = 0, columnas = 0;
		System.out.println("\nPrimera Matriz:\n");
		System.out.println("               _________________________________");
		System.out.println("               |                               |");
		for ( fila = 0 ; fila < 10 ; fila ++) {
			
			System.out.print("               | ");
			for ( columnas = 0 ; columnas < 10 ; columnas ++) {
				
				tablero [fila] [columnas] = (int) (Math.random() * 5);
				System.out.print(tablero [fila] [columnas] + "  ");
				
			}
			System.out.print("|");
			System.out.println();
			
		}
		System.out.println("               |_______________________________|");
		System.out.println("\n\nSegunda Matriz:\n");
		System.out.println("               _________________________________");
		System.out.println("               |                               |");
		for ( fila = 0 ; fila < 10 ; fila ++) {
			
			System.out.print("               | ");
			for ( columnas = 0 ; columnas < 10 ; columnas ++) {
				
				segundoTablero [fila] [columnas] = (int) (Math.random() * 5);
				System.out.print(segundoTablero [fila] [columnas] + "  ");
				
			}
			System.out.print("|");
			System.out.println();
			
		}
		System.out.println("               |_______________________________|");
		System.out.println("\n\nSuma de la Primera y Segunda Matriz:\n");
		System.out.println("               _________________________________");
		System.out.println("               |                               |");
		for ( fila = 0 ; fila < 10 ; fila ++) {
			
			System.out.print("               | ");
			for ( columnas = 0 ; columnas < 10 ; columnas ++) {
				
				segundoTablero [fila] [columnas] += tablero [fila] [columnas];
				System.out.print(segundoTablero [fila] [columnas] + "  ");
				
			}
			System.out.print("|");
			System.out.println();
			
		}
		System.out.println("               |_______________________________|");
	}

}

package Exercici04;

public class Exercici89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n89.Donada una taula de dos dimensions de 10 x 10 de reals omplir la taula amb números i\r\n"
				+ "\nposteriorment calcular la suma de cada fila i la suma de cada columna mostrant els 20\r\n"
				+ "\nresultats per pantalla.\n");
		int tablaSumar [] [] = new int [10] [10];
		int totalVertical [] = new int [10], totalHorizontal [] = new int [10];
		int lineas = 0, columnas = 0;
		System.out.println("               ________________________________________");
		System.out.println("               |                                      |");
		for ( lineas = 0 ; lineas < 10 ; lineas ++) {
			
			System.out.print("               | ");
			for ( columnas = 0 ; columnas < 10 ; columnas ++) {
				
				tablaSumar [lineas] [columnas] = (int) (Math.random() * 10);
				System.out.print(tablaSumar [lineas] [columnas] + "  ");
				totalHorizontal [lineas] += tablaSumar [lineas] [columnas]; 
				
			}
			System.out.print(" =  " + totalHorizontal [lineas] + " |");
			System.out.println();
			
		}
		System.out.println("               |                                      |");
		System.out.println("               | || || || || || || || || || ||  Ramon |");
		System.out.println("               |                                      |");
		System.out.print("               | ");
		for ( columnas = 0 ; columnas < 10 ; columnas ++) {
			
			for ( lineas = 0 ; lineas < 10 ; lineas ++) {
				
				totalVertical [columnas] += tablaSumar [lineas] [columnas];
				
			}
			
			System.out.print(totalVertical [columnas] + " ");
			
		}
		System.out.print("       |\n");
		System.out.println("               |______________________________________|");
		
	}

}

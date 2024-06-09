package Exercici04;

public class Exercici90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n90.Donada una taula de dos dimensions de 10 x 10 de reals omplir la taula amb números i\r\n"
				+ "\nposteriorment buscar quin es el valor més gran i el més petit de cada fila, mostrant els 10\r\n"
				+ "\nvalors per pantalla");
		int tablaSumar [] [] = new int [10] [10];
		int GrandeHorizontal [] = new int [10] , PequeHorizontal [] = new int [10] ;
		int lineas = 0, columnas = 0;
		System.out.println("               ____________________________________________________________________");
		System.out.println("               |                                                                  |");
		for ( lineas = 0 ; lineas < 10 ; lineas ++) {
			
			System.out.print("               | ");
			for ( columnas = 0 ; columnas < 10 ; columnas ++) {
				
				tablaSumar [lineas] [columnas] = (int) (Math.random() * 10);
				System.out.print(tablaSumar [lineas] [columnas] + "  ");
				if (GrandeHorizontal [lineas] < tablaSumar [lineas] [columnas] ) GrandeHorizontal [lineas] = tablaSumar [lineas] [columnas];
				if (columnas == 0) PequeHorizontal [lineas] = tablaSumar [lineas] [columnas];
				else if (PequeHorizontal [lineas] > tablaSumar [lineas] [columnas] ) PequeHorizontal [lineas] = tablaSumar [lineas] [columnas];
				
			}
			System.out.print(" Mas grande =  " + GrandeHorizontal [lineas] + " , Mas pequeño = " + PequeHorizontal [lineas] + " |");
			System.out.println();
		}
		System.out.println("               |                                                           Ramon  |");
		System.out.println("               |__________________________________________________________________|");
	}

}

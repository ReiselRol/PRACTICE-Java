package proyectosprop;

import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.parser.ParseException;

public class wef {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, ParseException {
		
		//consigue el tamaño de una array que esta dentro de un JSON con otra consulta
		
		int size = Agile.searchSizeJSON("src/proyectosprop/Duda.json", "figures", "A");
		
		for (int i = 0; i < size; i++) {
			
			//Es como un select raro el cual devuelve un elemento en String que si quieres otro tipo lo casteas
			
			String cordX = Agile.searchJSON("src/proyectosprop/Duda.json", "figures", "A", "" + i, "O", "coords", "O", "x", "E");
			String cordY = Agile.searchJSON("src/proyectosprop/Duda.json", "figures", "A", "" + i, "O", "coords", "O", "y", "E");
			String forma = Agile.searchJSON("src/proyectosprop/Duda.json", "figures", "A", "" + i, "O", "forma", "E");
			String color = Agile.searchJSON("src/proyectosprop/Duda.json", "figures", "A", "" + i, "O", "color", "E");
			String mida = Agile.searchJSON("src/proyectosprop/Duda.json", "figures", "A", "" + i, "O", "mida", "E");
			
			//Imprime resultados por pantalla
			
			System.out.println("Cordenadas: x = " + cordX + ", Y = " + cordY);
			System.out.println("Forma: " + forma);
			System.out.println("Color: " + color);
			System.out.println("Mida: " + mida);
			System.out.println();
			
		}
		
		String pantallax = Agile.searchJSON("src/proyectosprop/Duda.json", "pantalla", "O", "x", "E");
		String pantallay = Agile.searchJSON("src/proyectosprop/Duda.json", "pantalla", "O",  "y", "E");
		System.out.println("Pantalla: X: " + pantallax + ", Y: " + pantallay);
		
	}

}

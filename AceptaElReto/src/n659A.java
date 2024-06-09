import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n659A {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int numero;
		while ( (numero = Integer.parseInt(br.readLine())) != 0 ) {
			
			String palabra = "";
			while (!(numero == 0)) {
				
				if (numero > 999999) {
					
					palabra += "H";
					numero -= 1000000;
					
				}
				else if (numero > 99999) {
					
					palabra += "R";
					numero -= 100000;
					
				}
				else if (numero > 9999) {
					
					palabra += "D";
					numero -= 10000;
					
				}
				else if (numero > 999) {
					
					palabra += "F";
					numero -= 1000;
					
				}
				else if (numero > 99) {
					
					palabra += "C";
					numero -= 100;
					
				}
				else if (numero > 9) {
					
					palabra += "G";
					numero -= 10;
					
				}
				else if (numero > 0) {
					
					palabra += "T";
					numero -= 1;
					
				}
				
			}
			System.out.println(palabra);
			
		}
		
	}

}

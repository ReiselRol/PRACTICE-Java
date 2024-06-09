import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n658A {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int numero;
		while ( (numero = Integer.parseInt(br.readLine())) != 0 ) {
			
			int max = 0, nivel = 0;
			while (!(numero <= max )) {
				
				nivel += 1;
				max += Math.pow( 1 + 2 * (nivel - 1), 2);
				
			}
			
			System.out.println(nivel);
		}

	}

}
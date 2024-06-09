import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n657WA {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int casos = Integer.parseInt(br.readLine()), a, b, c, ax, cx;
		for (int i = 0; i < casos; i++) {
			
			String [] linea = br.readLine().split(" ");
			a = Integer.parseInt(linea[0]);
			ax = a;
			b = Integer.parseInt(linea[1]);
			c = Integer.parseInt(linea[2]);
			cx = c;
			
			if (b < 0) {
				
				if (c > 0) {
					
					a = -a + b;
					c = c + ( b + 1 );
					
				}
				else {
					
					c = b + -c;
					a += -b;
				}
			}
			else {
				
				 if (a < 0) {
					 
					 a = -a + b;
					 c = c - b + 1;
				 }
				 else {
					 
					 a = b - a;
					 c = c - b;
					 
				 }
			}
			
			System.out.println( (a < c) ? ax : (a > c) ? cx : "EMPATE" );
			
		}

	}

}
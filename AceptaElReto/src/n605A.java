import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n605A {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        while (true) {
        	
        	String linea = br.readLine();
        	
        	if (linea.charAt(0) == '.') break;
        	
        	int V = 0, I = 0;
        	
        	for (int i = 0; i < linea.length() - 2; i += 2 ) {
        		
        		if (linea.charAt(i) == 'V') V += 1;
        		else if (linea.charAt(i) == 'I') I += 1;
        		
        	}
        	
        	System.out.print((V > I) ? "VERANO\n" : (V == I) ? "EMPATE\n" : "INVIERNO\n");
        	
        }

	}

}

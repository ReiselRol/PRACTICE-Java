import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n663A {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        int ultimo = Integer.parseInt(br.readLine());
        for (int i = 0; i < ultimo ; i++) {
        	
        	StringBuilder str = new StringBuilder();
        	int numero = Integer.parseInt(br.readLine());
        	str.append(( (numero > 0 ) ? (numero - 1)  : numero )).append("\n");
        	System.out.print(str);
        	
        }

	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n604A {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        int ultimo = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < ultimo; i++) {
        	
        	int valor = 0;
        	String [] problema = (br.readLine()).split(" ");
        	int [] palo  = {0,0,0,0};
        	
        	for (int j = 0; j < problema.length; j++) {
        		
        		if (problema[j].charAt(0) == 'A') valor += 4;
        		else if (problema[j].charAt(0) == 'K') valor += 3;
        		else if (problema[j].charAt(0) == 'Q') valor += 2;
        		else if (problema[j].charAt(0) == 'J') valor += 1;
        		
        		if (problema[j].charAt(0) == 'C') palo [0] += 1;
        		else if (problema[j].charAt(0) == 'D') palo [1] += 1;
        		else if (problema[j].charAt(0) == 'P') palo [2] += 1;
        		else if (problema[j].charAt(0) == 'T') palo [3] += 1;
        		
        		
        	}
        	for (int j = 0; j < palo.length; j++) {
        		
        		if (palo[j] == 0) valor += 3;
        		else if (palo[j] == 1) valor += 2;
        		else if (palo[j] == 2) valor += 1;
        	}
        	
        	System.out.println(valor);
        	
        }

	}

}

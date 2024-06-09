import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class n661A {

    public String nombre;
    public int valor;
    public int peso;

    public n661A(String nombre, int valor, int peso) {
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
    }

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        StringBuilder str = new StringBuilder();
        
        int repeticion;
        ArrayList<n661A> items = new ArrayList<n661A>();
        while (true) {
        	repeticion = Integer.parseInt(br.readLine());
        	if (repeticion == 0) break;
	        for (int i = 0; i < repeticion; i++) {
	
	            String[] linea = br.readLine().split(" ");
	            items.add(new n661A(linea[0], Integer.parseInt(linea[1]),  Integer.parseInt(linea[2])));
	
	        }
	        Collections.sort(items, new ValorPesoComparator());
	        
	        for (int i = 0; i < repeticion; i++) {
	            str.append(items.get(i).nombre);
	            if (i + 1 != repeticion) str.append(" ");
	        }
	        
	        System.out.println(str);
        }
    }
}

class ValorPesoComparator implements Comparator<n661A> {

    public int compare(n661A o1, n661A o2) {
        int result = Integer.compare(o2.valor, o1.valor);
        if (result == 0) {
            result = Integer.compare(o1.peso, o2.peso);
        }
        if (result == 0) {
            result = 1;
        }
        return result;
    }

}
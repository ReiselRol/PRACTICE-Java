package Exercici2on01;

public class LaMain {

	public static void main(String[] args) {
			String message = "Ab";
			String key = "Sa puta madre para que sirvo??";
			String encripted = nCript.Encripta(message,key);
			String unnencripted = nCript.Desencripta(encripted, key);
			System.out.println(encripted);
			System.out.println(unnencripted);
	}
	
}
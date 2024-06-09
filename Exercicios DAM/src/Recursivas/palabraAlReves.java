package Recursivas;

public class palabraAlReves {

	public static void main(String[] args) {
		String palabraAGirar = "Casa";
		System.out.println("La a girar es: " + palabraAGirar + " y girada es: " + reves(palabraAGirar));
	}
	public static String reves (String palabra) {
		if (palabra.length() > 1) {
			String palabraGirada = "" + palabra.charAt(palabra.length() - 1);
			String palabraSinLaUltimaLetra = "";
			for (var i = 0; i < palabra.length() - 1; i++) palabraSinLaUltimaLetra += palabra.charAt(i);
			return palabraGirada + reves(palabraSinLaUltimaLetra);
		} else return palabra;
	}
}

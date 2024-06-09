package ExamenesFretaCFGM;

import ExamenesFretaCFGM.M2.M2UF2;

public class SelectorExamenes {

	public static void main(String[] args) {
		
		boolean finalizado = false;
		final String [] modulo = {"M2 (Sistemas Operatius)","Salir"};
		
		do {
			
			Agile.print(Agile.title("Examenes Repaso CFGM Freta"), 1);
			Agile.printMenu(modulo, 15);
			Agile.print("Hecho por Ramon Rios en gratitud de una buena formación", 2);
			int opcion = Agile.qInt(1, 1, modulo.length);
			opcion --;
			
			if (modulo[opcion].equalsIgnoreCase("M2 (Sistemas Operatius)")) {
				
				final int TOTALUFS = 3;
				int ufSeleccionada = ElegirUf(TOTALUFS);
				if (ufSeleccionada == 2) {
					
					M2UF2 examen = new M2UF2();
					examen.start();
					
				}
				
			}
			else if (modulo[opcion].equalsIgnoreCase("Salir")) finalizado = true;
			
		} while (finalizado == false);
		

	}
	
	private static void RellenarUfsUtiles(String [] ufsUtiles, String [] uf) {
		
		for (int i = 0; i < ufsUtiles.length - 1; i++) {
			
			ufsUtiles[i] = uf[i];
			
		}
		
		ufsUtiles[ufsUtiles.length - 1] = "Volver Atras";
		
	}
	
	private static int ElegirUf(int TOTALUFS) {
		
		final String [] uf = {"UF1", "UF2", "UF3", "UF4", "UF5", "UF6", "UF7", "UF8", "UF9", "UF10"};
		
		final int TOTALOPCIONES = TOTALUFS + 1;
		String [] ufsUtiles = new String [TOTALOPCIONES];
		
		RellenarUfsUtiles(ufsUtiles, uf);
		Agile.printMenu(ufsUtiles, 15);
		int opcion = Agile.qInt(1, 1, ufsUtiles.length);
		
		return opcion;
		
	}

}

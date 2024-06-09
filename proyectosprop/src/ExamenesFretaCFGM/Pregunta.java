package ExamenesFretaCFGM;

import java.util.Arrays;
import java.util.Collections;

public class Pregunta {
	
	private String pregunta;
	private String [] opciones;
	private String respuesta;
	private final int longuitudMaxima = 45;
	
	public Pregunta() {
		
	}
	
	public Pregunta(String pregunta, String [] opciones, String respuesta) {
		
		this.pregunta = pregunta;
		this.opciones = opciones;
		this.respuesta = respuesta;
		
	}
	
	private void MostrarPregunta () {
		
		final int tabulacion = 5;
		Collections.shuffle(Arrays.asList(this.opciones));
		Agile.printAdv( this.pregunta, tabulacion, longuitudMaxima);
		Agile.printMenu(opciones, tabulacion);
		
	}
	
	private boolean EsCorrecto(int opcion) {
		
		if (this.opciones[opcion - 1].equalsIgnoreCase(respuesta)) return true;
		else {
			
			Agile.printAdv("Respuesta incorrecta, la respuesta correcta era: " + this.respuesta, 5, longuitudMaxima);
			return false;
		}
		
	}
	
	public boolean EvaluarPregunta() {
		
		MostrarPregunta();
		int opcion = Agile.qInt(1, 1, this.opciones.length);
		if (EsCorrecto(opcion)) return true;
		else return false;
		
	}
	
}

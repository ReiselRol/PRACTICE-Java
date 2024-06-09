package ExamenesFretaCFGM;

import java.util.ArrayList;

public abstract class PlantillaExamen {
	
	private double nota = 0;
	public ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();
	public String nombreExamen = "M2 UF2";
	
	public void start() {
		
		int preguntasContestadas = 0;
		ArrayList<Integer> preguntasHechas = new ArrayList<Integer>();
		RellenarPreguntas(preguntas);
		
		final int TOTALPREGUNTAS = preguntas.size();
		
		Agile.print(Agile.title("Examen Repaso " + nombreExamen), 1);
		
		do {
			
			HacerPregunta(TOTALPREGUNTAS, preguntasHechas, preguntas);
			preguntasContestadas ++;
			
		} while (ExamenFinalizado(preguntasContestadas, TOTALPREGUNTAS) == false);
		
		Agile.printAdv("Examen de repaso finalizado!, tu nota que has obtenido haciendo el examen es de: " + this.nota + ReaccionNota(), 5, 32);
		
	}
	
	private void HacerPregunta(int TOTALPREGUNTAS, ArrayList<Integer> preguntasHechas, ArrayList<Pregunta> preguntas) {
		
		int pregunta = (int)(Math.random() * preguntas.size());
		boolean respuestaCorrecta = preguntas.get(pregunta).EvaluarPregunta();
		
		if (respuestaCorrecta) subirNota(TOTALPREGUNTAS);
		
		preguntas.remove(pregunta);
		
	}
	
	private boolean ExamenFinalizado(int preguntasContestadas, int TOTALPREGUNTAS) {
		
		if (preguntasContestadas == TOTALPREGUNTAS) return true;
		else return false;
		
	}
	
	private void subirNota(int TOTALPREGUNTAS) {
		
		double divisor = TOTALPREGUNTAS * 0.01;
		double valor = (10 / (divisor * 100));
		this.nota += valor;
		
	}
	
	private String ReaccionNota() {
		
		if (this.nota < 5) return " Deberias volver a intentarlo";
		else if (this.nota < 7.5) return " Vas por buen camino";
		else if (this.nota < 9) return " Empiezas a saberlo casi todo";
		else return " Estas preparado para el examen";
		
	}
	
	protected abstract void RellenarPreguntas(ArrayList<Pregunta> preguntas);
	
}

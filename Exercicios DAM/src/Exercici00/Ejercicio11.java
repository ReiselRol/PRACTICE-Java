package Exercici00;
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n 11.	Si considerem que la nota mínima que podem treure als exàmens per fer mitja és un 3,5 , i que conten com un 60% de la nota final. Què he de treure en els exercicis de cara a aprovar si trec el mínim de 3’5 en el examen?.");
		/*
		 3,5*0.6 + X*0,4 = 5
		 2,1 + X*0,4 = 5
		 X*0.4 = 5 - 2,1
		 X*0,4 = 2,9 
		 X = 2,9 / 0,4
		 X = 7,25
		 */
		double sesenta = 3.5 * 0.6;
		int numeroQueBuscamos = 5;
		double cuarenta = 0.4;
		double Calculo = ( numeroQueBuscamos - sesenta ) / cuarenta;
		System.out.println("\nSe necesitaria una nota de " + Calculo + " en las actividades para poder aprobar el curso");
	}

}

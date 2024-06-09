package Exercici2on02;

public class Index {

	private static int threadsCuantity = 5;
	private static boolean checkThreadPropertieSpeed = false;
	private static int arraySize = 1000;
	
	public static void main(String[] args) {
		System.out.println("Tiempo de la resolución: " + calculeAverageAndTime(true) + " pico segundos.");
	}
	private static long calculeAverageAndTime (boolean showResults) {
		long start = System.nanoTime();
		doAverage(showResults);
		return (System.nanoTime() - start) / 1000;
	}
	private static void doAverage (boolean showResults) {
		var allNumbers = getArrayFilled();
		double number = calculeAverage(allNumbers);
		if (showResults) System.out.println("La media de los " + arraySize + " numeros es: " + String.format("%.3f", number));
	}
	private static double calculeAverage(int [] arrayToCheck) {
		var allThreads = getAllProcessSetUpped(arrayToCheck);
		startAllProcess(allThreads);
		return getAverageFromThreads(allThreads) / threadsCuantity;
	}
	private static double getAverageFromThreads (Mitjana [] allThreads) {
		boolean finished = false;
		while (finished == false) finished = (checkThreadPropertieSpeed) ? checkIsFinishedThreadWithProp(allThreads) : checkIsFinishedThreadWithMethod(allThreads);
		double averageFromThreads = 0;
		for (var eachProcess = 0; eachProcess < allThreads.length; eachProcess++) averageFromThreads += allThreads[eachProcess].getAverage();
		return averageFromThreads;
	}
	private static boolean checkIsFinishedThreadWithProp(Mitjana [] allThreads) {
		 for (var eachThread = 0; eachThread < allThreads.length; eachThread++) {
			 if (allThreads[eachThread].finished == false) return false;
		 }
		 return true;
	}
	private static boolean checkIsFinishedThreadWithMethod(Mitjana [] allThreads) {
		 for (var eachThread = 0; eachThread < allThreads.length; eachThread++) {
			 if (allThreads[eachThread].isAlive() == true) return false;
		 }
		 return true;
	}
	private static int [] getArrayFilled () {
		int [] arrayToReturn = new int[arraySize];
		for (var position = 0; position < arrayToReturn.length; position ++) arrayToReturn[position] = (int) (Math.random() * 10) + 1;
		return arrayToReturn;
	}
	private static Mitjana [] getAllProcessSetUpped (int [] arrayToCheck) {
		var allThreads = new Mitjana[threadsCuantity];
		for (var thread = 0; thread < allThreads.length; thread++) allThreads[thread] = new Mitjana(thread, arrayToCheck, arraySize / threadsCuantity);
		return allThreads;
	}
	private static void startAllProcess (Mitjana [] allThreads) {
		for (var thread = 0; thread < allThreads.length; thread++) allThreads[thread].run();
	}
}
package Exercici2on02;

public class Mitjana extends Thread{
	
	public boolean finished = false;
	private int positionJump;
	private int [] arrayToCheck;
	private double average;
	private int maxPositionToCheck = 200;
	
	public Mitjana () { }
	public Mitjana (int positionJump, int [] arrayToCheck) {
		this.positionJump = positionJump;
		this.arrayToCheck = arrayToCheck;
	}
	public Mitjana (int positionJump, int [] arrayToCheck, int maxPositionToCheck) {
		this.positionJump = positionJump;
		this.arrayToCheck = arrayToCheck;
		this.maxPositionToCheck = maxPositionToCheck;
	}
	public void run() {
		this.average = calculeAverage();
		this.finished = true;
	}
	private double calculeAverage() {
		double average = 0;
		var lastPosition = 0 + maxPositionToCheck * (positionJump + 1);
		for (var position = 0 + maxPositionToCheck * positionJump; position < lastPosition; position ++) average += arrayToCheck[position];
		return average / maxPositionToCheck;
	}
	public double getAverage() {
		return average;
	}
}

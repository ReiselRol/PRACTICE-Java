

public class Vector {

	public static final int DEFAULTACELERACIONX = 1;
	public static final int DEFAULTACELERACIONY = 1;
	private int aceleracionX;
	private int aceleracionY;
	
	public Vector () {
		
		this.aceleracionX = DEFAULTACELERACIONX;
		this.aceleracionY = DEFAULTACELERACIONY;
		
	}
	
	public Vector ( int aceleracionX, int aceleracionY) {
		
		this.aceleracionX = aceleracionX;
		this.aceleracionY = aceleracionY;
		
	}

	public int getAceleracionX() {
		return aceleracionX;
	}

	public void setAceleracionX(int aceleracionX) {
		this.aceleracionX = aceleracionX;
	}

	public int getAceleracionY() {
		return aceleracionY;
	}

	public void setAceleracionY(int aceleracionY) {
		this.aceleracionY = aceleracionY;
	}
	
}

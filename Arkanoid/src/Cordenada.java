

public class Cordenada {

	public static final int DEFAULTX = Arkanoid.ANCHO/2;
	public static final int DEFAULTY = Arkanoid.ALTO/2;
	private int x;
	private int y;
	
	public Cordenada () {
		
	}
	
	public Cordenada (int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}

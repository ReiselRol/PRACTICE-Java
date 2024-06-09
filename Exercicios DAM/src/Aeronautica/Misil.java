package Aeronautica;

public class Misil {

	private Cordenada cordenadas;
	private int velocidad;
	
	public Misil() {
		
		this.velocidad = 0;
		
	}
	public Cordenada getCordenadas() {
		return cordenadas;
	}
	public void setCordenadas(Cordenada cordenadas) {
		this.cordenadas = cordenadas;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
}

package Aeronautica;

public class Combate extends Avion {

	private Misil misiles[];
	private int distanciaDisparar;
	private boolean amigo;
	private boolean encriptado;
	
	public Combate() {
		super();
	}
	public Combate(String matricula, String marca, String modelo, int capacitat, int tripulante, String origen, String destino, Cordenada cordenadas, int autonomia, boolean trenAterrizage, boolean motores, int velocitat, Misil misiles[], int distanciaDisparar, boolean amigo) {
		
		super(matricula, marca, modelo, capacitat, tripulante, origen, destino, cordenadas, autonomia, trenAterrizage, motores, velocitat);
		this.misiles = misiles;
		this.distanciaDisparar = distanciaDisparar;
		this.amigo = amigo;
		this.encriptado = false;
	}
	public Misil[] getMisiles() {
		return misiles;
	}
	public void setMisiles(Misil[] misiles) {
		this.misiles = misiles;
	}
	public int getDistanciaDisparar() {
		return distanciaDisparar;
	}
	public void setDistanciaDisparar(int distanciaDisparar) {
		this.distanciaDisparar = distanciaDisparar;
	}
	public boolean getAmigo() {
		return amigo;
	}
	public void setAmigo(boolean amigo) {
		this.amigo = amigo;
	}
	public boolean getEncriptado() {
		return encriptado;
	}
	public void setEncriptado(boolean encriptado) {
		this.encriptado = encriptado;
	}
	public void encriptar() {
		
		this.encriptado = true;
		String nuevaMatricula = "";
		
		for (int i = 0; i < matricula.length(); i ++) nuevaMatricula += ((char)(matricula.charAt(i) + 1));
		
		matricula = nuevaMatricula;

		
	}
	public void desencriptar() {
		
		this.encriptado = false;
		
		String nuevaMatricula = "";
		for (int i = 0; i < matricula.length(); i ++) nuevaMatricula += ((char)(matricula.charAt(i) - 1));
		
		matricula = nuevaMatricula;
	}
	
}

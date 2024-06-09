package BiciletaElectricas;

public class Bicicleta {

	private String matricula;
	private String marca;
	private String modelo;
	private int [] diaCompra = new int [3];
	private boolean alquilado;
	private int tiempoUso;
	private int potenciaBateria;
	private double distanciaRecorida;
	private boolean plusElectrica;
	private double costoAlquiler;

	public Bicicleta () {
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int[] getDiaCompra() {
		return diaCompra;
	}

	public void setDiaCompra(int[] diaCompra) {
		this.diaCompra = diaCompra;
	}

	public boolean isAlquilado() {
		return alquilado;
	}

	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}

	public int getTiempoUso() {
		return tiempoUso;
	}

	public void setTiempoUso(int tiempoUso) {
		this.tiempoUso = tiempoUso;
	}

	public int getPotenciaBateria() {
		return potenciaBateria;
	}

	public void setPotenciaBateria(int potenciaBateria) {
		this.potenciaBateria = potenciaBateria;
	}

	public double getDistanciaRecorida() {
		return distanciaRecorida;
	}

	public void setDistanciaRecorida(double distanciaRecorida) {
		this.distanciaRecorida = distanciaRecorida;
	}

	public boolean isPlusElectrica() {
		return plusElectrica;
	}

	public void setPlusElectrica(boolean plusElectrica) {
		this.plusElectrica = plusElectrica;
	}
	
	public double getCostoAlquiler() {
		return costoAlquiler;
	}

	public void setCostoAlquiler(double costoAlquiler) {
		this.costoAlquiler = costoAlquiler;
	}

}

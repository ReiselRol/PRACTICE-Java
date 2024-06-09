package Aeronautica;

public class Avion {
	
	protected String matricula;
	protected String marca;
	protected String modelo;
	protected int capacitat;
	protected int tripulante;
	protected String origen;
	protected String destino;
	protected Cordenada cordenadas;
	protected int autonomia;
	protected boolean trenAterrizage;
	protected boolean motores;
	protected int velocitat;
	
	public Avion() {
		
	}
	
	public Avion (String matricula, String marca, String modelo, int capacitat, int tripulante, String origen, String destino, Cordenada cordenadas, int autonomia, boolean trenAterrizage, boolean motores, int velocitat) {
		
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.capacitat = capacitat;
		this.tripulante = tripulante;
		this.origen = origen;
		this.destino = destino;
		this.cordenadas = cordenadas;
		this.autonomia = autonomia;
		this.trenAterrizage = trenAterrizage;
		this.motores = motores;
		this.velocitat = velocitat;
		
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
	public int getCapacitat() {
		return capacitat;
	}
	public void setCapacitat(int capacitat) {
		this.capacitat = capacitat;
	}
	public int getTripulante() {
		return tripulante;
	}
	public void setTripulante(int tripulante) {
		this.tripulante = tripulante;
	}
	public boolean getTrenAterrizage() { 
		return this.trenAterrizage;
	}
	public boolean getMotores() { 
		return this.motores;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Cordenada getCordenadas() {
		return cordenadas;
	}
	public void setCordenadas(Cordenada cordenadas) {
		this.cordenadas = cordenadas;
	}
	public int getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}
	public boolean isTrenAterrizage() {
		return trenAterrizage;
	}
	public void setTrenAterrizage(boolean trenAterrizage) {
		this.trenAterrizage = trenAterrizage;
	}
	public boolean isMotores() {
		return motores;
	}
	public void setMotores(boolean motores) {
		this.motores = motores;
	}
	public int getVelocitat() {
		return velocitat;
	}
	public void setVelocitat(int velocitat) {
		this.velocitat = velocitat;
	}
	public void apagarMotores() {
		this.motores = false;
	}
	public void encenderMotores() {
		this.motores = true;
	}
	public void acelerarAvion (int velocidad) {
		this.velocitat += velocidad;
	}
	public void frenarAvion (int velocidad) {
		this.velocitat -= velocidad;
	}
	public void elevarAvion (int cantidad) {
		this.cordenadas.subirAltura(cantidad);
	}
	public void descenderAvion(int cantidad) {
		this.cordenadas.bajarAltura(cantidad);
	}
	public void esstadoTrenAterizage(boolean estado) {
		this.trenAterrizage = estado;
	}
	public void setCordenadas(int preguntarCordenadas, int preguntarCordenadas2) {
		this.cordenadas.setX(preguntarCordenadas);
		this.cordenadas.setY(preguntarCordenadas2);
		
	}
	
}

package ExamenHerencia;

public class Orco extends Personage{

	private int tenacidad;
	
	public Orco () {
		super();
	}
	
	public Orco (String nombre, int ataquePoder, Arma [] armas, String faccion, int tenacidad) {
		
		super(nombre, ataquePoder, armas, faccion);
		this.tenacidad = tenacidad;
		
	}
	
	public void mostrarInfo() {
		
		System.out.println("\n" + nombre + " is an Orc in " + faccion + " faction"
						 + "\nTenacitat: " + tenacidad
						 + "\nAttack power without weapons: " + ataquePoder);
		
		for (int arma = 0; arma < armas.length; arma ++) System.out.print("\nWeapon 1: " + armas[arma].getNombre() + " - " + armas[arma].getAtaquePoder());
		
		System.out.println("\nAverage Attack Power: " + mediaPoder() );
		
	}
	
	public int mediaPoder () {
		
		int average = 0, totalPoderArmas = 0, totalArmas = armas.length;
		
		for (int arma = 0; arma < totalArmas; arma ++) totalPoderArmas += armas[arma].getAtaquePoder();
		
		average = (int) ataquePoder + ( (totalPoderArmas / totalArmas) * (tenacidad / 2) );
		
		return average;
		
	}
	
}

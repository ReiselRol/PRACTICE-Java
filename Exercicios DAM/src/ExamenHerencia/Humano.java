package ExamenHerencia;

public class Humano extends Personage {

	private boolean inteligencia;
	
	public Humano () {
		
		super();
		
	}
	
	public Humano (String nombre, int ataquePoder, Arma [] armas, String faccion, boolean inteligencia) {
		
		super(nombre, ataquePoder, armas, faccion);
		this.inteligencia = inteligencia;
		
	}
	
	public void mostrarInfo() {
		
		System.out.println("\n" + nombre + " is an Human in " + faccion + " faction"
						 + "\nIntel·ligencia: " + ( (inteligencia) ? "Si" : "No" )
						 + "\nAttack power without weapons: " + ataquePoder);
		
		for (int arma = 0; arma < armas.length; arma ++) System.out.print("\nWeapon 1: " + armas[arma].getNombre() + " - " + armas[arma].getAtaquePoder());
		
		System.out.println("\nAverage Attack Power: " + mediaPoder() );
		
	}
	
	public int mediaPoder () {
		
		int average = 0, totalPoderArmas = 0, totalArmas = armas.length;
		final double bonusInteligencia = 1.33;
		
		for (int arma = 0; arma < totalArmas; arma ++) totalPoderArmas += armas[arma].getAtaquePoder();
		
		if (inteligencia) average = (int) (ataquePoder * bonusInteligencia) + (totalPoderArmas / totalArmas);
		else average = (int) (ataquePoder) + (totalPoderArmas / totalArmas);
		
		return average;
		
	}
}

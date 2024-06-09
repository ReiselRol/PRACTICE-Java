package ExamenHerencia;

public class Elfo extends Personage {

	private double magia;
	
	public Elfo () {
		super();
	}
	
	public Elfo (String nombre, int ataquePoder, Arma [] armas, String faccion, double magia) {
		
		super(nombre, ataquePoder, armas, faccion);
		this.magia = magia;
		
	}
	
	public void mostrarInfo() {
		
		System.out.println("\n" + nombre + " is an Elf in " + faccion + " faction"
						 + "\nMagia: " + magia
						 + "\nAttack power without weapons: " + ataquePoder);
		
		for (int arma = 0; arma < armas.length; arma ++) System.out.print("\nWeapon " + arma + ": " + armas[arma].getNombre() + " - " + armas[arma].getAtaquePoder());
		
		System.out.println("\nAverage Attack Power: " + mediaPoder() );
		
	}
	
	public int mediaPoder () {
		
		int average = 0, totalPoderArmas = 0, totalArmas = armas.length;
		
		for (int arma = 0; arma < totalArmas; arma ++) totalPoderArmas += armas[arma].getAtaquePoder();
		
		average = (int) ( (int) ataquePoder + ( ( (totalPoderArmas) * ( 1 + magia) )  / totalArmas ) );
		
		return average;
		
	}
	
}

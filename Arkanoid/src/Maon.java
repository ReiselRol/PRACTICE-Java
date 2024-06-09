

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Maon {

	public static final Tamaño TAMAÑODEFAULT = new Tamaño((Arkanoid.ANCHO - 60) / 8, 30);
	
	private Cordenada cordenada;
	private Tamaño tamaño;
	private Color color;
	private Boolean caer;
	private int vida;
	private int speed = 1;
	private Arkanoid partida;
	private int timerInvencibilidad = 0;
	private int vidaInicial;
	
	
	public Arkanoid getPartida() {
		return partida;
	}

	public void setPartida(Arkanoid partida) {
		this.partida = partida;
	}
	
	public Maon() {
		this.tamaño = TAMAÑODEFAULT;
	}
	
	public Maon(Cordenada cordenada, Tamaño tamaño, int vida) {
		
		this.tamaño = tamaño;
		this.cordenada = cordenada;
		this.vida = vida;
		this.caer = false;
		this.vidaInicial = vida;
		this.timerInvencibilidad = 0;
		setColor();
		
	}

	public Maon(Cordenada cordenada, Tamaño tamaño, int vida, Arkanoid partida) {
		
		this.tamaño = tamaño;
		this.cordenada = cordenada;
		this.vida = vida;
		this.vidaInicial = vida;
		this.caer = false;
		this.timerInvencibilidad = 0;
		setColor();
		this.partida = partida;
		
	}
	
	public Cordenada getCordenada() {
		return cordenada;
	}
	
	public void setCordenada(Cordenada cordenada) {
		this.cordenada = cordenada;
	}
	
	public Tamaño getTamaño() {
		return tamaño;
	}
	
	public void setTamaño(Tamaño tamaño) {
		this.tamaño = tamaño;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor() {
		
		if (vida == 1) color = Color.RED;
		else if (vida == 2) color = Color.ORANGE;
		else if (vida == 3) color = Color.YELLOW;
		else if (vida == 4) color = Color.GREEN;
		else if (vida == 5) color = Color.CYAN;
		else if (vida == 6) color = Color.BLUE;
		else if (vida == 6) color = Color.MAGENTA;
		else if (vida == 7) color = Color.PINK;
		else if (vida == 8) color = Color.GRAY;
		else if (vida == 9) color = new Color(37,37,37);
		else if (vida >= 10) color = Color.WHITE;
		
	}
	
	public int getVida() {
		return this.vida;
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public int getX() {
		return this.cordenada.getX();
	}
	
	public void setX(int x) {
		this.cordenada.setX(x);
	}
	public int getY() {
		return cordenada.getY();
	}
	
	public void setY(int y) {
		this.cordenada.setY(y);
	}
	
	public int getAltura() {
		return this.tamaño.getAltura();
	}
	
	public void setAltura(int altura) {
		this.tamaño.setAltura(altura);
	}
	
	public int getAncho() {
		return this.tamaño.getAncho();
	}
	
	public void setAncho(int Ancho) {
		this.tamaño.setAncho(Ancho);
	}

	public Rectangle getBounds() {
		return new Rectangle(getX(), getY(), getAltura(), getAncho());
	}
	
	public void restarVida(Boliche bola) {
		this.vida -= bola.getDaño();
		setColor();
	}
	public void restarTimer() {
		this.timerInvencibilidad --;
	}
	public int getTimerInvencibilidad() {
		return timerInvencibilidad;
	}

	public void setTimerInvencibilidad(int timerInvencibilidad) {
		this.timerInvencibilidad = timerInvencibilidad;
	}

	public void pintar(Graphics2D graficos2D) {

		graficos2D.setColor(getColor());
		graficos2D.fillRect(getX(), getY(), getAltura(), getAncho());
		graficos2D.setColor(new Color(0,0,0,50));
		graficos2D.fillRect(getX(), getY(), getAltura(), getAncho());
		graficos2D.fillRect(getX() + 3, getY() + 3, getAltura() - 6, getAncho() - 6);
		graficos2D.setColor(getColor());
		graficos2D.fillRect(getX() + 6, getY() + 6, getAltura() - 12, getAncho() - 12);
		graficos2D.setColor(Color.BLACK);
		graficos2D.drawRect(getX(), getY(), getAltura(), getAncho());
		
	}

	public int getVidaInicial() {
		return vidaInicial;
	}

	public void setVidaInicial(int vidaInicial) {
		this.vidaInicial = vidaInicial;
	}
	
	public int valorMaon() {
		
		int calculo = (int) (100 * (1 + (0.33 * (this.vidaInicial - 1))));
		return calculo;
	}

	public Boolean getCaer() {
		return caer;
	}

	public void setCaer(Boolean caer) {
		this.caer = caer;
	}
	
	public void mover() {
		
		this.cordenada.setY( this.cordenada.getY() + this.speed);
		
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}

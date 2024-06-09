

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Boliche {

	public static final Tamaño TAMAÑODEFAULT = new Tamaño(Tamaño.ALTURADEFAULT, Tamaño.ANCHURADEFAULT);
	public static final Cordenada CORDENADAEFAULT = new Cordenada(Cordenada.DEFAULTX, Arkanoid.ALTO - 10 - 105);
	public static final Vector VECTORDEFAULT = new Vector(Vector.DEFAULTACELERACIONX, Vector.DEFAULTACELERACIONY);
	
	private Tamaño tamaño;
	private Cordenada cordenada;
	private Cordenada ultimoMaon;
	private Vector vector;
	private int speed;
	private int daño = 1;
	private boolean collisionJugador;
	private boolean collisionMaon;
	private Arkanoid partida;
	private Cordenada [] shadow = {CORDENADAEFAULT,CORDENADAEFAULT,CORDENADAEFAULT}; 
	
	
	public Arkanoid getPartida() {
		return partida;
	}

	public void setPartida(Arkanoid partida) {
		this.partida = partida;
	}

	public Boliche () {
		
		this.tamaño = TAMAÑODEFAULT;
		this.cordenada = CORDENADAEFAULT;
		this.vector = VECTORDEFAULT;
		this.speed = 4;
		this.collisionJugador = false;
		this.collisionMaon = false;
		
		setAx(1 * speed);
		setAy(1 * speed);
		
	}
	
	
	public Boliche (Arkanoid partida) {
		
		this.tamaño = TAMAÑODEFAULT;
		this.cordenada = CORDENADAEFAULT;
		this.vector = VECTORDEFAULT;
		this.speed = 4;
		this.collisionJugador = false;
		this.collisionMaon = false;
		this.partida = partida;
		setAx(1 * speed);
		setAy(1 * speed);
		
	}
	
	public Boliche (Tamaño tamaño, Cordenada cordenada, Vector vector, Arkanoid partida) {
		
		this.tamaño = tamaño;
		this.cordenada = cordenada;
		this.vector = vector;
		this.speed = 4;
		this.collisionJugador = false;
		this.collisionMaon = false;
		this.partida = partida;
		
	}

	
	
	public Cordenada getUltimoMaon() {
		return ultimoMaon;
	}

	public void setUltimoMaon(Cordenada ultimoMaon) {
		this.ultimoMaon = ultimoMaon;
	}

	public Tamaño getTamaño() {
		return tamaño;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setTamaño(Tamaño tamaño) {
		this.tamaño = tamaño;
	}

	public Cordenada getCordenada() {
		return cordenada;
	}

	public void setCordenada(Cordenada cordenada) {
		this.cordenada = cordenada;
	}

	public Vector getVector() {
		return vector;
	}

	public void setVector(Vector vector) {
		this.vector = vector;
	}
	
	
	
	public boolean isCollisionMaon() {
		return collisionMaon;
	}

	
	public boolean setCollisionMaon(boolean collisionMaonVertical, Maon maon) {
		this.collisionMaon = collisionMaonVertical;
		if (collisionMaon) {
			this.ultimoMaon = maon.getCordenada();
		}
		return collisionMaon;
	}

	public int getX() {
		return cordenada.getX();
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
		return tamaño.getAltura();
	}
	
	public void setAltura(int altura) {
		this.tamaño.setAltura(altura);
	}
	
	public int getAncho() {
		return tamaño.getAncho();
	}
	
	public void setAncho(int Ancho) {
		this.tamaño.setAncho(Ancho);
	}
	
	public int getAx () {
		return vector.getAceleracionX();
	}
	
	public void setAx (int aX) {
		this.vector.setAceleracionX(aX);
	}
	
	public int getAy () {
		return vector.getAceleracionY();
	}
	
	public void setAy (int aY) {
		this.vector.setAceleracionY(aY);
	}
	
	public boolean isCollisionJugador() {
		return collisionJugador;
	}

	public void setCollisionJugador(boolean collisionJugador) {
		this.collisionJugador = collisionJugador;
	}
	
	public void setCollisionMaon(boolean collisionMaon) {
		this.collisionMaon = collisionMaon;
	}

	public void moverBoliche(int ancho, int alto, boolean colisionadoRecientemente, Jugador jugador, boolean esPrincipal) {
		setearSombra(cordenada);
		if (getX() + getAx() < 30) setAx(1 * speed);
		if (getX() + getAx() > ancho - 35) setAx(-1 * speed);
		if (getY() + getAy() < 100) setAy(1 * speed);
		if (collisionJugador) {
			setAy(-1 * speed);
			if (getX() < jugador.getX() + jugador.getAncho() / 2) {
				if(getAx() > 0) setAx(-1 * speed);
			}
			else {
				if (getAx() < 0)setAx(1 * speed);
			}
		}
		if(getY() + getAy() > alto && esPrincipal) {
			jugador.restarVida();
			if (jugador.getVidas() > 0)setCordenada(new Cordenada(jugador.getX() + jugador.getAncho()/2 ,Arkanoid.ALTO - 10 - 105));
		}
	
		if (colisionadoRecientemente == true) {
			
			if (getY() - getAy() < ultimoMaon.getY()) setAy(-1 * speed);
			else if ((getX() - getAx() < ultimoMaon.getX())) setAx(-1 * speed);
			else if ((getX() - getAx() > Maon.TAMAÑODEFAULT.getAncho() + ultimoMaon.getX())) setAx(1 * speed);
			else if (getY() - getAy() > Maon.TAMAÑODEFAULT.getAltura() - ultimoMaon.getY()) setAy(1 * speed);
		}
		
		setX(getX() + getAx());
		setY(getY() + getAy());
		
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle(getX(), getY(), getAncho(), getAltura());
	}
	
	public void pintar (Graphics2D graficos2D) {
		
		graficos2D.setColor(Color.RED);
		graficos2D.fillOval(shadow[2].getX(), shadow[2].getY(), getAltura(), getAncho());
		graficos2D.setColor(Color.ORANGE);
		graficos2D.fillOval(shadow[1].getX(), shadow[1].getY(), getAltura(), getAncho());
		graficos2D.setColor(Color.YELLOW);
		graficos2D.fillOval(shadow[0].getX(), shadow[0].getY(), getAltura(), getAncho());
		
		graficos2D.setColor(Color.DARK_GRAY);
		graficos2D.fillOval(getX(), getY(), getAltura(), getAncho());
		graficos2D.setColor(Color.GRAY);
		graficos2D.fillOval(getX() + 2, getY() + 2, getAltura() - 5, getAncho() - 5);
		graficos2D.setColor(Color.LIGHT_GRAY);
		graficos2D.fillOval(getX() + 2, getY() + 2, getAltura() - 8, getAncho() - 8);
		graficos2D.setColor(Color.BLACK);
		graficos2D.drawOval(getX(), getY(), getAltura(), getAncho());
		
	}
	
	public void setearSombra (Cordenada nuevaCordenada) {
		
		this.shadow[2] = new Cordenada(shadow[1].getX(), shadow[1].getY());
		this.shadow[1] = new Cordenada(shadow[0].getX(), shadow[0].getY());
		this.shadow[0] = new Cordenada(nuevaCordenada.getX(), nuevaCordenada.getY());
	}

	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}
	
}

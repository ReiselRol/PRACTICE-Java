
public class Buff {
	private int id;
	private int timer = 1000;
	private boolean aplicado = false;
	
	public Buff () {
		
	}
	
	public Buff(int id) {
		
		this.setId(id);
		
	}

	public int getTimer() {
		return timer;
	}

	public void setTimer(int timer) {
		this.timer = timer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isAplicado() {
		return aplicado;
	}

	public void setAplicado(boolean aplicado) {
		this.aplicado = aplicado;
	}
	
	public void aplicarBufo(int id, Jugador jugador ) {
		
		if (id == 1) jugador.getTamaño().setAltura(jugador.getTamaño().getAltura() + 30);
		else if (id == 2) jugador.getTamaño().setAltura(jugador.getTamaño().getAltura() - 15);
		else if (id == 3) {
			for(int i = 0; i < jugador.getPartida().bolas.size(); i++) {
				jugador.getPartida().bolas.get(i).setSpeed( jugador.getPartida().bolas.get(i).getSpeed() + 1);
			}
		}
		else if (id == 4) jugador.setVidas( jugador.getVidas() +  1);
		else if (id == 5) {
			for(int i = 0; i < jugador.getPartida().bolas.size(); i++) {
				jugador.getPartida().bolas.get(i).setSpeed( jugador.getPartida().bolas.get(i).getSpeed() - 1);
			}
		}
		else if (id == 6) {
			
			jugador.getPartida().bolas.add( new Boliche( Boliche.TAMAÑODEFAULT, jugador.getPartida().bolas.get(0).getCordenada(), new Vector(jugador.getPartida().bolas.get(0).getVector().getAceleracionX() * -1, jugador.getPartida().bolas.get(0).getVector().getAceleracionY()),jugador.getPartida()));
			
		}
		
	}
	
	public void resetBufo(int id, Jugador jugador ) {
		
		if (id == 1) jugador.getTamaño().setAltura(jugador.getTamaño().getAltura() - 30);
		else if (id == 2) jugador.getTamaño().setAltura(jugador.getTamaño().getAltura() + 15);
		else if (id == 3) {
			for(int i = 0; i < jugador.getPartida().bolas.size(); i++) {
				jugador.getPartida().bolas.get(i).setSpeed( jugador.getPartida().bolas.get(i).getSpeed() - 1);
			}
		}
		else if (id == 5) {
			for(int i = 0; i < jugador.getPartida().bolas.size(); i++) {
				jugador.getPartida().bolas.get(i).setSpeed( jugador.getPartida().bolas.get(i).getSpeed() + 1);
			}
		}
		
	}
	
	
}

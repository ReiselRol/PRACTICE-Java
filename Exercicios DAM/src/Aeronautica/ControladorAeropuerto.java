package Aeronautica;

import java.util.ArrayList;

public class ControladorAeropuerto {

	public ArrayList<Avion> aviones = new ArrayList<Avion>();
	
	public static void main(String[] args) {

		ControladorAeropuerto a = new ControladorAeropuerto();
		a.principal();

	}
	private void principal() {
		
		boolean finalizado = false;
		
		do{
			
			finalizado = menuPrincipal();
			
		} while (finalizado == false);
		
	}
	private boolean menuPrincipal() {
		
		int opcion = Interface.menuPrincipal();
		if (opcion == 1 ) {
			
			menuControladorAereo();
			return false;
			
		}
		else if (opcion == 2) {
			
			menuControladorAviones();
			return false;
			
		}
		else return true;
		
	}
	private void menuControladorAereo() {
		
		final int OPCIONVOLVER = 7;
		int opcion = 0;
		boolean finalizado = false;
		
		do {
			
			opcion = Interface.menuControladorAereo();
			
			if ( opcion == OPCIONVOLVER ) finalizado = true;
			else if ( opcion == 1 && puedeAñadir()) añadirAvion();
			else if ( opcion == 2 && puedeAñadir()) Engine.añadirAvionRandom(aviones);
			else if ( (opcion == 1 || opcion == 2) && puedeAñadir() == false) Interface.noPuedeAñadir();
			else if ( opcion == 3) menuControladorAviones();
			else if ( opcion == 4) {
				
				mantenimientoEspacio();
				Interface.mostrarAviones(aviones); 
			}
			else if ( opcion == 5) encriptarAviones();
			else if ( opcion == 6) desencriptarAviones();
						
		} while (finalizado == false);
		
	}
	private void menuControladorAviones() {
		
		final int OPCIONVOLVER = 12;
		int opcion = 0;
		boolean finalizado = false;
		boolean esCombate = false;
		int avionSeleccionado = -1;
			
		do {
			
			esCombate = (avionSeleccionado == -1) ? false : (aviones.get(avionSeleccionado) instanceof Combate);
			opcion = Interface.menuControladorAviones(esCombate);
			
			if ( ((opcion == OPCIONVOLVER) && (esCombate)) || ((opcion == OPCIONVOLVER - 1) && (esCombate == false)) ) finalizado = true;
			else if ( opcion == 1 ) avionSeleccionado = seleccionarAvion();
			else if ( opcion == 2) {
				
				if ( avionSeleccionado == -1 ) Interface.noHayAvionSeleccionado();
				else aviones.set(avionSeleccionado, encenderMotores(aviones.get(avionSeleccionado)));
				
			}
			else if ( opcion == 3) {
				
				if ( avionSeleccionado == -1 ) Interface.noHayAvionSeleccionado();
				else aviones.set(avionSeleccionado, apagarMotores(aviones.get(avionSeleccionado)));
				
			}
			else if ( opcion == 4) {
				
				if ( avionSeleccionado == -1 ) Interface.noHayAvionSeleccionado();
				else aviones.set(avionSeleccionado, accelerarAvion(aviones.get(avionSeleccionado)));
				
			}
			else if ( opcion == 5) {
				
				if ( avionSeleccionado == -1 ) Interface.noHayAvionSeleccionado();
				else aviones.set(avionSeleccionado, frenarAvion(aviones.get(avionSeleccionado)));
				
			}
			else if ( opcion == 6) {
				
				if ( avionSeleccionado == -1 ) Interface.noHayAvionSeleccionado();
				else aviones.set(avionSeleccionado, ascenderAvion(aviones.get(avionSeleccionado)));
				
			}
			else if ( opcion == 7) {
				
				if ( avionSeleccionado == -1 ) Interface.noHayAvionSeleccionado();
				else aviones.set(avionSeleccionado, descenderAvion(aviones.get(avionSeleccionado)));
				
			}
			else if ( opcion == 8) {
				
				if ( avionSeleccionado == -1 ) Interface.noHayAvionSeleccionado();
				else aviones.set(avionSeleccionado, trenAterrizage(aviones.get(avionSeleccionado)));
				
			}
			else if ( opcion == 9) {
				
				if ( avionSeleccionado == -1 ) Interface.noHayAvionSeleccionado();
				else aviones.set(avionSeleccionado, coordenadasAvion(aviones.get(avionSeleccionado)));
				
			}
			else if ( ((opcion == 11) && (esCombate)) || ((opcion == 10) && (esCombate == false))) avionSeleccionado = -1;
			
		} while (finalizado == false);
		
	}
	private void añadirAvion() {
		
		boolean esCombate = (Interface.preguntarEsDeCombate().equalsIgnoreCase("si")) ? true : false;
		if (esCombate) rellenarDatosCombate();
		else rellenarDatosAvion();
		
	}
	private boolean puedeAñadir() {
		
		final int MAXIMOAVIONES = 10;
		if ( MAXIMOAVIONES <= aviones.size()) return false;
		else return true;
		
	}
	private boolean hayAviones() {
		
		if ( aviones.size() > 0) return true;
		else return false;
		
	}
	private void rellenarDatosAvion() {
		
		Cordenada cordenadas = new Cordenada(Interface.preguntarCordenadas('x'),Interface.preguntarCordenadas('y'),Interface.preguntarAltura());
		
		String Matricula;
		if (!hayAviones()) Matricula = (Interface.preguntarMatricula());
		else {
			do {
				
				Matricula = (Interface.preguntarMatricula());
				if (existeMatricula(Matricula)) System.err.print("\n [E] esa matricula ya ha sido introducida");
				
			} while(existeMatricula(Matricula));
		}
		String Marca = (Interface.preguntarMarca());
		String Modelo = (Interface.preguntarModelo());
		int Capacitat = (Interface.preguntarCapacidad());
		int Tripulante = (Interface.preguntarTripulantes());
		String Origen = (Interface.preguntarOrigen());
		String Destino = (Interface.preguntarDestino(Origen));
		int Autonomia = (Interface.preguntarAutonomia());
		int Velocitat =(Interface.preguntarVelocidad());
		boolean Motores = ((Interface.preguntarMotores().equalsIgnoreCase("si") ? true : false));
		boolean TrenAterrizage = ((Interface.preguntarTrenAterrizage().equalsIgnoreCase("si") ? true : false));
		
		Avion avion = new Avion(Matricula, Marca, Modelo, Capacitat, Tripulante, Origen, Destino, cordenadas, Autonomia, TrenAterrizage, Motores, Velocitat);
		aviones.add(avion);
		
	}
	private void rellenarDatosCombate() {
		
		Cordenada cordenadas = new Cordenada(Interface.preguntarCordenadas('x'),Interface.preguntarCordenadas('y'),Interface.preguntarAltura());
		String Matricula;
		
		if (!hayAviones()) Matricula = (Interface.preguntarMatricula());
		else {
			do {
				
				Matricula = (Interface.preguntarMatricula());
				if (existeMatricula(Matricula)) System.err.print("\n [E] esa matricula ya ha sido introducida");
				
			} while(existeMatricula(Matricula));
		}
		String Marca = (Interface.preguntarMarca());
		String Modelo = (Interface.preguntarModelo());
		int Capacitat = (Interface.preguntarCapacidad());
		int Tripulante = (Interface.preguntarTripulantes());
		String Origen = (Interface.preguntarOrigen());
		String Destino = (Interface.preguntarDestino(Origen));
		int Autonomia = (Interface.preguntarAutonomia());
		int Velocitat = (Interface.preguntarVelocidad());
		boolean Motores = ((Interface.preguntarMotores().equalsIgnoreCase("si") ? true : false));
		boolean TrenAterrizage = ((Interface.preguntarTrenAterrizage().equalsIgnoreCase("si") ? true : false));
		
		Misil [] misiles = new Misil[Interface.preguntarMisiles()];
		int DistanciaDisparar = (Interface.preguntarDistancia());
		boolean Amigo = ((Interface.preguntarAliado().equalsIgnoreCase("si") ? true : false));
		
		Combate combate = new Combate(Matricula, Marca, Modelo, Capacitat, Tripulante, Origen, Destino, cordenadas, Autonomia, TrenAterrizage, Motores, Velocitat, misiles, DistanciaDisparar, Amigo);
		aviones.add(combate);
		
	}
	private boolean existeMatricula (String matricula) {
		
		boolean hayCoencidencias = false;
		for (int i = 0; i < aviones.size(); i++) {
			
			if (matricula.equalsIgnoreCase(aviones.get(i).getMatricula())) hayCoencidencias = true;
			
		}
		return hayCoencidencias;
	}
	private int posicionAvion (String matricula) {
		
		int posicion;
		
		for (posicion = 0; posicion < aviones.size(); posicion++) {
			
			if (matricula.equalsIgnoreCase(aviones.get(posicion).getMatricula())) break;
			
		}
		return posicion;
	}
	private int seleccionarAvion() {
		
		String matricula;
		
		if (hayAviones()) {
			
			matricula = Interface.preguntarMatricula();
			
			if (existeMatricula(matricula)) return posicionAvion(matricula);
			else {
				
				Interface.noHayMatricula();
				return -1;
			}
			
			
		}
		else {
			
			Interface.noHayAviones();
			return -1;
		}
		
	}
	private Avion encenderMotores (Avion avion) {
		
		boolean deseasContinuar = ( (Interface.preguntarEncenderMotores().equals("si")) ) ? true : false;
		
		if (deseasContinuar == true) {
			
			avion.encenderMotores();
			return avion;
			
		}
		else return avion;
		
	}
	private Avion apagarMotores (Avion avion) {
		
		boolean deseasContinuar = ( (Interface.preguntarApagarMotores().equals("si")) ) ? true : false;
		
		if (deseasContinuar == true) {
			
			avion.apagarMotores();
			return avion;
			
		}
		else return avion;
		
	}
	private Avion accelerarAvion (Avion avion) {
		
		int cuantoDeseasAñadir = Interface.preguntarCuantaVelocidadAccelerar();
		avion.acelerarAvion(cuantoDeseasAñadir);
		return avion;
		
	}
	private Avion frenarAvion (Avion avion) {
		
		int cuantoDeseasreducir = Interface.preguntarCuantaVelocidadFrenar();
		avion.frenarAvion(cuantoDeseasreducir);
		return avion;
		
	}
	private Avion ascenderAvion (Avion avion) {
		
		int cuantoDeseasAñadir = Interface.preguntarCuantaAlturaAscender();
		avion.elevarAvion(cuantoDeseasAñadir);
		return avion;
		
	}
	private Avion descenderAvion (Avion avion) {
		int cuantoDeseasAñadir;
		do {
			
			cuantoDeseasAñadir = Interface.preguntarCuantaAlturaDescender();
			if (avion.getCordenadas().getAltura() - cuantoDeseasAñadir < 0) Interface.noPuedesDescender();
			
		} while (avion.getCordenadas().getAltura() - cuantoDeseasAñadir < 0);
		avion.descenderAvion(cuantoDeseasAñadir);
		return avion;
		
	}
	private Avion trenAterrizage (Avion avion) {
		boolean estadoTren = ( (Interface.preguntarApagarMotores().equals("si")) ) ? true : false;
		avion.esstadoTrenAterizage(estadoTren);
		return avion;
	}
	private Avion coordenadasAvion(Avion avion) {
		avion.setCordenadas(Interface.preguntarCordenadas('x'),Interface.preguntarCordenadas('y'));
		return avion;
	}
	private Combate encriptarAvion(Combate combate) {
		
		combate.encriptar();
		return combate;
		
	}
	private void encriptarAviones() {
		
		int avionesEncriptados = 0;
		for (int i = 0; i < aviones.size(); i++) {
			if (aviones.get(i) instanceof Combate) {
				if ( ((Combate) aviones.get(i)).getAmigo() && (((Combate) aviones.get(i)).getEncriptado() == false)) {
					aviones.set(i, encriptarAvion((Combate) aviones.get(i)));
					avionesEncriptados ++;
				}
			}
		}
		Interface.avionesEncriptados(avionesEncriptados);
		
	}
	private Combate desencriptarAvion(Combate combate) {
		
		combate.desencriptar();
		return combate;
		
	}
	private void desencriptarAviones() {
		
		int avionesEncriptados = 0;
		for (int i = 0; i < aviones.size(); i++) {
			if (aviones.get(i) instanceof Combate) {
				if ( ((Combate) aviones.get(i)).getAmigo() && (((Combate) aviones.get(i)).getEncriptado() == true)) {
					aviones.set(i, desencriptarAvion((Combate) aviones.get(i)));
					avionesEncriptados++;
				}
			}
		}
		Interface.avionesDesencriptados(avionesEncriptados);
		
	}
	private void mantenimientoEspacio() {
		
		ArrayList<Integer> avionesBorrar = new ArrayList<Integer>();
		
		for (int i = 0; i < aviones.size(); i++) {
			
			if (estaFuera(aviones.get(i))) avionesBorrar.add(i);
			
		}
		borrarAviones(avionesBorrar);
	}
	private boolean estaFuera (Avion avion) {
		
		int y = avion.getCordenadas().getY();
		int x = avion.getCordenadas().getX();
		
		return (x <= 100 && y <= 100) ? false : true;
	}
	private void borrarAviones(ArrayList<Integer> listaBorrar) {
		
		int avionesABorrar = listaBorrar.size();
		int maximo = -1;
		
		for (int i = 0; i < avionesABorrar ; i++) {
			
			for (int j = 0; j < listaBorrar.size(); j++) {
				
				if (maximo < listaBorrar.get(i)) maximo = listaBorrar.get(i);
				
			}
			aviones.remove(maximo);
			maximo = -1;
			
		}
	}
	public static boolean estanCerca(Avion avion, Avion avionComparar) {
		
		int altura,x,y;
		
		altura = avion.getCordenadas().getAltura() - avionComparar.getCordenadas().getAltura();
		if (altura < 0) altura *= -1;
		
		x = avion.getCordenadas().getX() - avionComparar.getCordenadas().getX();
		if (x < 0) x *= -1;
		
		y = avion.getCordenadas().getY() - avionComparar.getCordenadas().getY();
		if (y < 0) y *= -1;
		
		if ((x <= 50 || y <= 50) && altura <= 500) return true;
		else return false;
		
	}

}

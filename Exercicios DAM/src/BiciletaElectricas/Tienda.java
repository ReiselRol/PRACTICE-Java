package BiciletaElectricas;

import java.util.ArrayList;

public class Tienda {

	private String nombre;
	private String direccion;
	public ArrayList<Bicicleta> bicicletas = new ArrayList<Bicicleta>();
	
	public Tienda () {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}

package co.edu.unbosque.model;

import java.io.Serializable;

public class ClientesDTO implements Serializable{
	
	private long cedula;
	private String nombre;
	private String direccion;
	private int telefono; 
	
	public ClientesDTO(long cedula, String nombre, String direccion, int telefono) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;

	}

	
	public long getCedula() {
		return cedula;
	}
	public void setCedula(long cedula) {
		this.cedula = cedula;
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

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	@Override
	public String toString() {
		return "ClientesDTO [cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono="
				+ telefono + "]";
	}
}


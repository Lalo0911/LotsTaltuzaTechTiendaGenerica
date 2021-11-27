package co.edu.unbosque.model;

import java.io.Serializable;

public class ClientesDTO implements Serializable{
	
	private String cedula;
	private String nombre;
	private String direccion;
	private String correo;
	private String telefono; 
	
	public ClientesDTO(String cedula, String nombre, String direccion, String telefono,String correo) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;

	}

	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public String toString() {
		return "ClientesDTO [cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + ", correo="
				+ correo + ", telefono=" + telefono + "]";
	}

	
}


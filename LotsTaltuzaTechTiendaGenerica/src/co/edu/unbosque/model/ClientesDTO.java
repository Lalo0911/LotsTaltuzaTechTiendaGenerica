package co.edu.unbosque.model;

import java.io.Serializable;
import java.util.ArrayList;

public class ClientesDTO implements Serializable{
	
	private String cedula;
	private String nombre;
	private String direccion;
	private String correo;
	private String telefono; 
	private String historialVentas;
	private String detallerDeVentas;
	
	public ClientesDTO(String cedula, String nombre, String direccion, String telefono,String correo) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;	
		this.historialVentas="";
		this.detallerDeVentas="";
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




	public String getHistorialVentas() {
		return historialVentas;
	}


	public void setHistorialVentas(String historialVentas) {
		this.historialVentas = historialVentas;
	}


	public String getDetallerDeVentas() {
		return detallerDeVentas;
	}


	public void setDetallerDeVentas(String detallerDeVentas) {
		this.detallerDeVentas = detallerDeVentas;
	}


	public String toString() {
		return "Cedula-" + cedula + ", Nombre-" + nombre + ", Direccion-" + direccion + ", Correo "+ correo + ", Telefono-" + telefono;
	}

	
}


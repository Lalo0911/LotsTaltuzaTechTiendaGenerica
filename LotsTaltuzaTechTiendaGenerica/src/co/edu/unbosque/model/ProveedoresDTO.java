package co.edu.unbosque.model;

import java.io.Serializable;

public class ProveedoresDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private long nit;
	private String nombreProveedor;
	private String direccion;
	private int telefono;
	private String ciudad;
	
	public ProveedoresDTO(long nit, String nombreProveedor, String direccion, int telefono, String ciudad) {
		super();
		this.nit = nit;
		this.nombreProveedor = nombreProveedor;
		this.direccion = direccion;
		this.telefono = telefono;
		this.ciudad = ciudad;
	}

	public long getNit() {
		return nit;
	}

	public void setNit(long nit) {
		this.nit = nit;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
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

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String toString() {
		return "Proveedores [nit=" + nit + ", nombreProveedor=" + nombreProveedor + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", ciudad=" + ciudad + "]";
	}

}

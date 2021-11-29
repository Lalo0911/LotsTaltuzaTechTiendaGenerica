package co.edu.unbosque.model;

import java.io.Serializable;

public class ProveedoresDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String nit;
	private String nombreProveedor;
	private String direccion;
	private String telefono;
	private String ciudad;
	private String totalDeComprasProveedor;
	
	public ProveedoresDTO(String nit, String nombreProveedor, String direccion, String telefono, String ciudad) {
		super();
		this.nit = nit;
		this.nombreProveedor = nombreProveedor;
		this.direccion = direccion;
		this.telefono = telefono;
		this.ciudad = ciudad;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTotalDeComprasProveedor() {
		return totalDeComprasProveedor;
	}

	public void setTotalDeComprasProveedor(String totalDeComprasProveedor) {
		this.totalDeComprasProveedor = totalDeComprasProveedor;
	}

	public String toString() {
		return "Proveedores [nit=" + nit + ", nombreProveedor=" + nombreProveedor + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", ciudad=" + ciudad + "]";
	}

}

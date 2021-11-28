package co.edu.unbosque.model;

import java.io.Serializable;

public class ProductosDTO implements Serializable{

	private String codigoProducto;
	private String nombreProducto;
	private String nitProveedor;
	private String precioCompraProducto;
	private String precioVentaProducto;

	public ProductosDTO(String codigoProducto, String nombreProducto, String nitProveedor, String precioCompraProducto,
			String precioVentaProducto) {
		super();
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
		this.nitProveedor = nitProveedor;
		this.precioCompraProducto = precioCompraProducto;
		this.precioVentaProducto = precioVentaProducto;
	}
	
	public String getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getNitProveedor() {
		return nitProveedor;
	}
	public void setNitProveedor(String nitProveedor) {
		this.nitProveedor = nitProveedor;
	}
	public String getPrecioCompraProducto() {
		return precioCompraProducto;
	}
	public void setPrecioCompraProducto(String precioCompraProducto) {
		this.precioCompraProducto = precioCompraProducto;
	}
	public String getPrecioVentaProducto() {
		return precioVentaProducto;
	}
	public void setPrecioVentaProducto(String precioVentaProducto) {
		this.precioVentaProducto = precioVentaProducto;
	}
	@Override
	public String toString() {
		return "Código Producto-" + codigoProducto + ", Nombre Proveedor-" + nombreProducto
				+ ", Nit Proveedor-" + nitProveedor + ", Precio Compra Producto-" + precioCompraProducto
				+ ", Precio Venta Producto-" + precioVentaProducto;
	}

}

package co.edu.unbosque.model;

public class ProductosDTO {

	private int codigoProducto;
	private String nombreProveedor;
	private int nitProveedor;
	private int precioCompraProducto;
	private int precioVentaProducto;

	public ProductosDTO(int codigoProducto, String nombreProveedor, int nitProveedor, int precioCompraProducto,
			int precioVentaProducto) {
		super();
		this.codigoProducto = codigoProducto;
		this.nombreProveedor = nombreProveedor;
		this.nitProveedor = nitProveedor;
		this.precioCompraProducto = precioCompraProducto;
		this.precioVentaProducto = precioVentaProducto;
	}
	
	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getNombreProveedor() {
		return nombreProveedor;
	}
	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}
	public int getNitProveedor() {
		return nitProveedor;
	}
	public void setNitProveedor(int nitProveedor) {
		this.nitProveedor = nitProveedor;
	}
	public int getPrecioCompraProducto() {
		return precioCompraProducto;
	}
	public void setPrecioCompraProducto(int precioCompraProducto) {
		this.precioCompraProducto = precioCompraProducto;
	}
	public int getPrecioVentaProducto() {
		return precioVentaProducto;
	}
	public void setPrecioVentaProducto(int precioVentaProducto) {
		this.precioVentaProducto = precioVentaProducto;
	}
	@Override
	public String toString() {
		return "Productos [codigoProducto=" + codigoProducto + ", nombreProveedor=" + nombreProveedor
				+ ", nitProveedor=" + nitProveedor + ", precioCompraProducto=" + precioCompraProducto
				+ ", precioVentaProducto=" + precioVentaProducto + "]";
	}

}

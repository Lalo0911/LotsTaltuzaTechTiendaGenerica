package co.edu.unbosque.model;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistence.BinariosFile;

public class ProductosDAO implements Crud{

	
	private ArrayList<ProductosDTO> productos;
	private BinariosFile bF;
	private File f;
	
	

	public ProductosDAO() 
	{
		productos = new ArrayList<ProductosDTO>();
		bF = new BinariosFile();
		
	}
	
	public void rellenar(){
		if(bF.leerArchivoProductos()!=null) {
		productos=bF.leerArchivoProductos();
		bF.escribirArchivoProductos(productos);	
		}
		
	}
	
	public boolean Verificar(String codigoDelProducto) {
		boolean repetida = false;
		
		if(bF.leerArchivoProductos()!=null) {	
			for (int i = 0; i < bF.leerArchivoProductos().size(); i++) {
				if(bF.leerArchivoProductos().get(i).getCodigoProducto().equals(codigoDelProducto)) {
					repetida= true;
				}	
			}
		}
		
		return repetida;
	}
	
	public void agregarProducto(ProductosDTO productos1, int num){
		if(num==1) {
			productos.add(productos1);
			bF.escribirArchivoProductos(productos);
		}
		else {
			if(bF.leerArchivoProductos()!=null) {
				productos=bF.leerArchivoProductos();
				productos.add(productos1);
				bF.escribirArchivoProductos(productos);
			}
			else {
				productos.add(productos1);
				bF.escribirArchivoProductos(productos);
			}
		}
	}
	   
	public String leer() {
		
		String respuesta= "";
		
		try{
			
		for(int i=0;i<bF.leerArchivoProductos().size();i++){
			respuesta =
					
		                "Codigo del producto: "+bF.leerArchivoProductos().get(i).getCodigoProducto()+
		                " Nombre del producto: " +bF.leerArchivoProductos().get(i).getNombreProducto()+
		                " Nit del proveedor del producto: " +bF.leerArchivoProductos().get(i).getNitProveedor()+
		                " Precio de compra del producto: " +bF.leerArchivoProductos().get(i).getPrecioCompraProducto()+	
		                " Precio de venta del producto: " +bF.leerArchivoProductos().get(i).getPrecioVentaProducto()+"\n"+respuesta;
		}	
			
		}catch(Exception e){

       }
		return respuesta;
	}
	
	public ProductosDTO buscarProducto(String codigo) {

		ProductosDTO encontrar = null;

		if(bF.leerArchivoProductos()!=null) {	
			for (int i = 0; i < bF.leerArchivoProductos().size(); i++) {
				if(bF.leerArchivoProductos().get(i).getCodigoProducto().equals(codigo)) {
					encontrar= productos.get(i);
				}	
			}
		}
		return encontrar;
	}

	public void actualizarProducto(String codigoProductoActualizar,String codigoProducto, String nombreProducto, String nitProveedor, String precioCompraProducto,
			String precioVentaProducto){
		if(buscarProducto(codigoProductoActualizar)!=null) 
		{ 
			ProductosDTO encontrar = new ProductosDTO(codigoProducto,nombreProducto,nitProveedor,precioCompraProducto,precioVentaProducto);
			eliminarProducto(codigoProductoActualizar);
			agregarProducto(encontrar,1);
		}
	}

public void eliminarProducto(String codigoProducto){

		if(buscarProducto(codigoProducto) != null){ 

			f= new File("./Data/productos.dat");
			bF.eliminarFichero(f);
			productos.remove(buscarProducto(codigoProducto));			
			bF.escribirArchivoProductos(productos);

		}
		else{
			
		}
	}

	
	public BinariosFile getbF() {
		return bF;
	}
	public void setbF(BinariosFile bF) {
		this.bF = bF;
	}
	
	public ArrayList<ProductosDTO> getProductos() {
		return productos;
	}

	public File getF() {
		return f;
	}

	public void setF(File f) {
		this.f = f;
	}

}



package co.edu.unbosque.model;
import java.io.File;
import java.util.ArrayList;
import co.edu.unbosque.model.persistence.BinariosFile;


public class ProveedoresDAO implements Crud{
	
	private ArrayList<ProveedoresDTO> proveedores;
	private BinariosFile bF;
	private File f;
	
	

	public ProveedoresDAO() 
	{
		proveedores = new ArrayList<ProveedoresDTO>();
		bF = new BinariosFile();	
	}
	
	public boolean Verificar(String nit) {
		boolean repetida = false;
		
		if(bF.leerArchivoProveedores()!=null) {	
			for (int i = 0; i < bF.leerArchivoProveedores().size(); i++) {
				if(bF.leerArchivoProveedores().get(i).getNit().equals(nit)) {
					repetida= true;
				}	
			}
		}
		
		return repetida;
	}
	
	public void rellenar(){
		if(bF.leerArchivoProveedores()!=null) {
		proveedores=bF.leerArchivoProveedores();
		bF.escribirArchivoProveedores(proveedores);		
		}
	}
	
	public void agregarProveedor(ProveedoresDTO proveedoruno, int num){
		if(num==1) {
			proveedores.add(proveedoruno);
			bF.escribirArchivoProveedores(proveedores);
		}
		else {
			if(bF.leerArchivoProveedores()!=null) {
				proveedores=bF.leerArchivoProveedores();
				proveedores.add(proveedoruno);
				bF.escribirArchivoProveedores(proveedores);
			}
			else {
				proveedores.add(proveedoruno);
				bF.escribirArchivoProveedores(proveedores);
			}
		}
	}
	
	public String leer() {
		
		String respuesta= "";
		
		 try{
			 
			for(int i=0;i<bF.leerArchivoProveedores().size();i++){
			respuesta =
		                "NIT: "+bF.leerArchivoProveedores().get(i).getNit()+
		                " Nombre del proveedor: " +bF.leerArchivoProveedores().get(i).getNombreProveedor()+
		                " Direccion: " +bF.leerArchivoProveedores().get(i).getDireccion()+
		                " Telefono: " +bF.leerArchivoProveedores().get(i).getTelefono()+	
		                " Ciudad: " +bF.leerArchivoProveedores().get(i).getCiudad()+
		                "\n"+respuesta;
		     } 
			 
		 }catch(Exception e){
	   
         }
		return respuesta;
	    }
	
	public ProveedoresDTO buscarProveedor(String nit) {

		ProveedoresDTO encontrar = null;

		if(bF.leerArchivoProveedores()!=null) {	
			for (int i = 0; i < bF.leerArchivoProveedores().size(); i++) {
				if(bF.leerArchivoProveedores().get(i).getNit().equals(nit)) {
					encontrar= proveedores.get(i);
				}	
			}
		}
		return encontrar;
	}
	
	public void actualizarProveedor(String nitBuscar,String nit, String nombreProveedor, String direccion, String telefono, String ciudad){
		if(buscarProveedor(nitBuscar)!=null) 
		{ 
			ProveedoresDTO encontrar = new ProveedoresDTO(nit, nombreProveedor, direccion, telefono, ciudad);
			eliminarProveedor(nitBuscar);
			agregarProveedor(encontrar,1);
		}
	}
	
	public void eliminarProveedor(String nit){

		if(buscarProveedor(nit) != null){ 

			f= new File("./Data/proveedores.dat");
			bF.eliminarFichero(f);
			proveedores.remove(buscarProveedor(nit));			
			bF.escribirArchivoProveedores(proveedores);

		}
		else{
			
		}
	}

	public ArrayList<ProveedoresDTO> getProveedores() {
		return proveedores;
	}

	public BinariosFile getbF() {
		return bF;
	}

	public File getF() {
		return f;
	}

}

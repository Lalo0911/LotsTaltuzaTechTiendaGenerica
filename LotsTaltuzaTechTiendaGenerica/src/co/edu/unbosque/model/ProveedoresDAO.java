package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.BinariosFile;

public class ProveedoresDAO {

	
	private ArrayList<ProveedoresDTO> proveedores;
	private BinariosFile bF;
	

	public ProveedoresDAO() 
	{
		proveedores = new ArrayList<ProveedoresDTO>();
		bF = new BinariosFile();
		
	}
	public void agregarCliente(ProveedoresDTO proveedores1){
		if(bF.leerArchivoClientes()!=null) {
		proveedores = bF.leerArchivoProveedores();
		proveedores.add(proveedores1);
	    bF.escribirArchivoProveedores(proveedores);
		}
		else {
			proveedores.add(proveedores1);
			bF.escribirArchivoProveedores(proveedores);
		}
	}
	public String leerProveedor(){
	      String respuesta= "";
	    
				for(int i=0;i<bF.leerArchivoProveedores().size();i++){
		respuesta =
		"Nit: "+bF.leerArchivoProveedores().get(i).getNit()+
		" Nombre: " +bF.leerArchivoProveedores().get(i).getNombreProveedor()+
		" Dirección: " +bF.leerArchivoProveedores().get(i).getDireccion()+
		" Telefono: " +bF.leerArchivoProveedores().get(i).getTelefono()+	
		" Ciudad: " +bF.leerArchivoProveedores().get(i).getCiudad()+"\n"+respuesta;	
				}
	       return respuesta;
	    }
	public ProveedoresDTO buscarProveedores(long nit) {
		
		ProveedoresDTO encontrar = null;
		if(bF.leerArchivoProveedores()!=null) 
		{	
			for (int i = 0; i < bF.leerArchivoProveedores().size(); i++) 
			{
				if(bF.leerArchivoProveedores().get(i).getNit()==(nit)) 
				{
					encontrar= bF.leerArchivoProveedores().get(i);
				}	
			}
		}
		return encontrar;
	}

	public void actualizarCliente(long nit, long nit1, String nombre, String direccion, int telefono, String ciudad)
	{

		if(buscarProveedores(nit)!=null) 
		{
			buscarProveedores(nit).setNit(nit1);
			buscarProveedores(nit).setNombreProveedor(nombre);
			buscarProveedores(nit).setDireccion(direccion);
			buscarProveedores(nit).setTelefono(telefono);
			buscarProveedores(nit).setCiudad(ciudad);
		}
	}

	@SuppressWarnings("unlikely-arg-type")
	public void eliminarCliente(long nit) 
	{
		if(buscarProveedores(nit) != null) 
		{
			bF.leerArchivoClientes().remove(buscarProveedores(nit));
		}
	}
	public BinariosFile getbF() {
		return bF;
	}
	public void setbF(BinariosFile bF) {
		this.bF = bF;
	}
	public ArrayList<ProveedoresDTO> getProveedores() {
		return proveedores;
	}
	public void setProveedores(ArrayList<ProveedoresDTO> proveedores) {
		this.proveedores = proveedores;
	}



}



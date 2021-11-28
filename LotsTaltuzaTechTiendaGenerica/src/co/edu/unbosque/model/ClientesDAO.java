package co.edu.unbosque.model;
import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.persistence.BinariosFile;

public class ClientesDAO implements Crud{


	private ArrayList<ClientesDTO> clientes;
	private BinariosFile bF;
	private File f;


	public ClientesDAO() 
	{
		clientes = new ArrayList<ClientesDTO>();
		bF = new BinariosFile();

	}

	public void agregarCliente(ClientesDTO clientes1, int num){
		if(num==1) {
			clientes.add(clientes1);
			bF.escribirArchivoClientes(clientes);
		}
		else {
			if(bF.leerArchivoClientes()!=null) {
				clientes=bF.leerArchivoClientes();
				clientes.add(clientes1);
				bF.escribirArchivoClientes(clientes);
			}
			else {
				clientes.add(clientes1);
				bF.escribirArchivoClientes(clientes);
			}
		}
	}
	
	public String leer() {
		String respuesta= "";

		for(int i=0;i<clientes.size();i++){
			respuesta =
					"Documento: "+bF.leerArchivoClientes().get(i).getCedula()+
					" Nombre: " +bF.leerArchivoClientes().get(i).getNombre()+
					" Direccion: " +bF.leerArchivoClientes().get(i).getDireccion()+
					" Telefono: " +bF.leerArchivoClientes().get(i).getTelefono()
					+"Correo: " +bF.leerArchivoClientes().get(i).getCorreo()+
					"\n"+respuesta;	
		}
		return respuesta;
	}
	
	
	public ClientesDTO buscarClientes(String cedula) {

		ClientesDTO encontrar = null;

		if(clientes!=null) {	
			for (int i = 0; i < clientes.size(); i++) {
				if(clientes.get(i).getCedula().equals(cedula)) {
					encontrar= clientes.get(i);
				}	
			}
		}
		return encontrar;
	}

	public void actualizarCliente(String cedula, String cedula1, String nombre, String direccion, String telefono,String correo){
		if(buscarClientes(cedula)!=null) 
		{ 
			ClientesDTO encontrar = new ClientesDTO(cedula1, nombre, direccion, telefono,correo);
			eliminarCliente(cedula);
			agregarCliente(encontrar,1);

		}
	}

	public void eliminarCliente(String cedula){

		if(buscarClientes(cedula) != null){ 

			f= new File("./Data/clientes.dat");
			bF.eliminarFichero(f);
			clientes.remove(buscarClientes(cedula));		
			bF.escribirArchivoClientes(clientes);

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

	public ArrayList<ClientesDTO> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<ClientesDTO> clientes) {
		this.clientes = clientes;
	}

	

}




package co.edu.unbosque.model;

import java.io.File;
import java.util.ArrayList;

import co.edu.unbosque.model.persistence.BinariosFile;

public class ClientesDAO {


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
	public String leerCliente(){
		String respuesta= "";

		for(int i=0;i<clientes.size();i++){
			respuesta =
				"Documento: "+bF.leerArchivoClientes().get(i).getCedula()+
				" Nombre: " +bF.leerArchivoClientes().get(i).getNombre()+
				" Dirección: " +bF.leerArchivoClientes().get(i).getDireccion()+
				" Telefono: " +bF.leerArchivoClientes().get(i).getTelefono()+	
				" Ciudad: " +bF.leerArchivoClientes().get(i).getCiudad()+"\n"+respuesta;	
		}
		return respuesta;
	}
	public ClientesDTO buscarClientes(long cedula) {

		ClientesDTO encontrar = null;
		clientes = bF.leerArchivoClientes();
		if(clientes!=null) 
		{	
			for (int i = 0; i < clientes.size(); i++) 
			{
				if(clientes.get(i).getCedula()==cedula) 
				{
					encontrar= clientes.get(i);
				}	
			}
		}
		return encontrar;
	}

	public void actualizarCliente(long cedula, long cedula1, String nombre, String direccion, int telefono, String ciudad){
		if(buscarClientes(cedula)!=null) 
		{

			buscarClientes(cedula).setCedula(cedula1);
			buscarClientes(cedula).setNombre(nombre);
			buscarClientes(cedula).setDireccion(direccion);
			buscarClientes(cedula).setTelefono(telefono);
			buscarClientes(cedula).setCiudad(ciudad);
			agregarCliente(buscarClientes(cedula),1);

		}
	}

	public void eliminarCliente(long cedula){
		
		if(buscarClientes(cedula) != null) 
		{
			f=new File("./Data/clientes.dat");
			clientes.remove(buscarClientes(cedula));
			System.out.println(bF.eliminarFichero(f));
			bF.escribirArchivoClientes(clientes);

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



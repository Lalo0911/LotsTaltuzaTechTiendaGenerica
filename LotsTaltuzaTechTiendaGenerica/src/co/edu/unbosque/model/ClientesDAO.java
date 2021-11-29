package co.edu.unbosque.model;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JOptionPane;

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
	
	public boolean Verificar(String cedula) {
	boolean repetida = false;

	if(bF.leerArchivoClientes()!=null) {	
		for (int i = 0; i < bF.leerArchivoClientes().size(); i++) {
			if(bF.leerArchivoClientes().get(i).getCedula().equals(cedula)) {
				repetida= true;
			}	
		}
	}

	return repetida;
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

   try{
	   
	for(int i=0;i< bF.leerArchivoClientes().size();i++){
			respuesta =
					"Documento: "+bF.leerArchivoClientes().get(i).getCedula()+
					" Nombre: " +bF.leerArchivoClientes().get(i).getNombre()+
					" Direccion: " +bF.leerArchivoClientes().get(i).getDireccion()+
					" Telefono: " +bF.leerArchivoClientes().get(i).getTelefono()
					+"Correo: " +bF.leerArchivoClientes().get(i).getCorreo()+
					"\n"+respuesta;	
		}
		
   }catch(Exception e){
	   
   }
		
	return respuesta;
	}
	
	
	public void rellenar(){
		if(bF.leerArchivoClientes()!=null) {
			clientes=bF.leerArchivoClientes();
			bF.escribirArchivoClientes(clientes);	
		}

	}

	public ClientesDTO buscarClientes(String cedula) {

		ClientesDTO encontrar = null;
		
		if(bF.leerArchivoClientes()!=null) {	
			for (int i = 0; i < bF.leerArchivoClientes().size(); i++) {
				if(bF.leerArchivoClientes().get(i).getCedula().equals(cedula)) {
					encontrar= clientes.get(i);
				}	
			}
		}
		return encontrar;
	}

	public int buscarIndiceClientes(String cedula)
	{
		int indice = -1;
		if(bF.leerArchivoClientes()!=null) {	
			for (int i = 0; i < bF.leerArchivoClientes().size(); i++) {
				if(bF.leerArchivoClientes().get(i).getCedula().equals(cedula)) {
					indice = i;
				}	
			}
		}
		return indice;
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
			clientes.remove(buscarIndiceClientes(cedula));
			bF.eliminarFichero(f);
			bF.escribirArchivoClientes(clientes);

		}
		else{
			
		}
	}
	
	public void actualizarClienteConsulta(String cedula,ClientesDTO clienteAnterior,String historialVentas, String detallesVentas){
		if(buscarClientes(cedula)!=null) 
		{ 	
			clienteAnterior.setHistorialVentas(bF.leerArchivoClientes().get(buscarIndiceClientes(cedula)).getHistorialVentas()+"\n"+historialVentas);
			clienteAnterior.setDetallerDeVentas(bF.leerArchivoClientes().get(buscarIndiceClientes(cedula)).getDetallerDeVentas()+"\n"+detallesVentas);
			eliminarCliente(cedula);
			agregarCliente(clienteAnterior,1);

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



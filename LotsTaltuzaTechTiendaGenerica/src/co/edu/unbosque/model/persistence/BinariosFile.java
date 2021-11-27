package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.ArrayList;
import co.edu.unbosque.model.*;



public class BinariosFile {

	private File f;

	public BinariosFile() {

	}

	public String escribirArchivoClientes(ArrayList<ClientesDTO> clientes) {
		String mensaje="Archivo Generado Exitosamente!";
		f=new File("./Data/clientes.dat");
		try{     
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(f));
			salida.writeObject(clientes);
			salida.close();
		} 
		catch(FileNotFoundException e){     
			mensaje= "No se encontro el archivo"; 
		} 
		catch(IOException e){     
			mensaje = "Error al escribir"; 
		}
		return mensaje;
	}
	
	
	public ArrayList<ClientesDTO> leerArchivoClientes() {
		 ArrayList<ClientesDTO> clientes=null;
		try {
	 		ObjectInputStream in = new ObjectInputStream (new FileInputStream("./Data/clientes.dat")); 
	 		clientes =(ArrayList<ClientesDTO>)in.readObject();
	 		in.close();

		} catch (IOException | ClassNotFoundException e) {
			return null;
		}
		return clientes;
	}
	
	public String escribirArchivoProveedores(ArrayList<ProveedoresDTO> proveedores) {
		String mensaje="Archivo Generado Exitosamente!";
		f=new File("./Data/proveedores.dat");
		try{     
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(f));
			salida.writeObject(proveedores);
			salida.close();
		} 
		catch(FileNotFoundException e){     
			mensaje= "No se encontro el archivo"; 
		} 
		catch(IOException e){     
			mensaje = "Error al escribir"; 
		}
		return mensaje;
	}
	
	public ArrayList<ProveedoresDTO> leerArchivoProveedores() {
		 ArrayList<ProveedoresDTO> proveedores=null;
		try {
	 		ObjectInputStream in = new ObjectInputStream (new FileInputStream("./Data/proveedores.dat")); 
	 		proveedores =(ArrayList<ProveedoresDTO>)in.readObject();
	 		in.close();

		} catch (IOException | ClassNotFoundException e) {
			return null;
		}
		return proveedores;
	}
	
	public String eliminarFichero(File fichero) {
		
		String message= "";
	    if (!fichero.exists()) {
	        message="El archivo data no existe.";
	    } else {
	        fichero.delete();
	        
	        message="El archivo data fue eliminado."+leerArchivoClientes();
	    }
return message;
	}
	
}



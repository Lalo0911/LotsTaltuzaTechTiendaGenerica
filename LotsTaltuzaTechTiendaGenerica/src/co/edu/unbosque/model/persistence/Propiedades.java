package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JFileChooser; 

public class Propiedades { 

	private Properties prop = new Properties(); 
	private String archivoprop = "./Data/config.properties";
	
	public Propiedades() 
	{
		escribirPropiedades("TALTUZA","Electrodomesticos","10554875520","Bogotá D.C.","0.19","0.04","Bancolombia","1598746320","Laura Mateus");
		
	}
	
	public int escribirPropiedades(String nombreTienda, String tipoComercio, String nit, String ciudad,String iva, String tasaInteres, String nombreBanco, String numeroCuenta, String nombreGerente ) {
		try {
			prop.setProperty("NombreTienda", nombreTienda);
			prop.setProperty("TipoComercio", tipoComercio);
			prop.setProperty("Nit", nit);
			prop.setProperty("Ciudad", ciudad);
			prop.setProperty("Iva", iva);
			prop.setProperty("TasaInteres", tasaInteres);
			prop.setProperty("NombreBanco", nombreBanco);
			prop.setProperty("NumeroCuenta", numeroCuenta);
			prop.setProperty("NombreGerente", nombreGerente);
			prop.store(new FileOutputStream(archivoprop), null);
		}catch(IOException ex) {
			return -1;
		}
		return 0;
	}	
	
	
	public String leerPropiedades() {
		String linea = "";
		try {
			prop.load(new FileInputStream(archivoprop));

			prop.list(System.out);
			
			linea += "Nombre Tienda: "+prop.getProperty("NombreTienda");
			linea += "Tipo de comercio: "+prop.getProperty("TipoComercio");
			linea += "NIT de la tienda: "+prop.getProperty("Nit");
			linea += "Ciudad de Ubicación: "+prop.getProperty("Ciudad");
			linea += "Valor de IVA: "+prop.getProperty("Iva");
			linea += "Tasa de interés: "+prop.getProperty("TasaInteres");
			linea += "Nombre de banco donde está la cuenta: "+prop.getProperty("NombreBanco");
			linea += "Número cuenta corriente: "+prop.getProperty("NumeroCuenta");
			linea += "Nombre gerente de la tienda: "+prop.getProperty("NombreGerente");

		} catch (IOException e) {
			return null;
		}

		return linea;
	}
	
	
	
	public String leerPropiedades(String propiedad) {
		String busqueda="";
		try {
			prop.load(new FileInputStream(archivoprop));

			busqueda = prop.getProperty(propiedad);

		}catch(IOException ex) {
			return null;
		}
		return busqueda;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public String getArchivoprop() {
		return archivoprop;
	}

	public void setArchivoprop(String archivoprop) {
		this.archivoprop = archivoprop;
	}
}
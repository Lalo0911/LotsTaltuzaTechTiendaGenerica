package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {

	private Properties prop = new Properties();
	private String archivoprop = "./data/archivo.properties";

	public int escribirPropiedades() {
		try {
			prop.setProperty("nombreTienda", "TALTUZA");
			prop.setProperty("tipoComercio", "archivo.properties");
			prop.setProperty("nit", "10554875520");
			prop.setProperty("ciudad", "Bogotá D.C.");
			prop.setProperty("iva", "0.19");
			prop.setProperty("tasaInteres", "0.04");
			prop.setProperty("nombreBanco", "Bancolombia");
			prop.setProperty("numeroCuenta", "1598746320");
			prop.setProperty("nombreGerente", "Laura Mateus");
			prop.store(new FileOutputStream(archivoprop), null);
		}catch(IOException ex) {
			return -1;
		}
		return 0;
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
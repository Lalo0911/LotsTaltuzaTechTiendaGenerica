package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.BinariosFile;
import co.edu.unbosque.model.persistence.ArchivoTexto;
import co.edu.unbosque.model.persistence.Propiedades;

public class Fachada {
	
	private BinariosFile bF;
	private Propiedades prop;
	private ClientesDTO clientesDTO;
	private ClientesDAO clientesDAO;
	
	public Fachada()
	{
		
		clientesDTO = new ClientesDTO(null, null, null, null,null);
		clientesDAO = new ClientesDAO();
		bF = new BinariosFile();
		prop = new Propiedades();

		
	}


	public BinariosFile getbF() {
		return bF;
	}


	public void setbF(BinariosFile bF) {
		this.bF = bF;
	}


	public Propiedades getProp() {
		return prop;
	}


	public void setProp(Propiedades prop) {
		this.prop = prop;
	}


	public ClientesDTO getClientesDTO() {
		return clientesDTO;
	}


	public void setClientesDTO(ClientesDTO clientesDTO) {
		this.clientesDTO = clientesDTO;
	}


	public ClientesDAO getClientesDAO() {
		return clientesDAO;
	}


	public void setClientesDAO(ClientesDAO clientesDAO) {
		this.clientesDAO = clientesDAO;
	}

	

}

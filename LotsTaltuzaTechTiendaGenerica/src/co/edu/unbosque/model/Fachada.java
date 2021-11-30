package co.edu.unbosque.model;
import co.edu.unbosque.model.persistence.BinariosFile;
import co.edu.unbosque.model.persistence.Propiedades;

public class Fachada {
	
	private BinariosFile bF;
	private Propiedades prop;
	private ClientesDTO clientesDTO;
	private ClientesDAO clientesDAO;
	private ProductosDAO productosDAO;
	private ProductosDTO productosDTO;
	private ProveedoresDAO proveedoresDAO;
	private ProveedoresDTO proveedoresDTO;
	
	public Fachada() 
	{
		
		clientesDTO = new ClientesDTO(null, null, null, null,null);
		clientesDAO = new ClientesDAO();
		productosDAO = new ProductosDAO();
		productosDTO = new ProductosDTO(null, null, null, null,null);
		proveedoresDAO= new ProveedoresDAO();
		proveedoresDTO= new ProveedoresDTO(null,null,null,null,null);
		bF = new BinariosFile();
		prop = new Propiedades();
		

		
	}
	
	public void rellenar()
	{
	    clientesDAO.rellenar();
		productosDAO.rellenar();
		proveedoresDAO.rellenar();
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


	public ProductosDAO getProductosDAO() {
		return productosDAO;
	}


	public void setProductosDAO(ProductosDAO productosDAO) {
		this.productosDAO = productosDAO;
	}


	public ProductosDTO getProductosDTO() {
		return productosDTO;
	}


	public void setProductosDTO(ProductosDTO productosDTO) {
		this.productosDTO = productosDTO;
	}


	public ProveedoresDAO getProveedoresDAO() {
		return proveedoresDAO;
	}


	public ProveedoresDTO getProveedoresDTO() {
		return proveedoresDTO;
	}
	

}

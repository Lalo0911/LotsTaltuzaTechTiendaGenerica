package co.edu.unbosque.test;
import co.edu.unbosque.model.Fachada;
import junit.framework.TestCase;

public class ProgramaTest extends TestCase {

	private Fachada fachada;

	public void setUp() {
		fachada = new Fachada();
	}
		
	public void testLeerArchivoCliente() 
	{
		assertEquals("Mensaje generrar error",fachada.getbF().leerArchivoClientes().get(0).getNombre(),"Lalo");
	}
	
	public void testLeerArchivoProveedor()
	{
		assertEquals("No sirvio AHHHHH",fachada.getbF().leerArchivoProveedores().get(0).getNit(),"98765");
	}
	
	public void testLeerArchivoProducto()
	{
		assertEquals("No hay existencidas del producto", fachada.getbF().leerArchivoProductos().get(0).getNombreProducto(), "Gaseosa");
	}	
}

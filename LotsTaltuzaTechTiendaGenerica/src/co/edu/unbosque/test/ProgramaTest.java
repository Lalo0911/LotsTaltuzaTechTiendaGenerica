package co.edu.unbosque.test;
import co.edu.unbosque.model.ClientesDAO;
import junit.framework.TestCase;

public class ProgramaTest extends TestCase {

	private ClientesDAO cliente;
	
	public void setUp() {
		cliente = new ClientesDAO();
	}
	
	public void testTodo() {
		
		assertEquals("Mensaje generrar error",cliente.leer()," Nombre: Santiago");
	}
	
	
}

package co.edu.unbosque.test;
import co.edu.unbosque.model.ClientesDTO;
import junit.framework.TestCase;

public class ProgramaTest extends TestCase {

	private ClientesDTO cliente;
	
	public void setUp() {
		cliente = new ClientesDTO(1231, "laPerritaDeCulitoFeliz", "r", 0, "dfvd");
	}
	
	public void testTodo() {
		
		assertEquals("Mensaje generrar error",cliente.getNombre(),"laPerritaDeCulitoFeliz");
	}
	
	
}

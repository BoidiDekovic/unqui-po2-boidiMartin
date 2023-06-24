package parcialPlanDeAhorro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {

	Cliente cliente;
	@BeforeEach
	void setUp() throws Exception {
	
		cliente = new Cliente("123");
	}

	@Test
	void testCuandoUnClienteSeCreaTieneUnCbu() {
		assertEquals("123" , cliente.getCbu());	}

}

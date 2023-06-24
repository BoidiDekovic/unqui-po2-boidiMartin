package tp5_parte2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturaServicioTest {
	
	Factura factura;
	
	@BeforeEach
	void setUp() throws Exception {
	factura = new FacturaServicio(185,3);
	}
	@Test
	void testMontoApagar() {
		assertEquals(555,factura.getMontoAPagar());
	}

}

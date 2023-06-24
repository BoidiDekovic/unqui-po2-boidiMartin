package tp5_parte2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturaImpuestoTest {

	Factura factura;

	
	@BeforeEach
	void setUp() throws Exception {
	factura = new FacturaImpuesto(120,2,500);
	
	}
	@Test
	void testMontoApagar() {
		assertEquals(740 , factura.getMontoAPagar());
	}

}

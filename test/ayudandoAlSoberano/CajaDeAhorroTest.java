package ayudandoAlSoberano;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaDeAhorroTest {
	
	CajaDeAhorro caja;
	
	@BeforeEach
	void setUp() throws Exception {
		caja = new CajaDeAhorro("Martin", 3000);
	}

	@Test
	void testComprobarExtraccion() {
		caja.setSaldo(5000);
		caja.extraer(4000);
		assertTrue(caja.getMovimientos().isEmpty());
	}

}

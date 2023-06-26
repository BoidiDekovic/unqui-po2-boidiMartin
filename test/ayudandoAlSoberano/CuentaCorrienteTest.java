package ayudandoAlSoberano;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaCorrienteTest {
	
	CuentaCorriente cuenta;
	@BeforeEach
	void setUp() throws Exception {
	
		cuenta = new CuentaCorriente("Martin" , 2000);
		
	}

	@Test
	void testComprobarExtraccion() {
		cuenta.setSaldo(5000);
		cuenta.extraer(4000);
		assertFalse(cuenta.getMovimientos().isEmpty());
	}

}

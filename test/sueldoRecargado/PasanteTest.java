package sueldoRecargado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PasanteTest {

	
	Pasante pasante;
	@BeforeEach
	void setUp() throws Exception {
	
	pasante = new Pasante(5);
	}

	@Test
	void testSueldoDePasante() {
		assertEquals(174 , pasante.sueldo());
	}

}

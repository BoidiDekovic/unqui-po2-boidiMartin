package sueldoRecargado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TemporarioTest {

	Temporario temporario;
	@BeforeEach
	void setUp() throws Exception {
	
	temporario = new Temporario(5,1);
	
	}

	@Test
	void testCalcularSueldo() {
		assertEquals(1,373.5 , temporario.sueldo());
	}

}

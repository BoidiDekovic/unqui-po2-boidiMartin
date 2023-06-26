package sueldoRecargado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlantaTest {

	Planta planta;
	
	@BeforeEach
	void setUp() throws Exception {
		planta = new Planta(4,3);
	}

	@Test
	void testSueldo() {
		assertEquals( 3,449.87 , planta.sueldo());
	}

}

package parcialConsumidorDeOxigeno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CocoTest {

	Coco coco ;
	
	@BeforeEach
	void setUp() throws Exception {
		coco = new Coco(2,2.13);
	
	}

	
	@Test
	void testCuandoUnCocoSeCreaSuEdadEsLaQueLePasasPorParametro() {
		assertEquals(2 , coco.getEdad());
	}
	@Test
	void testCuandoUnCocoSeCreaSuRadioEsLaQueLePasasPorParametro() {
		assertEquals(2.13 , coco.getRadio());
	}
	
	@Test
	void testCuandoAUnCocoLePreguntasSuConsumoTeLoRetorna() {
		assertEquals(4.26 , coco.consumo());
	}
}

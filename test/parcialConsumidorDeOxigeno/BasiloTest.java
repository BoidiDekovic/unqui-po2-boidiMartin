package parcialConsumidorDeOxigeno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BasiloTest {
	
	Basilo basilo, basilo1;
		
	@BeforeEach
	void setUp() throws Exception {
	
		basilo = new Basilo(1 , 12);
		basilo1 = new Basilo(3,12);
	}

	
	@Test
	void testCuandoUnBasiloSeCreaSuEdadEsLaQueLePasasPorParametro() {
		assertEquals(1 , basilo.getEdad());
	}
	@Test
	void testCuandoUnCocoSeCreaSuLongitudEsLaQueLePasasPorParametro() {
		assertEquals(12 , basilo.getLongitud());
	}

	@Test
	void testCuandoUnBasiloTieneMenosDeDosAniosSuConsumoEsElDeSuLongitudMultiplicadoPorTres() {
		assertEquals(36 , basilo.consumo());
	}
	@Test
	void testCuandoUnBasiloTieneMasDeDosAniosSuConsumoEsElDeSuLongitudMultiplicadoPorTresYDividoPorSuEdad() {
		assertEquals(12 , basilo1.consumo());
	}
	
	
}

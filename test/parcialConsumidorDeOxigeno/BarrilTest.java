package parcialConsumidorDeOxigeno;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BarrilTest {

	Barril barril;
	Coco coco1 , coco2;
	
	@BeforeEach
	void setUp() throws Exception {
	
		barril = new Barril(123,1990);
		coco1 = mock(Coco.class);
		coco2 = mock(Coco.class);
	}

	@Test
	void testCuandoUnBarrilSeCreaTieneUnAnioDeFabricacion() {
		assertEquals(1990 ,  barril.getAnioFabricacion());
	}
	@Test
	void testCuandoUnBarrilSeCreaTieneUnCodigo() {
		assertEquals(123 ,  barril.getCodigo());
	}
	@Test
	void tesCuandoUnBarrilSeCreaNoTieneConsumidores() {
		assertTrue(barril.getConsumidores().isEmpty());
	}

	@Test
	void cuandoUnBarrilConsultaElConsumoLeRetornaLaSumaDeLosConsumosDeSusConsumidores() {
		barril.agregarConsumidor(coco1);
		barril.agregarConsumidor(coco2);
		when(coco1.consumo()).thenReturn(120.20);
		when(coco2.consumo()).thenReturn(120.20);
		barril.consumoBarril();
		verify(coco1 , times(1)).consumo();
	}
	
	
}

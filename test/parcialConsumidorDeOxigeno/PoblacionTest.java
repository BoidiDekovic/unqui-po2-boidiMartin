package parcialConsumidorDeOxigeno;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PoblacionTest {

	Poblacion poblacion , poblacion1;
	Coco coco,coco1; 
	Basilo basilo,basilo1;
	
	@BeforeEach
	void setUp() throws Exception {
	
		poblacion = new Poblacion();
		poblacion1 = mock(Poblacion.class);
		basilo = mock(Basilo.class);
		basilo1 = mock(Basilo.class);
		coco = mock(Coco.class);
		coco1 = mock(Coco.class);
		when(basilo.cantidad()).thenReturn(1);
		when(coco.cantidad()).thenReturn(1);
		when(poblacion1.cantidad()).thenReturn(5);
	
	}

	@Test
	void testCuandoUnaPoblacionSeCreaNoTieneConsumidores() {
		assertTrue(poblacion.getConsumidores().isEmpty());
	}

	@Test
	void testCuandoUnaPoblacionQuiereSaberSuCantidad() {
		poblacion.agregarConsumidor(basilo);
		poblacion.agregarConsumidor(coco);
		poblacion.agregarConsumidor(poblacion1);
		
		assertEquals(7 , poblacion.cantidad());
	}
	
	@Test
	void testCuandoUnaPoblacionConsultasuConsumoLeRetornaLaSumaDeTodosLosConsumosDeSusConsumidores() {
		poblacion.agregarConsumidor(basilo);
		poblacion.agregarConsumidor(coco);
		poblacion.agregarConsumidor(poblacion1);
		when(basilo.consumo()).thenReturn(1.24);
		when(coco.consumo()).thenReturn(1.12);
		when(poblacion1.consumo()).thenReturn(10.10);
		
		assertEquals(87.22 , poblacion.consumo());
	}
	
	
	
	
}

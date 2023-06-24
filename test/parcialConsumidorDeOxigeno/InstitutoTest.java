package parcialConsumidorDeOxigeno;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class InstitutoTest {
	
	Instituto instituto;
	Barril barril,barril1;
	
	@BeforeEach
	void setUp() throws Exception {
	instituto = new Instituto();
	barril = mock(Barril.class);
	barril1 = mock(Barril.class);
	when(barril.getCodigo()).thenReturn(383);
	when(barril1.getCodigo()).thenReturn(373);
	when(barril.consumoBarril()).thenReturn(550.10);
	when(barril1.consumoBarril()).thenReturn(250.10);
	
	
	}

	@Test
	void testCuandoUnInstitutoIniciaNoTieneBarriles() {
		assertTrue(instituto.getBarriles().isEmpty());
	}
	@Test
	void testCuandoUnInsTitutoAgregaUnbarrilSuListaDeBarrilesNoEstaVacia() {
		instituto.agregarBarril(barril);
		assertFalse(instituto.getBarriles().isEmpty());
	}
	@Test
	void testCuandoUnInstitutoQuiereEncontrarUnBarrilConSuCodigo() {
		instituto.agregarBarril(barril);
		instituto.agregarBarril(barril1);
		assertEquals(barril1 , instituto.obterBarril(373));
	}
	@Test
	void testCuandoUnInstitutoQuiereSaberElConsumoDeUnBarril() {
		instituto.agregarBarril(barril);
		instituto.agregarBarril(barril1);
		assertEquals(550.10 , instituto.consumoTotalBarril(barril));

	}
	
	
	
	

}

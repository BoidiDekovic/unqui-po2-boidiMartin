package parcialConstruccion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperarioTest {
	Operario operario, operario1;
	@BeforeEach
	void setUp() throws Exception {
		
		operario = new Operario(8,7,120.5);
		operario1 = new Operario(8,1,120.5);
	
	}

	@Test
	void testCuandoUnOperarioSeCreaTieneUnaCantidadDeHorasPorDia() {
		assertEquals(8 , operario.getCantidadHoras());
	}
	@Test
	void testCuandoUnOperarioSeCreaTieneUnaAntiguedad() {
		assertEquals(7 , operario.getAntiguedad());
	}
	@Test 
	void testCuandoUnOperarioSeCreaTieneValorPorCostoDeHora() {
		assertEquals(120.5 , operario.getValolorPorHora());
	}
	@Test
	void testCuandoLaAntiegudadDelOperarioEsMenorA5GanaUnSueldo() {
		assertEquals(964.0, operario1.costo());
	}
	@Test
	void testCuandoLaAntiegudadDelOperarioEsMayorA5GanaUnSueldo() {
		assertEquals(1060.4, operario.costo());
	}

}

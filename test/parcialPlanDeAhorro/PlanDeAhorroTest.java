package parcialPlanDeAhorro;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlanDeAhorroTest {

	PlanDeAhorro plan;
	EstadoPlanDeAhorro estado;
	Retribucion retribucion;
	Cliente cliente ;
	@BeforeEach
	void setUp() throws Exception {
	
		cliente = mock(Cliente.class);
		estado = mock(EstadoPlanDeAhorro.class);
		retribucion = mock(Retribucion.class);
		when(cliente.getCbu()).thenReturn("12345");
		plan = new PlanDeAhorro("Volkswagen", "GolTren" , cliente, 12, cliente.getCbu());
		
	}

	@Test
	void testCuandoPlanSeCreaTieneUnaMarca() {
		assertEquals("Volkswagen" , plan.getMarca());
	}
	@Test
	void testCuandoPlanSeCreaTieneUnModelo() {
		assertEquals("GolTren" , plan.getModelo());
	}
	@Test
	void testCuandoPlanSeCreaTieneUnCliente() {
		assertEquals(cliente , plan.getCliente());
	}
	@Test
	void testCuandoPlanSeCreaTieneUnCbu() {
		assertEquals(cliente.getCbu(), plan.getCbu());
	}
	@Test
	void testCuandoPlanSeCreaTieneUnaCantidadDeCuotasApagar() {
		assertEquals(12 , plan.getCantidadCuotas());
	}
	@Test
	void testCuandoPlanSeCreaSusCuotasPagasEstanEnCero() {
		assertEquals(0 , plan.getCuotasPagas());
	}

}

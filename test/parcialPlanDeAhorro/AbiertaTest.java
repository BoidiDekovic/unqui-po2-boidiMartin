package parcialPlanDeAhorro;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AbiertaTest {

	Abierta abierta;
	PlanDeAhorro plan, plan2;
	Cliente cliente;
	Finalizado finalizado;
	@BeforeEach
	void setUp() throws Exception {
		cliente = mock(Cliente.class);
		when(cliente.getCbu()).thenReturn("123");
		plan = new PlanDeAhorro("Volkswagen", "GolTren" , cliente, 3, cliente.getCbu());
		plan2 = mock(PlanDeAhorro.class);
		abierta = new Abierta();
		finalizado = mock(Finalizado.class);
		when(plan2.getCantidadCuotas()).thenReturn(0);
		
	}

	@Test
	void testCuandoUnPlanAbiertoPagaUnCuotaEstaEsdiminiye() {
		plan.setEstadoPlanDeAhorro(abierta);
		abierta.pagarCuota(plan);
		assertEquals(2 , plan.getCantidadCuotas());
		assertEquals(1, plan.getCuotasPagas());
	}
	@Test 
	void testCuandoUnPlanAbiertoPagaTodasSusCuotasCambiaAEstadoFinaliado(){
		abierta.pagarCuota(plan);
		abierta.pagarCuota(plan);
		abierta.pagarCuota(plan);
		assertEquals(0 , plan.getCantidadCuotas());
		assertEquals(3, plan.getCuotasPagas());
		abierta.pagarCuota(plan2);
		verify(plan2, times(1)).setEstadoPlanDeAhorro(any(Finalizado.class));
	}

	@Test 
	void testCuandoAUnEstadoAbiertaLePreguntasSiEsNoCreadaTeDevuelveVerdadero() {
		assertTrue(abierta.noEsCreada());
	}
	
}

package parcialPlanDeAhorro;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CreadoTest {

	Creado creado;
	PlanDeAhorro plan;
	Retribucion retribucion;
	@BeforeEach
	void setUp() throws Exception {
	
		creado = new Creado();
		plan = mock(PlanDeAhorro.class);
		retribucion = mock(Retribucion.class);
	
	}

	@Test
	void testCuandoUnEstadoCreadoPagaUnaCuotaIncremtaLaCuentaYCambiaAEstadoAbierto() {
		creado.pagarCuota(plan);
		verify(plan , times(1)).procesarPago();
		verify(plan ,times(1)).setEstadoPlanDeAhorro(any(Abierta.class));
		}

	@Test
	void testCuandoUnEstadoSeteaLaRetribucionDelEstadoEstaCambia() {
		creado.setRetribucion(plan, retribucion);
		verify(plan , times(1)).setRetribucion(any(Retribucion.class));
	}
	
	@Test 
	void testCuandoAUnEstadoCreadoLePreguntasSiEsNoCreadaTeDevuelveVerdadero() {
		assertFalse(creado.noEsCreada());
	}
	
}

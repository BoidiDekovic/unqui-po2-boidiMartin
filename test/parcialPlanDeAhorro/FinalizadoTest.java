package parcialPlanDeAhorro;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FinalizadoTest {

	Finalizado finalizado;
	PlanDeAhorro plan;
	Retribucion retribucion;
	
	@BeforeEach
	void setUp() throws Exception {
	
		finalizado =  new Finalizado();
		plan = mock(PlanDeAhorro.class);
		retribucion = mock(Retribucion.class);
		when(plan.getRetribucion()).thenReturn(retribucion);
	}

	@Test
	void testCuandoUnEstadoCerradoEjecutaRetribucionEstaSeEjecuta() {
		finalizado.ejecutarRetribucion(plan);
		verify(retribucion, times(1)).ejecutarRetribucion(plan);
		verify(plan, times(1)).setEstadoPlanDeAhorro(any(Cerrado.class));
	}

}

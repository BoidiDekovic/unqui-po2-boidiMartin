package parcialPlanDeAhorro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


class AutoMovilFisicoTest {

	AutoMovilFisico auto;
	PlanDeAhorro plan;
	FabricaAutoMotriz fabrica;
	@BeforeEach
	void setUp() throws Exception {
	
		fabrica = mock(FabricaAutoMotriz.class);
		auto = new AutoMovilFisico(fabrica);
		plan = mock(PlanDeAhorro.class);
		when(plan.getMarca()).thenReturn("Fiat");
		when(plan.getModelo()).thenReturn("Punto");
		when(plan.getRetribucion()).thenReturn(auto);
	
	}

	@Test
	void testCuandoSeEjucutaRetribucion() {
		auto.ejecutarRetribucion(plan);
		verify(fabrica, times(1)).comprarAutoMovil("Fiat", "Punto");
	}

}

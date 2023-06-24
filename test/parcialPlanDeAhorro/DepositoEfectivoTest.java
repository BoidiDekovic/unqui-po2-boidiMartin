package parcialPlanDeAhorro;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DepositoEfectivoTest {

	RedBancaria banco;
	FabricaAutoMotriz fabrica;
	DepositoEfectivo deposito;
	PlanDeAhorro plan;
	@BeforeEach
	void setUp() throws Exception {
	
		banco = mock(RedBancaria.class);
		fabrica = mock(FabricaAutoMotriz.class);
		deposito = new DepositoEfectivo(banco,fabrica);
		plan = mock(PlanDeAhorro.class);
		when(plan.getMarca()).thenReturn("Fiat");
		when(plan.getModelo()).thenReturn("Punto");
		when(plan.getRetribucion()).thenReturn(deposito);
	}

	@Test
		void testCuandoSeEjucutaRetribucion() {
			deposito.ejecutarRetribucion(plan);
			verify(fabrica, times(1)).valorAutroMovil("Fiat","Punto");
		
		}

}

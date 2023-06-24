package parcialPlanDeAhorro;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConcesionariaTest {

	
	PlanDeAhorro plan1,plan2,plan3;
	Concesionaria concesionaria;
	@BeforeEach
	void setUp() throws Exception {
	
		concesionaria = new Concesionaria();
		
		plan1 = mock(PlanDeAhorro.class);
		plan2 = mock(PlanDeAhorro.class);
		plan3 = mock(PlanDeAhorro.class);
		
		when(plan1.getEstadoPlan()).thenReturn(any(Abierta.class));
		when(plan2.getEstadoPlan()).thenReturn(any(Finalizado.class));
		when(plan3.getEstadoPlan()).thenReturn(any(Creado.class));
		when(plan1.getCantidadCuotas()).thenReturn(5);
		when(plan2.getCantidadCuotas()).thenReturn(2);
		when(plan3.getCantidadCuotas()).thenReturn(12);
	
		
	}


	//void testUnaConcesionariaSabeCalcularLasCuotasQueLeQuedanACadaPlan() {
		//concesionaria.agregarPlan(plan1);
		//concesionaria.agregarPlan(plan2);
		//concesionaria.agregarPlan(plan3);
		//assertEquals(7 , concesionaria.cantidadPendienteDeLosPlanes());

}



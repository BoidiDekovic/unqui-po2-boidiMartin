package parcialSecretaria;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProyectoTest {

	Proyecto proyecto;
	Empleado empleado1,empleado2,lider;
	LocalDate fecha;
	@BeforeEach
	void setUp() throws Exception {
	fecha = LocalDate.of(2023,2,18);
	empleado1 = mock(Empleado.class);
	empleado2 = mock(Empleado.class);
	lider = mock(Empleado.class);
	proyecto = new Proyecto("Java", fecha, lider, 3);
	
	when(empleado1.sueldoDiario()).thenReturn((float) 120.2);
	when(empleado2.sueldoDiario()).thenReturn((float) 120.2);
	when(lider.sueldoDiario()).thenReturn((float) 120.2);
	}
	
	@Test 
	void testCuandoUnProyectoSeCreaTieneUnaFechaDeInicio() {
		assertEquals(fecha,  proyecto.getFechaInicio());
	}

	@Test
	void testCuandoUnProyectoCalculaLaInversionTotal() {
		proyecto.agregarEmpleado(empleado1);
		proyecto.agregarEmpleado(empleado2);
		
		assertEquals(360.5999755859375, proyecto.inversionTotal());
		
		
	}

}

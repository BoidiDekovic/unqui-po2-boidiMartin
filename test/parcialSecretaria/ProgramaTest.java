package parcialSecretaria;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProgramaTest {

	Proyecto proyecto1, proyecto2,proyecto3;
	Empleado empleado1, empleado2, lider;
	Programa programa, programa1;
	LocalDate fecha, fecha1, fecha2, fecha3;
	
	@BeforeEach
	void setUp() throws Exception {
		proyecto1 = mock(Proyecto.class);
		proyecto2 = mock(Proyecto.class);
		proyecto3 = mock(Proyecto.class);
		fecha = LocalDate.of(2022,1,18);
		fecha1 = LocalDate.of(2023,3,18);
		fecha2 = LocalDate.of(2023,8,18);
		fecha3 = LocalDate.of(2023,9,18);
		empleado1 = mock(Empleado.class);
		empleado2 = mock(Empleado.class);
		lider = mock(Empleado.class);	
		programa = new Programa("Javascrip", fecha3, lider, 3000);	
		programa1 = new Programa("Javascrip", fecha, lider, 3000);
		
	
		
	}

	@Test
	void testCuandoAUnProgramaLePedisLaFechaTeRetornaLaFechaDeSuProyectoMasViejo() {
		
		programa.agregarObra(proyecto1);
		programa.agregarObra(proyecto2);
		programa.agregarObra(proyecto3);
		programa.agregarObra(programa1);
		when(proyecto1.getFechaInicio()).thenReturn(fecha3);
		when(proyecto2.getFechaInicio()).thenReturn(fecha2);
		when(proyecto3.getFechaInicio()).thenReturn(fecha1);		

		assertEquals(fecha , programa.obtenerFechaDeInicio());
	}
	
	@Test 
	
	void testCuandoUnProgramaSeLePideSuInversionTotalReturnaLaSumaDeLasInversionesTotalesDeTodasSusObras() {
		programa.agregarObra(proyecto1);
		programa.agregarObra(proyecto2);
		programa.agregarObra(proyecto3);
		when(proyecto1.inversionTotal()).thenReturn((float) 200.20);
		when(proyecto2.inversionTotal()).thenReturn((float) 200.20);
		when(proyecto3.inversionTotal()).thenReturn((float) 200.20);
		assertEquals(3600.60009765625, programa.inversionTotal());
	}
	

}

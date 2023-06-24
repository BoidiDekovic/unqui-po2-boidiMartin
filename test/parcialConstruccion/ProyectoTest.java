package parcialConstruccion;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProyectoTest {

	Proyecto proyecto;
	Actividad  actividad , actividad1,actividad2, actividad3;
	Material material;
	Operario operario;
	
	@BeforeEach
	void setUp() throws Exception {
	
		proyecto = new Proyecto();
		operario = mock(Operario.class);
		material = mock(Material.class);
		actividad = mock(Transporte.class);
		actividad1 = mock(Transporte.class);
		actividad2 = mock(Transporte.class);
		actividad3 = mock(Obra.class);
		when(actividad.costo()).thenReturn(100.10);
		when(actividad1.costo()).thenReturn(100.10);
		when(actividad2.costo()).thenReturn(100.10);
		
	}

	@Test
	void testCuandoUnProyectoSeCreaNoTieneActividades() {
		assertTrue(proyecto.getActividades().isEmpty());
	}

	@Test
	void testUnProyectoPuedeAgregarCualquierTipoDeActividad() {
		proyecto.agregarActividad(actividad);
		proyecto.agregarActividad(actividad1);
		proyecto.agregarActividad(actividad2);
		proyecto.agregarActividad(actividad3);
		assertEquals(4, proyecto.getActividades().size());
	}
	@Test
	void testUnProyectoPuedeEliminarUnaActividad() {
		proyecto.agregarActividad(actividad3);
		proyecto.agregarActividad(actividad2);
		proyecto.agregarActividad(actividad);
		proyecto.sacarActividad(actividad);
		assertEquals(2, proyecto.getActividades().size());
	}
	@Test
	void testUnProyectoPuedeSaberElCostoDeSusActividades() {
		proyecto.agregarActividad(actividad2);
		proyecto.agregarActividad(actividad3);
		assertEquals(100.1 , proyecto.costo());
	}
	
}

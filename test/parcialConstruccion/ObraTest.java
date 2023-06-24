package parcialConstruccion;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ObraTest {

	Obra obra;
	Actividad actividad;
	Material material;
	Operario operario;
	
	@BeforeEach
	void setUp() throws Exception {
		
		obra = new Obra();
		operario = mock(Operario.class);
		material = mock(Material.class);
		material = mock(Material.class);
		when(material.costo()).thenReturn(150.10);	
		when(operario.costo()).thenReturn(150.10);	
		}

	@Test
	void testCuandoUnaObraSeCreaNoTieneOperarios() {
		assertTrue(obra.getOperarios().isEmpty());
	}
	@Test
	void testCuandoUnaObraSeCreaNoTieneMateriales() {
		assertTrue(obra.getMateriales().isEmpty());
	}

	@Test 
	void testCuandoUnaObraAgregaUnMaterialIncremetaSuListaDeMaterials() {
		obra.agregarMaterial(material);
		assertFalse(obra.getMateriales().isEmpty());
	}
	@Test 
	void tescCuandoUnaOraAgregaUnOperarioIncrementaSuListaDeOperarios(){
		obra.agregarOperario(operario);
		assertFalse(obra.getOperarios().isEmpty());
	}
	@Test
	void testCuandoUnaObraCalculaSuCostoDetornaLaSumaDeCostosDeOperariosYMaterialeS() {
		obra.agregarMaterial(material);
		obra.agregarOperario(operario);
		assertEquals(300.20 , obra.costo());
	}
}

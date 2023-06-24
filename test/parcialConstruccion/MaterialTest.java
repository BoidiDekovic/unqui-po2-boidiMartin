package parcialConstruccion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaterialTest {

	Material material;
	
	
	@BeforeEach
	void setUp() throws Exception {
	
		material = new Material(4,10.11);
	
	}

	@Test
	void testCuandoUnMaterialSeCreaTieneUnaCantidad() {
		assertEquals(4,material.getCantidad());
	}
	@Test
	void testCuandoUnMaterialSeCreaTieneUnaValorUnitario() {
		assertEquals(4,material.getCantidad());
	}
	@Test
	void testUnMateriaLSabeSuCosto() {
		assertEquals(40.44 , material.costo());
	}

}

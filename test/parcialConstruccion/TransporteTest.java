package parcialConstruccion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TransporteTest {
	
	Transporte transporte;
	
	@BeforeEach
	void setUp() throws Exception {
		transporte = new Transporte(20.20,10.10,150.50);
	
	}

	@Test
	void testCuandoUnTransporteSeCreaTieneUnaDistancia() {
		assertEquals(20.20 , transporte.getDistancia());
	}
	@Test
	void testCuandoUnTransporteSeCreaTieneUnPeso() {
		assertEquals(10.10 , transporte.getPeso());
	}
	@Test 
	void testCuandoUnOperarioSeCreaTienePrecio() {
		assertEquals(150.50 ,transporte.getPrecio());
	}
	@Test
	void testCuandoUnTrasporteCalculaSuCsto() {
		assertEquals(30,705.01, transporte.costo());
	}
}
package parcialPoliza;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GastoAdmistrativoTest {
	
	private GastoAdministrativo gastoAdm;
	
	@BeforeEach
	void setUp() throws Exception {
	
		gastoAdm = new GastoAdministrativo("Luz",150);
		
	}

	@Test
	void testCuandoUnGastoAdmSeCreaTieneUnConcepto() {
		assertEquals("Luz" , gastoAdm.getConcepto());
	}
	@Test
	void testCuandoUnGastoAdmSeCreaTieneUnMonto() {
	    assertEquals(150, gastoAdm.getMonto());
	}

}

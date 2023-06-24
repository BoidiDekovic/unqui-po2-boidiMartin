package parcialPoliza;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VigenteTest {

	private Poliza poliza;
	private Item item;
	private Vigente estado;
	private BonificacionService bonificacion;
	
	
	@BeforeEach
	void setUp() throws Exception {
		item = mock(Item.class);
		poliza = mock(Poliza.class);
		estado = new Vigente();
		
	
	}

	@Test
	void testCuandoUnaPolizaVigenteAplicaDescuentoBorraTodosLosGatosAdministrativos() {
		estado.aplicarDescuento(poliza);
		verify(poliza, times(1)).elimarTodosLosGastosAdministrativos();
	}

	@Test
	void testCuandoUnaPolizaVigenteSeCancelaCambiaElEstadoApolizaAbiertaYBorraTodosLosGastosAdministrativos() {
		estado.cancelar(poliza);
		verify(poliza,times(1)).elimarTodosLosGastosAdministrativos();
		verify(poliza,times(1)).setEstadoPoLiza(any(Abierta.class));
	}
	@Test
	void testCuandoUnaPolizaQuiereAgregarUnItemSeCancelaLaPoliza() {
		estado.agregarItem(item, poliza);
		verify(poliza,times(1)).elimarTodosLosGastosAdministrativos();
		verify(poliza,times(1)).setEstadoPoLiza(any(Abierta.class));
	}
	
	
	
}

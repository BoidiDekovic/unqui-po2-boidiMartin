package parcialPoliza;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CerradaTest {

	private Poliza poliza;
	private Item item;
	private Cerrada estado;
	private BonificacionService bonificacion;
	
	
	@BeforeEach
	void setUp() throws Exception {
	
	item = mock(Item.class);
	poliza = mock(Poliza.class);
	estado = new Cerrada();
	
	
	}

	@Test
	void testCuandoUnaPolizaEnEstadoCerradaAgregaUnItemEsteSeAgregaPeroConUnGastoDeAdministracion() {
		estado.agregarItem(item, poliza);
		verify(poliza, times(1)).agregarItem(any(Item.class));
		verify(poliza, times(1)).agregarGastoAdm(any(GastoAdministrativo.class));
	}
	@Test
	void testCuandoUnaPolizaCerradaAgregaUnDescuentoEliminaElGastoAdministrativoMasAlto() {
		estado.aplicarDescuento(poliza);
		verify(poliza, times(1)).gastoAdministrativoMasAlto();
	}
	@Test
	void testCuandoUnaPolizaCerradaPagaCambiaSuEstadoAVigente() {
		estado.pagar(poliza);
		verify(poliza, times(1)).setEstadoPoLiza(any(Vigente.class));
	}
	
	
	
}

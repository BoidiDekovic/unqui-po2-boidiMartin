package parcialPoliza;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AbiertaTest {
	private Poliza poliza;
	private Item item;
	private Abierta estado;
	private BonificacionService bonificacion;
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		item = mock(Item.class);
		poliza = mock(Poliza.class);
		estado = new Abierta();
	}

	@Test
	void testCuandoUnaPolizaAbiertaAgregaUnItemEsteEstaDentroDeLaPoliza() {
		estado.agregarItem(item, poliza);
		verify(poliza, times(1)).agregarItem(item);
	}
	@Test
	void testCuandoUNaPolizaAbiertaAplicaUnDescuentoAgregaUnGastoAdministrativo(){
		estado.aplicarDescuento(poliza);
		verify(poliza, times(1)).agregarGastoAdm(any());
	}
	@Test
	void testCuandoUnaPolizaAbiertaCierraInventarioCambiaAEstadoCerrada() {
		estado.cerrarInventario(poliza);
		verify(poliza,times(1)).setEstadoPoLiza(any(Cerrada.class));
	}
	
}








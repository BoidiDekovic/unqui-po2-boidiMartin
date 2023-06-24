package parcialPoliza;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PolizaTest {
	
	private Poliza poliza;
	private Item item1, item2;
	private GastoAdministrativo gasto1,gasto2,gasto3;
	private EstadoPoliza estado;
	private BonificacionService bonificacion;

	@BeforeEach
	void setUp() throws Exception {
		item1 = mock(Item.class);
		item2 = mock(Item.class);
		gasto1 = mock(GastoAdministrativo.class);
		gasto2 = mock(GastoAdministrativo.class);
		gasto3 = mock(GastoAdministrativo.class);
		estado = mock(EstadoPoliza.class);
		poliza = new Poliza(bonificacion);
		
		when(gasto1.getMonto()).thenReturn(150.50);
		when(gasto2.getMonto()).thenReturn(150.50);
		when(gasto3.getMonto()).thenReturn(150.50);
		when(item1.valorDeItem()).thenReturn(200.0);
		when(item2.valorDeItem()).thenReturn(200.0);
		
		poliza.agregarGastoAdm(gasto1);
		poliza.agregarGastoAdm(gasto2);
		poliza.agregarGastoAdm(gasto3);
		
	}

	@Test
	void testCuandoUnaPolizaSeCreaSuInventarioEstaVacio() {
		
		assertTrue(poliza.getInventario().isEmpty());
	}
	@Test
	void testCuandoUnaPolizaSeCreaSusGastosAdministrativosEstanVacios() {
		poliza.elimarTodosLosGastosAdministrativos();
		assertTrue(poliza.getGastosAdministrativos().isEmpty());
	}
	
	@Test
	void testCuandoUnaPolizaQuiereSaberElMontoAseguradoDelInvetario() {
		poliza.agregarItem(item1);
		poliza.agregarItem(item2);
		assertEquals(400.0 , poliza.montoAsegurado());
	}
	@Test
	void testCuandoUnaPolizaQuiereSaberElTotalDeLosGastosAdministrativos() {

		assertEquals(451.5, poliza.totalGastosAdm());
	}
	
	@Test
	void testCuandoUnaPolizaQuiereSaberElPrecioAPagar() {
		poliza.agregarItem(item1);
		poliza.agregarItem(item2);
		assertEquals(481.5, poliza.precioAPagar());
	}
	@Test
	void testCuandoUnaPolizaPideElGastoAdministrativoMasAltoLeRetormaElQueTieneElValorMasAlto() {
		GastoAdministrativo gasto4 = new GastoAdministrativo("MasAlto" ,500.5);
		poliza.agregarGastoAdm(gasto4);
		poliza.eliminarGastoAdministrativo(poliza.gastoAdministrativoMasAlto());
		assertFalse(poliza.getGastosAdministrativos().contains(gasto4));
	}
	
	
}
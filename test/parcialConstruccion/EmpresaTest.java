package parcialConstruccion;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaTest {

	Empresa empresa;
	Proyecto proyecto;
	Material material;
	MetodoDePago efectivo, tarjeta ,mercadoPago;
	@BeforeEach
	void setUp() throws Exception {
		proyecto = mock(Proyecto.class);
		efectivo = new Efectivo();
		tarjeta = new TarjetaDeCredito();
		mercadoPago = new MercadoPago();
		material = mock(Material.class);
		
		empresa = new Empresa("Rinho Well Locks" , "30-21513613-4" , proyecto);
		when(proyecto.costo()).thenReturn(500.50);
		when(material.costo()).thenReturn(500.50);
	}

	@Test
	void testCuandoUnaEmpresaSeCreaTieneUnaRazonSocial() {
		assertEquals("Rinho Well Locks" , empresa.getRazonSocial());
	}
	@Test
	void testCuandoUnaEmpresaSeCreaTieneUnCuit() {
		assertEquals("30-21513613-4" , empresa.getCuit());
	}
	@Test
	void testCuandoUnaEmpresaSeCreaTieneUnaActividad() {
		assertEquals(proyecto, empresa.getActividad());
	}

	@Test
	void cuandoUnaEmpresaPagaConEfectivoElCostoEsElMismoDeLoQueSaleLaACtividad() {
		empresa.setMetodoDePago(efectivo);	
		assertEquals(500.50 , empresa.calcularCosto());
	}
	@Test
	void cuandoUnaEmpresaPagaConMercadoPagoLaACtividadtieneUnDescuento() {
		empresa.setMetodoDePago(mercadoPago);	
		assertEquals(485.485 , empresa.calcularCosto());
	}
	@Test
	void cuandoUnaEmpresaPagaConTarjetaDeCreditoElCostoDeLaActividadtieneUnRecargargo() {
		empresa.setMetodoDePago(tarjeta);	
		assertEquals(520.52 , empresa.calcularCosto());
	}
	
	
	
}

package tp5_parte2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	
	Caja caja;
	Producto producto1,producto2;
	Factura factura1,factura2;
	Stock stock,stock1;
	
	@BeforeEach
	void setUp() throws Exception {
	caja =  mock(Caja.class);
	caja = new Caja();
	stock = new Stock();
	stock1 = new Stock();
	factura1 = new FacturaServicio(185,3);
	factura2 = new FacturaImpuesto(390,2,200);
	producto1 = new ProductoCooperativa(120D,stock);
	producto2 = new ProductoTradicional(100D,stock);
		}

	@Test
	void testVerMontoTotal() {
		
		caja.agregarPago(factura1);
		caja.agregarPago(factura2);
		caja.agregarPago(producto1);
		caja.agregarPago(producto2);
		
		assertEquals(1743, caja.cobrar());
	}

	@Test
	void testGetCantidadDePagos() {
		caja.agregarPago(factura1);
		caja.agregarPago(producto2);
		
		assertEquals(2 , caja.cantidadDePagos());
	}
	
	@Test 
	void testContorolarStock() {
		caja.agregarPago(producto1);
		caja.agregarPago(producto2);
		caja.agregarPago(factura1);
		caja.asignarPagosAPagables();
	
		assertEquals(0,stock.getProductos().size());
	}
	
	
}

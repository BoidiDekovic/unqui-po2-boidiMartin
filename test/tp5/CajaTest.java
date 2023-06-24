package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	
	Caja caja;
	Stock stock,stock1;
	Producto producto1,producto2;
	
	@BeforeEach
	void setUp() throws Exception {
	caja =  new Caja();
	stock = new Stock();
	stock1 = new Stock();
	producto1 = new ProductoTradicional(120D,stock);
	producto2 = new ProductoCooperativa(120D,stock1);
	
	}

	@Test
	void testRegistroProducto() {
		caja.registrarProducto(producto2);
		assertEquals(0,stock1.getProductos().size());
	}

	@Test 
	void testRegistrarProducto2() {
		caja.registrarProducto(producto1);
		assertEquals(1, caja.getProductos().size());
	}

	@Test
	void testGetMontoTotal() {
		caja.registrarProducto(producto1);
		caja.registrarProducto(producto2);
		assertEquals(228D, caja.getMontoTotal());
	}
	
}

package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StockTest {
	
	Stock stock ;
	Producto producto1,producto2;

	@BeforeEach
	void setUp() throws Exception {
		stock = new Stock();
		producto1 = new ProductoTradicional(120D,stock);
		producto2 = new ProductoCooperativa(120D,stock);
	
	}

	@Test
	void testAgregarProductosAlStock() {
		assertEquals(2 , stock.getProductos().size());
	}
	
	@Test 
	void testRemoverProducto() {
		this.stock.sacarProducto(producto1);
		assertEquals(1 , stock.getProductos().size());
	}

}

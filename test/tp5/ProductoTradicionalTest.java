package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTradicionalTest {

	Stock stock;
	Producto producto;
	
	@BeforeEach
	void setUp() throws Exception {
		stock = new Stock();
		producto = new ProductoTradicional(130D,stock);
	}

	@Test
	void testConstructorDeProductoTradicional() {
		assertEquals(130D, producto.getPrecio());
	}

}

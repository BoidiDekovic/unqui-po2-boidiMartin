package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoCooperativaTest {

	Stock stock;
	Producto producto;
	@BeforeEach
	void setUp() throws Exception {
		stock = new Stock();
		
		
	}

	@Test
	void testConstructorConDescuentoAplicadoEnProductoCooperativa() {
		
		producto = new ProductoCooperativa(120D,stock);	
		assertEquals(108D , producto.getPrecio());
}

	
}
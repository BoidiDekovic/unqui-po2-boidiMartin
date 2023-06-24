package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
	Stock stock ;
	Producto producto1,producto2,producto3,producto4;
	@BeforeEach
	void setUp() throws Exception {
		stock = new Stock();
		producto1 = new ProductoTradicional(120D,stock);
		producto2 = new ProductoCooperativa(120D,stock);
		producto3 = new ProductoCooperativa(120D,stock);
		producto4 = new ProductoTradicional(120D,stock);
	}

	@Test
	void testReducirStockDeUnPRoducto() {
		this.producto1.reducirStock();
		this.producto2.reducirStock();
		assertEquals(2, producto1.stockDisponible()); 	
	}
	
}

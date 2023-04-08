package tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoPrimeraNecesidadTest {
	private ProductoPrimeraNecesidad leche, arroz;
	@BeforeEach
	void setUp() throws Exception {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false);
		arroz = new ProductoPrimeraNecesidad("Arroz",18.d, true , 8.d);
	}

	@Test
	public void testCalcularPrecio() {
		leche.descuentoParaPrecios();
		assertEquals(new Double(7.2), leche.getPrecio());
	}

	
	@Test 
	
	void testConstructorConDescuento() {
		arroz = new ProductoPrimeraNecesidad("Arroz",18.50, true , 0.8);
		assertEquals(new Double(14.80),arroz.getPrecio());
	}
	
}

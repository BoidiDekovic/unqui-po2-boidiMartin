package parcialPoliza;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemTest {
	
	private Item item;
	
	@BeforeEach
	void setUp() throws Exception {
	
		item = new Item(3,120);
	
	}

	@Test
	void testCuandoUnItemSeCreaTieneUnaCantidad(){
		assertEquals(3, item.getCantidad());
	}
	
	@Test
	void testCuandoUnItemSeCreaTieneUnValorPorUnidad() {
		assertEquals(120, item.getValor());
	}
	
	@Test
	void testValorTotalDeUnItem() {
		
		assertEquals(360 , item.valorDeItem());
	}
	

}

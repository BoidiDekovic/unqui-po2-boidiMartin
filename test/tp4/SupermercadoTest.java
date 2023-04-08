package tp4;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SupermercadoTest {
	private Producto arroz;
	private Producto detergente;
	private Supermercado supermercado;
	
	
	@BeforeEach
	void setUp() throws Exception {
		arroz = new Producto("Arroz", 18.20, true);
		detergente = new Producto("Detergente", 75.20);
		supermercado = new Supermercado("Lo de Tito", "Av Zubeldia 801");
	}

	@Test
	public void testCantidadDeProductos() {
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals(supermercado.cantidadDeProductos(),2);
	}
	@Test
	public void testPrecioTotal() {
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals (new Double(93.40), supermercado.precioTotal());
	}
		
}

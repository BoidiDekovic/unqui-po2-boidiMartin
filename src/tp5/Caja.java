package tp5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Caja {

	private List<Producto> productos;
	private Double montoTotal ;
	
	public Caja() {

		this.productos = new ArrayList<Producto>();
		this.montoTotal = 0D;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public Double getMontoTotal() {
		return productos.stream().mapToDouble(p-> p.precio).sum();
		}
	

	public void registrarProducto(Producto producto) {
		this.productos.add(producto);
		producto.reducirStock();
	}
	


}

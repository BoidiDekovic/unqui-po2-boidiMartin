package tp5_parte2;

import java.util.ArrayList;
import java.util.List;

public class Stock {
	private List<Producto> productos;

	public Stock() {
		this.productos = new ArrayList<Producto>();
	}

	public void agregarProducto (Producto producto) {
		this.productos.add(producto);
	}
	
	public void sacarProducto (Producto producto) {
		this.productos.remove(producto);
	}

	public List<Producto> getProductos() {
		return productos;
	}

}

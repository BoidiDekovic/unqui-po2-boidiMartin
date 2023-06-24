package tp5_parte2;

import java.util.ArrayList;
import java.util.List;

public abstract class Producto implements IPagable {
	protected double precio;
	private Stock stock;
	
	public Producto(Double precio,Stock stock) {
		this.precio = precio;
		this.stock = stock;
		stock.agregarProducto(this);
	}
	
	public void reducirStock() {
		stock.sacarProducto(this);
	}
	
	public double getPrecio() {
		return this.precio;
	}

	public Stock getStock() {
		return stock;
	}
	public int stockDisponible() {
		return this.getStock().getProductos().size();
	}
	@Override
	public double getMonto() {
		return this.getPrecio();
	}

	@Override
	public void asignarPago(Caja caja) {
		this.reducirStock();
	}
	

}

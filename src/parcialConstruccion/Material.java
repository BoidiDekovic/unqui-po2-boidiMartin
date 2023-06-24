package parcialConstruccion;

public class Material {
	
	private int cantidad;
	private double precio;
	
	
	public Material(int cantidad, double precio) {
		super();
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public double costo() {
		
		return this.getPrecio() * this.getCantidad();
	}

	public int getCantidad() {
		return cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	
}

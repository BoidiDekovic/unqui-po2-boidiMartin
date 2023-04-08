package tp4;

public class Producto {
	private String nombre;
	private Double precio;
	private boolean esPrecioCuidado ;

	
	public Producto(String nombre, Double p, boolean esPrecioCuidado) {
		this.nombre = nombre;
		this.precio = p;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	public Producto(String nombre, Double p) {
		this.nombre = nombre;
		this.precio = p;
	}

	
	public String getNombre() {
		return nombre;
	}
	
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	public void setEsPrecioCuidado(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}

	public void aumentarPrecio(Double p) {
		this.setPrecio(getPrecio()+p);
	}
	
	
}

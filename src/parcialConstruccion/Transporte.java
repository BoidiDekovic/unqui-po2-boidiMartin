package parcialConstruccion;

public class Transporte implements Actividad {

	private double distancia;
	private double peso;
	private double precio;
	
	public Transporte(double distancia, double peso, double precio) {
		super();
		this.distancia = distancia;
		this.peso = peso;
		this.precio = precio;
	}


	@Override
	public double costo() {
		
		return this.getDistancia() * this.getPrecio() * this.getPrecio();
	}
	
	public double getDistancia() {
		return distancia;
	}

	public double getPeso() {
		return peso;
	}

	public double getPrecio() {
		return precio;
	}

}

	

package tp5_parte2;

public class FacturaServicio extends Factura{

	public FacturaServicio(double precioPorUnidad, int cantidad) {
		super(precioPorUnidad, cantidad);
	}

	public double calcularCosto(double precioPorUnidad,int cantidad) {
		return precioPorUnidad * cantidad;
		
	}


}
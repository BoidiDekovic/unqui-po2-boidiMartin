package tp5_parte2;

public class FacturaImpuesto extends Factura {

	
	
	public FacturaImpuesto(double precioUnidades , int cantidad, int tasa) {
		super(precioUnidades, cantidad);
		super.montoAPagar = calcularCosto(precioUnidades,cantidad,tasa); 
		
	}

	public double calcularCosto(double precioPorUnidad,int cantidad,int tasa) {
		return (precioPorUnidad * cantidad) + tasa ;
	}
	


}

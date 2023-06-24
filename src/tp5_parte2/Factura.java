package tp5_parte2;

public  class Factura implements IPagable {

	public double montoAPagar;

	public Factura(double precioPorUnidad , int cantidad) {
		this.montoAPagar = calcularCosto(precioPorUnidad ,cantidad);
}
	public double getMontoAPagar() {
		return montoAPagar;
	}

	public double calcularCosto(double precioPorUnidad,int cantidad) {
		return precioPorUnidad * cantidad;
		
	}
		
	@Override
	public void asignarPago(Caja caja) {
		caja.registrarPago(this);
	}
	@Override
	public double getMonto() {
		return this.getMontoAPagar();
	}


}

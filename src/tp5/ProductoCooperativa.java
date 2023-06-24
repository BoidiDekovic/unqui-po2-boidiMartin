package tp5;

public class ProductoCooperativa extends Producto{

	public ProductoCooperativa(Double precio, Stock stock) {
		super(aplicarDescuento(precio), stock);
		
	}

	@Override
	public double getPrecio() {
		
		return super.getPrecio();
	}

	private static Double aplicarDescuento(Double precio) {
		return precio - (precio*10/100);
	}
	

}

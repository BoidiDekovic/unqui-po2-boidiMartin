package tp5_parte2;

public class ProductoCooperativa extends Producto{

	public ProductoCooperativa(Double precio, Stock stock) {
		super(aplicarDescuento(precio), stock);
		
	}

	@Override
	public double getPrecio() {
		
		return super.getPrecio();
	}

	private static double aplicarDescuento(Double precio) {
		return precio - (precio*10/100);
	}

}

	

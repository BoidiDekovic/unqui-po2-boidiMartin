package tp4;

public class ProductoPrimeraNecesidad extends Producto{

	public ProductoPrimeraNecesidad(String nombre, Double precio, boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);

	
	}
	
	
	public ProductoPrimeraNecesidad(String nombre,Double precio,boolean esPrecioCuidado,Double descuento) {
		super(nombre,precio,esPrecioCuidado);
		this.generarDescuento(descuento);
	}
	
	
	public  void descuentoParaPrecios() {
		this.setPrecio(getPrecio()*0.9);
		}
			
	
	public void generarDescuento(Double descuento) {
		this.setPrecio(getPrecio()*descuento);
	}
	
	
	
}
	


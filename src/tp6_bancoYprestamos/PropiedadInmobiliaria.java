package tp6_bancoYprestamos;

public class PropiedadInmobiliaria {
	
	private String descripcion;
	private String direccion;
	private float valorFiscal;

	
	public PropiedadInmobiliaria(String descripcion, String direccion, float valorFiscal) {

		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}

	public float getValorFiscal() {
		return valorFiscal;
	}
	

	
	
	
}

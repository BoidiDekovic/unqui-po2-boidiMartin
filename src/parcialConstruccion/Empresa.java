package parcialConstruccion;

public class Empresa {
	private String razonSocial;
	private String cuit;
	private MetodoDePago mp;
	private Actividad actividad;
	
	public Empresa(String razonSocial, String cuit, Actividad actividad) {
		super();
		this.razonSocial = razonSocial;
		this.cuit = cuit;
		this.actividad = actividad;
	}
	public String getRazonSocial() {
		return this.razonSocial;
	}
	public String getCuit() {
		return this.cuit;
	}
	
	public Actividad getActividad() {
		return this.actividad;
	}
	
	public void setMetodoDePago(MetodoDePago mp) {
		this.mp = mp;
	}
	
	public MetodoDePago getMetodoDePago() {
		return this.mp;
	}

	public double calcularCosto() {
		return this.getMetodoDePago().costoDeActividad(getActividad());
	}
	
	
	
}

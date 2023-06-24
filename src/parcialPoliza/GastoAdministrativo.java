package parcialPoliza;

public class GastoAdministrativo {
	
	private String concepto;
	private double monto;
	
	public GastoAdministrativo(String concepto, double monto) {
		super();
		this.concepto = concepto;
		this.monto = monto;
	}
	
	public String getConcepto() {
		return this.concepto;
	}

	public double getMonto() {
		return this.monto;
	}
	
	
}

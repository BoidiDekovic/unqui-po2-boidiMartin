package parcialPlanDeAhorro;

public class PlanDeAhorro {
	
	private String marca;
	private String modelo;
	private Cliente cliente;
	private String cbu;
	private int cantidadCuotas;
	private int cuotasPagas;
	private EstadoPlanDeAhorro estado;
	private Retribucion retribucion;
	
	public PlanDeAhorro(String marca, String modelo, Cliente cliente, int cantidadCuotas, String cbu) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cliente = cliente;
		this.cantidadCuotas = cantidadCuotas;
		this.cuotasPagas = 0;
		this.estado = new Creado();
		this.retribucion = retribucion;
		this.cbu = cbu;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public String getCbu() {
		return cbu;
	}

	public int getCantidadCuotas() {
		return cantidadCuotas;
	}

	public int getCuotasPagas() {
		return cuotasPagas;
	}
	public Retribucion getRetribucion() {
		return retribucion;
	}
	public EstadoPlanDeAhorro getEstadoPlan() {
		return estado;
	}
	
	public void pagarCuota() {
		estado.pagarCuota(this);
	}
	
	public void setEstadoPlanDeAhorro(EstadoPlanDeAhorro estado) {
		this.estado = estado;
	}
	public void setRetribucion(Retribucion retribucion) {
		this.estado.setRetribucion(retribucion);
	}
	public void ejecutarRetribucion() {
		estado.ejecutarRetribucion(this);
	}
	
	public void procesarPago() {
		this.cantidadCuotas = this.getCantidadCuotas() - 1;
		this.cuotasPagas = this.getCuotasPagas() + 1;
	}
	
}

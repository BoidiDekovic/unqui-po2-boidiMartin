package tp6_bancoYprestamos;

public abstract class  SolicitudDeCredito implements Solicitud {

	private float monto;
	private int plazoDias;
	private Cliente cliente;
	
	public SolicitudDeCredito(float monto, int plazoDias, Cliente cliente) {
		
		this.monto = monto;
		this.plazoDias = plazoDias;
		this.cliente = cliente;
	}
	
	
	
	
	public abstract boolean esAceptable();
		

	
}

package tp6_bancoYprestamos;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito{

	
	public SolicitudDeCreditoPersonal(float monto, int plazoDias, Cliente cliente) {
		super(monto, plazoDias, cliente);
	}

	@Override
	public float solicitudCredito() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean esAceptable() {
		// TODO Auto-generated method stub
		return false;
	}

}

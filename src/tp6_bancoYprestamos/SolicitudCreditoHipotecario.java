package tp6_bancoYprestamos;

public class SolicitudCreditoHipotecario extends SolicitudDeCredito{

	private PropiedadInmobiliaria propiedad;
	
	public SolicitudCreditoHipotecario(float monto, int plazoDias, Cliente cliente, PropiedadInmobiliaria propiedad) {
		super(monto, plazoDias, cliente);
		this.propiedad = propiedad;
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

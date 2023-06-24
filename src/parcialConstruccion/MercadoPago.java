package parcialConstruccion;

public class MercadoPago implements MetodoDePago{

	
	@Override
	public double costoDeActividad(Actividad actividad) {
		
		return actividad.costo() - tresPorCientoDelCosto(actividad) ;
	}

	public double tresPorCientoDelCosto(Actividad actividad) {
		return actividad.costo() * 0.03;
	}

}

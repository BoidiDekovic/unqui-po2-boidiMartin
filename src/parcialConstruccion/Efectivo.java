package parcialConstruccion;

public class Efectivo implements MetodoDePago{

	@Override
	public double costoDeActividad(Actividad actividad) {
		
		return actividad.costo();
	}

}

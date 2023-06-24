package parcialConstruccion;

public class TarjetaDeCredito implements MetodoDePago{

	@Override
	public double costoDeActividad(Actividad actividad) {
		return actividad.costo() + recargaDelCuatroPorCiento(actividad);
	}

	public double recargaDelCuatroPorCiento(Actividad actividad) {
		return actividad.costo() * 0.04;
	}

}

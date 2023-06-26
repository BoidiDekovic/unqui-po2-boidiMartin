package sueldoRecargado;

public class Pasante extends Empleado{

	public Pasante(int cantidadHoras) {
		super(cantidadHoras);
	}
	@Override
	public double sueldoBasico() {
		
		return this.getCantidadHoras() * 40;
	}

}

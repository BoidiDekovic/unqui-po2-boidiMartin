package sueldoRecargado;

public class Planta extends Empleado {
	
	private int cantidadDeHijos;
	
	public Planta(int cantidadHoras , int cantidadDeHijos) {
		super(cantidadHoras);
		this.cantidadDeHijos = cantidadDeHijos;
	}

	@Override
	public double sueldoBasico() {
	
		return 3000 + bonoFamiliar();
	}
	public double bonoFamiliar() {
		return cantidadDeHijos * 150;

	}
}
package sueldoRecargado;

public abstract class Empleado {
	private int cantidadHoras ;
	
	public Empleado(int cantidadHoras) {
		super();
		this.cantidadHoras = cantidadHoras;
	}
	
	

	public final double sueldo() {
	
		return this.sueldoBasico() + bonoFamiliar() - descuentoAporte();
	}
	
	public abstract double sueldoBasico();

	public double descuentoAporte() {
		return sueldoBasico() * 0.13 ;
	}

	public double bonoFamiliar() {
		return 0.0 ;
	}
	
	public int getCantidadHoras() {
		return cantidadHoras;
	}
}




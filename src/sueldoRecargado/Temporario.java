package sueldoRecargado;

public class Temporario extends Empleado {

		
	private int cantidadDeHijos;
	private boolean esCasado;
	
	public Temporario(int cantidadHoras , int cantidad) {
		super(cantidadHoras);
		this.cantidadDeHijos = cantidad;
		
	}

	@Override
	public double sueldoBasico() {
		
		return this.getCantidadHoras() * 5 + 1000;
	}

	public double bonoFamiliar() {
		if( esCasado || this.cantidadDeHijos > 0) {
			return 100;
		}else {
			return 0;
		}
	}
}
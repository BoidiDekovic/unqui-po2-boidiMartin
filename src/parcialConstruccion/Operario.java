package parcialConstruccion;

public class Operario  {
	
	private int cantidadHoras;
	private int antiguedad;
	private double valolorPorHora;
	
	public Operario(int cantidadHoras, int antiguedad, double valolorPorHora) {
		super();
		this.cantidadHoras = cantidadHoras;
		this.antiguedad = antiguedad;
		this.valolorPorHora = valolorPorHora;
	}

	public double costo() {
		if(this.getAntiguedad() > 5) {
			return this.getValolorPorHora() * this.getCantidadHoras() * 1.1;
		}else {
			return this.getCantidadHoras() * this.getValolorPorHora();		}
	}

	public int getCantidadHoras() {
		return cantidadHoras;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public double getValolorPorHora() {
		return valolorPorHora;
	}

	
	
}

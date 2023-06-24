package parcialConsumidorDeOxigeno;

public class Basilo extends Bacteria {

	private int edad;
	private int longitud;
	
	
	public Basilo(int edad , int longitud) {
		super(edad);
		this.longitud = longitud;
	}
	
	public int getLongitud() {
		return longitud;
	}


	@Override
	public double consumo() {
		if(this.getEdad() > 2) {
			return (this.getLongitud() * 3) / this.getEdad();
		}else {
			return this.getLongitud() * 3;
		}
	}

	@Override
	public int cantidad() {
		
		return 1;
	}

}

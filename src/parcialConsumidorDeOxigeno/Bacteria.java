package parcialConsumidorDeOxigeno;

public abstract class Bacteria implements ConsumidorDeOxigeno {
	
	private int edad;

	public Bacteria(int edad) {
		super();
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}


	@Override
	public abstract double consumo();

}

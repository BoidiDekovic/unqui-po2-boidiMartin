package parcialConsumidorDeOxigeno;

public class Coco extends Bacteria {

	private double radio;
	
	public Coco(int edad , double radio) {
		super(edad);
		this.radio = radio;
	}


	public double getRadio() {
		return radio;
	}


	@Override
	public double consumo() {
		
		return this.getRadio() * 2;
	}

	@Override
	public int cantidad() {
		
		return 1;
	}

}

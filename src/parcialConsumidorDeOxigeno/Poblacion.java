package parcialConsumidorDeOxigeno;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Poblacion implements ConsumidorDeOxigeno{

	private List<ConsumidorDeOxigeno> consumidores;

	public Poblacion() {
		super();
		consumidores = new ArrayList<ConsumidorDeOxigeno>();
	}
	
	
	public List<ConsumidorDeOxigeno> getConsumidores() {
		return consumidores;
	}


	public void agregarConsumidor(ConsumidorDeOxigeno consumidor) {
		this.consumidores.add(consumidor);
	}
	
	
	@Override
	public double consumo() {
		
		return this.consumidores.stream().mapToDouble(c->c.consumo()).sum() * cantidad();
	}

	@Override
	public int cantidad() {
		return this.consumidores.stream().mapToInt(c->c.cantidad()).sum();
	}
	
	
}

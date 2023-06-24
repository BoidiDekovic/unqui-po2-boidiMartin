package parcialConsumidorDeOxigeno;

import java.util.ArrayList;
import java.util.List;

public class Barril {

	private int codigo;
	private int anioFabricacion;
	private List<ConsumidorDeOxigeno> consumidores;
	
	public Barril(int codigo, int anioFabricacion) {
		super();
		this.codigo = codigo;
		this.anioFabricacion = anioFabricacion;
		this.consumidores = new ArrayList<ConsumidorDeOxigeno>();
	}


	public int getCodigo() {
		return codigo;
	}
	public List<ConsumidorDeOxigeno> getConsumidores() {
		return consumidores;
	}


	public int getAnioFabricacion() {
		return anioFabricacion;
	}
	public double consumoBarril() {
		return this.consumidores.stream().mapToDouble(c -> c.consumo()).sum();
	}
	
	public void agregarConsumidor(ConsumidorDeOxigeno consumidor) {
		this.consumidores.add(consumidor);
	}
	
	
	
}

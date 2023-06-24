package parcialConsumidorDeOxigeno;

import java.util.ArrayList;
import java.util.List;

public class Instituto {

	private List<Barril> barriles;

	public Instituto() {
		super();
		barriles = new ArrayList<Barril>();
	}

	public List<Barril> getBarriles() {
		return barriles;
	}
	
	public void agregarBarril(Barril barril) {
		this.barriles.add(barril);
	}
	
	public Barril obterBarril(int codigo) {
		return this.getBarriles().stream().filter(b->b.getCodigo()== codigo).findFirst().orElseThrow();
	}
	
	public double consumoTotalBarril(Barril barril) {
		return barril.consumoBarril();
	}
	
}

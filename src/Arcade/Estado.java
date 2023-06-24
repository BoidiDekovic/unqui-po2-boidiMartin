package Arcade;

public abstract class Estado {
	
	private Arcade arcade;

	public Arcade getArcade() {
		return arcade;
	}
	public abstract void inicioApretado();
	public abstract void fichaIngresada();
}

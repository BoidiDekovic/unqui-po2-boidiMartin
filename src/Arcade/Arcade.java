package Arcade;

public class Arcade {
	int cantFichas;
	Estado estadoArcade;
	
	public Arcade(Estado estadoArcade) {
		super();
		cantFichas = 0;
		this.estadoArcade = estadoArcade;
	}
	
	public void cambioDeEstado(Estado estado) {
		this.estadoArcade = estado;
	}
	public boolean incrementarFicha() {
		if(this.getCantFichas() < 2) {
			cantFichas++;
			return true;
			}
		else {
			System.out.print("No se pueden ingresar mas de dos fichas");
			return false;
		}
	}
	public int getCantFichas() {
		return cantFichas;
	}
	public void setCantFichas(int cant) {
		this.cantFichas = cant;
	}
	public void finalizarPartida() {
		setCantFichas(0);
	}
	
}

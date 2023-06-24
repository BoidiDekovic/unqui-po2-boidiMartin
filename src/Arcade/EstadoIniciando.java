package Arcade;

public class EstadoIniciando extends Estado{

	@Override
	public void inicioApretado() {
		if(super.getArcade().cantFichas > 0) {
			if(super.getArcade().cantFichas == 1 ) {
				System.out.print("Iniciar partida un jugador");
			}
			else {
				// hay dos fichas
				System.out.print("Iniciar partida de dos jugadores");
			}
		super.getArcade().cambioDeEstado(new EstadoJugando());
		}
		else {
			System.out.print("Debe ingresar al menos una fucha para iniciar juego");
		}
	}

	@Override
	public void fichaIngresada() {
		super.getArcade().incrementarFicha();
	}

}

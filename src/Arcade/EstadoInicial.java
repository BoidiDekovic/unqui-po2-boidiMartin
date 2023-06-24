package Arcade;

public class EstadoInicial extends Estado{

	@Override
	public void inicioApretado() {
		getArcade().cambioDeEstado(new EstadoIniciando());
		System.out.print("Ingrese Ficha");
	}

	@Override
	public void fichaIngresada() {
		// no hace nada.
		
	}

}

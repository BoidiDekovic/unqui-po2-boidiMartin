package parcialPoliza;

public class Vigente implements EstadoPoliza {


	public Vigente() {
		super();
	}

	@Override
	public void agregarItem(Item item, Poliza poliza) {
		//una Poliza vigente no puede agregar Items
		cancelar(poliza);

	}

	@Override
	public void aplicarDescuento(Poliza poliza) {
		poliza.elimarTodosLosGastosAdministrativos();

	}
	
	public void cancelar(Poliza poliza) {
		poliza.elimarTodosLosGastosAdministrativos();
		poliza.setEstadoPoLiza(new Abierta());
	}

}

package parcialPoliza;

public class Abierta implements EstadoPoliza{

	public Abierta() {
		super();

	}

	@Override
	public void agregarItem(Item item, Poliza poliza) {
		poliza.agregarItem(item);
	}

	@Override
	public void aplicarDescuento(Poliza poliza) {
		poliza.agregarGastoAdm(new GastoAdministrativo("Bonificacion Administrativa" , -500.0));
	}
	
	public void cerrarInventario(Poliza poliza) {
		poliza.setEstadoPoLiza(new Cerrada());
	}

}

package ayudandoAlSoberano;

public class CuentaCorriente extends CuentaBancaria {

	private int descubierto;
	
	public CuentaCorriente(String titular , int descubierto) {
		super(titular);
		this.descubierto =  descubierto;
	}

	@Override
	public boolean condicionExtranccion(Double monto) {

		return super.getSaldo() + this.descubierto >= monto;
	}

}

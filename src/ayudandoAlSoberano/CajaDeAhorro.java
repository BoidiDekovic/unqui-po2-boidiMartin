package ayudandoAlSoberano;

public class CajaDeAhorro extends CuentaBancaria{

	private int limite;
	
	public CajaDeAhorro(String titular , int limite) {
		super(titular);
		this.limite = limite;
	}

	@Override
	public boolean condicionExtranccion(Double monto) {
		return super.getSaldo() >= monto && this.limite >= monto;
	}

}

package ayudandoAlSoberano;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {

	private String titular;
	private double saldo ;
	private List<String> movimientos;
	
	
	public CuentaBancaria(String titular) {
		super();
		this.titular = titular;
		this.saldo = 0;
		this.movimientos = new ArrayList<String>();
	}

	
	public final void extraer(double monto) {
		if(this.condicionExtranccion(monto)) {
			this.setSaldo((this.getSaldo()-monto));
			this.agregarMovimiento("Extraccion");
		}
	}
	
	public abstract boolean condicionExtranccion(Double condicion);

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void agregarMovimiento(String movimiento) {
		this.movimientos.add(movimiento);
	}


	public List<String> getMovimientos() {
		return movimientos;
	}

	
}

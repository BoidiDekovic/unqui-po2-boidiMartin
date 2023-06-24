package tp5_parte2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class Caja implements Agencia {

	private Double montoTotal ;
	private List<IPagable> pagables;
	
	public Caja() {
		pagables = new ArrayList<IPagable>();	
		this.montoTotal = getMontoTotal();
	}

	public double getMontoTotal() {
		return pagables.stream().mapToDouble(p-> p.getMonto()).sum();
	}

	public List<IPagable> getPagables() {
		return pagables;
	}

	public double cobrar() {
		asignarPagosAPagables();
		return getMontoTotal();
	}

	public void asignarPagosAPagables() {
		pagables.stream().forEach(p-> p.asignarPago(this));
	}

	public void agregarPago(IPagable pagable) {
		this.pagables.add(pagable);
	}
	
	
	public int cantidadDePagos() {
		return this.getPagables().size();
	}
	
	@Override
	public void registrarPago(Factura factura) {
				// informa a la agencia
		
	}
	

}

package parcialSecretaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa extends Obra {

	private float costoFijoPorGestion;
	private Empleado lider;
	private List<Obra> obras;
	
	public Programa(String nombre, LocalDate fechaInicio , Empleado lider , float costoFijoPorGestion) {
		super(nombre, fechaInicio , lider);
		this.obras = new ArrayList<Obra>();
		this.costoFijoPorGestion = costoFijoPorGestion;
	}

	@Override
	public float inversionTotal() {
		return (float) obras.stream()
							.mapToDouble(o-> o.inversionTotal())
							.sum() + this.getCostoFijoPorGestion();
	}

	@Override
	public LocalDate obtenerFechaDeInicio() {
		LocalDate fechaMasAntigua = this.getFechaInicio();
		for(Obra o : this.obras) {
			LocalDate fecha = o.getFechaInicio();
			if(fecha.isBefore(fechaMasAntigua))
			 fechaMasAntigua = fecha;
			}
		return fechaMasAntigua;
	}

	
	public void agregarObra(Obra obra) {
		this.obras.add(obra);
	}
	public void sacarObra(Obra obra) {
		this.obras.remove(obra);
	}

	public float getCostoFijoPorGestion() {
		return costoFijoPorGestion;
	}


}

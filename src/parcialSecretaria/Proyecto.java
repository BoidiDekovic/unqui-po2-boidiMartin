package parcialSecretaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Proyecto extends Obra {
	
	private int duracion;
	private List<Empleado> empleados;
 	
	public Proyecto(String nombre, LocalDate fechaInicio, Empleado lider,  int duracion) {
		super(nombre, fechaInicio, lider);
		this.duracion = duracion;
		this.empleados = new ArrayList<Empleado>();
	}

	@Override
	public float inversionTotal() {
		
		return (float) empleados.stream().mapToDouble(e -> e.sueldoDiario()).sum() + sueldoDeLiderConPlus();
	}
	
	public float sueldoDeLiderConPlus() {
		return sueldoDeLider()  ;
	}

	public float sueldoDeLider() {
		return this.getLider().sueldoDiario();
	}

	@Override
	public LocalDate obtenerFechaDeInicio() {
		return this.getFechaInicio();
	}
	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}

	
}

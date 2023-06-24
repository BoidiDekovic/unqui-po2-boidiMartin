package parcialSecretaria;

import java.time.LocalDate;

public abstract class Obra {
	
	private String nombre ;
	private LocalDate fechaInicio;
	private Empleado lider;
	
	public Obra(String nombre, LocalDate fechaInicio, Empleado lider) {
		super();
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.lider = lider;
	}
	
	
	
	public abstract float inversionTotal();

	public abstract LocalDate obtenerFechaDeInicio();

	
	public Empleado getLider() {
		return this.lider;
	}

	public LocalDate getFechaInicio() {
		return this.fechaInicio;
	}
}



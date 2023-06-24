package parcialConstruccion;

import java.util.HashSet;
import java.util.Set;

public class Proyecto implements Actividad {

	
	private Set<Actividad> actividades;
	
	public Proyecto() {
		this.actividades = new HashSet<Actividad>();
	}

	@Override
	public double costo() {
		
		return this.actividades.stream().mapToDouble(a -> a.costo()).sum();
	}

	public void agregarActividad(Actividad actividad) {
		this.actividades.add(actividad);
	}
	
	public void sacarActividad(Actividad actividad) {
		this.actividades.remove(actividad);
	}

	public Set<Actividad> getActividades() {
		return actividades;
	}
	
}

package parcialConstruccion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public  class Obra implements Actividad{

	
	List<Material> materiales;
	Set<Operario> operarios;
	
	public Obra() {
		super();
		this.materiales = new ArrayList<Material>();
		this.operarios = new HashSet<Operario>();
	}

	@Override
	public  double costo() {
		return costoTotalDeOperarios() + costoTotalDeMateriales();
	}

	private double costoTotalDeMateriales() {
		return this.getMateriales().stream().mapToDouble(m->m.costo()).sum();
	}

	private double costoTotalDeOperarios() {
		
		return this.getOperarios().stream().mapToDouble(o-> o.costo()).sum();
	}

	public void agregarOperario(Operario operario) {
		this.operarios.add(operario);
	}
	public void agregarMaterial(Material material) {
			this.materiales.add(material);
	}

	public List<Material> getMateriales() {
		return materiales;
	}

	public Set<Operario> getOperarios() {
		return operarios;
	}
	
}

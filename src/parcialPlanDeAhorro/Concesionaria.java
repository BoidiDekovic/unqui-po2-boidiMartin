package parcialPlanDeAhorro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Concesionaria {

	private Set<Cliente> clientes;
	private List<PlanDeAhorro> planes;
	
	public Concesionaria() {
		super();
		clientes = new HashSet<Cliente>();
		planes = new ArrayList<PlanDeAhorro>();
	}
	
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	public void agregarPlan(PlanDeAhorro plan) {
		this.planes.add(plan);
	}
	
	public int cantidadPendienteDeLosPlanes() {
		return this.planes.stream()
						  .filter(p -> p.getEstadoPlan().noEsCreada())
						  .mapToInt(p->p.getCantidadCuotas()).sum();
	}
}
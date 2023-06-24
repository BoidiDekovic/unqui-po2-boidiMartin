package parcialPlanDeAhorro;

public class Abierta extends EstadoPlanDeAhorro {

	@Override
	public void pagarCuota(PlanDeAhorro plan) {
		if(plan.getCantidadCuotas() == 0) {
			plan.setEstadoPlanDeAhorro(new Finalizado());
		}else {
			plan.procesarPago();
		}
		
	}

	@Override
	public boolean noEsCreada() {
		
		return true;
	}

}

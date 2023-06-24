package parcialPlanDeAhorro;

public class Creado extends EstadoPlanDeAhorro {

	@Override
	public void pagarCuota(PlanDeAhorro plan) {
		plan.procesarPago();
		plan.setEstadoPlanDeAhorro(new Abierta());

	}
	
	public void setRetribucion(PlanDeAhorro plan , Retribucion retribucion) {
		plan.setRetribucion(retribucion);
	}

	@Override
	public boolean noEsCreada() {
		
		return false;
	}

}

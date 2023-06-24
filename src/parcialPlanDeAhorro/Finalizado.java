package parcialPlanDeAhorro;

public class Finalizado extends EstadoPlanDeAhorro {
	
	@Override
	public void pagarCuota(PlanDeAhorro Plan) {
		 // no ejecuta la funcion porque el plan ya esta finalizado
	}
	
	public void ejecutarRetribucion(PlanDeAhorro plan) {
		plan.getRetribucion().ejecutarRetribucion(plan);
		plan.setEstadoPlanDeAhorro(new Cerrado());
	}

	@Override
	public boolean noEsCreada() {
		// TODO Auto-generated method stub
		return true;
	}

}

package parcialPlanDeAhorro;

public class Cerrado extends EstadoPlanDeAhorro {

	@Override
	public void pagarCuota(PlanDeAhorro plan) {
		 // no ejecuta la funcion porque el plan ya esta finalizado

	}

	@Override
	public boolean noEsCreada() {
		return false;
	}

}

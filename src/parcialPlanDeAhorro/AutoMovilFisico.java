package parcialPlanDeAhorro;

public class AutoMovilFisico implements Retribucion {

	private FabricaAutoMotriz fabrica;
	
	public AutoMovilFisico(FabricaAutoMotriz fabrica) {
		super();
		this.fabrica = fabrica;
	}



	@Override
	public void ejecutarRetribucion(PlanDeAhorro plan) {
		this.fabrica.comprarAutoMovil(plan.getMarca(), plan.getModelo());
	}

}

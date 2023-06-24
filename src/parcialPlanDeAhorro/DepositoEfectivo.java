package parcialPlanDeAhorro;

public class DepositoEfectivo implements Retribucion {

	RedBancaria banco;
	FabricaAutoMotriz fabrica;
	

	public DepositoEfectivo(RedBancaria banco, FabricaAutoMotriz fabrica) {
		super();
		this.banco = banco;
		this.fabrica = fabrica;
	}




	@Override
	public void ejecutarRetribucion(PlanDeAhorro plan) {
		
		banco.Depositar(fabrica.valorAutroMovil(plan.getMarca() , plan.getModelo()), plan.getCbu());
		
	}

}

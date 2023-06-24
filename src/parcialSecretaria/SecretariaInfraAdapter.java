package parcialSecretaria;

public class SecretariaInfraAdapter implements Secretaria{

	private SecretariaInfraestructura secretariaInfra;
	
	public SecretariaInfraAdapter(SecretariaInfraestructura secretariaInfra) {
		super();
		this.secretariaInfra = secretariaInfra;
	}








	@Override
	public float montoTotal() {
		return secretariaInfra.inversionTotal();
	}

}

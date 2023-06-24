package parcialSecretaria;

import java.util.ArrayList;
import java.util.List;

public class SecretariaInfraestructura  {

	private List<Obra> obras;
	
	public SecretariaInfraestructura() {
		
		this.obras = new ArrayList<Obra>();
	}
	
	public float inversionTotal() {
		return (float )this.obras.stream().mapToDouble(o-> o.inversionTotal()).sum();
		
	}

}

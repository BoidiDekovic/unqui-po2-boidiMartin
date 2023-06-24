package parcialSecretaria;

import java.util.ArrayList;
import java.util.List;

public class Ministerio {



	public Ministerio() {
	}
	
	public float montoTotalAInvertir(List<Secretaria> secretarias) {
		float total = 0;
		for (Secretaria secretaria : secretarias){
			total += secretaria.montoTotal();
		}
	return total;
	}
}
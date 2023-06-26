package strategy1;

public class EncriptadorNave {
	
	
	private IEstrategia estrategia;
	
	
	public EncriptadorNave() {
		super();
		this.setEstrategia(estrategia);
	}

	public void setEstrategia(IEstrategia estr) {
		this.estrategia = estr;
	}
	
	public String encriptarMensaje (String mnsj) {
		return this.estrategia.encriptar(mnsj);
	}
	
	public String desencriptarMensaje (String mnsj) {
		return this.estrategia.desencriptar(mnsj);
	}
	
}
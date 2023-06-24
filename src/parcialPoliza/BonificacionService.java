package parcialPoliza;

public interface BonificacionService {
	public boolean codigoValido(int codigo);
	public void anularCodigo(int codigo);
	public void notificarTitular(String email, int codigo);
	
}

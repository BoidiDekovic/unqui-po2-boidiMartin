package tp_emailCliente.copy2;

public interface IServidorEmail {
	public void recibirNuevos(String user, String password);
	public void enviar (Correo correo);
}

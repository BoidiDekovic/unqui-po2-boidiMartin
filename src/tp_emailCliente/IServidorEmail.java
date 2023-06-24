package tp_emailCliente;

public interface IServidorEmail {
	public void recibirNuevos(String user, String password);
	public void enviar (Correo correo);
}

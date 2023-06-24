package tp_emailCliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteEmal {

	private ServidorEmail servidor;
	private String user;
	private String password;
	private List<Correo> inbox;
	private List<Correo> borrados;
	
	
	public ClienteEmal(ServidorEmail servidor, String user, String password) {
		super();
		this.servidor = servidor;
		this.user = user;
		this.password = password;
		this.inbox  =  new ArrayList<Correo>();
		this.borrados= new ArrayList<Correo>();
		
	}
	
	public void conectar() {
		
	}
	
	public void borrarCorreo(Correo correo) {
		this.inbox.remove(correo);
		this.borrados.add(correo);
		
	}
	
	public int contarBorrados() {
		return this.borrados.size();
	}
	public int contarInbox(){
		return this.inbox.size();
	}
	
	
	public void elimnarBorrado(Correo correo) {
		this.borrados.remove(correo);
	}
	
	public void recibirCorreo() {
		this.servidor.recibirNuevos(this.user, this.password);
	}
	
	public void envicarCorreo(String asunto, String destinatario , String cuerpo) {
		new Correo(asunto,destinatario,cuerpo);
	}
	
	
	
	
}

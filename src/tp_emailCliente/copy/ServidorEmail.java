package tp_emailCliente.copy;

import java.util.ArrayList;
import java.util.List;

public class ServidorEmail implements IServidorLoger, IServidorEmail{

	private ServidorPop servidor;


	public void conectar(String user , String password) {
		//Verifica que el usuario sea valido y establece la conexion.
	}
	
	public void enviar(Correo correo) {
	      //realiza lo necesario para enviar el correo.		
		}
	
	
	public void recibirNuevos(String user, String pass) {
		List<Correo> retorno = new ArrayList<Correo>();
	  //Verificar autenticidad de usuario.
		//obtener emails Nuevos del usuario.
		//asignar a retorno la lista de los nuevos e-mails.
	
	}
	
}

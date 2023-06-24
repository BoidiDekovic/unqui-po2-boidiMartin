package tp6_bancoYprestamos;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<Cliente> clientes;
	private List<Solicitud> solicitudes;
	
	public Banco() {
		this.clientes = new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<Solicitud>();
	}
	
	
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
		
	}
	
	public void registrarSolicitud(Solicitud solicitud) {
		this.solicitudes.add(solicitud);
	}
	
	
}

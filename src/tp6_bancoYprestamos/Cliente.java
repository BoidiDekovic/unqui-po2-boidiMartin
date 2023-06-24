package tp6_bancoYprestamos;

public class Cliente {

	private String nombre;
	private String apellido;
	private String dirrecion;
	private int edad;
	private float sueldoAnual;
	private float sueldoMensual;
	
	
	public Cliente(String nombre, String apellido, String dirrecion, int edad, float sueldoAnual, float sueldoMensual) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dirrecion = dirrecion;
		this.edad = edad;
		this.sueldoAnual = sueldoAnual;
		this.sueldoMensual = sueldoMensual;
	}


	public float getSueldoAnual() {
		return sueldoAnual;
	}

	public void setSueldoAnual(float sueldoAnual) {
		this.sueldoAnual = sueldoAnual;
	}

	public int getEdad() {
		return edad;
	}
	
	public float getSueldoMensual() {
		return sueldoMensual;
	}

	public void predirCretito (Banco banco , Solicitud solicitud) {
		
	}
	
	
	
	
}

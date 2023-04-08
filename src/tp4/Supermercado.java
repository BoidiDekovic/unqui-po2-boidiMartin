package tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion; 
    private List <Producto> productos;
    
  
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>();
	}

	public List<Producto> getProductos() {
		return this.productos;
	}
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	public void agregarProducto (Producto p) {
		this.getProductos().add(p);
		}
    public void sacarProducto (Producto p) {
    	this.getProductos().remove(p);
    	
    }
    public int cantidadDeProductos() {
    	return this.getProductos().size();
    }
    public Double precioTotal() {
    	return this.productos.stream().mapToDouble(p -> p.getPrecio()).sum();
    }
  
    
    }
    
    
    
    


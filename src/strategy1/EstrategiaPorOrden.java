package strategy1;

public class EstrategiaPorOrden implements IEstrategia{
	
	String mensajeEncriptado;
	
	@Override
	public  String encriptar(String mensaje) {
       
        String[] palabras = mensaje.split(" ");
        StringBuilder mensajeEncriptado = new StringBuilder();
        for (int i = palabras.length - 1; i >= 0; i--) {
            mensajeEncriptado.append(palabras[i]).append(" ");
        }
        mensajeEncriptado.deleteCharAt(mensajeEncriptado.length() - 1);
        
        return mensajeEncriptado.toString();
    }


	@Override
	public String desencriptar(String s) {
        String[] palabrasEncriptadas = mensajeEncriptado.split(" ");
        
        StringBuilder mensajeDesencriptado = new StringBuilder();
      
        for (int i = palabrasEncriptadas.length - 1; i >= 0; i--) {
            mensajeDesencriptado.append(palabrasEncriptadas[i]).append(" ");
        }
        
        mensajeDesencriptado.deleteCharAt(mensajeDesencriptado.length() - 1);
        return mensajeDesencriptado.toString();
	}

}

package Strategy1;

public class EstrategiaPorNumero implements IEstrategia {
	 private  String mensajeEncriptado;
	@Override
	public String encriptar(String mensaje) {
		StringBuilder mensajeEncriptado = new StringBuilder();

        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = Character.toLowerCase(mensaje.charAt(i));

            if (Character.isLetter(caracter)) {
                int numero = caracter - 'a' + 1;
                mensajeEncriptado.append(numero).append(",");
            } else if (caracter == ' ') {
                mensajeEncriptado.append("0,");
            }
        }

        mensajeEncriptado.deleteCharAt(mensajeEncriptado.length() - 1);

        return mensajeEncriptado.toString();
	}

	@Override
	public String desencriptar(String mensaje) {
		StringBuilder mensajeDesencriptado = new StringBuilder();
        String[] numeros = mensajeEncriptado.split(",");

        for (String numero : numeros) {
            int valor = Integer.parseInt(numero);

            if (valor >= 1 && valor <= 26) {
                char letra = (char) (valor + 'a' - 1);
                mensajeDesencriptado.append(letra);
            } else if (valor == 0) {
                mensajeDesencriptado.append(" ");
            }
        }

        return mensajeDesencriptado.toString();
	}

	
}

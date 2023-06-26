package strategy1;

public class EstrategiaPorVocal implements IEstrategia{
	StringBuilder mensajeEncriptado = new StringBuilder();
	@Override
	public String encriptar(String mensaje) {
		
        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);

            if (esVocal(caracter)) {
                mensajeEncriptado.append(obtenerSiguienteVocal(caracter));
            } else {
                mensajeEncriptado.append(caracter);
            }
        }
        return mensajeEncriptado.toString();
	}

	@Override
	public String desencriptar(String s) {
		StringBuilder mensajeDesencriptado = new StringBuilder();
		for (int i = 0; i < mensajeEncriptado.length(); i++) {
            char caracter = mensajeEncriptado.charAt(i);

            if (esVocal(caracter)) {
                mensajeDesencriptado.append(obtenerVocalAnterior(caracter));
            } else {
                mensajeDesencriptado.append(caracter);
            }
        }

        return mensajeDesencriptado.toString();
	}
	private static boolean esVocal(char caracter) {
        char c = Character.toLowerCase(caracter);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private static char obtenerSiguienteVocal(char caracter) {
        char c = Character.toLowerCase(caracter);

        switch (c) {
            case 'a':
                return 'e';
            case 'e':
                return 'i';
            case 'i':
                return 'o';
            case 'o':
                return 'u';
            case 'u':
                return 'a';
            default:
                return caracter;
        }
    }

    private static char obtenerVocalAnterior(char caracter) {
        char c = Character.toLowerCase(caracter);

        switch (c) {
            case 'e':
                return 'a';
            case 'i':
                return 'e';
            case 'o':
                return 'i';
            case 'u':
                return 'o';
            case 'a':
                return 'u';
            default:
                return caracter;
        }
    }

}

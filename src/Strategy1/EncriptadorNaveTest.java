package Strategy1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EncriptadorNaveTest {

	EncriptadorNave encriptador;
	EstrategiaPorOrden estrategia1;
	EstrategiaPorVocal estrategia2;
	EstrategiaPorNumero estrategia3;
	@BeforeEach
	void setUp() throws Exception {
	
	
		encriptador = new EncriptadorNave();
		estrategia1 = new EstrategiaPorOrden();
	    estrategia2 = new EstrategiaPorVocal();
		estrategia3 = new EstrategiaPorNumero();	
	
	}

	@Test
	void testCuandoLaEstrategiaEsPorVocal() {

		encriptador.setEstrategia(estrategia2);
		assertEquals("pirru" ,encriptador.encriptarMensaje("perro"));
	}
	
	@Test
	void testCuandoLaEstrategiaEsPorNumero() {
		encriptador.setEstrategia(estrategia3);
		assertEquals("16,5,18,18,15" ,encriptador.encriptarMensaje("perro"));
	}
	@Test
	void testCuandoLaEstrategiaEsPorOrden() {
		encriptador.setEstrategia(estrategia1);
		assertEquals("pinocho de casa la En" ,encriptador.encriptarMensaje("En la casa de pinocho"));
	}
}

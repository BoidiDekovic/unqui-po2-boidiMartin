package parcialSecretaria;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class MinisterioTest {
	
	Secretaria  secretaria1,secretaria2,secretaria3;
	SecretariaInfraAdapter secretariaInfra;
	SecretariaInfraestructura secretaria;
	Ministerio  ministerio;
	List<Secretaria> secretarias;
	
	@BeforeEach
	void setUp() throws Exception {
	
	ministerio = new Ministerio();
	secretaria = mock(SecretariaInfraestructura.class);
	secretariaInfra = new SecretariaInfraAdapter(secretaria);
	secretaria1 = mock(Secretaria.class);
	secretaria2 = mock(Secretaria.class);
	secretaria3 = mock(Secretaria.class);
	
	secretarias = new ArrayList<Secretaria>();
	secretarias.add(secretaria1);
	secretarias.add(secretaria2);
	secretarias.add(secretaria3);
	secretarias.add(secretariaInfra);
	}

	@Test
	void testCuandoUnMinisterioConsultaSuMontoTotalEsteDevuelveLaSumaDeInversionTotalDeTodasLasSecretarias() {
		
		when(secretaria1.montoTotal()).thenReturn((float) 100.20);
		when(secretaria2.montoTotal()).thenReturn((float) 100.20);
		when(secretaria3.montoTotal()).thenReturn((float) 100.20);
		when(secretariaInfra.montoTotal()).thenReturn((float) 100.20);
		
		assertEquals(400.79998779296875 , ministerio.montoTotalAInvertir(secretarias));
	}

}

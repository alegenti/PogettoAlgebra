package esperimenti;

import static org.junit.Assert.*;

import org.junit.Test;

public class NuovoEsperimentotest {

	@Test
	public void testSomma() {
		int a = 3;
		int b = 4;
		int valoreAtteso = 7;
		int valoreCalcolato = NuovoEsperimento.somma(a,b);
		assertEquals(valoreAtteso,valoreCalcolato);
	}

}

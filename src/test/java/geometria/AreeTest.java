package geometria;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreeTest {

	@Test
	public void testTriangolo() {
		int base = 3;
		int altezza = 4;
		int valoreAtteso = 6;
		int valoreCalcolato = Aree.triangolo(base,altezza);
		assertEquals(valoreAtteso,valoreCalcolato);
		
	}

	@Test
	public void testQuadrato() {
		int lato = 2;
		int valoreAtteso = 4;
		int valoreCalcolato = Aree.quadrato(lato);
		assertEquals(valoreAtteso,valoreCalcolato);
		
	}

	@Test
	public void testRombo() {
		int diagMaggiore = 5;
		int diagMinore = 2;
		int valoreAtteso = 5;
		int valoreCalcolato = Aree.rombo(diagMaggiore,diagMinore);
		assertEquals(valoreAtteso,valoreCalcolato);
		
	}

}

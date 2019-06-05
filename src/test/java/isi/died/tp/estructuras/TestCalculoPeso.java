package isi.died.tp.estructuras;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import isi.died.tp.dominio.*;



public class TestCalculoPeso {

	private Liquido liqui1;
	private Liquido liquido2;
	private Liquido liquido3;
	private Liquido liquido4;
	private Liquido liquido5;
	private Liquido liquido6;
	private Liquido liquido7;
	
	@Before
	public void preTest() {
		
		liqui1 = new Liquido (1000,0.5);
		liquido2 = new Liquido (5000,5);
		liquido3 = new Liquido (4002,0.4);
		liquido4 = new Liquido (3003,0.5);
		liquido5 = new Liquido (1004,0.2);
		liquido6 = new Liquido (2005,0.1);
		liquido7 = new Liquido (1006,0.5);
		
		
	}
	
	
	
	
	
	@Test
	public void testTrue() {
	
		assertTrue(0.5 == liqui1.calcularPeso());
		assertTrue(25 == liquido2.calcularPeso());
	}
	public void testFalso() {
		
		assertTrue(7 == liqui1.calcularPeso());
		assertTrue(0.25 == liquido2.calcularPeso());
	}

}

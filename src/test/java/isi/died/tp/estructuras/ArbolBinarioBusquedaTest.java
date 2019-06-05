package isi.died.tp.estructuras;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArbolBinarioBusquedaTest {

	private ArbolBinarioBusqueda<Integer> abb1;
	private ArbolBinarioBusqueda<Integer> abb2;
	private ArbolBinarioBusqueda<Integer> abb3;

	
	@Before
	public void preTest() {
		//No Lleno, no completo
		abb1 = new ArbolBinarioBusqueda<Integer>(40);
		abb1.agregar(34);
		abb1.agregar(420);
		abb1.agregar(65);
		abb1.agregar(90);
		abb1.agregar(12);
		abb1.agregar(11);

		//Lleno y Completo
		abb2 = new ArbolBinarioBusqueda<Integer>(7);
		abb2.agregar(2);
		abb2.agregar(1);
		abb2.agregar(5);
		abb2.agregar(9);
		abb2.agregar(12);
		abb2.agregar(8);

		//No Lleno y Completo
		abb3 = new ArbolBinarioBusqueda<Integer>(7);
		abb3.agregar(2);
		abb3.agregar(1);
		abb3.agregar(5);
		abb3.agregar(9);
	
		

	}
	
	@Test
	public void testContiene() {
		Boolean obtenido = abb1.contiene(40);
		assertTrue(obtenido);
		assertFalse(abb1.contiene(3));
	}

	@Test
	public void testEqualsArbolOfE() {
		
		assertTrue(abb2.equals(abb2));
		assertFalse(abb2.equals(abb3));
	}

	@Test
	public void testProfundidad() {
		
		assertEquals(2,abb2.profundidad());
	
		
	}

	@Test
	public void testCuentaNodosDeNivel() {

		assertEquals(4,abb2.cuentaNodosDeNivel(2));
		assertEquals(2,abb2.cuentaNodosDeNivel(3));

	}

	@Test
	public void testEsCompleto() {
		assertFalse(abb1.esCompleto());
		assertTrue(abb2.esCompleto());
		assertTrue(abb3.esCompleto());
	}

	@Test
	public void testEsLleno() {
		
	 	assertFalse(abb1.esLleno());
		assertTrue(abb2.esLleno());
		assertFalse(abb3.esLleno());
	
	}

}
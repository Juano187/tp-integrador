package isi.died.tp.estructuras;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArbolBinarioBusquedaTest {

	private ArbolBinarioBusqueda<Integer> abblleno;
	private ArbolBinarioBusqueda<Integer> abblleno2;
	private ArbolBinarioBusqueda<Integer> abbCompleto;
	private ArbolBinarioBusqueda<Integer> abbraiz;
	private ArbolBinarioBusqueda<Integer> abb2;
	
	
	@Before
	public void preTest() {
		abblleno = new ArbolBinarioBusqueda<Integer>(40);
		abblleno.agregar(34);
		abblleno.agregar(420);
		abblleno.agregar(65);
		abblleno.agregar(90);
		abblleno.agregar(12);
		abblleno.agregar(11);
		
		abbCompleto = new ArbolBinarioBusqueda<Integer>(5);
		abbCompleto.agregar(34);
		abbCompleto.agregar(420);
		abbCompleto.agregar(65);
		abbCompleto.agregar(90);
		
		abblleno2 = new ArbolBinarioBusqueda<Integer>(40);
		abblleno2.agregar(34);
		abblleno2.agregar(420);
		abblleno2.agregar(65);
		abblleno2.agregar(90);
		abblleno2.agregar(12);
		abblleno2.agregar(11);
		
		abbraiz = new ArbolBinarioBusqueda<Integer>(3);
		abb2 = new ArbolBinarioBusqueda<Integer>(40);
		abb2.agregar(34);
		abb2.agregar(4);
	}
	
	@Test
	public void testContiene() {
		Boolean obtenido = abblleno.contiene(40);
		assertTrue(obtenido);
		assertFalse(abblleno.contiene(3));
	}

	@Test
	public void testEqualsArbolOfE() {
		
		assertTrue(abblleno.equals(abblleno2));
		assertFalse(abblleno.equals(abbCompleto));
	}

	@Test
	public void testProfundidad() {
		
		assertEquals(0,abbraiz.profundidad() );
	
		
	}

	@Test
	public void testCuentaNodosDeNivel() {
		assertEquals(1,abbraiz.cuentaNodosDeNivel(0));
	}

	@Test
	public void testEsCompleto() {
		assertTrue(abbraiz.esCompleto());
	}

	@Test
	public void testEsLleno() {
	 assertTrue(abbraiz.esLleno());
	
	}

}

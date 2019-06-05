package isi.died.tp.estructuras;

import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.swing.SingleSelectionModel;

import isi.died.tp.dominio.*;
import isi.died.tp.estructuras.*;

import org.junit.Before;
import org.junit.Test;

public class TestRangoABB {
	private ArbolBinarioBusqueda<Insumo> abb1;
	private ArbolBinarioBusqueda<Insumo> abb2;
	private ArbolBinarioBusqueda<Insumo> abb3;
	private Insumo insu;
	private Insumo insu1;
	private Insumo insu2;
	private Insumo insu3;
	private Insumo insu4;
	private Insumo insu5;
	ArrayList<Insumo> listaIgual ;
	ArrayList<Insumo> listaDistinta ;
	
	
	@Before
	public void preTest() {
		
		insu = new Insumo (1,40);
		insu1 = new Insumo (2,34);
		insu2 = new Insumo (3,420);
		insu3 = new Insumo (4,65);
		insu4 = new Insumo (5,90);
		insu5 = new Insumo (6,20);
		
		
		abb1 = new ArbolBinarioBusqueda<Insumo>(insu);
		abb1.agregar(insu1);
		abb1.agregar(insu2);
		abb1.agregar(insu3);
		abb1.agregar(insu4);
		abb1.agregar(insu5); 
	
		listaIgual = new ArrayList<Insumo>();
		listaIgual.add(insu5);
		listaIgual.add(insu1);
		listaIgual.add(insu);
		listaIgual.add(insu3);
		listaIgual.add(insu4);
		listaIgual.add(insu2);
		
		listaDistinta = new ArrayList<Insumo>();
		listaDistinta.add(insu);
		listaDistinta.add(insu);
		listaDistinta.add(insu);
		listaDistinta.add(insu);
		listaDistinta.add(insu);
		listaDistinta.add(insu);

		
		
		
		
	}
	
	@Test
	public void test() {


		assertFalse(abb1.rango(insu5, insu2).equals(listaDistinta));
		assertTrue(abb1.rango(insu5, insu2).equals(listaIgual));
		
		
	}

}

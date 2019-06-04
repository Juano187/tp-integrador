package isi.died.tp.estructuras;

import java.util.ArrayList;
import java.util.List;

public class PruebaArboles {
	
	public static void main(String[] args) {
	 	
		//ArbolBinarioBusqueda abbvacio = new ArbolVacio();

		ArbolBinarioBusqueda<Integer> abb1 = new ArbolBinarioBusqueda<Integer>(7);
		abb1.agregar(2);
		abb1.agregar(5);
		abb1.agregar(8);
		abb1.agregar(12);
		abb1.agregar(6);
		abb1.agregar(9);
		abb1.agregar(4);

		ArbolBinarioBusqueda<Integer> abb2 = new ArbolBinarioBusqueda<Integer>(7);
		abb2.agregar(2);
		abb2.agregar(1);
		abb2.agregar(5);
		abb2.agregar(9);
		abb2.agregar(12);
		abb2.agregar(8);

		ArbolBinarioBusqueda<Integer> abb3 = new ArbolBinarioBusqueda<Integer>(7);
		abb3.agregar(2);
		abb3.agregar(1);
		abb3.agregar(5);
		abb3.agregar(9);
		
		ArbolBinarioBusqueda<Integer> abb4 = new ArbolBinarioBusqueda<Integer>(7);
		abb4 = new ArbolBinarioBusqueda<Integer>(40);
		abb4.agregar(34);
		abb4.agregar(420);
		abb4.agregar(65);
		abb4.agregar(90);
		abb4.agregar(12);
		abb4.agregar(11);

		List<Integer> lista = abb1.inOrden();

		for(int i=0; i<lista.size(); i++){

			System.out.print(lista.get(i) + " ");

		}

		System.out.println();

		System.out.println("Contiene a "+ 4 + ": "+ abb1.contiene(4));
		System.out.println("Contiene a "+ 1 + ": "+ abb1.contiene(1));
		System.out.println("Profundidad: " + abb1.profundidad());
		System.out.println("Cuenta Nodos de Nivel "+0+ ": "+ abb1.cuentaNodosDeNivel(0));
		System.out.println("Cuenta Nodos de Nivel "+3+ ": "+ abb1.cuentaNodosDeNivel(3));
		System.out.println("Cuenta Nodos de Nivel "+1+ ": "+abb1.cuentaNodosDeNivel(1));
		System.out.println("Cuenta Nodos de Nivel "+4+ ": "+abb1.cuentaNodosDeNivel(4));
		System.out.println("Cuenta Nodos de Nivel "+2+ ": "+abb1.cuentaNodosDeNivel(2));
		System.out.println("Es lleno: "+abb1.esLleno());
		System.out.println("Es completo: "+abb1.esCompleto());
		System.out.println();
		System.out.println("Contiene a "+ 4 + ": "+ abb2.contiene(4));
		System.out.println("Contiene a "+ 1 + ": "+ abb2.contiene(1));
		System.out.println("Profundidad: " + abb2.profundidad());
		System.out.println("Cuenta Nodos de Nivel "+0+ ": "+ abb2.cuentaNodosDeNivel(0));
		System.out.println("Cuenta Nodos de Nivel "+3+ ": "+ abb2.cuentaNodosDeNivel(3));
		System.out.println("Cuenta Nodos de Nivel "+1+ ": "+abb2.cuentaNodosDeNivel(1));
		System.out.println("Cuenta Nodos de Nivel "+4+ ": "+abb2.cuentaNodosDeNivel(4));
		System.out.println("Cuenta Nodos de Nivel "+2+ ": "+abb2.cuentaNodosDeNivel(2));
		System.out.println("Es lleno: "+ abb2.esLleno());
		System.out.println("Es completo: "+abb2.esCompleto());
		System.out.println();
		System.out.println("Contiene a "+ 4 + ": "+ abb3.contiene(4));
		System.out.println("Contiene a "+ 1 + ": "+ abb3.contiene(1));
		System.out.println("Profundidad: " + abb3.profundidad());
		System.out.println("Cuenta Nodos de Nivel "+0+ ": "+ abb3.cuentaNodosDeNivel(0));
		System.out.println("Cuenta Nodos de Nivel "+3+ ": "+ abb3.cuentaNodosDeNivel(3));
		System.out.println("Cuenta Nodos de Nivel "+1+ ": "+abb3.cuentaNodosDeNivel(1));
		System.out.println("Cuenta Nodos de Nivel "+4+ ": "+abb3.cuentaNodosDeNivel(4));
		System.out.println("Cuenta Nodos de Nivel "+2+ ": "+abb3.cuentaNodosDeNivel(2));
		System.out.println("Es lleno: "+abb3.esLleno());
		System.out.println("Es completo: "+abb3.esCompleto());
		System.out.println();
		System.out.println("Contiene a "+ 4 + ": "+ abb4.contiene(4));
		System.out.println("Contiene a "+ 1 + ": "+ abb4.contiene(1));
		System.out.println("Profundidad: " + abb4.profundidad());
		System.out.println("Cuenta Nodos de Nivel "+0+ ": "+ abb4.cuentaNodosDeNivel(0));
		System.out.println("Cuenta Nodos de Nivel "+3+ ": "+ abb4.cuentaNodosDeNivel(3));
		System.out.println("Cuenta Nodos de Nivel "+1+ ": "+abb4.cuentaNodosDeNivel(1));
		System.out.println("Cuenta Nodos de Nivel "+4+ ": "+abb4.cuentaNodosDeNivel(4));
		System.out.println("Cuenta Nodos de Nivel "+2+ ": "+abb4.cuentaNodosDeNivel(2));
		System.out.println("Es lleno: "+ abb4.esLleno());
		System.out.println("Es completo: "+abb4.esCompleto());
		System.out.println();

	}


}
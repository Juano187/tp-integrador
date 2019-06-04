package isi.died.tp.estructuras;

import java.util.ArrayList;
import java.util.List;

public class ArbolBinarioBusqueda<E extends Comparable<E>> extends Arbol<E> {

	protected Arbol<E> izquierdo;
	protected Arbol<E> derecho;
	
	public ArbolBinarioBusqueda(){
		this.valor=null;
		this.izquierdo=new ArbolVacio<E>();
		this.derecho=new ArbolVacio<E>();
	}
	
	public ArbolBinarioBusqueda(E e){
		this.valor=e;
		this.izquierdo=new ArbolVacio<E>();
		this.derecho=new ArbolVacio<E>();
	}
	
	public ArbolBinarioBusqueda(E e,Arbol<E> i,Arbol<E> d){
		this.valor=e;
		this.izquierdo=i;
		this.derecho=d;
	}
	
	@Override
	public List<E> preOrden() {
		List<E> lista = new ArrayList<E>();
		lista.add(this.valor);
		lista.addAll(this.izquierdo.preOrden());
		lista.addAll(this.derecho.preOrden());
		return lista;
	}
	@Override
	public List<E> inOrden() {
		List<E> lista = new ArrayList<E>();
		lista.addAll(this.izquierdo.preOrden());
		lista.add(this.valor);
		lista.addAll(this.derecho.preOrden());
		return lista;
	}
	@Override
	public List<E> posOrden() {
		List<E> lista = new ArrayList<E>();
		lista.addAll(this.izquierdo.preOrden());
		lista.addAll(this.derecho.preOrden());
		lista.add(this.valor);
		return lista;

	}
	@Override
	public boolean esVacio() {
		return false;
	}
        
	@Override
	public E valor() {
		return this.valor;
	}
	
	@Override
	public Arbol<E> izquierdo() {
		return this.izquierdo;
	}
	
	@Override
	public Arbol<E> derecho() {
		return this.derecho;
	}


	@Override
	public void agregar(E a) {
		if(this.valor.compareTo(a)<1) {
			if (this.derecho.esVacio()) this.derecho = new ArbolBinarioBusqueda<E>(a);
			else this.derecho.agregar(a);
		}else {
			if (this.izquierdo.esVacio()) this.izquierdo= new ArbolBinarioBusqueda<E>(a);
			else this.izquierdo.agregar(a);
		}
	}
	
	@Override
	public boolean equals(Arbol<E> unArbol) {
		return this.valor.equals(unArbol.valor()) && this.izquierdo.equals(unArbol.izquierdo()) && this.derecho.equals(unArbol.derecho());
	}

	@Override
	public boolean contiene(E unValor) {
		// TODO 1.a
		if(this.valor.compareTo(unValor)==0)
			return true;

		if(this.valor.compareTo(unValor)>0) //Raiz es mayor a unValor

			return izquierdo.contiene(unValor);
		
		else{
		
			return derecho.contiene(unValor);
		
		}
		
	}

	@Override
	public int profundidad() {
		if( this.izquierdo.valor == null && this.derecho.valor == null) {
			return 0;
		}else
		{
			return 1 + Math.max(this.izquierdo.profundidad(), this.derecho.profundidad());
		}
	}

	@Override
	public int cuentaNodosDeNivel(int nivel) {
		// TODO 1.c
		if(nivel>this.profundidad()) return 0;

		if(this.esVacio()) return 0;

		if(nivel==0) return 1;

		return this.izquierdo.cuentaNodosDeNivel(nivel-1) + this.derecho.cuentaNodosDeNivel(nivel-1);
	}
	
	@Override
	public boolean esCompleto() {
		// TODO 1.d
		if(this.profundidad()==0){
			return true;
		}
		else{

			if(this.izquierdo.profundidad()-this.derecho.profundidad()==1){

				return (this.derecho.esLleno() && this.izquierdo.esCompleto());
			
			}
			else{
				if(this.izquierdo.profundidad()-this.derecho.profundidad()==0){
					return (this.izquierdo.esLleno() && this.derecho.esCompleto());
				}
				return false;
			}

		}
		
	}

	@Override
	public boolean esLleno() {
		// TODO 1.e
		return (cuentaNodosDeNivel(profundidad()))==(Math.pow(2,profundidad()));
	}


}

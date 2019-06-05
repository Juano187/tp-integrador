package isi.died.tp.dominio;

import isi.died.tp.estructuras.*;


public class Planta{

	
	private ArbolBinarioBusqueda<Insumo> listaInsumos;
	private String ciudad; //Partes, piezas, elementos a granel

	public Planta(){

	}

	public Planta(String ciu){

		ciudad = ciu;
		listaInsumos = new ArbolBinarioBusqueda<Insumo>();

	}

	public void agregarInsumo(Insumo ins){

		listaInsumos.agregar(ins);

	}

	public ArbolBinarioBusqueda<Insumo> getListaInsumos() {
		return listaInsumos;
	}

	public void setListaInsumos(ArbolBinarioBusqueda<Insumo> listaInsumos) {
		this.listaInsumos = listaInsumos;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}





}
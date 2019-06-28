package isi.died.tp.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import isi.died.tp.estructuras.*;


public class Planta{

	private int id;
	private String nombre;
	private List<Stock> listaStock= new ArrayList<Stock>();
	
	
	public double costoTotal() {
		
		double costo = this.listaStock.stream().mapToDouble(x-> x.getCostoStock()).sum();
		
		return costo;
		
	}
	
	public List<Insumo> stockEntre(int a,int b){
		
	List<Insumo> insumos= new ArrayList<Insumo>();
	List <Stock> stock =  this.listaStock.stream().filter(x->x.getCantidad()>=a && x.getCantidad() <= b).collect(Collectors.toList()); 
	insumos= stock.stream().map(Stock :: getInsumo).collect(Collectors.toList());
	return insumos;
	
	}
	
	public boolean necesitaInsumos(Insumo i) {

		 
		List <Stock> stock =  this.listaStock.stream().filter(x -> x.getInsumo().equals(i) && x.getCantidad() < x.getPuntoPedido()).collect(Collectors.toList()); 
		
		return !stock.isEmpty();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//comentado la implementacion del taller 03
	//private ArbolBinarioBusqueda<Insumo> listaInsumos;
	//private String ciudad; //Partes, piezas, elementos a granel

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Planta(){

	}

	public Planta(int id, String nombre ){
		this.id = id;
		this.nombre = nombre;
	//	ciudad = ciu;
		//listaInsumos = new ArbolBinarioBusqueda<Insumo>();

	}

	public void agregarInsumo(Insumo ins){

		//listaInsumos.agregar(ins);

	}
/*
	public ArbolBinarioBusqueda<Insumo> getListaInsumos() {
		return listaInsumos;
	}
*/
	public void setListaInsumos(ArbolBinarioBusqueda<Insumo> listaInsumos) {
		//this.listaInsumos = listaInsumos;
	}
	/*
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
*/




}
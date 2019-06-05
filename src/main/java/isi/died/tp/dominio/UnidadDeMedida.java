package isi.died.tp.dominio;

public class UnidadDeMedida{

	private double valor;
	private String unidad;

	public UnidadDeMedida(double val, String uni){

		valor=val;
		unidad=uni;

	}
	
	public UnidadDeMedida(){

	}

	public double getValor(){
		return valor;
	}

	public String getUnidad(){
		return unidad;
	}
}
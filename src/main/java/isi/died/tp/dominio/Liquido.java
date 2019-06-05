package isi.died.tp.dominio;

public class Liquido extends Insumo{

	private UnidadDeMedida densidad; //Kg/M3

	public Liquido(){
		
	}

	public Liquido(double litros, double den){

		this.unidadMed = new UnidadDeMedida(litros, "Litro");
		densidad= new UnidadDeMedida(den, "Kg/M3");

	} 

	public double calcularPeso(){

		return this.densidad.getValor()*(this.unidadMed.getValor()/1000);
	
	}

}
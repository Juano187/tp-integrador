package isi.died.tp.dominio;

public class Insumo implements Comparable<Insumo>{

	private int id;
	private String descripcion; //Partes, piezas, elementos a granel
	protected UnidadDeMedida unidadMed; //Kilo, Pieza, Gramo, Metro, Litro, M3, etc. Calcula el costo
	private double costo;
	private int stock;
	
	
	public int getId() {
		return id;
	} 
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setUnidadMed(UnidadDeMedida unidadMed) {
		this.unidadMed = unidadMed;
	}
	public UnidadDeMedida getUnidad(){
		return getUnidad();
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public double getKg() {
		return kg;
	}
	public void setKg(double kg) {
		this.kg = kg;
	}
	public boolean isEsRefrigerado() {
		return esRefrigerado;
	}
	public void setEsRefrigerado(boolean esRefrigerado) {
		this.esRefrigerado = esRefrigerado;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getStock(){
		return stock;
	}
	

	private double kg;
	private boolean esRefrigerado;

	public Insumo(int iden, String desc, UnidadDeMedida unidad, int st, int cos, int valorkg, boolean refrigerado){

		id=iden;
		descripcion=desc;
		unidadMed=unidad;
		stock=st;
		costo=cos;
		kg=valorkg;
		esRefrigerado=refrigerado;
		

	}
	public Insumo(){

	}
	public Insumo(int id, int st) {
		this.id = id;
		this.stock = st;
	}
	public boolean equals(Insumo a ) {
		return (this.id == a.getId());
		
	}
	public int compareTo(Insumo ins2){

		return (int) (this.stock - ins2.getStock());

	}



}
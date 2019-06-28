package isi.died.tp.dominio;

public class Stock {

	
	private int id;
	private int cantidad;
	private int puntoPedido;
	private Insumo insumo;
	
	public Stock(){
		
	}

	//TODO aca esta el costo del insumo del stock
	public double getCostoStock() {
		return (this.cantidad*this.insumo.getCosto());
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPuntoPedido() {
		return puntoPedido;
	}

	public void setPuntoPedido(int puntoPedido) {
		this.puntoPedido = puntoPedido;
	}

	public Insumo getInsumo() {
		return insumo;
	}

	public void setInsumo(Insumo insumo) {
		this.insumo = insumo;
	}
	
	
	
	
	
	
}

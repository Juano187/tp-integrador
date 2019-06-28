package isi.died.tp.estructuras;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

import isi.died.tp.dominio.Insumo;
import isi.died.tp.dominio.Planta;


public class GrafoPlanta extends Grafo<Planta> {
	
	public void imprimirDistanciaAdyacentes(Planta inicial) {
	
		List<Planta> adyacentes = super.getAdyacentes(inicial);

		for(Planta unAdyacente: adyacentes) {
	
			Arista<Planta> camino = super.buscarArista(inicial, unAdyacente);

			System.out.println("camino de "+inicial.getNombre()+" a "+	unAdyacente.getNombre()+ " tiene valor de "+ camino.getValor() );
			}
	}

	public Planta buscarPlanta(Planta inicial, Insumo i, Integer saltos) {
		
		ArrayList<Planta> visitados = new ArrayList<Planta>();
		visitados.add(inicial);
		return buscarPlanta2(inicial, i, saltos, visitados);
		
		
	}
	
	public Planta buscarPlanta2(Planta inicial, Insumo i, Integer saltos, ArrayList<Planta> vis) {
		
		if(saltos<0) return null;
		
		if(!vis.contains(inicial) && inicial.necesitaInsumos(i)) {
			return inicial;
		}else {
			
			if(!vis.contains(inicial)) vis.add(inicial);
			List<Planta> adyacente = this.getAdyacentes(inicial);
			for(Planta a: adyacente) {
				if(!vis.contains(a))	
					this.buscarPlanta2(a, i, saltos-1, vis);
			}
				
		}
		return null;
		
	}
}
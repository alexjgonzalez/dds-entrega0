package dds.entrega0.operaciones;

import java.util.ArrayList;
import java.util.List;

import dds.entrega0.operaciones.Estado;
import dds.entrega0.operaciones.Item;

public class Egreso {
	
	private Estado estado = Estado.ABIERTO;
	
	private List<Item> items = new ArrayList<Item>();

	public Egreso() {
		// TODO Auto-generated constructor stub
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public void addItem(Item unItem) {
		items.add(unItem);
	}
	

}

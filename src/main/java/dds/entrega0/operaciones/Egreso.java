package dds.entrega0.operaciones;

import java.util.ArrayList;
import java.util.List;

import dds.entrega0.documentos.DocumentoComercial;
import dds.entrega0.items.Item;
import dds.entrega0.operaciones.Estado;

public abstract class Egreso {
	
	private Estado estado = Estado.ABIERTO;
	
	private List<Item> items = new ArrayList<Item>();
	
	private DocumentoComercial documentoComercial;
	
	public Estado getEstado() {
		return estado;
	}
	
	public void agregarItem(Item unItem) {
		items.add(unItem);
	}
	
	public void cerrarOperacion() {
		items.forEach(unItem -> unItem.cerrarPrecio());
		this.estado = Estado.CERRADO;
	}
	
	public int compraTotal() {
		//return items.stream().map(unItem -> unItem.precio()).sum();
		return items.stream().mapToInt(unItem -> unItem.precio()).sum();
	}
	
	public boolean solicitaRemito() {
		return items.stream().allMatch(unItem -> unItem.requiereRemito());
	}

	public DocumentoComercial getDocumentoComercial() {
		return documentoComercial;
	}

	public void setDocumentoComercial(DocumentoComercial documentoComercial) {
		this.documentoComercial = documentoComercial;
	}

}

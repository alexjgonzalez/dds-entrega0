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
	
	public void addItem(Item unItem) {
		items.add(unItem);
	}
	
	public void cerrarOperacion() {
		this.estado = Estado.CERRADO;
	}

	public DocumentoComercial getDocumentoComercial() {
		return documentoComercial;
	}

	public void setDocumentoComercial(DocumentoComercial documentoComercial) {
		this.documentoComercial = documentoComercial;
	}

}

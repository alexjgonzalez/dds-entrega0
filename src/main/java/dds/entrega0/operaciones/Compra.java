package dds.entrega0.operaciones;

import java.time.LocalDate;

import dds.entrega0.documentos.Remito;

public class Compra extends Egreso {

	public Compra() {
		// TODO Auto-generated constructor stub
	}
	
	public void generarRemito(LocalDate fecha, String detalle, int precio, int numero) {
		if(this.solicitaRemito()) {
			Remito remitoCompraArticulos = new Remito(fecha, detalle, precio, numero);
			this.setDocumentoComercial(remitoCompraArticulos);
		}
		
	}

}

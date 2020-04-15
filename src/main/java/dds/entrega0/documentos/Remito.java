package dds.entrega0.documentos;

import java.time.LocalDate;

public class Remito extends DocumentoComercial {

	int nro;
	
	public Remito ( LocalDate fecha, String detalle, int precio, int numero) {
		super(fecha, detalle, precio);
		this.nro = numero;
		this.setNomenclador("R");
	}

	public int getNro() {
		return nro;
	}

	public void setNro(int nro) {
		this.nro = nro;
	}
	
}

package dds.entrega0.documentos;

import java.time.LocalDate;

public class Remito extends DocumentoComercial {

	int nro;
	
	Remito ( LocalDate fecha, String detalle, int numero) {
		super(fecha, detalle);
		this.nro = numero;
	}

	public int getNro() {
		return nro;
	}

	public void setNro(int nro) {
		this.nro = nro;
	}
}

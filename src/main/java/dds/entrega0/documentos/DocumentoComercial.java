package dds.entrega0.documentos;

import java.time.LocalDate;

public abstract class DocumentoComercial {

	LocalDate fecha;
	String detalle;
	
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	
	public String getDetalle() {
		return detalle;
	}
	
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
}

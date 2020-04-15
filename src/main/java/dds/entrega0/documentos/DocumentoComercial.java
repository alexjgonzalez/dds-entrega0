package dds.entrega0.documentos;

import java.time.LocalDate;

public abstract class DocumentoComercial {

	LocalDate fecha;
	String detalle;
	int precio;
	String nomenclador = "X";
	
	public DocumentoComercial(LocalDate fecha, String detalles, int precio) {
		this.fecha = fecha;
		this.detalle = detalles;
		this.precio = precio;
	}
	
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
	
	public void setNomenclador(String nomenclador) {
		this.nomenclador = nomenclador;
	}
	
	public String getNomenclador() {
		return this.nomenclador;
	}
	
}

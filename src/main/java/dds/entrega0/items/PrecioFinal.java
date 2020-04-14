package dds.entrega0.items;

import dds.entrega0.exceptions.CambiarPrecioFinalException;

public class PrecioFinal implements PrecioTipo {

	public void validarCambio(int nuevoPrecio) {
		throw new CambiarPrecioFinalException("La operacion de Compra está Cerrada. No se puede cambiar el Precio");
	}
}

package dds.entrega0.items;

public abstract class Item {
	
	String nombre;
	int precio;
	PrecioTipo precioTipo = new PrecioLista();
	
	Item(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public int precio() {
		return precio;
	}
	
	public void actualizarPrecio(int unPrecio) {
		precioTipo.validarCambio(unPrecio);
		this.precio = unPrecio;
	}
	
	public void cerrarPrecio() {
		precioTipo = new PrecioFinal();
	}
	
	public boolean requiereRemito() {
		return true;
	}


}

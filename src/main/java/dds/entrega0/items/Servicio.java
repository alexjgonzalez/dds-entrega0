package dds.entrega0.items;

public class Servicio extends Item {

	public Servicio(String nombre, int precio) {
		super(nombre, precio);
	}
	
	@Override
	public boolean requiereRemito() {
		return false;
	}

}

package dds;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

import dds.entrega0.items.Articulo;
import dds.entrega0.items.Servicio;
import dds.entrega0.operaciones.Compra;
import dds.entrega0.operaciones.Egreso;
import dds.entrega0.exceptions.CambiarPrecioFinalException;

public class OperacionesTest {
	
	Compra compraArticulos;
	Compra compraServicios;
	Compra compraArticulosServicios;
	Articulo lavandina = new Articulo("Lavandina",150);
	Articulo alcoholEnGel = new Articulo("Alcohol en Gel",150);
	Articulo barbijo = new Articulo("Barbijo",250);
		
	Servicio limpieza = new Servicio("Limpieza Oficina",1500);
	Servicio reparacionNotebook = new Servicio("Reparación de Notebook",3500);
	Servicio plomero = new Servicio("Cambio de grifos cocina",4500);

	@Before
	public void setearInicio() {
		compraArticulos = new Compra();
		compraArticulos.agregarItem(lavandina);
		compraArticulos.agregarItem(barbijo);
		
		compraServicios = new Compra();
		compraServicios.agregarItem(limpieza);
		
		compraArticulosServicios = new Compra();
		compraArticulosServicios.agregarItem(plomero);
		compraArticulosServicios.agregarItem(limpieza);
		compraArticulosServicios.agregarItem(reparacionNotebook);
		
	}
	
	@Test
	public void testPrecioCompraArticulos() {
		Assert.assertEquals(400, compraArticulos.compraTotal());
	}
	
	@Test
	public void testPrecioCompraServicios() {
		Assert.assertEquals(1500, compraServicios.compraTotal());
	}
	
	@Test
	public void testPrecioCompraArticulosServicios() {
		compraArticulosServicios.cerrarOperacion();
		Assert.assertEquals(9500, compraArticulosServicios.compraTotal());
	}
	
	@Test
	public void testCambioPrecioCompraAbierta() {
		lavandina.actualizarPrecio(200);
		Assert.assertEquals(450, compraArticulos.compraTotal());
	}
	
	@Test
	public void testCambioPrecioCompraCerrada() {
		
		try {
			compraArticulos.cerrarOperacion();
			lavandina.actualizarPrecio(200);
			Assert.assertEquals(400, compraArticulos.compraTotal());
			Assert.fail("Error");
			}
			catch(CambiarPrecioFinalException excepcion) {
				String message = "La operacion de Compra está Cerrada. No se puede cambiar el Precio";
				Assert.assertEquals(message, excepcion.getMessage());
			}
	}
	
	@Test
	public void testCambioPrecioCompraCerrada() {
		
		try {
			compraArticulos.cerrarOperacion();
			lavandina.actualizarPrecio(200);
			Assert.assertEquals(400, compraArticulos.compraTotal());
			Assert.fail("Error");
			}
			catch(CambiarPrecioFinalException excepcion) {
				String message = "La operacion de Compra está Cerrada. No se puede cambiar el Precio";
				Assert.assertEquals(message, excepcion.getMessage());
			}
	}
	
	

}

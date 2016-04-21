package cl.ubb.agil;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ProductoTest {
	@Test
	public void TestGetStockProducto() {
		/*Arrange*/
		Categoria cat= new Categoria("Bebida","2001");
		Producto producto = new Producto ("Cocacola", 2, 20, cat);
		/*Act*/
		int stock = producto.getStock();		
		/*Assert*/
		assertThat(stock,is(0));
	}
	@Test
	public void TestIsBajoStockTrue() {
		/*Arrange*/
		Producto producto = new Producto ("Cocacola", 2, 20);
		/*Act*/
		boolean verdad = producto.isBajoStock();		
		/*Assert*/
		assertThat(verdad,is(true));
	}
	@Test
	public void TestGetStockFaltante() {
		/*Arrange*/
		Producto producto = new Producto ("Cocacola", 2, 20);
		/*Act*/
		int stock = producto.getStockFaltante();		
		/*Assert*/
		assertThat(stock,is(20));
	}

}

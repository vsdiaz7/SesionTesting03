package cl.ubb.agil;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CategoriaTest {

	@Test
	public void TestGetNombreCategoria() {
		/*Arrange*/
		Categoria categoria = new Categoria("Lacteos", "2001");
		/*Act*/
		String nombreCat= categoria.getNombre();		
		/*Assert*/
		assertThat(nombreCat,is("Lacteos"));
	}
	
	@Test
	public void TestGetCodigoCategoria5dig() {
		/*Arrange*/
		Categoria categoria = new Categoria("Lacteos", "20001");
		/*Act*/
		String CodigoCat= categoria.getCodigo();		
		/*Assert*/
		assertThat(CodigoCat,is("20001"));
	}
	
	@Test
	public void TestSetNombreCategoria() {
		/*Arrange*/
		Categoria categoria = new Categoria("Lacteos", "2001");
		/*Act*/
		categoria.setNombre("Bebidas");
		String nombreCat= categoria.getNombre();		
		/*Assert*/
		assertThat(nombreCat,is("Bebidas"));
	}
	
	@Test
	public void TestSetCodigoCategoria() {
		/*Arrange*/
		Categoria categoria = new Categoria("Lacteos", "2001");
		/*Act*/
		categoria.setCodigo("0000");
		String nombreCat= categoria.getCodigo();		
		/*Assert*/
		assertThat(nombreCat,is("0000"));
	}
	
}

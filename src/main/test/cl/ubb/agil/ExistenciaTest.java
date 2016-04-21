package cl.ubb.agil;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ExistenciaTest {

	@Test
	public void TestGetExistencia() {
		/*Arrange*/
		Existencia existencia = new Existencia("91991");
		/*Act*/
		String numeroExistencia= existencia.getNumero();		
		/*Assert*/
		assertThat(numeroExistencia,is("91991"));
	}
	
}

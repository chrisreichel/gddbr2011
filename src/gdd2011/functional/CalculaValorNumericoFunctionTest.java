package gdd2011.functional;

import static org.junit.Assert.*;
import gdd2011.GDDExercises;

import org.junit.Before;
import org.junit.Test;

public class CalculaValorNumericoFunctionTest {

	@Test
	public void testCalculaValorNumerico(){
		//Given
		final CalculaValorNumericoFunction f = new CalculaValorNumericoFunction();
		final Long expected = 9344115L; 
		final String palavra = "zgbhkc";

		//When
		final Long actual = f.apply(palavra);
		
		//Then
		assertEquals(expected, actual);
	}

}

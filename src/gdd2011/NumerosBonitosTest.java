package gdd2011;

import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.junit.Test;

public class NumerosBonitosTest {

	@Test
	public void testObtemNumerosBonitosDeA() {
		//Given
		final GDDExercises p = new GDDExercises("/texto_a.txt");
		final int expected = 79;

		//When
		final Collection<Long> actual = p.obtemNumerosBonitos();

		//Then
		assertEquals(expected, actual.size());
	}
	
	@Test
	public void testObtemNumerosBonitosDeB() {
		//Given
		final GDDExercises p = new GDDExercises("/texto_b.txt");

		//When
		final Collection<Long> actual = p.obtemNumerosBonitos();

		System.out.println("Numero de numeros bonitos no texto B: " + actual.size());
	}
}

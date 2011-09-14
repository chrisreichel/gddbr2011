package gdd2011;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class ProposicoesTest {

	@Test
	public void testCalculaNumeroDePreposicoesTextoA() {
		//Given
		final GDDExercises p = new GDDExercises("/texto_a.txt");
		final int expected = 63;

		//When
		final int atual = p.obtemPreposicoes().size();
		
		//Then
		System.out.println("Total de preposicoes: " + atual);
		assertEquals(expected, atual);
	}
	
}

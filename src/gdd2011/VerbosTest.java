package gdd2011;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VerbosTest {

	@Test
	public void testCalculaNumeroDeVerbosTextoA() {
		//Given
		final GDDExercises p = new GDDExercises("/texto_a.txt");
		final int expected = 70;

		//When
		final int atual = p.obtemVerbos().size();
		
		//Then
		System.out.println("Total de verbos: " + atual);
		assertEquals(expected, atual);
	}
	
	@Test
	public void testCalculaNumeroDeVerbosEmPrimeiraPessoaTextoA() {
		//Given
		final GDDExercises p = new GDDExercises("/texto_a.txt");
		final int expected = 52;

		//When
		final int atual = p.obtemVerbosEmPrimeiraPessoa().size();
		
		//Then
		System.out.println("Total de verbos em 1ª pessoa: " + atual);
		assertEquals(expected, atual);
	}

}

package gdd2011;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Collections2;
import com.google.common.collect.Iterables;

public class VocabularioTest {
	
	@Test
	public void testVocabularioA() {
		//Given
		final GDDExercises p = new GDDExercises("/texto_a.txt");
		final Collection<String> expected = new GDDExercises().loadFile("/vocabulario_ordenado_a.txt");
		System.out.println("O vocabulario tem: " + expected.size() + " palavras");
		//When
		final Collection<String> actual = p.obtemVocabulario();
		
		//Then
		assertEquals(expected.size(), actual.size());
		
		final List<String> esperados = new ArrayList<String>();
		final List<String> atuais = new ArrayList<String>();
		
		Iterables.addAll(esperados, expected);
		Iterables.addAll(atuais, actual);
		
		for(int i=0; i < esperados.size(); i++) {
			assertEquals(esperados.get(i), atuais.get(i));
		}
	}
	
	@Test
	public void testVocabularioB() {
		//Given
		final GDDExercises p = new GDDExercises("/texto_b.txt");
		File file = new File("C:\\Temp\\vocabulario_b.txt");
		
		//When
		final Collection<String> vocabulario = p.obtemVocabulario();
		p.persisteVocabulario(file, vocabulario);
		
		//Then
		assertTrue(p.getTodasAsLinhas().size() >= vocabulario.size());
	}

}

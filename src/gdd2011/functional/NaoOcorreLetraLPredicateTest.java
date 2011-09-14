package gdd2011.functional;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NaoOcorreLetraLPredicateTest {

	private NaoOcorreLetraLPredicate p = null;
	
	@Before
	public void setUp() throws Exception {
		
		p = new NaoOcorreLetraLPredicate();
		
	}
	
	@Test
	public void testNaoContemL() {
		//GIVEN
		final String input = "cachorro";
		//WHEN
		final boolean actual = p.apply(input);
		//THEN
		assertTrue(actual);
	}
	
	@Test
	public void testContemLNoInicio() {
		//GIVEN
		final String input = "Ludico";
		//WHEN
		final boolean actual = p.apply(input);
		//THEN
		assertTrue(!actual);
	}
	
	@Test
	public void testContemLNoMeio() {
		//GIVEN
		final String input = "almeida";
		//WHEN
		final boolean actual = p.apply(input);
		//THEN
		assertTrue(!actual);		
	}
	
	@Test
	public void testContemLNoFim() {
		//GIVEN
		final String input = "papl";
		//WHEN
		final boolean actual = p.apply(input);
		//THEN
		assertTrue(!actual);
	}
	
	@Test
	public void testSoContemL() {
		//GIVEN
		final String input = "lLlLLLL";
		//WHEN
		final boolean actual = p.apply(input);
		//THEN
		assertTrue(!actual);
	}
	
	@Test
	public void testContemLInicioMeioEFim() {
		//GIVEN
		final String input = "laLal";
		//WHEN
		final boolean actual = p.apply(input);
		//THEN
		assertTrue(!actual);
	}

}

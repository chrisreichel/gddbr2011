package gdd2011.functional;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TerminaComLetraTipoBarPredicateTest {

	TerminaComLetraTipoBarPredicate p = null;

	@Before
	public void setUp() throws Exception {
		p = new TerminaComLetraTipoBarPredicate();
	}

	@Test
	public void testApply() {
		// Given
		final String palavra = "macaco";
		
		// When
		final boolean retVal = p.isTerminaEmBar(palavra);
		
		// Then
		assertTrue(retVal);
	}

	@Test
	public void testIsTerminaEmBarOK() {
		// Given
		final String palavra = "maça";
		
		// When
		final boolean retVal = p.isTerminaEmBar(palavra);
		
		// Then
		assertTrue(retVal);
	}

	@Test
	public void testIsNaoTerminaEmBar() {
		// Given (foo: m, h, q, w e b)
		final String palavra = "malam";
		
		// When
		final boolean retVal = p.isTerminaEmBar(palavra);
		
		// Then
		assertTrue(!retVal);
	}

}

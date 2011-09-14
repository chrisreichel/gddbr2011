package gdd2011.functional;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ComecaComLetraTipoBarPredicateTest {

	private ComecaComLetraTipoBarPredicate p = null;
	
	@Before
	public void setUp() throws Exception {
		p = new ComecaComLetraTipoBarPredicate();
	}

	@Test
	public void testApply() {
		// Given
		final String palavra = "xilofone";
		
		// When
		final boolean retVal = p.isComecaEmBar(palavra);
		
		// Then
		assertTrue(retVal);
	}

	@Test
	public void testIsComecaEmBarOK() {
		// Given
		final String palavra = "tomate";
		
		// When
		final boolean retVal = p.isComecaEmBar(palavra);
		
		// Then
		assertTrue(retVal);
	}

	@Test
	public void testIsNaoComecaEmBar() {
		// Given (foo: m, h, q, w e b)
		final String palavra = "malam";
		
		// When
		final boolean retVal = p.isComecaEmBar(palavra);
		
		// Then
		assertTrue(!retVal);
	}


}

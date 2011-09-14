package gdd2011.functional;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DeveTer4LetrasPredicateTest {

	private DeveTer4LetrasPredicate p = null;
	
	@Before
	public void setUp() throws Exception {
		p = new DeveTer4LetrasPredicate();
	}

	@Test
	public void testTerminaCom4OK() {
		//GIVEN
		final String palavra = "mala";
		
		//WHEN
		final boolean retVal = p.apply(palavra);
		
		//THEN
		assertTrue(retVal);
	}

	@Test
	public void testTerminaCom5() {
		//GIVEN
		final String palavra = "carro";
		
		//WHEN
		final boolean retVal = p.apply(palavra);
		
		//THEN
		assertTrue(!retVal);
	}
	
	@Test
	public void testTerminaCom3() {
		//GIVEN
		final String palavra = "pau";
		
		//WHEN
		final boolean retVal = p.apply(palavra);
		
		//THEN
		assertTrue(!retVal);
	}
	
}

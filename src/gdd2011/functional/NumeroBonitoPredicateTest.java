package gdd2011.functional;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumeroBonitoPredicateTest {

	@Test
	public void testApply() {
		//Given
		final NumeroBonitoPredicate p = new NumeroBonitoPredicate();
		final Long seed = 526112L;
		
		//When and Then
		assertTrue(p.apply(seed));
	}

	@Test
	public void testApplyFalse() {
		//Given
		final NumeroBonitoPredicate p = new NumeroBonitoPredicate();
		final Long seed = 526113L;
		
		//When and Then
		assertTrue(!p.apply(seed));
	}
	
	@Test
	public void testApplyFalseMinor() {
		//Given
		final NumeroBonitoPredicate p = new NumeroBonitoPredicate();
		final Long seed = 4L;
		
		//When and Then
		assertTrue(!p.apply(seed));
	}
}

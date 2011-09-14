package gdd2011.utils;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class GOOGLONTest {

	// bscjfgwnhtqvdrlzxmkp
	@Test
	public void testGooglonHashFactory() {
		//Given
		final GOOGLON f = new GOOGLON();

		//When
		final Map<String, Integer> hash = f.googlonHashFactory();
		
		//Then
		assertTrue(19 == hash.get("p"));
		assertTrue(0 == hash.get("b"));
		assertTrue(1 == hash.get("s"));
		assertTrue(18 == hash.get("k"));
		assertTrue(5 == hash.get("g"));
		
	}

}

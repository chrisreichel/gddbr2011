package gdd2011.functional;

import com.google.common.base.CharMatcher;
import com.google.common.base.Predicate;

public class NaoOcorreLetraLPredicate implements Predicate<String> {

	@Override
	public boolean apply(String input) {

		if(input != null && !"".equals(input)){
			final CharMatcher matcher = CharMatcher.anyOf("lL");
			return matcher.matchesNoneOf(input);
		}
		
		return false;
	}

}

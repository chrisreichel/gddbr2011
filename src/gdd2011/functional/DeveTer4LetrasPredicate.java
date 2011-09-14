package gdd2011.functional;

import com.google.common.base.Predicate;

public class DeveTer4LetrasPredicate implements Predicate<String> {

	@Override
	public boolean apply(String input) {

		if(input != null && input.length() == 4){
			return true;
		}

		return false;
	}

}

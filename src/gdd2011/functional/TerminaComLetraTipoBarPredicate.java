package gdd2011.functional;

import gdd2011.utils.GOOGLON;

import com.google.common.base.Predicate;

public class TerminaComLetraTipoBarPredicate implements Predicate<String> {

	@Override
	public boolean apply(String input) {

		if(input != null && !"".equals(input)){
			return isTerminaEmBar(input);
		}
		
		return false;
	}

	public boolean isTerminaEmBar(String value){
		char end = value.charAt(value.length() - 1);
		final String key = String.valueOf(end);
		return !GOOGLON.letrasFooFactory().containsKey(key);
	}
	
}

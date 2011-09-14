package gdd2011.functional;

import gdd2011.utils.GOOGLON;

import com.google.common.base.Predicate;

public class ComecaComLetraTipoBarPredicate implements Predicate<String> {

	@Override
	public boolean apply(String input) {

		if(input != null && !"".equals(input)){
			return isComecaEmBar(input);
		}
		
		return false;
	}

	public boolean isComecaEmBar(String value){
		char end = value.charAt(0);
		final String key = String.valueOf(end);
		return !GOOGLON.letrasFooFactory().containsKey(key);
	}

}

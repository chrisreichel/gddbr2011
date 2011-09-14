package gdd2011.functional;

import gdd2011.utils.GOOGLON;

import com.google.common.base.Predicate;

public class NumeroBonitoPredicate implements Predicate<Long> {

	/**
	 * Os Googlons consideram um número bonito se ele satizfaz essas duas propriedades:
    	é maior ou igual a 526112
    	é divisível por 4
	 */
	@Override
	public boolean apply(Long numero) {

		return (numero >= GOOGLON.VL_MIN_NUM_BONITO && numero%4 == 0);
	}

}

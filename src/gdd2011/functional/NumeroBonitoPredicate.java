package gdd2011.functional;

import gdd2011.utils.GOOGLON;

import com.google.common.base.Predicate;

public class NumeroBonitoPredicate implements Predicate<Long> {

	/**
	 * Os Googlons consideram um n�mero bonito se ele satizfaz essas duas propriedades:
    	� maior ou igual a 526112
    	� divis�vel por 4
	 */
	@Override
	public boolean apply(Long numero) {

		return (numero >= GOOGLON.VL_MIN_NUM_BONITO && numero%4 == 0);
	}

}

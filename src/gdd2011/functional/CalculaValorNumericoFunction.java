package gdd2011.functional;

import gdd2011.utils.GOOGLON;

import java.util.Map;

import com.google.common.base.Function;

/**
 * no Googlon, as palavras também são números dados em base 20, onde cada letra é um dígito, 
 * e os dígitos são ordenados do menos significativo para o mais significativo 
 * (o inverso do nosso sistema). 
 * Ou seja, a primeira posição é a unidade, a segunda posição vale 20, 
 * a terceira vale 400, e assim por diante. Os valores das letras são 
 * dados pela ordem em que elas aparecem no alfabeto Googlon (que é diferente da nossa ordem)
 */
public class CalculaValorNumericoFunction implements Function<String, Long> {

	@Override
	public Long apply(String palavra) {
		final Map<String, Integer> hashAlfabeto = GOOGLON.googlonHashFactory();
		long valorNumerico = 0L;
		for(int i=0; i < palavra.length(); i++){
			String letra = palavra.charAt(i) + "";
			long valorCasa = (long) Math.pow(GOOGLON.BASE_NUMERICA_GOOGLE, i);
			int valorHash = hashAlfabeto.get(letra);
			valorNumerico += valorCasa * valorHash;
		}
		return valorNumerico;
	}

}

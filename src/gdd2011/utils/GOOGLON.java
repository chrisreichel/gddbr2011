package gdd2011.utils;

import java.text.ParseException;
import java.text.RuleBasedCollator;
import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Splitter;
import com.google.common.collect.Ordering;

/**
 * Primeiramente, as letras Googlon são classificadas em dois grupos: as letras m, h, q, w e b 
 * são chamadas "letras tipo foo", enquanto que as demais são conhecidas como "letras tipo bar".
 * 
 * @author e106005
 */
public final class GOOGLON {

	public static final double BASE_NUMERICA_GOOGLE = 20.0;
	public static final long VL_MIN_NUM_BONITO = 526112;
	
	public static Map<String, Boolean> letrasFooFactory(){

		final Map<String, Boolean> foo = new HashMap<String, Boolean>();
		
		foo.put("m", true);
		foo.put("h", true);
		foo.put("q", true);
		foo.put("w", true);
		foo.put("b", true);
		
		return foo;
	}

	/**
	 * O alfabeto Googlon, em ordem, é: <pre>bscjfgwnhtqvdrlzxmkp</pre>
	 * <a href="http://blogs.oracle.com/CoreJavaTechTips/entry/sorting_strings">REf</a>
	 * @return
	 */
	public static RuleBasedCollator collatorDeOrdemFactory(){
		final String regras = "< b, B < s, S < c, C < j, J < f, F < g, G < w, W < n, N < h, H < t, T < q, Q < v, V < d, D < r, R < l, L < z, Z < x, X < m, M < k, K < p";
		RuleBasedCollator rule = null;
		try {
			rule = new RuleBasedCollator(regras);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return rule;
	}
	
	/**
	 * a primeira letra do alfabeto Googlon representa o dígito 0, a segunda representa o dígito 1, 
	 * e assim por diante.
	 * @return
	 */
	public static Map<String, Integer> googlonHashFactory(){
		final String alfabeto = "b,s,c,j,f,g,w,n,h,t,q,v,d,r,l,z,x,m,k,p";
		final Map<String, Integer> hashAlfabeto = new HashMap<String, Integer>();
		final Iterable<String> split = Splitter.on(",").omitEmptyStrings().trimResults().split(alfabeto);
		int value = 0;
		for (String letra : split) {
			hashAlfabeto.put(letra, value);
			value++;
		}
		return hashAlfabeto;
	}
}

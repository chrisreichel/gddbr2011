package gdd2011;

import static com.google.common.collect.Collections2.filter;
import gdd2011.functional.CalculaValorNumericoFunction;
import gdd2011.functional.ComecaComLetraTipoBarPredicate;
import gdd2011.functional.DeveTer4LetrasPredicate;
import gdd2011.functional.DeveTerNoMinimo8LetrasPredicate;
import gdd2011.functional.NaoOcorreLetraLPredicate;
import gdd2011.functional.NumeroBonitoPredicate;
import gdd2011.functional.TerminaComLetraTipoBarPredicate;
import gdd2011.utils.GOOGLON;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;

import com.google.common.base.Charsets;
import com.google.common.base.Splitter;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterables;
import com.google.common.io.Files;

public class GDDExercises {

	private Collection<String> todasAsLinhas = null;

	public GDDExercises(){}
	
	public GDDExercises(String fileLocation) {
		todasAsLinhas = loadFile(fileLocation);
	}

	public Collection<String> loadFile(String fileLocation) {
		final File file = new File(getClass().getResource(fileLocation)
				.getFile());
		final Collection<String> todasAsLinhas = new ArrayList<String>();
		try {
			List<String> input = Files.readLines(file, Charsets.UTF_8);
			Iterables.addAll(todasAsLinhas, Splitter.on(' ').trimResults()
					.omitEmptyStrings().split(input.get(0)));
			input = null; // GC friend
		} catch (IOException e) {
			e.printStackTrace();
		}
		return todasAsLinhas;
	}

	/**
	 * Os linguistas descobriram que as preposições em Googlon são as palavras 
	 * de 4 letras que terminam numa letra tipo bar, mas onde não ocorre a letra l.
	 * 
	 * @return
	 */
	public Collection<String> obtemPreposicoes() {
		Collection<String> lines = 
				filter(
						filter(
								filter(todasAsLinhas, new DeveTer4LetrasPredicate()),
						new TerminaComLetraTipoBarPredicate()),
				new NaoOcorreLetraLPredicate());
		return lines;
	}

	/**
	 * no Googlon, os verbos sempre são palavras de 8 ou mais letras que terminam numa letra tipo bar
	 * @return
	 */
	public Collection<String> obtemVerbos(){
		Collection<String> lines = 
						filter(
								filter(todasAsLinhas, new DeveTerNoMinimo8LetrasPredicate()),
						new TerminaComLetraTipoBarPredicate());

		return lines;
	}
	
	/**
	 * se um verbo começa com uma letra tipo bar, o verbo está em primeira pessoa
	 * @return
	 */
	public Collection<String> obtemVerbosEmPrimeiraPessoa(){
		
		return filter(obtemVerbos(), new ComecaComLetraTipoBarPredicate());
	}
	
	/**
	 * criar uma lista de vocabulário para cada texto, isto é, uma lista ordenada (e sem repetições) 
	 * das palavras que aparecem em cada um dos textos.
	 * Essas listas devem estar ordenadas e não podem conter repetições de palavras. 
	 * No Googlon, assim como no nosso alfabeto, as palavras são ordenadas lexicograficamente, 
	 * mas o problema é que no Googlon, a ordem das letras no alfabeto é diferente da nossa. 
	 * O alfabeto Googlon, em ordem, é: <pre>bscjfgwnhtqvdrlzxmkp</pre>
	 * @return
	 */
	public Collection<String> obtemVocabulario(){
		
		System.out.println("Numero de palavras total: " + todasAsLinhas.size());
		Set<String> linhasDesordenadasSet = new HashSet<String>(todasAsLinhas);
		System.out.println("Numero de palavras unicas: " + linhasDesordenadasSet.size());

		List<String> linhas = new ArrayList<String>(linhasDesordenadasSet);
		
		Collections.sort(linhas, GOOGLON.collatorDeOrdemFactory());
		
		return linhas;
	}
	
	/*
	 * Gera um arquivo com o conteúdo da collection, pronto para ser enviado ao GDD2011
	 */
	public void persisteVocabulario(File file, Collection<String> vocabulario){
		try {
			FileUtils.writeLines(file, vocabulario, " ");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return
	 */
	public Collection<Long> obtemNumerosBonitos(){
		 
		return filter(Collections2.transform(todasAsLinhas, new CalculaValorNumericoFunction()), new NumeroBonitoPredicate());
	}
	
	/**
	 * 
	 * @return
	 */
	public Collection<String> getTodasAsLinhas(){
		return this.todasAsLinhas;
	}
}

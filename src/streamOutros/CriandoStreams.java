package streamOutros;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
		//Metodo sem retorno
		//Consumer<String> print = System.out::print;
		Consumer<Object> print = System.out::print;
		
		Stream<String> langs = Stream.of("Java ", "Lua " , "JS\n" );
		langs.forEach(print);
		
		//Stream a partir de 1 array
		String[] maisLangs = {"Python ","Lisp ","Perl ", "Go\n" };
		Stream.of(maisLangs).forEach(print);
		
		//Stream a partir de arrays
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs,1,3).forEach(print);
		
		//Stream a partir da collection
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin ");
		System.out.println("\nStream Sequencial");
		outrasLangs.stream().forEach(print);
		System.out.println("\nParalelo Stream - Não segue a ordem");
		outrasLangs.parallelStream().forEach(print);
		
		System.out.println("\nStream Generaty- Não tem fim nem ordenação");
		//Supplier é uma função lambda que nao recebe param, mas retorna algo.//generate(()-> "a") = infinito
		//Stream.generate(()-> "a").forEach(print);
		
		System.out.println("\nStream iterate- Não tem fim com ordenação");
		//Supplier é uma função lambda que nao recebe param, mas retorna algo.//generate(()-> "a") = infinito
		//Stream.iterate(0, n -> n+1).forEach(print);
		
		System.out.println("\nStream de numeros a partir de 1 array");
		Integer[] numeros = {1 ,2 ,3 ,4};
		Stream.of(numeros).forEach(print);
		
	}

}

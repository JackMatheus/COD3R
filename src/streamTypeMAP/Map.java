package streamTypeMAP;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

//https://github.com/cod3rcursos/curso-java/blob/master/exercicios/src/streams/Map.java
public final class Map {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print;

		List<String> marcas = Arrays.asList("BWM ", "Audi ", "Honda ");
		System.out.println("\nmarcas");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		System.out.println("\nmarcas2");
		marcas.stream().map(m -> m.valueOf(m.charAt(0))).forEach(print);

		// Refatorado as funções para a Classe Utilitário

		// >>>Ja armazenando em variaveis para poder utilizar posteriormente
		// UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		// Imprimindo somente o primeiro caracter da palavra
		// UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		// UnaryOperator<String> grito = n -> n + "!!!!!!!";

		// System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("testes"));
		System.out.println("\nmaiuscula");
		marcas.stream().map(Utilitarios.maiuscula).forEach(print);

		System.out.println("\nprimeiraLetra");
		marcas.stream().map(Utilitarios.primeiraLetra).forEach(print);

		System.out.println("\ngrito");
		marcas.stream().map(Utilitarios.grito).forEach(print);

		System.out.println("\n\nUsando Composição FINAL");
		marcas.stream().map(Utilitarios.maiuscula).map(Utilitarios.primeiraLetra).map(Utilitarios.grito).forEach(print);

	}

}

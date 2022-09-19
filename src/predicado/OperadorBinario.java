package predicado;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	
	public static void main(String[] args) {
		System.out.println("----Exemplo 1-------");
		// Ponto de entrada são dois parametros ( n1, n2 )
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;		
		System.out.println(media.apply(9.8, 5.7));
		System.out.println("-------------------");

		System.out.println("----Exemplo 2-------");
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {

			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";

		};				
		System.out.println(resultado.apply(9.7, 4.1));
		
		System.out.println("----Exemplo 3-------");
		Function<Double, String> conceito = 
				m -> m >=7 ? "Aprovado" : "Reprovado";
				System.out.println(media.andThen(conceito).apply(9.7, 4.1));
	}
}

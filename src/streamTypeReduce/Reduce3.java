package streamTypeReduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno ("Ana",7.1);
		Aluno a2 = new Aluno ("Lua",6.1);
		Aluno a3 = new Aluno ("Gui",8.1);
		Aluno a4 = new Aluno ("Gabi",10);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Aluno> aprovados = a -> a.nota >= 7;
		Function<Aluno, Double> filtroNotas = a -> a.nota;
		
		//BiFunction mais flexível
		//Reduce Accumulador(Media), ValorElementos(Double), Resultado(Media)
		//Função retornando Media, se fosse tipo void necessitaria {media.adicionar(nota);return media;}
		BiFunction<Media, Double, Media> calcularMedia = 
				(media, nota) -> media.adicionar(nota);
				
		BinaryOperator<Media> combinarMedia = 
				(m1, m2) -> Media.combinar(m1, m2);
				
		//Pipeline
		Media media = alunos.parallelStream()
				.filter(aprovados)
				.map(filtroNotas)
				//Imprementando reduce com BiFunction<Media, Double, Media> 
				.reduce(new Media(), calcularMedia, combinarMedia);
		
		System.out.println("A Média dos aprovados da " + media.getValor());
	}

}

package streamOutros;

import java.util.Arrays;
import java.util.List;

public class Outros {
	
	public static void main(String[] args) {
				
			
			Aluno a1 = new Aluno ("Ana", 7.8, false);
			Aluno a2 = new Aluno ("Bia", 5.8, true);
			Aluno a3 = new Aluno ("Daniel", 9.8, true);
			Aluno a4 = new Aluno ("Gui", 6.8, true);
			Aluno a5 = new Aluno ("Rebeca", 7.1, true);
			Aluno a6 = new Aluno ("Pedro", 9.1, false);
			Aluno a7 = new Aluno ("Gui", 8.1, false);
			Aluno a8 = new Aluno ("Maria", 10, false);
			
			//Populando o Array
			List<Aluno> alunos = Arrays.asList(a1 ,a2 ,a3 ,a4 ,a5 ,a6, a7, a8);
			
			System.out.println("distinct...");
			alunos.stream().distinct().forEach(System.out::println);
			
			System.out.println("\nSkip/limit");
			alunos.stream()
			.limit(2)
			.skip(1)
			.distinct()
			.forEach(System.out::println);
			
			
			System.out.println("\nTakeWhile");
			alunos.stream()
			.distinct()
			.skip(2)
			.takeWhile(a -> a.nota >= 7.0)
			.takeWhile(a -> a.bomComportamento)
			.forEach(System.out::println);
			
	}

}

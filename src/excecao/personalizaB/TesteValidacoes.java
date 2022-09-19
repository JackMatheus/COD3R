package excecao.personalizaB;

import excecao.Aluno;
import excecao.NumeroForaIntervaloException;
import excecao.NumeroForaIntervaloExceptionB;
import excecao.StringVaziaException;
import excecao.StringVaziaExceptionB;

public class TesteValidacoes {
	
	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Ana", 7);
			try {
				Validar.aluno(aluno);
			} catch (StringVaziaExceptionB | NumeroForaIntervaloExceptionB e) {
				System.out.println(e.getMessage());
			}
			
			
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException 
				| IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Validar.aluno(null);
		} catch (StringVaziaExceptionB | NumeroForaIntervaloExceptionB e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
}
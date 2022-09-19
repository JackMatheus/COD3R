package excecao.personalizaB;

import excecao.Aluno;
import excecao.NumeroForaIntervaloExceptionB;
import excecao.StringVaziaExceptionB;

public class Validar {
	
	private Validar() {
		
	}
	
	public static void aluno(Aluno aluno) throws StringVaziaExceptionB, NumeroForaIntervaloExceptionB {
		
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo!");
		}
		
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaExceptionB("nome");
		}
		
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloExceptionB("nota");
		}
		
	}

}

package excecao.causa;
//https://github.com/cod3rcursos/curso-java/blob/master/exercicios/src/excecao/personalizadaB/NumeroForaIntervaloException.java
import excecao.Aluno;

public class Causa {
	
	public static void main(String[] args) {
		
		try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			if(e.getCause() != null ) {
				System.out.println();
			};
		}
		
	}
	
	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception causa) {
			throw new IllegalArgumentException(causa);
		}
	}
	
	static void metodoB(Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("Aluno está nulo !!!!");
		};
		System.out.println("Nome " + aluno.nome);
	}

}

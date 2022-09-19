package oo.cadastroAluno.nxn;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	//O Aluno poder� ter varios cursos;
	final String nome;
	final List<Curso> cursos = new ArrayList<Curso>();
	
	//Construtor
	Aluno(String nome) {
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Curso obterCursoPorNome(String nome) {			
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		
		return null;
	}
	
	public String toString() {
		return nome;
	}

}
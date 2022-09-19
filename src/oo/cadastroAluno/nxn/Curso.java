package oo.cadastroAluno.nxn;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	//O Curso poderá ter varios alunos;
	final String nome;
	final List<Aluno> alunos = new ArrayList<Aluno>();
	
	//Construtor
	Curso (String nome){
		this.nome = nome;
	}
	
	//Metodo add aluno	
	void adicionarAluno(Aluno aluno) {
	this.alunos.add(aluno);
	aluno.cursos.add(this);
	}

}

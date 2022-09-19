package oo.composicao.banco;

public class Cliente {
	
	Conta conta;
	
	String nome;
	int CPF;	
	
	//Recebendo Produto como parametro
	Cliente(Conta conta, String nome ,int CPF) {
		this.conta = conta;
		this.nome =nome;
		this.CPF = CPF;
	}


}

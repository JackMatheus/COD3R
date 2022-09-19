package oo.composicao.banco;

import java.util.ArrayList;

public class Agencia {

	int numero;
	String endereco;
	
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	
	void adicionarCliente(Conta conta, int num) {
		this.clientes.add(new Cliente(conta, endereco, numero));
	}
	
    void adicionarCliente( String nome ,int CPF, int num,double saldo ,String tipo, double debito) {
	this.clientes.add(new Cliente(new Conta (num, saldo, tipo, debito), nome ,CPF));
	}
	
	//	void adicionarCliente( String nome ,int CPF, int num,double saldo ,String tipo, double debito) {
	//this.clientes.add(new Cliente(new Conta (int num,double saldo ,String tipo, double debito), String nome ,int CPF));
	//}
	
	
	//Intanciando um tem e um produto 
	//	void adicionarItem(String nome, double preco, int qtde) {
	//		//var produto = new Produto(nome, preco);
	//		this.itens.add(new Item(new Produto(nome, preco), qtde));
	//	}
	
	
				
	
}

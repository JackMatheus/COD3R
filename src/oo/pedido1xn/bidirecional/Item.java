package oo.pedido1xn.bidirecional;

public class Item {
	
	String nome;
	int quantidade;
	double preco;	
	//Bidirecional
	Compra compra;
	
	//Construtor
	Item(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

}

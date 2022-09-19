package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
	
	final ArrayList<Item> itens = new ArrayList<Item>();	
	
	
	void adicionarItem(Produto p , int qtde) {
		this.itens.add(new Item(p,qtde));
	}
	
	//Intanciando um tem e um produto 
	void adicionarItem(String nome, double preco, int qtde) {
		//var produto = new Produto(nome, preco);
		this.itens.add(new Item(new Produto(nome, preco), qtde));
	}
	
	//Relação de 1 x n = 1 Compra com varios itens unidirecional
	//Recebendo Obj Item
		//Metodo valor total
	double obterValorTotal() {
		double total = 0;
		
		
		for(Item item: itens) {
			total+=item.quantidade*item.produto.preco;
		}
				
		return total;
	}

}


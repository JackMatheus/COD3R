package oo.pedido1xn.bidirecional;

import java.util.ArrayList;

public class Compra {
	 //Esta string poderia ser outra classe 
	 String cliente;
	
	//Relação de 1 x n = 1 Compra com varios itens unidirecional
	//Recebendo Obj Item
	ArrayList<Item> itens = new ArrayList<Item>();
	

	//Bidirecional
	void adcionarItem(String nome, int quantidade, double preco) {
		this.adcionarItem(new Item(nome, quantidade, preco));		
	}
	
	//Bidirecional
	void adcionarItem(Item item) {
		this.itens.add(item);
		item.compra = this;
	}
	
	//Metodo valor total
	double obterValorTotal() {
		double total = 0;
		
		
		for(Item item: itens) {
			total+=item.quantidade*item.preco;
		}
				
		return total;
	}

}

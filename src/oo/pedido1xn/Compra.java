package oo.pedido1xn;

import java.util.ArrayList;

public class Compra {
	 //Esta string poderia ser outra classe 
	 String cliente;
	
	//Relação de 1 x n = 1 Compra com varios itens unidirecional
	//Recebendo Obj Item
	ArrayList<Item> itens = new ArrayList<Item>();
	
	//Metodo valor total
	double obterValorTotal() {
		double total = 0;
		
		
		for(Item item: itens) {
			total+=item.quantidade*item.preco;
		}
				
		return total;
	}

}

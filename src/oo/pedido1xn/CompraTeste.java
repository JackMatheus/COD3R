package oo.pedido1xn;

public class CompraTeste {

	public static void main(String[] args) {
		//Instanciando Classe Compra
		Compra compra1 = new Compra();
		compra1.cliente = "Jo�o Pedro";
		
		//o Construtor me possibilitou criar objs mais facilmente
		compra1.itens.add(new Item("Caneta", 20, 7.45));
		compra1.itens.add(new Item("Borracha", 12, 3.45));
		compra1.itens.add(new Item("Caderno", 3, 18.89));
		
		System.out.println(compra1.itens.size());
		
		System.out.println(compra1.obterValorTotal());
		
		
	}
}

package oo.composicao.desafio;


public class ClienteMain {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem(new Produto("Notebook", 1888),2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 9.67, 100);
		compra2.adicionarItem(new Produto("Impressora", 888),1);

		//Instanciando Classe Compra
		Cliente cliente = new Cliente("Maria Julia");
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		
		System.out.println("O valor total da compra, " + cliente.obterValorTotal());
		
		
	
		
		
		
	}
}


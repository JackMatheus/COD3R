package oo.composicao.desafio;

import java.util.ArrayList;


public class Cliente {

	final String nome;	
	final ArrayList<Compra> compras = new ArrayList<Compra>();	
	
	//Construtor de cliente recebe nome;
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}

	//Metodo para Percorrer as compras e retornar
	double obterValorTotal() {
		double total = 0;
		
		for(Compra compra: compras) {
			total+=compra.obterValorTotal();
		}
		
		return total;
	}

}

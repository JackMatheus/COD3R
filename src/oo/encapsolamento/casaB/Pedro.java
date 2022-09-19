package oo.encapsolamento.casaB;

import oo.encapsolamento.casaA.Ana;

public class Pedro extends Ana {
	
	//Errado-Instancia da ANA não tranmite a herança
	//Ana mae = new Ana();
	
	void testeAcessos() {
		//System.out.println(segredo); // Não consigo acesso pois é private segredo
		//System.out.println(facoDentroDeCasa); //Esta no mesmo pacote
		
		//Errado:Instancia da ANA não tranmite a herança
		//System.out.println(mae.formaDeFalar); //Protected - Este é tranm por herança
		//System.out.println(mae.todosSabem); //PUBLIC - Visivel a todos - ok
		
		//Correto - acesso direto o atributo
		System.out.println(formaDeFalar); //Protected - Este é tranm por herança
		System.out.println(todosSabem); //PUBLIC - Visivel a todos - ok
		System.out.println(new Ana().todosSabem); //PUBLIC - Visivel a todos - ok
	}


}

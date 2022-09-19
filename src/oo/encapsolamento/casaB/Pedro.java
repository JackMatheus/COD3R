package oo.encapsolamento.casaB;

import oo.encapsolamento.casaA.Ana;

public class Pedro extends Ana {
	
	//Errado-Instancia da ANA n�o tranmite a heran�a
	//Ana mae = new Ana();
	
	void testeAcessos() {
		//System.out.println(segredo); // N�o consigo acesso pois � private segredo
		//System.out.println(facoDentroDeCasa); //Esta no mesmo pacote
		
		//Errado:Instancia da ANA n�o tranmite a heran�a
		//System.out.println(mae.formaDeFalar); //Protected - Este � tranm por heran�a
		//System.out.println(mae.todosSabem); //PUBLIC - Visivel a todos - ok
		
		//Correto - acesso direto o atributo
		System.out.println(formaDeFalar); //Protected - Este � tranm por heran�a
		System.out.println(todosSabem); //PUBLIC - Visivel a todos - ok
		System.out.println(new Ana().todosSabem); //PUBLIC - Visivel a todos - ok
	}


}

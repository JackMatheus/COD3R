package oo.encapsolamento.casaB;

import oo.encapsolamento.casaA.Ana;

public class Julia {
	
	void testeAcessos() {
		
		Ana sogra = new Ana();
		//System.out.println(sogra.segredo); 
		//System.out.println(sogra.facoDentroDeCasa); 
		//System.out.println(sogra.formaDeFalar);
		System.out.println(sogra.todosSabem); //PUBLIC - Visivel a todos - ok
	}

}

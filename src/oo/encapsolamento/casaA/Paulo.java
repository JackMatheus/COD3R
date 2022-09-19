package oo.encapsolamento.casaA;

public class Paulo {
	
	Ana esposa = new Ana();
	void testeAcessos() {
		//System.out.println(esposa.segredo); // Não consigo acesso pois é private segredo
		System.out.println(esposa.facoDentroDeCasa); //Esta no mesmo pacote
		System.out.println(esposa.formaDeFalar); //Esta no mesmo pacote
		System.out.println(esposa.todosSabem); //PUBLIC - Visivel a todos
		
	}

}

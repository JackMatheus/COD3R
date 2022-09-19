package Desafio;

public class Pessoa {
	
	String nomePessoa; 
	double pesoPessoa;
	int idadePessoa;	
	
	//caso 1- Construtor padrão, 
	Pessoa(String nomePessoa, double pesoPessoa, int idadePessoa){		
		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoPessoa;
		this.idadePessoa = idadePessoa;
	}
	
	//x-metodo comerBem
	//Recemendo da Comida da Classe Comida como parametro (Comida=classe, comida=parametro do objeto, que acabei de criar)
	void comerBem (Comida comida) {		
		
		if(comida!=null) {
			this.pesoPessoa +=comida.pesoComida;
		}	 	
		
	}
	
	String apresentar() {
		return "Olá eu sou o "+" "+ nomePessoa +" "+ "e tenho"+" "+ pesoPessoa +"Kgs.";
	}

}

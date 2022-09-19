package oo.polimorfismoEstatico;

public class Jantar {
	
	public static void main(String[] args) {
		Pessoa pessoaConvidada = new Pessoa(99.65);

		Arroz ingrediente1 = new Arroz(0.20);
		Feijao ingrediente2 = new Feijao(0.10);		
		System.out.println("Peso inicial do convidado: " +pessoaConvidada.getPeso());
		
		pessoaConvidada.comer(ingrediente1);
		pessoaConvidada.comer(ingrediente2);		
		//System.out.println("Peso do convidado após comer Arroz e Feijão: " +pessoaConvidada.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.4);
		pessoaConvidada.comer(sobremesa);	
		System.out.println("Peso final do convidado apos comer Arroz, Feião e sobremesa: " +pessoaConvidada.getPeso());
	}

}

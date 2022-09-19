package predicado;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		
		
		
		/*
		 * 1.Apartir do Produto calcular o preço real (com desconto)
		 * 2.Imposto municipal: >=2500(8,5%) / < 2500(Isento)
		 * 3.Frete: >=3000(100) / < 3000(50)
		 * 4.Arredondar: Deixar com duas casas decimais
		 * 5.Formatar: R$1234,56
		 */
		
		
		//Recebe Produto, Retorna Double
		//Criando o metodo e setando null
		//Function<Produto, Double> precoFinal = null;
		Function<Produto, Double> precoFinal =
				//Recebe Produto
				//produto -> produto.preco * (1 - produto.desconto); 
				 produto -> produto.preco * (1- produto.desconto);
		
		//Imposto Municipal
		//Recebe o preço, Retorna double
		UnaryOperator<Double> impostoMunicipal= 
				//Recebe o preço
				preco -> preco >= 2500 ? preco * 1.085 : preco;
				
		//frete
		//Recebe o preço, Retorna double			
		UnaryOperator<Double> frete=
				preco -> preco >= 3000 ? preco + 100.0 : preco + 50.0;
		//arredondar
		//Recebe o preço, Retorna double				
		UnaryOperator<Double> arredondar= 
				//preco -> Double.parseDouble(String.format("%.2f",preco)); //Erro no Double.parseDouble
				preco -> preco >= 1000 ? preco * 1 : preco;	
		//formatar
		//Recebe o preço, Retorna STRING
		Function<Double, String> formatar= 
				preco -> ("R$" + preco).replace(".", ",");
				
		//gorgeta 5,10,20
		//Recebe o preço, Retorna double
		Double minimum = 5.0;
		Double avarage = 10.0;
		Double maximum = 20.0;		
		UnaryOperator<Double> gorgeta10 = 				
				preco -> preco <= 30 ? minimum : maximum;		
				
		//Criando o Produto - nesta posição para eviatar conflito com  variável p
		Produto p = new Produto( "Ipad", 3235.89, 0.13);
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);		
		
		System.out.println("O preço final é " + preco);
		
		//Condição de gorgeta	Deu errado	
		//String gorgeta = gorgeta10.apply(p);	
		//System.out.println("gorgeta  é " + gorgeta);
		
	}

}

package streamTypeFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import streamOutros.Aluno;

public class FilterProduto {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Lapis", 1.99 ,0.45 ,0 );
		Produto p2 = new Produto("Notebook", 5000.00 ,0.5 ,0 );
		Produto p3 = new Produto("Caderno", 10.99 ,0.45 ,0 );
		Produto p4 = new Produto("Impressora", 1200 ,0.40 ,30 );
		Produto p5 = new Produto("Ipad", 3000 ,0.5 ,0 );
		Produto p6 = new Produto("Celular", 1900 ,0.12 ,0.0 );
		Produto p7 = new Produto("Mouse", 800 ,0.5 ,0.0 );
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
		//PipeLine de excecuções
		Predicate<Produto> superPromocao = 
					p -> p.desconto >= 0.30;
	    Function<Produto, Double> precoComDesconto =
			   		p ->  p.preco *(1-p.desconto);
		Predicate<Produto> freteGratis = 
				    p -> p.valorFrete == 0;
		Predicate<Produto> precoRelevante =
	     		    p -> p.preco >= 500;

		Function<Produto, String> resultado = 
					p -> "Nome: " + p.nome + " Preço: " + p.preco + " Desconto: " +p.desconto;
		
				    
		produtos.stream()
				.filter(superPromocao)				
				.filter(freteGratis)
				.filter(precoRelevante)
				.map(precoComDesconto)			
				
				//.map(resultado)
				.forEach(System.out::println);
		
	
				

	} 

}

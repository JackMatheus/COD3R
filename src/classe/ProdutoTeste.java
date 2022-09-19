package classe;

import java.util.Scanner;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		int a = 3;
		Scanner entrada = new Scanner(System.in);

		//casoo 1-Construtor padrão
		Produto p2 = new Produto();
		p2.setNome("Canetinha");
		p2.preco = 4553.00;
		p2.desconto= 0.29;
		
		//caso 2 -Construtor com argumento
		Produto p1 = new Produto("Notebook", 4353.00,  0.25);		
		
		System.out.println(p1.getNome());
		System.out.println(p2.getNome());
		
		
		
		double precoFinal1 = p1.precoComDescontodouble(10);
		System.out.println(precoFinal1);
		
		double precoFinal2 = p2.precoComDescontodouble(0.1);
		System.out.println(precoFinal2);	
		
		Double mediaCarrinho = ((precoFinal1+precoFinal2)/2);
		System.out.printf("Média de produtos do carrinho = R$%.2f.", mediaCarrinho);	
	}

}

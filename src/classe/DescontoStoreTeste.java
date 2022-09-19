package classe;

import java.util.Scanner;

public class DescontoStoreTeste {
		
		public static void main(String[] args) {
			
			int a = 3;
			Scanner entrada = new Scanner(System.in);

			//caso 1-Construtor padrão
			DescontoStore p1 = new DescontoStore();
			p1.nome = "Notebook com desconto";
			p1.preco = 2000.00;
			
			//caso 1-Construtor padrão
			DescontoStore p2 = new DescontoStore();
			p2.nome = "Canetinha com desconto";
			p2.preco = 1000.00;
			
			System.out.printf("\nAqui estou estanciando o desconto unico para todos os produtos\n");
			//DescontoStore é a classe de desconto já criada
			DescontoStore.desconto = 0.10;
			
			
			//caso 2 -Construtor com argumento
			//DescontoStore p1 = new DescontoStore("Notebook", 2000.00);			
			System.out.println(p1.nome+  " " + p1.precoComDescontodouble());
			double precoFinal1 = p1.precoComDescontodouble();

			
			System.out.printf("\n/////////////////////////////\n");			
			System.out.println(p2.nome+ " " + p2.precoComDescontodouble());			
			double precoFinal2 = p2.precoComDescontodouble();
			
			
			System.out.printf("\n/////////////////////////////\n");			
			Double mediaCarrinho = ((precoFinal1+precoFinal2)/2);
			System.out.printf("Média de produtos do carrinho = R$%.2f.", mediaCarrinho);	
		}

	}

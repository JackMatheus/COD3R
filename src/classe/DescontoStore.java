package classe;

public class DescontoStore {
	
	String nome;
	double preco;
	//metodo static para indicar q a vari�vel n�o vai sofrer altera��o
	static double desconto = 0.25;

	//caso 1- Construtor padr�o, assim n�o precisa passar nada na constru��o do objeto
	DescontoStore(){		 
		}	
		
	//caso2 -Construtor com paramentro
	DescontoStore(String nomeInicial){
		nome = nomeInicial; 
		}
	DescontoStore(String nomeInicial, double precoInicial){
		nome = nomeInicial; 
		preco = precoInicial; 
		}
	
	//n�o necessita de parametros pq as infos preco*desconto j� esta dentro da classe produto;
	//novo parametro descontoDoGerente
	//float precoComDescontodouble () {		
	//	return (float)(preco*(1-desconto));
	//}
	
	double precoComDescontodouble () {		
		return preco*(1-desconto);
	}
	
	//double precoComDescontodouble (double descontoDoGerente) {		
	//	return preco*(1-desconto + descontoDoGerente);
	//}
}


package classe;

public class DescontoStore {
	
	String nome;
	double preco;
	//metodo static para indicar q a variável não vai sofrer alteração
	static double desconto = 0.25;

	//caso 1- Construtor padrão, assim não precisa passar nada na construção do objeto
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
	
	//não necessita de parametros pq as infos preco*desconto já esta dentro da classe produto;
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


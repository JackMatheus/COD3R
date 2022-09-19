package classe;

public class Produto {
	
	public String nome;
	double preco;
	double desconto;

	//caso 1- Construtor padrão, assim não precisa passar nada na construção do objeto
	Produto(){		 
		}	
		
	//caso2 -Construtor com paramentro
	public Produto(String nomeInicial){
		setNome(nomeInicial); 
		}
	public Produto(String nomeInicial, double precoInicial, double descontoIncial){
		setNome(nomeInicial); 
		preco = precoInicial; 
		desconto = descontoIncial;
		}
	
	//não necessita de parametros pq as infos preco*desconto já esta dentro da classe produto;
	//novo parametro descontoDoGerente
	//float precoComDescontodouble () {		
	//	return (float)(preco*(1-desconto));
	//}
	
	double precoComDescontodouble () {		
		return preco*(1-desconto);
	}
	
	double precoComDescontodouble (double descontoDoGerente) {		
		return preco*(1-desconto + descontoDoGerente);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}


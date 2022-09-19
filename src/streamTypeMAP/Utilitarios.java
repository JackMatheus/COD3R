package streamTypeMAP;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	//CRIANDO UM CONSTRUTOR , OU SEJA , NÃO POSSO INSTANCIAR A CLASSE Utilitarios
	private Utilitarios () {
		
	};
	
	//Ja armazenando em variaveis para poder utilizar posteriormente 
	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	//Imprimindo somente o primeiro caracter da palavra
	public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
	public final static UnaryOperator<String> grito = n -> n + "!!!!!!!";

}

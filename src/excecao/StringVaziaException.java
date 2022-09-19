package excecao;

public class StringVaziaException extends RuntimeException{
	
	private String nomeDoAtributo;

	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMesage() {
		return String.format("O atributo '%s' está vazio.",nomeDoAtributo);
	}

}

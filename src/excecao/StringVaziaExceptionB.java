package excecao;

public class StringVaziaExceptionB extends Exception{
	
	private String nomeDoAtributo;

	public StringVaziaExceptionB(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMesage() {
		return String.format("O atributo '%s' está vazio.",nomeDoAtributo);
	}

}

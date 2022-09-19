package excecao;

public class NumeroForaIntervaloException extends RuntimeException{
	
	private String nomeDoAtributo;

	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMesage() {
		return String.format("O atributo %s está negativo",nomeDoAtributo);
	}
	
	

}

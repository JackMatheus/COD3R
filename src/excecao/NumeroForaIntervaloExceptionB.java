package excecao;

public class NumeroForaIntervaloExceptionB extends Exception{
	
	private String nomeDoAtributo;

	public NumeroForaIntervaloExceptionB(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMesage() {
		return String.format("O atributo %s está negativo",nomeDoAtributo);
	}
	
	

}

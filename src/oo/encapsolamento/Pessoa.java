package oo.encapsolamento;

public class Pessoa {
	
    private String nome;   
	private String sobrenome;
	private int idade;
	
	//Construtor 
	public Pessoa(String nome, String sobrenome ,int idade) {
		alterarIdade(idade);
		setSobrenome(sobrenome);
		setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
    public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	//Criando o metodo nome completo
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}

	public int lerIdade() {
		return idade;
	}

	public void alterarIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >=0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}
	

	@Override
	public String toString() {
		return "Olá eu sou o " + getNome() + " " +getSobrenome() +" tenho " + lerIdade() + " anos";
	}
}

package oo.encapsolamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Pedro", "Amoedo", -45);
		//setIdade()-Metodo para ler a idade
		//System.out.println(p1.getIdade());
		
		//getIdade()-Metodo para alterar a idade
		p1.alterarIdade(120);		
		
		//System.out.println(p1.lerIdade);
		System.out.println(p1.lerIdade());
		System.out.println(p1); //toString
		
		//Opcao função nome completo
		System.out.println(p1.getNomeCompleto());
	}

}

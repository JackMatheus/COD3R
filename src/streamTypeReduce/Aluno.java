package streamTypeReduce;

public class Aluno {
	
	public final String nome;
	public final double nota;
	public final Boolean bomComportamento;
	
	public Aluno(String nome, double nota) { 
		this(nome, nota, true);
	}
	
	
	public Aluno(String nome, double nota, Boolean bomComportamento) {
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}
	
	/*
	 * Exemplo de hashCode()
	 * 
	
	@Override
	public int hashCode() {
		return 1;		
	}
	 * 
	 * */
	
	
	/*Resultado do nome e nota sem o metodo toSpring - > streamTypeReduce.Aluno@1517365b */
	
	public String toString() {
		return nome + " tem nota " + nota;
		
	}
	
	

}

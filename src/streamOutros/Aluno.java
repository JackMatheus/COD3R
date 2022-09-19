package streamOutros;

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
	
	public String toString() {
		return nome + " tem nota " + nota;
	}

	
	//Equals e Hashcode para q o distint funcione corretamente
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bomComportamento == null) ? 0 : bomComportamento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (bomComportamento == null) {
			if (other.bomComportamento != null)
				return false;
		} else if (!bomComportamento.equals(other.bomComportamento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(nota) != Double.doubleToLongBits(other.nota))
			return false;
		return true;
	}

	
}

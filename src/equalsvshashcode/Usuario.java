package equalsvshashcode;

public class Usuario {
	
	String nome;
	String email;

//metodo = Convers�o do objeto para usuario
	public boolean equals(Object objeto) {
		if(objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.contains(this.email);
			
			return nomeIgual && emailIgual;					
		} else {
			return false;
		}
	}
	
	public int hashCode() {
		return 0;
	}

}

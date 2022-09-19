package oo.polimorfismoDinamico;

public class Pessoa {
	
private double peso;
	
	//Construtor Sorvete
	public Pessoa (double peso) {
		setPeso(peso);
	};
	
	//Metodo comer
	public void comer(Arroz arroz) {
		this.peso +=arroz.getPeso();
	}
	
	//Metodo comer
	public void comer(Feijao feijao) {
		this.peso +=feijao.getPeso();
	}
	
	//Metodo comer
	public void comer(Sorvete sorvete) {
		this.peso +=sorvete.getPeso();
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}
	}

}

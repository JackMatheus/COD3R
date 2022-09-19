package oo.polimorfismoEstatico;

public class Pessoa {
	
private double peso;
	
	//Construtor Sorvete
	public Pessoa (double peso) {
		setPeso(peso);
	};
	
	//Metodo comer
	public void comer(Comida comida) {
		this.peso +=comida.getPeso();
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

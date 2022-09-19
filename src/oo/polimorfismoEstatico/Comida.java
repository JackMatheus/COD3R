package oo.polimorfismoEstatico;

public class Comida {

private double peso;
	
	//Construtor Comida
	public Comida (double peso) {
		setPeso(peso);
	};

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}
	}
	
	
}

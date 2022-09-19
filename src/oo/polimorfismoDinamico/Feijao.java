package oo.polimorfismoDinamico;

public class Feijao {
	
private double peso;
	
	//Construtor Sorvete
	public Feijao (double peso) {
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

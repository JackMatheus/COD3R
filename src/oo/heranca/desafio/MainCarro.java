package oo.heranca.desafio;

public class MainCarro {
	
	public static void main(String[] args) {
		
		//Carro-Civic extends Carro
		Carro carro1 = new Civic();
		carro1.acelerar();		
		System.out.println("Acelerando carro1: " + carro1);
		
		carro1.acelerar();
		System.out.println("Acelerando carro1: " + carro1);
		
		carro1.frear();
		System.out.println("Freando carro1: " + carro1);
		
		carro1.frear();
		System.out.println("Freando carro1: " + carro1);
		
		carro1.frear();
		System.out.println("Freando carro1: " + carro1);
		
		
		//Carro ou Ferrari extends Carro
		//-> recebendo dado (variavel) via construtor da Ferrari
		Ferrari carro2 = new Ferrari(600);
		carro2.acelerar();		
		System.out.println("Acelerando carro2: " + carro2);
		
		carro2.acelerar();		
		System.out.println("Acelerando carro2: " + carro2);
		
		carro2.acelerar();		
		System.out.println("Acelerando carro2: " + carro2);
		
		carro2.frear();		
		System.out.println("Frear carro2: " + carro2);
		
	}

}

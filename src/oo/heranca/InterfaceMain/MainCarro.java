package oo.heranca.InterfaceMain;

import oo.heranca.desafio.comModificadoressAcesso.Carro;
import oo.heranca.desafio.comModificadoressAcesso.Civic;
import oo.heranca.desafio.comModificadoressAcesso.Ferrari;

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
		//Metodo ligar turbo
		//carro2.ligarTurbo();
		//carro2.ligarAr();
		//carro2.desligarAr();
				
		carro2.acelerar();	
		carro2.frear();
		System.out.println("Acelerando carro2: " + carro2);
		
		carro2.acelerar();		
		System.out.println("Acelerando carro2: " + carro2);
		
		carro2.acelerar();		
		System.out.println("Acelerando carro2: " + carro2);
		
		carro2.frear();		
		System.out.println("Frear carro2: " + carro2);
		
	}

}

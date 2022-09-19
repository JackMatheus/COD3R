package oo.abstrato;

public class TesteAbstrato {
	
	public static void main(String[] args) {
		
		//Tem que pensar com escalonamento de responsabilidades (escada mesmo)
		//Cachorro classe concreta
		Animal b = new Cachorro();
		System.out.println(b.mover());
		
		Mamifero a = new Cachorro();
		System.out.println(a.mover());
		System.out.println(a.mamar());
		System.out.println(a.respirar());
	}

}

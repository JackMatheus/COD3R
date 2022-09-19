package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		Monstro monstro = new Monstro(10,10);
		//monstro.x=10;
		//monstro.y=10;
		//->passando String norte para o metodo andar da classe Jogador
		//j1.andar(Direcao.NORTE);
		//j1.andar(Direcao.LESTE);
		System.out.println(monstro.x);
		System.out.println(monstro.y);
		
		
		//Devido a herança Heroi e Monstro tem os mesmos atributos de jogador
		//Heroi j2 = new Heroi();
		//Mostro j2 = new Mostro();		
		
		// ->> Recebendo x, y do construtor da classe Heroi
		Heroi heroi = new Heroi(10,11);
		//Distancia de ataque necessaria
		//heroi.x=10;
		//heroi.y=11;
		
		System.out.println("Situação inicial");
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
		
		System.out.println("Situação após o ataque");
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
	
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
		

	}
}

package oo.heranca;

public class Monstro extends Jogador {
	
	//Construtor 1 padrão , definindo as posição x=0, y=0
	Monstro() {
		super(0, 0);		
	}
		
	// -->Construtor 2, definindo as posição x=0, y=0 - construtor que chama a classe PAI (Main)
	Monstro(int x, int y) {
		super(x, y);		
	}
	
	/*
	boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x-oponente.x);
		int deltaY = Math.abs(y-oponente.y);
		
		// deltaX == 0 == mesma coluna // deltaY == 1 mesma coluna // Entao pode atacar!
		if (deltaX == 0 && deltaY == 1) {
			oponente.vida -=20;
			return true;
		}else if(deltaX == 1 && deltaY == 0){
			oponente.vida -=20;
			return true;
		}else {
			return false;
		}
		
	}
	*/

}

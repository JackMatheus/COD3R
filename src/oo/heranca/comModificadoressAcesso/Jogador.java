package oo.heranca.comModificadoressAcesso;

public class Jogador {
	
	public int vida = 100;
	public int x; 
	public int y;
	
	//adicionado Construtor padr�o como exemplo
	//Jogador(){
	//	this(0,0);	
	//}
	
	
	//adicionado Construtor
	 protected Jogador(int x, int y){
		this.x = x;
		this.y = y;		
	}
	
	public boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x-oponente.x);
		int deltaY = Math.abs(y-oponente.y);
		
		// deltaX == 0 == mesma coluna // deltaY == 1 mesma coluna // Entao pode atacar!
		if (deltaX == 0 && deltaY == 1) {
			oponente.vida -=10;
			return true;
		}else if(deltaX == 1 && deltaY == 0){
			oponente.vida -=10;
			return true;
		}else {
			return false;
		}
		
	}
	// recebendo Dire��o do Enum ou classe 
	public boolean andar(Direcao direcao) {	
		
		switch(direcao) {
		case NORTE:
		y--;
		break;
		
		case LESTE:
		x++;
		break;
		
		case SUL:
		y++;
		break;
		
		case OESTE:
		x--;
		break;
		
		
		
		}

		return true;
	}

}

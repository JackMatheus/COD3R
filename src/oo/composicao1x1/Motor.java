package oo.composicao1x1;

public class Motor {
	
	//Bi-redicional 1 x 1 
	//instanciando carro dentro de motor
	
	Carro carro;
	boolean ligado = false;	
	double fatorInjecao = 1;
	
	//Motor recebe carro como paramentro
	Motor(Carro carro){
		this.carro = carro;
	}
	int giros(){
		
		if(!ligado) {
			return 0;
			}else{
		return (int)Math.round(fatorInjecao * 3000);	
			}
	}
}




package oo.heranca.desafio;

public class Ferrari extends Carro {
	
	Ferrari(){
		this(315);
	}
	
	Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		//add delta
		inc =350;
		
	}
	
//    @Override
//	void acelerar() {	
//		super.acelerar();
//		volec_atual += 15;		
//	}
}

package oo.heranca.desafio.comModificadoressAcesso;

public class Ferrari extends Carro {
	
	public Ferrari(){
		this(315);
	}
	
	public Ferrari(int velocidadeMaxima){
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

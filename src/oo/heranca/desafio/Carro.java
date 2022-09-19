package oo.heranca.desafio;

public class Carro {
	     // Exercíco add velocidade máxima
	
		  final int VELOCIDADE_MAXIMA;
          int inc = 5;
          int volec_atual;
          
         //Construtor, que recebebe por parametro criado int velocidadeMaxima
          Carro(int velocidadeMaxima){
        	  VELOCIDADE_MAXIMA = velocidadeMaxima;
          }
          
      	void acelerar() { 
      		if(volec_atual + inc > VELOCIDADE_MAXIMA) {
      			volec_atual = VELOCIDADE_MAXIMA;
      		}else {
        		//int aceleracao = volec_atual + inc;
          		volec_atual += inc;
      		}
    	}
    	
    	void frear() {
    		if( volec_atual >= inc) {
    			//int desacelaracao = volec_atual - inc;
    			volec_atual -= inc;
    		}else {
    			volec_atual=0;
    		}
    	
    	}
    	
    	public String toString() {
    		return "Velocidade atual é " + volec_atual + "Km/h.";
    	}
    	
    	

}

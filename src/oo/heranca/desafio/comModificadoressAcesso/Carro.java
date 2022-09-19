package oo.heranca.desafio.comModificadoressAcesso;

public class Carro {
	     // Exercíco add velocidade máxima
	
		  public final int VELOCIDADE_MAXIMA;
		  // protected - só pode ser transmitido por herança
          protected int inc = 5;
          protected int volec_atual;
          
         //Construtor, que recebebe por parametro criado int velocidadeMaxima
          protected Carro(int velocidadeMaxima){
        	  VELOCIDADE_MAXIMA = velocidadeMaxima;
          }
          
      	public void acelerar() { 
      		if(volec_atual + inc > VELOCIDADE_MAXIMA) {
      			volec_atual = VELOCIDADE_MAXIMA;
      		}else {
        		//int aceleracao = volec_atual + inc;
          		volec_atual += inc;
      		}
    	}
    	
    	public void frear() {
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

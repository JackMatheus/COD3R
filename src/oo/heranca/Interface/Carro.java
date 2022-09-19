package oo.heranca.Interface;

public class Carro {
	     // Exerc�co add velocidade m�xima
	
		  public final int VELOCIDADE_MAXIMA;
		  // privite - visibilidade s� na mesma classe
          private int inc = 5;
          protected int volec_atual;
          
         //Construtor, que recebebe por parametro criado int velocidadeMaxima
          protected Carro(int velocidadeMaxima){
        	  VELOCIDADE_MAXIMA = velocidadeMaxima;
          }
          
      	public void acelerar() { 
      		if(volec_atual + getInc() > VELOCIDADE_MAXIMA) {
      			volec_atual = VELOCIDADE_MAXIMA;
      		}else {
        		//int aceleracao = volec_atual + inc;
          		volec_atual += getInc();
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
    		return "Velocidade atual � " + volec_atual + "Km/h.";
    	}

		public int getInc() {
			return inc;
		}

		public void setInc(int inc) {
			this.inc = inc;
		}
    	
    	
    	
    	

}

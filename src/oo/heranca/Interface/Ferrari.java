package oo.heranca.Interface;

public class Ferrari extends Carro implements Esportivo, Luxo{
	
	private boolean ligarTurbo = false; 
	private boolean ligarAr = false;
	
	public Ferrari(){
		this(315);
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		//add delta-Inc
		setInc(15);
		}
	
	public void ligarTurbo() {
		//setInc(35);
		ligarTurbo = true;
	}
	
	public void desligarTurbo() {
		//setInc(15);
		ligarTurbo = false;
		}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
		}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
		}
	
	@Override
	public int getInc() {
		
		if(ligarTurbo && !ligarAr) {return 35;
		}else if (ligarTurbo && ligarAr) {return 30;
		}else if (!ligarTurbo && !ligarAr) {return 20;
		}else {return 15;}
		
	}
    

	
}
	

package oo.heranca.Interface;

public interface Luxo {
	
	//Ligar ar cond
	
	public void ligarAr();
	abstract void desligarAr();
	
	//metodo padr�o default n�o � obrigado a implementar
	default int velocidadeDoAr() {
		return 1;
	};
	

}

package oo.heranca.Interface;

public interface Luxo {
	
	//Ligar ar cond
	
	public void ligarAr();
	abstract void desligarAr();
	
	//metodo padrão default não é obrigado a implementar
	default int velocidadeDoAr() {
		return 1;
	};
	

}

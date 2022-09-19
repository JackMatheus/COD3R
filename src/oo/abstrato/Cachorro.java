package oo.abstrato;

public class Cachorro extends Mamifero {
	
	//Porque por exemplo o metodo mover pode ser diferente para animais terrestre/aquaticos ou voadores
	//@Override
    //public String mover() {
	//	return "Usando AS PATAS";
	//	}
	
	@Override
	public String mamar() {
		return "Nas Mamas";
	}

}

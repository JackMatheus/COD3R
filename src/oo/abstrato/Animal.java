package oo.abstrato;

public abstract class Animal {
	
	//Metodo respirar 
	public String respirar() {
		return "Respirando CO2" ;
	}
	//Metodo mover não definido
	//Porque por exemplo o metodo mover pode ser diferente para animais terrestre/aquaticos ou voadores
	public abstract String mover();	
	//public abstract String mamar();
	//Este metodo foi implementado em na classe mamifero
	
	
    
}
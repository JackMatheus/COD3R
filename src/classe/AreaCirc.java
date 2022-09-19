package classe;

public class AreaCirc {
	
	//ex. variav�l da inst�ncia 
	double raio;	
	//ex. variav�l da classe 
	static final double PI = 3.14;	
	
	//1.1.2-raioInicial � informado
	AreaCirc( double raioInicial ){		
		raio = raioInicial;		
	}
	
	//2.1.2 area aqui
	double area() {
		return PI*Math.pow(raio,2);		
	
	}	
	//3.1.2 area aqui
	static double area(double raio) {
		return PI*Math.pow(raio,2);		
	}

}

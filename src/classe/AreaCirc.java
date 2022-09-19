package classe;

public class AreaCirc {
	
	//ex. variavél da instância 
	double raio;	
	//ex. variavél da classe 
	static final double PI = 3.14;	
	
	//1.1.2-raioInicial é informado
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

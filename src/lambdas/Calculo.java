package lambdas;

@FunctionalInterface
public interface Calculo {
	
	//Importante: Só posso ter 1 metodo funcional tipo lambda, para que o java possa reconhecer na class Main
	double excecutar(double a, double b);
	//String excecutar(double a, double b);
	
	//metodo funcional tipo defalt
	default String muitoLegal() {
		return "Muito legal";
	}
	
	//metodo funcional tipo static
	static String legal() {
		return "legal";
	}
	
}

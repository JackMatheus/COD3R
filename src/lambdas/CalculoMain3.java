package lambdas;

import java.util.function.BinaryOperator;

public class CalculoMain3 {
	
	public static void main(String[] args) {
		//Uso do BinaryOperator
		//Não: int -> Double
		//Ok: double -> Double
		//Double a = 1.0;
		
		//Função Lambda (lambda function) bate com (numero de variáveis do metodo da class) invoca a class Calculo;
		//Generic <Double> define o tipo
		BinaryOperator<Double> soma = (n1, n2) -> {
			return n1 + n2;
			//return "opa";		
			
		};
		System.out.println("soma de  + b = " + " "+ soma.apply(2.0, 3.0));
		
		BinaryOperator<Integer> soma2 = (n1, n2) -> {
			return n1 + n2;
			//return "opa";		
			
		};
		System.out.println("soma de  + b = " + " "+ soma2.apply(2, 3));
		

}
}

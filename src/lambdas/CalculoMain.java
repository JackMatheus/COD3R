package lambdas;

public class CalculoMain {
	
	public static void main(String[] args) {
/*		Calculo soma = new Somar();
		System.out.println("soma de a + b = " + " "+ soma.excecutar(2, 3));
		
		Calculo multiplicacao = new Multiplicar();
		System.out.println("multiplicacao de a + b = " + " "+ multiplicacao.excecutar(2, 3));
		
		Calculo divisao = new Dividir();
		System.out.println("divisao de a + b = " + " "+ divisao.excecutar(2, 3));
		
		Calculo subtracao = new Subtrair();
		System.out.println("subtracao de a + b = " + " "+ subtracao.excecutar(2, 3));
*/
		//Função Lambda (lambda function) bate com (numero de variáveis do metodo da class) invoca a class Calculo;
		Calculo soma = (n1, n2) -> {
			return n1 + n2;
			//return "opa";		
			
		};
		System.out.println("soma de a + b = " + " "+ soma.excecutar(2, 3));
		

		
}
}

package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro n�mero: ");	
		double valor1 = entrada.nextDouble();

		System.out.print("Informe o segundo n�mero: ");
		double valor2 = entrada.nextDouble();
		
		System.out.print("Informe a operacao: ");		
		String op = entrada.next();
		
		//L�gica
		double resultado = "+".equals(op) ? valor1+ valor2 : 0;
		resultado = "-".equals(op) ? valor1 - valor2 : resultado;
		resultado = "*".equals(op) ? valor1 * valor2 : resultado;
		resultado = "/".equals(op) ? valor1 / valor2 : resultado;
		resultado = "%".equals(op) ? valor1 % valor2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f" + valor1, op, valor2,resultado);
		
		entrada.close();
	}

}

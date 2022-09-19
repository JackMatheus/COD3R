package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Func 1 - Digite o seu salário: ");
		String valor1 = scanner.next().replace(",", ".");
		
		System.out.println("Func 2 - Digite o seu salário: ");
		String valor2 = scanner.next().replace(",", ".");
		
		System.out.println("Func 3 - Digite o seu salário: ");
		String valor3 = scanner.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1); 
		double salario2 = Double.parseDouble(valor2); 
		double salario3 = Double.parseDouble(valor3); 
		
		Double media = (salario1+salario2+salario3)/3;
		
		System.out.println("A média salarial é :" + media );
		
	   scanner.close();
		
		
	}

}

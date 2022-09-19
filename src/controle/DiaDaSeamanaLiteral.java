package controle;

import java.util.Scanner;

public class DiaDaSeamanaLiteral {
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);	
		
		System.out.print("Digite um numero referente ao dia da semana: ");
		
		
		String diaDaSemana = entrada.next();
		if(diaDaSemana.equalsIgnoreCase("domingo")) {
			System.out.println("1");}
		else if(diaDaSemana.equalsIgnoreCase("segunda-feira")) {
			System.out.println("2");}
		else if(diaDaSemana.equalsIgnoreCase("terça-feira")) {
			System.out.println("3");}
		else if("quarta-feira".equalsIgnoreCase(diaDaSemana)) {
			System.out.println("4");}
		else{System.out.println("Dia inexistente");}
		
		
		entrada.close();
	}

}

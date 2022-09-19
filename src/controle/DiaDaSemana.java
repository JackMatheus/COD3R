package controle;

import java.util.Scanner;

public class DiaDaSemana {
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);	
		
		System.out.println("Digite um numero referente ao dia da semana: ");
		int diaDaSemana = (int) entrada.nextDouble();
		
		if(diaDaSemana>=8||diaDaSemana<=0) {
			System.out.println("Dia invalido");}
		else if(diaDaSemana==1) {
			System.out.println("Domingo");}
		else if(diaDaSemana==2) {
			System.out.println("Segunda-feira");}
		else if(diaDaSemana==3) {
			System.out.println("Terça-feira");}
		
		entrada.close();
		
	}
	
}
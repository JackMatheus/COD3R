package fundamentos;

import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas: ");
		
		int qtdeNotas = entrada.nextInt();
		System.out.println(qtdeNotas);
		
		//Criando um array de notas
		double[] notas = new double [qtdeNotas];		
		//System.out.println(notas[9]);
		
		//Primeiro array pegando e imprimindo notas
		for(int i =0; i<notas.length; i++) {
			System.out.println("Informe a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();	
		}		
		//System.out.print(Arrays.toString(notas));
		double total=0;
		for(double nota: notas) {
			total+=nota;
		}
		System.out.println("Total da soma de notas " + (total));
		System.out.print("A média é " + (total/notas.length));
		entrada.close();
	}

}

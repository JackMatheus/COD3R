package controle;

import java.util.Scanner;

public class While {
	
	public static void main(String[] args) {
		
		//nota >=0 e >=10 nota valida entao faça o laço
		//int total = total + nota digitada
		//int contador = ++
		//int media = total/contador
		//sair = -1,
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite uma nota válida: ");
		Double nota = entrada.nextDouble();
		int contador=0;
		Boolean condicao = nota>=10 || nota<=0;
		int sair = -1;
		
		if(entrada.equals(sair)) {
			System.out.println("Deseja Sair");
			System.out.println("Obrigado");
		}else {

		
		while(nota<=10 || nota>=0) {
			 double total = 0;
			 double media = 0;
			 total = total + nota; 			
			 contador++;
			 media = total/contador;		
		}
		
		}
		
		entrada.close();

	}

}

package controle;

import java.util.Scanner;

public class NovoDesafuioWhile {
	
	public static void main(String[] args) {
		
		//nota >=0 e >=10 nota valida entao faça o laço
		//int total = total + nota digitada
		//int contador = ++
		//int media = total/contador
		//sair = -1,
		
		Scanner entrada = new Scanner(System.in);
		
		 int sair = -1;
		
		 double total = 0;
		 double nota = 0;
		 int contador=0;
		// Boolean condicao = nota<=10 && nota>=0;
	
			while(nota!=-1) {
				 System.out.print("Digite uma nota válida (ou 1 p/ sair): ");	
				 nota = entrada.nextDouble();
				 
				 if(nota<=10 && nota>=0) {
					 total += nota; 			
					 contador++;
				 }else if (nota!=1) {
					 System.out.println("Nota Invalida !!!");	
				 }
				 
				 
				 
				 
		}
			double media = total/contador;	
			System.out.println("Média: " + media);
			
			
			entrada.close();
			
	}

}

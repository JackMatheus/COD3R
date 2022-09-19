package fundamentos;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);		
	
		System.out.print("Quantos alunos ?: ");
		int qtdealunos = entrada.nextInt();
		
		System.out.print("Quantas notas por aluno ?: ");
		int qtdenotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double[qtdealunos][qtdenotas];
		
		//a=aluno
		//n=nota
		double total = 0;
		for(int a=0; a < notasDaTurma.length; a++) {
			for(int n=0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: ", n+1, a+1);
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
			}
		}
		
		double media = total / (qtdealunos * qtdenotas);
		System.out.println("A média da turma é: " + media);
		entrada.close();
		
		for(double[] notasDoAluno: notasDaTurma ) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
	
		
	}

}

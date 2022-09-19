package fundamentos;

public class Ternario {
	
	public static void main(String[] args) {
		double media = 8.6;
		//1-criar una variavel //2-(se)condiçao 1//3-resultado: aprovado//4-Caso contrario 
		             // Expressao ? valores v ou f que sarão atribuidos
		//String resultadoParcial = media >= 5.0 ? "reprovado." : "em recuperacao.";
		String resultadoFinal = media >= 7.0 ? "aprovado." : "reprovado";
		
		System.out.println("O aluno está " + resultadoFinal);
		
		
		//exemplo 2		
		double nota = 9.0;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim": "Não";
		
		System.out.printf("Tem desconto ? %s", resultado);
	}

}

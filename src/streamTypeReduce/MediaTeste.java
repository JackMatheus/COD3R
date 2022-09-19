package streamTypeReduce;

public class MediaTeste {

	public static void main(String[] args) {
		
		Media m1 = new Media().adicionar(8.3).adicionar(6.7);
		Media m2 = new Media().adicionar(7.9).adicionar(6.6);
		//m1.adicionar(10);
		//m1.adicionar(8);
		//m1.subtrair(1);

		System.out.println("Valor da média " + m1.getValor());
		System.out.println("Valor da média " + m2.getValor());
		
		
		System.out.println(Media.combinar(m1, m2).getValor());
		
		
		
	}

}

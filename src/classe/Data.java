package classe;

public class Data {

	public static void main(String[] args) {

		ClasseDaData data1 = new ClasseDaData();
		//data1.dia = 01;
		//data1.mes = 10;
		//data1.ano = 2053;

		ClasseDaData data2 = new ClasseDaData(31,12,2021);
		//data4.dia = 30;
		//data4.mes = 10;
		//data4.ano = 2073;

		System.out.println("Imprimindo a data atrav�s do m�todo String obterDataFormatada() com retorno");
		System.out.println("Hoje �: " + " " + data1.obterDataFormatada());
		System.out.printf("Hoje �: " + " " + data2.obterDataFormatada() + "\n\n");

		System.out.println("Imprimindo a data atrav�s dovoid imprimirDataFormatada()-sem retorno");
		data1.imprimirDataFormatada();

	}

}

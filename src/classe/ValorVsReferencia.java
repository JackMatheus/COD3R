package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //Atribuição por valor 
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		ClasseDaData d1 = new ClasseDaData(25, 10, 1967);
		//d1.dia = 31;
		ClasseDaData d2 = d1; //Atribuição por referência (objeto)
		
		System.out.printf("\nApontam para o mesmo endereço de memoria d1, d2\n");	
		System.out.printf("\n/////////////////////////////\n");	
		d1.dia = 31;
		d2.mes = 12;
		d1.ano =2022;
		
		System.out.println(d1.obterDataFormatada());
		
		System.out.printf("\n/////////////////////////////\n");	
		System.out.println(d2.obterDataFormatada());
		
		System.out.printf("\n/////////////////////////////\n");	
		voltarDataParaMetodoPadrao(d1);
		
	    System.out.println(d1.obterDataFormatada());
		
		System.out.printf("\n/////////////////////////////\n");	
		System.out.println(d2.obterDataFormatada());
		
		System.out.printf("\n/////////////////////////////\n");	
		
		int c =5;
		alterarPrimitivo(c);
		
	}	
										//Objeto ClasseDaData, d = nome qualquer
	static void voltarDataParaMetodoPadrao (ClasseDaData d){
		d.dia =1;
		d.mes =1;
		d.ano = 1970;
		
		
	}
	
	static void alterarPrimitivo(int a) {
		a++;
		
	}

}

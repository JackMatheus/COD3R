package classe;

import java.sql.Date;

public class ClasseDaData {
	
	int dia;
	int mes;
	int ano;
	
	//Construtor padrao
	ClasseDaData(){
		dia = 1;
		mes = 1;
		ano = 1971;
		
	}
	
	//Construtor com parametros
	ClasseDaData(int diaInicial, int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	String obterDataFormatada() {		
	return String.format("%d/%d/%d", dia, mes, ano);		
	}
	
	//Metodo usado somente no terminal, não da para usar numa aplicação Web/Mobile, enfim
	void imprimirDataFormatada() {		
		//System.out.printf("%d/%d/%d\n", dia, mes, ano);
		System.out.printf(obterDataFormatada());		
	}
}

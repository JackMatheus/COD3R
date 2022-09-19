package classe;

public class VariavelLocalFromData {

	int dia;
	int mes;
	int ano;
	
	//Construtor padrao
	VariavelLocalFromData(){
		//dia = 1;
		//mes = 1;
		//ano = 1971;
		
		//ou
		this(1, 1, 1971);
		
	}
	
	//Construtor com parametros
	VariavelLocalFromData(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {	
		String formato = "%d/%d/%d";
	//return String.format("%d/%d/%d", dia, mes, ano);		
		return String.format(formato,this.dia, this.mes, this.ano);
	}

	
	//Metodo usado somente no terminal, não da para usar numa aplicação Web/Mobile, enfim
	void imprimirDataFormatada() {		
		//System.out.printf("%d/%d/%d\n", dia, mes, ano);
		System.out.printf(obterDataFormatada());		
	}
	
	
	//static void metodoErradoParaTeste() {
	//	this.dia=3;
		
	//Não é possível usar o this com o metodo static, porque o metodo static esta associado a classe , e o this é somente uma das instancia da classe
	//}
}
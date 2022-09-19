package classe;

public class ValorNulo {
	
	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!! Querida Cheguei"));
		
		//String s2 = null; //desta forma gera erro de compilação pq a variável não foi inicializada
		//System.out.println(s2.concat("!!! Querida Cheguei"));
		
		//String s2; //desta forma gera erro de compilação pq a variável não foi inicializada
		//System.out.println(s2.concat("!!! Querida Cheguei"));
		
		ClasseDaData d1 = Math.random()>0.5? new ClasseDaData(): null;
		if(d1 != null) {
			d1.mes = 3;	
			System.out.println(d1.obterDataFormatada());
		}
		//s3 =null;
		String s3 = Math.random()>0.5? "Opa": null;
		if(s3 !=null) {			
			System.out.println(s3.concat("!!! Querida Cheguei"));	
		}
		
	}

}

package classe;

public class AreaDaCircTeste {

	public static void main(String[] args) {
		
//		//1.1 raioInicial aqui ctrl+shift+c
//		AreaCirc a1 = new AreaCirc(10);		
//		a1.pi=10;		
//		
//		//2.1 area aqui
//		System.out.println(a1.area());
//		
//		
//		//raioInicial aqui
//		AreaCirc a2 = new AreaCirc(5);
//		a2.pi=5;		
//		System.out.println(a2.area());
		
		
		//Exemplo acessando as variáveis da classe
//		AreaCirc a1 = new AreaCirc(10);	
//		AreaCirc a2 = new AreaCirc(5);
//		
//		AreaCirc.pi=5.14;		
//		System.out.println(a1.area());
//		System.out.println(a2.area());		
//		
//		
//		AreaCirc.pi=1;		
//		System.out.println(a1.area());
		
//	    área que pertence a instancia vs area que pertence a classe 
		
//		exemplo 1 - a instancia da instânciA(OBJETO)	
		AreaCirc a1 = new AreaCirc(10);
		a1.raio=10;		
		System.out.println(a1.area());
		
//		EXEMPLO 2 -  area que pertence a classe 
		System.out.println(AreaCirc.area(100));
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
			
		}
		
		
	}

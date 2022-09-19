package fundamentos;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		// exemplo 1
		//int a  = 3*4-10;
		//int b = (int) Math.pow(a, 3);
		//double c = Math.pow(a, 3);
		
		//System.out.println(b);
		//System.out.println(c);
		
		// exemplo 2
		// bloco 1
		int a1  = 3+2;		
		int a2  = (int) Math.pow(a1, 2);		
		int a3 = (int) Math.pow(6, 2);
		int a3final = (a2*a3/6);
		System.out.println(a3final);
		
		// bloco 2
		int b1  = 1-5;		
		double b2  = Math.pow(b1, 2);
		int b3 = 2-7;
		double b4 = Math.pow(b3, 2);
		double b4final= (b2*b4)/(2*2);
		System.out.println(b4final);
		
		Double diferenca = a3final - b4final;
		
		
		double b5 = Math.pow(diferenca, 3);
		double b6 = Math.pow(10, 3);
		System.out.println(b5/b6);
		
		
				
		
		
	}

}

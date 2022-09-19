package classe;

public class PrimeiroTrauma {
	//Nota: estão fora do metodo main
	int a = 3;
	static int b= 3;
	
	public static void main(String[]args) {
		//Tem que instanciar a variavel devido o metodo static
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a);
		
		//metodo static
	    System.out.println(b);

		
	}

}

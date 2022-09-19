package classe;
public class DataTeste {
	
	public static void main(String[] args) {
	
	ClasseDaData data = new ClasseDaData();
	data.dia=01;
	data.mes=10;
	data.ano=2021;
	
	ClasseDaData data2 = new ClasseDaData();
	data2.dia=30;
	data2.mes=10;
	data2.ano=1873;
	
	System.out.printf("%d/%d/%d\n",data.dia,data.mes,data.ano);
	System.out.printf("%d/%d/%d",data2.dia,data2.mes,data2.ano);
	
	}
			
}

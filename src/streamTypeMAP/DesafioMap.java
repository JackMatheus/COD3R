package streamTypeMAP;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	
	public static void main(String[] args) {		
		/*Pesquisar
		 * 
		 * 1.Numero para String binária....6 =>"110"
		 * 2.Inverter a string..."110" => "011"
		 * 3.Converter de volta para inteiro => "011" =>3
		 * 
		 * */		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Consumer<String> println = System.out::println;
		
		//UnaryOperator<String> numBinario = n -> n.Integer.toBinaryString(numeros);
		//System.out.println("\nnumBinario " + numBinario);
		
		System.out.println("\n2.Inverter a string...\"110\" => \"011\"");		
		UnaryOperator<String> inverter = texto -> new StringBuilder(texto).reverse().toString();
		
		System.out.println("\n3.Converter de volta para inteiro => \"011\" =>3");		
		Function<String,Integer> binarioParaInt = 
				string -> Integer.parseInt(string, 2);				

		System.out.println("\nResultado Final");
		numeros.stream()
			.map(Integer::toBinaryString)
			.map(inverter)
			.map(binarioParaInt)
			.forEach(System.out::println);		
	}

}

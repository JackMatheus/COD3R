package streamTypeReduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		BinaryOperator<Integer> soma = (acc , n) -> acc + n;
		
	
		Integer total1 = nums.parallelStream()
				.reduce(soma)
				.get();
		System.out.println("\nTotal1 " + total1);
		Integer total2 = nums.stream()
				.reduce(100, soma);
		System.out.println("\nTotal2 " + total2);
		
		//Resultado foi um Optional <Integer>
		nums.stream()
			.filter(n-> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);	
		
	
	}
}

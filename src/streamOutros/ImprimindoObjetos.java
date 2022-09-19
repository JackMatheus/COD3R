package streamOutros;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	
	public static void main(String[] args) {
	    //List<Integer> numeros = Arrays.asList(1,2,3,4,5);
	    
		List<String> aprovados = Arrays.asList("Lu", "Lucas", "Maria", "Ana");
		System.out.println("\nUsando for");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));			
		}
		
		System.out.println("\nUsando for Each");
		for(String nome: aprovados) {
		System.out.println(nome);	
		}
		
		System.out.println("\nUsando Iterator...");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());		
		}
		
		System.out.println("\nUsando Stream...");
		Stream<String> stream = aprovados.stream(); 
		stream.forEach(System.out::println);
		//System.out.println();
		
		//Stream = sequencia de objetos que irão se suceder;
		System.out.println("\nUsando Stream numeros");
	    List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		Stream<Integer> stream1 = numeros.stream(); 
		stream1.forEach(System.out::print);
		
		//Stream = sequencia de objetos que irão se suceder;
		System.out.println("\nUsando Stream numeros");
	    List<Double> numeros2 = Arrays.asList( 1.1 , 2.2 , 3.3 , 4.4 , 5.5 );
		Stream<Double> stream2 = numeros2.stream(); 
		stream2.forEach(System.out::print);
		
	}

}

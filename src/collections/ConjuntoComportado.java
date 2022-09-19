package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
//		Set<String> listaAprovados = new HashSet<String>();
		SortedSet<String> listaAprovados = new TreeSet<String>();
		listaAprovados.add("Tipo String");
		listaAprovados.add("Ana");
		listaAprovados.add("Maria");
		listaAprovados.add("Tiago");
		
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
				
		}
		
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(1);
		nums.add(5);
		nums.add(3);
		nums.add(0);
		
		for(Integer n: nums) {
			System.out.println(n);
		}
	}

}

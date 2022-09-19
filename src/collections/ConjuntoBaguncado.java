package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1);
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("teste");		
		conjunto.add("x");
		
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println("FOI REMODIDO " + conjunto.remove("teste"));
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println("Existe o elemento Z ?" +conjunto.contains("z"));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		
		System.out.println("Trabalhando com conjuntos");
		System.out.println(nums);
		System.out.println(conjunto);
		
		System.out.println("União entre CONJUNTOS");
		conjunto.addAll(nums);
		System.out.println(conjunto);
		
		System.out.println("Intersecção entre CONJUNTOS");
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
	}
}

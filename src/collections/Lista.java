package collections;

import java.util.List;
import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Maria"));
		
		System.out.println("Pegando o elemento indice 3:  "  + lista.get(3)); //Acessar o indice
	
		System.out.println(">>>>>" + lista.remove(1));
		System.out.println(lista.remove(new Usuario("Manu")));
		System.out.println("Tem Lia na Lista?: " + lista.contains("Lia"));
		
//		for(Usuario u: lista) {
//			System.out.println(u.nome);
//		}
//		

		

		
		
	}

}

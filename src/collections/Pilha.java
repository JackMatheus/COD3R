package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		livros.add("O pequeno principe");
		livros.push("Don Quixote");
		//Primeiro elemento
		livros.push("O Hobbit");
		
		System.out.println("Pegando o primeiro elemento");
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println("Pegando todos elementos");
		for(String livro: livros) {
			System.out.println(livro);
		}
		

		
			
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		//System.out.println(livros.remove());
		
		//livros.size();
		//livros.clear();
		//livros.contains(livros);
		//livros.isEmpty();
		
		
	}

}

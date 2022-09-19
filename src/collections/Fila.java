package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		//Offer e Add -> adciona elemento na fila
		//Diferença é o comportamento quando a fila esta cheira, add return exceção, offer return true ou false
		fila.add("Ana"); //return exceção
		fila.offer("Bia");//return true ou false
		fila.add("Daniel");//return true ou false
		fila.add("Carlos");
		fila.offer("Rafaela");//return true ou false
		fila.add("Gui");//return true ou false
		
		//Peek e element -> obter proximo elemento da fila sem remover
		//Diferença é o comportamento quando a fila esta vazia
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.peek()); //return exceção
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		
		//Poll e remove -> obter proximo elemento 
		//da fila e remove!
		//Diferença é o comportamento quando a fila esta vazia
		System.out.println(fila.poll());// return false
		System.out.println(fila.remove());//return exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		//System.out.println("métodos clear, isEmpty e size");
		//fila.clear();
		//fila.isEmpty();
		//fila.size();
		//fila.coontains(...);
		//System.out.println(fila.isEmpty());
		//System.out.println(fila.size());
		
		
		
		
		
		
	}

}

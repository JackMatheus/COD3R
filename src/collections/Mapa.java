package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1, "Roberto");
		usuarios.put(1, "Mario");
		usuarios.put(2,"Rafaela");
		usuarios.put(3,"Rebela");
		usuarios.put(40,"Tatiane");
		
		System.out.println(usuarios);
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println("Retorno da função" + "usuarios.values()");
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(20));		
		System.out.println(usuarios.containsValue("Tatiane"));
		
		
		System.out.println(usuarios.get(40));
		System.out.println("Aqui");
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(1, "Gui"));
		
		System.out.println("Percorrendo e Imprimeindo os valores das chaves");
		for(int chave: usuarios.keySet()){
			System.out.println(chave);
		}
		
		System.out.println("Percorrendo e Imprimindo os valores");
		for(String usuario: usuarios.values()){
			System.out.println(usuario);
		}
		
		System.out.println("Percorrendo e Imprimeindo os valores das chaves e valores");
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			
			System.out.print(registro.getKey()+ "==>");
			System.out.println(registro.getValue());
			
		}
	}
}

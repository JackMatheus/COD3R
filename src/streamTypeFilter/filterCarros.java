package streamTypeFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import streamOutros.Aluno;

public class filterCarros {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro("VW","Gol","bolinha", 2030);
		Carro carro2 = new Carro("Hyundai","HB20","expression", 2022);
		Carro carro3 = new Carro("GM","Classic","silver", 2021);
		Carro carro4 = new Carro("Nissan","March","brown", 2011);
		Carro carro5 = new Carro("FIAT","Palio","green", 2022);
		Carro carro6 = new Carro("VW","Polo","Fast", 2022);
		Carro carro7 = new Carro("VW","Brasilia","Yellow", 1999);
		
		List<Carro> carros = Arrays.asList(carro1,carro2,carro3,carro4,carro5,carro6,carro7); 
		//System.out.println(carros);
		// Filter, filter, map
		Predicate<Carro> carroNovos = a -> a.ano >= 2000;
		
		Predicate<? super Carro> marcaDoCaroo = a -> a.marca == "VW";
		
		Function<Carro, String> saudacao = 
				s -> "Parabéns pelo " + s.nome + " " + s.ano +" Seja Feliz  !!!!";
				
		carros.stream()
			.filter(carroNovos)
			.filter(marcaDoCaroo)
			//.map(m -> m.valueOf(m.charAt(0)))
			.map(saudacao)
			//.map(m -> m.valueOf(m.charAt(0)))
			.forEach(System.out::println);
		
		System.out.println(carros.size());
		
		
	}

}

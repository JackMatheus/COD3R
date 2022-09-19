package lambdas;

import java.util.Objects;
//Encadeamento de fun��es 
import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {

		        System.out.println(new Carro("a"));
		        System.out.println(new Carro("x"));
		    }
		    static class Carro {
		        private String marca;
		        public Carro(String marca) {
		            this.marca = marca;
		        }
		        public boolean equals(Object o) {
		            Carro carro = (Carro) o;
		            return Objects.equals(marca, carro.marca);
		        }
		        public int hashCode() {
		            return 1;
	
		}

}}
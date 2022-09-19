package lambdas;


	public class Produto extends Object{
		
		final String nome;
		final double preco;
		final double desconto;
		
		
		public Produto(String nome, double preco, double desconto) {
			this.nome = nome;
			this.preco = preco;
			this.desconto = desconto;
		}
		
		public String toString() {
			double precoFinal = preco*(1-desconto);
			return nome + "tem preço de R$" + precoFinal;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			long temp;
			temp = Double.doubleToLongBits(desconto);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			temp = Double.doubleToLongBits(preco);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Produto other = (Produto) obj;
			if (Double.doubleToLongBits(desconto) != Double.doubleToLongBits(other.desconto))
				return false;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
				return false;
			return true;
		}
		
		
	}
	

	
	
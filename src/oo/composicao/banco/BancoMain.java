package oo.composicao.banco;

public class BancoMain {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta(1, 1000, "CC", 50);
		Conta conta2 = new Conta(2, 2000, "CP", 100);
	
		conta1.obterSaldoAtual();
		conta2.obterSaldoAtual();
		
		
		Cliente cliente1 = new Cliente(conta2, "Maecela", 0);
        //cliente1.adicionarCliente(conta1);		
		System.out.println("cliente1" + cliente1);
		
		System.out.println("O saldo atual da sua conta é: " + conta1.obterSaldoAtual());	
		System.out.println("O saldo atual da sua conta é: " + conta2.obterSaldoAtual());
		
	}
}

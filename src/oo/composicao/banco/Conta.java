package oo.composicao.banco;

public class Conta {

	int num;
	double saldo;
	double debito;
	String tipo;
	
	public Conta(int num,double saldo ,String tipo, double debito) {
		
		this.num = num;
		this.saldo = saldo;
		this.debito = debito;
		this.tipo = tipo;
	}
	
	double obterSaldoAtual() {
		double total = 0;		
		total = saldo - debito;
		return total;
	}

}

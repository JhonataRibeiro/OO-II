package br.com.conta;

public class SaldoInsuficienteException extends Exception {
	
	private double saldoAtual;
	
	public double getSaldoAtual() {
		return saldoAtual;
	}

	public SaldoInsuficienteException(double saldoAtual){
		super("Saldo insuficiente " + saldoAtual);
		this.saldoAtual = saldoAtual;
	}
	
	
}

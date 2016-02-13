package br.com.conta;

public class Conta {
	private double saldo;
	private String titular;
	private int agencia;
	private int numero;
	
	public void saca(double valor){
		if(valor <	 this.saldo){
			this.saldo -= valor;	
		}else{
			throw new RuntimeException("Saldo insuficiente");
		}
		
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

}

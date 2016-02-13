package br.com.conta;

import javax.management.RuntimeErrorException;

public class Conta {
	private double saldo;
	private String titular;
	private int agencia;
	private int numero;
	
	public void saca(double valor) throws Exception{
		if(valor <	 this.saldo){
			this.saldo -= valor;	
		}else{
			throw new SaldoInsuficienteException(saldo);
			//throw new RuntimeException();
		}
		
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

}

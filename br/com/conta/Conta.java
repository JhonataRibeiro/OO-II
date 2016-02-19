package br.com.conta;

import javax.management.RuntimeErrorException;

public class Conta implements Comparable<Conta>{
	private double saldo;
	private String titular;
	private int agencia;
	private int numero;
	
	public Conta(double saldo){
		this.saldo += saldo;
	}
	
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
	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public int compareTo(Conta outra) {
		if(this.saldo < outra.saldo) return -1;
		if(this.saldo > outra.saldo) return 1;
		return 0;
	}

}

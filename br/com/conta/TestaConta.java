package br.com.conta;

public class TestaConta {
	public static void main(String[] args) {
		Conta joao = new Conta();
		joao.deposita(50.0);
		joao.saca(100.00);
		
		System.out.println(joao.getSaldo());
	}
}

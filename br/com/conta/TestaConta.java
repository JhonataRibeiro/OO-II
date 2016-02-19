package br.com.conta;

public class TestaConta {
	public static void main(String[] args) {
		Conta joao = new Conta(20.0);
		joao.deposita(50.0);
		
		try {
			joao.saca(100.00);	
		}catch(SaldoInsuficienteException e){
			System.out.println("Saldo insuficiente - " + e.getSaldoAtual());
		}catch (Exception e) {
			System.out.println("Um outro erro qualquer");
		}
		
		
		System.out.println(joao.getSaldo());
	}
}

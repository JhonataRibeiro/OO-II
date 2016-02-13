package br.com.conta;

public class TestaExcecao {
	public static void main(String[] args) {
		System.out.println("Inicio main");
		m1();
		System.out.println("Fim do main");
	}

	private static void m1() {
		System.out.println("Iniciando metodo 1");
		m2();
		System.out.println("Terminando metodo 1");
	}

	private static void m2() {
		System.out.println("Iniciando metodo 2");
		int [] nums = new int[5];
		for(int i = 0; i < 6; i++){
			nums[i] = i*2;
			System.out.println(nums[i]);
		}
		System.out.println("Terminando metodo 2");
	}
}

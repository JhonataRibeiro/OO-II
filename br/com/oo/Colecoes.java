package br.com.oo;

import java.util.ArrayList;

public class Colecoes {
	public static void main(String[] args) {
		ArrayList nomes = new ArrayList();
		nomes.add("Mauricio");
		nomes.add("Guilherme");
		System.out.println(nomes.get(0));
		System.out.println(nomes.contains("Guilherme"));
	}
}

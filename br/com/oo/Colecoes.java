package br.com.oo;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import br.com.conta.Conta;

public class Colecoes {
	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		nomes.add("Mauricio");
		nomes.add("Guilherme");
		System.out.println(nomes.get(0));
		System.out.println(nomes.contains("Guilherme"));
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		Conta c1 = new Conta(700.00);
		Conta c2 = new Conta(450.00);
		
		contas.add(c1);
		contas.add(c2);
		
		Collections.sort(contas);
		
		for(Conta conta : contas){
			System.out.println(conta.getSaldo());;
		}
		
	}
}

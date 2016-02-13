package br.com.jhonata.oo.modelo;

import br.com.oo.Autenticavel;

public class Cliente implements Autenticavel {
	
	private String nome;
	private String endereco;
	
	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}

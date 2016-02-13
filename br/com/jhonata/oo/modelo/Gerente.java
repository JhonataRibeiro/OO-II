package br.com.jhonata.oo.modelo;

import br.com.oo.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel{
	public double getBonus(){
		return this.salario * 0.3;
	}
	
	public void cobraEntrega(){
		
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
}

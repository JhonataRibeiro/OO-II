package br.com.oo;

import br.com.jhonata.oo.modelo.Funcionario;

public abstract class FuncionarioAutenticavel extends Funcionario{
	
	protected int senha;
	
	public  boolean autentica(int senha){
		return this.senha == senha;
	}

	@Override
	public double getBonus() {
		// TODO Auto-generated method stub
		return 0;
	}

}

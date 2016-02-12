package br.com.oo;

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

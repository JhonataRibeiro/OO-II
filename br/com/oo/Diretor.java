package br.com.oo;

public class Diretor extends Funcionario implements Autenticavel{
	
	public double getBonus(){
		return this.salario * 0.3;
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

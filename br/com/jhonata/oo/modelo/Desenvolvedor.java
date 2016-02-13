package br.com.jhonata.oo.modelo;

class Desenvolvedor extends Funcionario{
	public double getBonus(){
		return this.salario * 0.25;
	}
}

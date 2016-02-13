package br.com.oo;

import br.com.jhonata.oo.modelo.Funcionario;

public class TotalizadorDeBonus{
	private double total;
	
	public void adiciona(Funcionario funcionario){
		this.total += funcionario.getBonus();
	}

	public double getTotal() {
		return this.total;
	}
}

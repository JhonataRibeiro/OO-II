package br.com.oo;

class TotalizadorDeBonus{
	private double total;
	
	public void adiciona(Funcionario funcionario){
		this.total += funcionario.getBonus();
	}

	public double getTotal() {
		return this.total;
	}
}

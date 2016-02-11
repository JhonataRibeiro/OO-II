package br.com.oo;

class Funcionario {
	private String nome;
	protected double salario;
	public void setSalario(double salario){
		this.salario  = salario;
	}
	
	public double getBonus(){
		return this.salario * 0.2;
	}
}

class Gerente extends Funcionario{
	public double getBonus(){
		return this.salario * 0.3;
	}
}

class TotalizadorDeBonus{
	private double total;
	
	public void adiciona(Funcionario funcionario){
		this.total += funcionario.getBonus();
	}

	public double getTotal() {
		return this.total;
	}
}

class Desenvolvedor extends Funcionario{
	public double getBonus(){
		return this.salario * 0.25;
	}
}



class TestaFuncionario{
	public static void main(String[] args) {
		Funcionario joao = new Funcionario();
		joao.setSalario(1000.00);
		System.out.println("salario: " + joao.getBonus());
		
		Gerente joaquin = new Gerente();
		joaquin.setSalario(2000.00);
		System.out.println("Bonus do gerente: " + joaquin.getBonus());
		
		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		totalizador.adiciona(joao);
		totalizador.adiciona(joaquin);
		
		System.out.println(totalizador.getTotal());
		
		
	}
}


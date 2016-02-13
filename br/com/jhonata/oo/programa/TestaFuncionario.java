package br.com.jhonata.oo.programa;

import br.com.jhonata.oo.modelo.Funcionario;
import br.com.jhonata.oo.modelo.Gerente;
import br.com.oo.TotalizadorDeBonus;

class TestaFuncionario{
	public static void main(String[] args) {
		Funcionario joao = new Gerente();
		joao.setSalario(1000.00);
		System.out.println("salario: " + joao.getBonus());
		
		Gerente joaquin = new Gerente();
		joaquin.setSalario(2000.00);
		joaquin.cobraEntrega();
		System.out.println("Bonus do gerente: " + joaquin.getBonus());
		
		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		totalizador.adiciona(joao);
		totalizador.adiciona(joaquin);
		
		System.out.println(totalizador.getTotal());
		
		
	}
}

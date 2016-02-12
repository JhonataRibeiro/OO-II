package br.com.areaCalculavel;

public class Quadrado implements AreaCalculavel{

	private int lado;
	
	public Quadrado(int lado) {
		this.lado = lado;
	}
	
	@Override
	public double areaCalculavel() {
		return this.lado * this.lado;
	}

}

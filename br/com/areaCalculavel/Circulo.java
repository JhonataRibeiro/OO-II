package br.com.areaCalculavel;

public class Circulo implements AreaCalculavel{

	private static double pi = 3.14;
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double areaCalculavel() {
		return pi * (Math.pow(raio, 2));
	}

}

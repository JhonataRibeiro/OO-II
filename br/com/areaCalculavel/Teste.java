package br.com.areaCalculavel;

public class Teste {
	
	public static void main(String[] args) {
			AreaCalculavel a = new Retangulo(2, 3);
			System.out.println(a.areaCalculavel());
			
			AreaCalculavel circulo = new Circulo(15);
			System.out.println(circulo.areaCalculavel());
	}

}

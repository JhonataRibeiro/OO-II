package br.com.oo;

public class TetaInteger {
	
	
	public static void main(String[] args) {
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);
		Integer teste;
		String a = "A";
		teste = Integer.parseInt(a);
		System.out.println(teste);
		
		if(x1 == x2){
			System.out.println("igual");
		}else{
			System.out.println("diferente");
			System.out.println("x1: " + x1);
			System.out.println("x2 " + x2);
		}
		
		if(x1.equals(x2)){
			System.out.println("igual");
		}else{
			System.out.println("diferente");
		}
		
	}

	
}

package br.com.oo;

public class SistemaInterno {
	public void autentica(Autenticavel f){
		
		int senha = 123; //just example
		
		if(f.autentica(senha) == true){
			System.out.println("bem vindo ao sistema");
		}else {
			System.out.println("senha incorreta");
		}
	}
}

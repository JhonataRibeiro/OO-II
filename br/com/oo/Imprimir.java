package br.com.oo;

import java.sql.Array;
import java.util.ArrayList;

public class Imprimir {
	
	public static void main(String[] args) {
		String nome = "juliana";
		Integer size = nome.length();
		
		char[] outro = nome.toCharArray();
		
		for(char letra : outro){
			System.out.println(letra);
		}
		
	}

}

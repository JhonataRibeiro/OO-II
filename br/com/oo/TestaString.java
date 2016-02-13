package br.com.oo;

public class TestaString {
	public static void main(String[] args) {
		String s = "fj11";
		s = s.replaceAll("11", "22");
		System.out.println(s);
		
		char data[] = {'a','b','c'};
		String str = new String(data);
		System.out.println(str);
		
		System.out.println(str.contains("ab"));
		
		String nome =  "jhonata ";
		System.out.println(nome.length());
		nome = nome.trim();
		
		System.out.println(nome.isEmpty());
		
		System.out.println(nome.length());
	}
}

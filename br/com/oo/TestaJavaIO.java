package br.com.oo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestaJavaIO {
	
	public static void main(String[] args){
		try {
			InputStream is = new FileInputStream("arquivo.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String s = br.readLine();
			int c = isr.read();
			while(s != null){
				System.out.println(s);
				s = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Erro na leitura do arquivo: " + e.getMessage());
		}
		
	}

}

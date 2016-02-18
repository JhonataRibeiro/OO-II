package br.com.oo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FromFile {
	
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");
		InputStreamReader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		String s = br.readLine();
		while(s != null){
			System.out.println(s);
			s = br.readLine();
		}
	}

}

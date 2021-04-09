package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "C";
		System.out.println(s.codePointAt(0));
		
		System.out.println();
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		System.out.println();
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length + ", windows-1252, ");
		String sNovo =  new String(bytes);
		System.out.println(sNovo);
		
		System.out.println();
		
		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + ", UTF-16, ");
		sNovo =  new String(bytes);
		System.out.println(sNovo);
		
		System.out.println();
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + ", US_ASCII, ");
		sNovo =  new String(bytes);
		System.out.println(sNovo);

	}

}

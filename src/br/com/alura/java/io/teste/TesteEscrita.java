package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada de arquivo
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Suspendisse eget nunc posuere, fringilla erat a, maximus mauris. Nunc vulputate tortor eros.");
		bw.newLine();
		bw.newLine();
		bw.write("Phasellus ac commodo elit, at scelerisque est. Aliquam erat volutpat.");
				
		bw.close();
	}

}

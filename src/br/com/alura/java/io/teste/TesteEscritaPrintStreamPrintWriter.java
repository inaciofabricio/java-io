package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada de arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem5.txt"));

		PrintStream ps = new PrintStream("lorem6.txt");
		
		ps.println("Suspendisse eget nunc posuere, fringilla erat a, maximus mauris. Nunc vulputate tortor eros.");
		ps.println();
		ps.println("Phasellus ac commodo elit, at scelerisque est. Aliquam erat volutpat.");
				
		ps.close();
	}

}

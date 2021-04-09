package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada de arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		FileWriter fw =  new FileWriter("lorem5.txt");
//		
//		fw.write("Suspendisse eget nunc posuere, fringilla erat a, maximus mauris. Nunc vulputate tortor eros.");
//		fw.write(System.lineSeparator());
//		fw.write(System.lineSeparator());
//		fw.write("Phasellus ac commodo elit, at scelerisque est. Aliquam erat volutpat.");
//				
//		fw.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem5.txt"));
		bw.write("Suspendisse eget nunc posuere, fringilla erat a, maximus mauris. Nunc vulputate tortor eros.");
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write("Phasellus ac commodo elit, at scelerisque est. Aliquam erat volutpat.");
				
		bw.close();
	}

}

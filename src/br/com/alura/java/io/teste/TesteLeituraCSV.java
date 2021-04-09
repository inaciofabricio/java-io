package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraCSV {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("teste.csv"), "UTF-8");
		
		while(scanner.hasNext()) {
			String linha = scanner.nextLine();
//			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipo = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			String valorFormatado = String.format(
					new Locale("pt","BR"), 
					"Tipo: %s, Agência: %04d, Conta: %06d, Titular: %s, Saldo: %10.2f", 
					tipo, agencia, numero, titular, saldo
			);
			System.out.println(valorFormatado);
			
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
		}
		
		
	
		
		scanner.close();

	}

}

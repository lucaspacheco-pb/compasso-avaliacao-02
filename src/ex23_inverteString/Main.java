/*
 * Elabore um programa que inverta as palavras em uma string
 */
package ex23_inverteString;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		String frase;
		
		do {
			System.out.print("Informe uma palavra para ser invertida: ");
			frase = scanner.nextLine().trim();
		} while(frase.length() == 0);
		
		System.out.println("A palavra " + frase + " invertida fica " + inverterPalavra(frase));
		
		scanner.close();
	}
	
	public static String inverterPalavra(String frase) {
		char[] caracteresFrase = frase.toCharArray();
		String teste = "";
		
		for(int i = 1; i <= frase.length(); i++) {
			teste += caracteresFrase[frase.length()-i];
		}
		
		return teste;
	}

}

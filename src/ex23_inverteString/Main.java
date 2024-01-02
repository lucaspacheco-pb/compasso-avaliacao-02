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
			// Método trim usado para sanitização dos dados fornecidos pelo usuário
		} while(frase.length() == 0);
		
		// Imprime o resultado que será retornado pela função inverterPalavra
		System.out.println("A palavra " + frase + " invertida fica " + inverterPalavra(frase));
		
		scanner.close();
	}
	
	public static String inverterPalavra(String frase) {
		// Transforma a palavra ou frase recebido em um array de caracteres
		char[] caracteresFrase = frase.toCharArray();
		// Declara e inicia a variável do tipo String com aspas vazias
		String invertido = "";
		
		for(int i = 1; i <= frase.length(); i++) {
			// Percorre o array de caracteres começando pelo final até o inicio e concatenando as letras na String invertido
			invertido += caracteresFrase[frase.length()-i];
		}
		
		return invertido;
	}

}

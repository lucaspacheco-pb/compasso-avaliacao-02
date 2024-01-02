/*
 * Escreva um programa que determine se uma string é um anagrama de outra.
 */
package ex20_stringAnagrama;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		String palavra1, palavra2;
		
		do {
			System.out.print("Informe a primeira palavra: ");
			palavra1 = scanner.nextLine().trim();
			// Método trim() utilizado para sanitização dos dados fornecidos pelo usuário
		} while(palavra1.length() <= 0);
		
		do {
			System.out.print("Informe a segunda palavra: ");
			palavra2 = scanner.nextLine().trim();
			// Novamente o método trim()
		} while(palavra2.length() <= 0);
		
		// a função verificaAnagrama é chamada como parametro do if, passando as duas palavras
        if (verificaAnagrama(palavra1, palavra2)) {
        	// Em caso de retorno verdadeiro, as palavras sao anagramas
            System.out.println(palavra1 + " e " + palavra2 + " são anagramas.");
        } else {
        	// Em caso de retorno negativo, as palavras nao sao anagramas
            System.out.println(palavra1 + " e " + palavra2 + " não são anagramas.");
        }

        scanner.close();
	}
	
	public static boolean verificaAnagrama(String palavra1, String palavra2) {
        // Verifica se o comprimento das palavras é igual
        if (palavra1.length() != palavra2.length()) {
            return false;
        }

        // Converte as strings para arrays de caracteres minusculos
        char[] charArray1 = palavra1.toLowerCase().toCharArray();
        char[] charArray2 = palavra2.toLowerCase().toCharArray();

        // Ordena os arrays de caracteres
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compara os arrays ordenados, sabendo que os arrays já tem a mesma quantidade de caracteres, aqui é verificado se as letras estão posicionadas da mesma maneira em ambas as strings
        return Arrays.equals(charArray1, charArray2);
    }

}

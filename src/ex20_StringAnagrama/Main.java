/*
 * Escreva um programa que determine se uma string é um anagrama de outra.
 */
package ex20_StringAnagrama;

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
		} while(palavra1.length() <= 0);
		
		do {
			System.out.print("Informe a segunda palavra: ");
			palavra2 = scanner.nextLine().trim();
		} while(palavra2.length() <= 0);
		
        if (verificaAnagrama(palavra1, palavra2)) {
            System.out.println(palavra1 + " e " + palavra2 + " são anagramas.");
        } else {
            System.out.println(palavra1 + " e " + palavra2 + " não são anagramas.");
        }

        scanner.close();
	}
	
	public static boolean verificaAnagrama(String palavra1, String palavra2) {
        // Verifica se os comprimento das palavras são iguais
        if (palavra1.length() != palavra2.length()) {
            return false;
        }

        // Converte as strings para arrays de caracteres minusculos
        char[] charArray1 = palavra1.toLowerCase().toCharArray();
        char[] charArray2 = palavra2.toLowerCase().toCharArray();

        // Ordena os arrays de caracteres
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compara os arrays ordenados
        return Arrays.equals(charArray1, charArray2);
    }

}

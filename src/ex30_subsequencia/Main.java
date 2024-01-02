/*Escreva um programa  que determine se uma string e uma subsequencia da outra */
package ex30_subsequencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Digite a primeira string: ");
            String str1 = in.nextLine();

            if (!validarString(str1)) {
                System.out.println("Entrada inválida. Apenas letras são permitidas.");
                return;
            }

            System.out.print("Digite a segunda string: ");
            String str2 = in.nextLine();

            if (!validarString(str2)) {
                System.out.println("Entrada inválida. Apenas letras são permitidas.");
                return;
            }

            if (ehSubsequencia(str1, str2)) {
                System.out.println("\"" + str1 + "\" é uma subsequência de \"" + str2 + "\".");
            } else {
                System.out.println("\"" + str1 + "\" NÃO é uma subsequência de \"" + str2 + "\".");
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado. Certifique-se de inserir entradas válidas.");
        } finally {
            in.close();
        }
    }

    // Função que valida se uma string contém apenas letras
    public static boolean validarString(String str) {
        return str.matches("[a-zA-Z]+");
    }

    // Função que verifica se uma string é uma subsequência de outra
    public static boolean ehSubsequencia(String str1, String str2) {
        int indexStr1 = 0;
        int indexStr2 = 0;

        // Percorre ambas as strings
        while (indexStr1 < str1.length() && indexStr2 < str2.length()) {
            // Compara os caracteres
            if (str1.charAt(indexStr1) == str2.charAt(indexStr2)) {
                indexStr1++; // Move para o próximo caractere em str1
            }

            indexStr2++; // Move para o próximo caractere em str2
        }

        // Se todos os caracteres de str1 foram encontrados em str2, então str1 é uma subsequência
        return indexStr1 == str1.length();
    }
}

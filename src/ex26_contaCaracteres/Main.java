/*Desenvolva um programa  que conte o número de caracteres alfabeticos de uma string */
package ex26_contaCaracteres;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = in.nextLine();

        int contador = contaCaracteresAlfabeto(entrada);

        System.out.println("Número de caracteres alfabéticos na string: " + contador);

        in.close();
    }

    // Função para contar o número de caracteres alfabéticos em uma string
    public static int contaCaracteresAlfabeto(String str) {
        int contador = 0;

        // Iteracao de cada caractere da string
        for (int i = 0; i < str.length(); i++) {
            char caractere = str.charAt(i);

            // Verifica se o caractere é uma letra do alfabeto
            if ((caractere >= 'a' && caractere <= 'z') || (caractere >= 'A' && caractere <= 'Z')) {
                contador++;
            }
        }

        return contador;
    }
}
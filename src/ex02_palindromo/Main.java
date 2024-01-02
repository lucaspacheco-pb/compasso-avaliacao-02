package ex02_palindromo;

import java.util.Scanner;

// 2.Desenvolva um programa que calcule a média geométrica de uma lista de números.

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma palavras: ");
        String palavras = scanner.nextLine();

        if (ehPalindromo(palavras)) {
            System.out.println("A string " + palavras + " é um palíndromo.");
        } else {
            System.out.println("A string " + palavras + " não é um palíndromo.");
        }

        scanner.close();
    }

    private static boolean ehPalindromo(String palavras) {

        //converte as palavras para minusculo e remove os espaços.
        palavras = palavras.toLowerCase().replaceAll(" ", "");

        //inverte a palavras.
        for (int i = palavras.length() - 1; i >= 0; i--) {
            if (palavras.charAt(i) != palavras.charAt(palavras.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
    
}

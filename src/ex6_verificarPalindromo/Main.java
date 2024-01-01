package ex6_verificarPalindromo;

import java.util.Scanner;

public class Main {

    // 6.Crie um programa que verifique se uma palavra é um palíndromo.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        String string;

        System.out.println("Digite uma string: ");
        string = scanner.nextLine();

        if (verificarPalindromo(string)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }

        scanner.close();
    }

    // este metodo recebe uma string e retorna true se a string for um palindromo, false caso contrario.

    public static boolean verificarPalindromo(String string) {
        String stringInvertida = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            stringInvertida += string.charAt(i);
        }

        if (string.equals(stringInvertida)) {
            return true;
        } else {
            return false;
        }
    }
    
}

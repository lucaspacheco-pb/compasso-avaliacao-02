package ex4_inverterString;

import java.util.Scanner;

// Elabore um programa que inverta uma string fornecida pelo usuário.

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string;

        System.out.println("Digite uma string: ");
        string = scanner.nextLine();

        System.out.println("String invertida: " + inverterString(string));

        scanner.close();


        
    }
    // este metodo recebe uma string e retorna a string invertida, fazendo uso do metodo charAt() da classe String.
    public static String inverterString(String string) {
        String stringInvertida = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            stringInvertida += string.charAt(i);
        }

        return stringInvertida;
    }

}

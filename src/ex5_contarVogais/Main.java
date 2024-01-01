package ex5_contarVogais;

import java.util.Scanner;

public class Main {

    // Implemente um programa que conte o número de vogais em uma string informada.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string;

        System.out.println("Digite uma string: ");
        string = scanner.nextLine();

        System.out.println("Número de vogais: " + contarVogais(string));

        scanner.close();

    }

    // este metodo recebe uma string e retorna o numero de vogais na string, fazendo uso do metodo charAt() da classe String.

    public static int contarVogais(String string) {
        int numeroVogais = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i'
                    || string.charAt(i) == 'o' || string.charAt(i) == 'u' || string.charAt(i) == 'A'
                    || string.charAt(i) == 'E' || string.charAt(i) == 'I' || string.charAt(i) == 'O'
                    || string.charAt(i) == 'U') {
                numeroVogais++;
            }
        }

        return numeroVogais;
    }

}

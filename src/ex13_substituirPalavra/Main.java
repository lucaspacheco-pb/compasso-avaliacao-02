package ex13_substituirPalavra;

//13.Elabore um programa que substitua todas as ocorrências de uma palavra por outra em uma string.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a string: ");
        String frase = scanner.nextLine();

        System.out.print("Digite a palavra que deseja substituir: ");
        String palavraAntiga = scanner.nextLine();

        System.out.print("Digite a nova palavra: ");
        String palavraNova = scanner.nextLine();

        // replaceAll subistitui a primeira string informada pela segunda
        // o \\b server para especificar exatamente a palavra por exemplo não substuir o "de" da palavra "derreter" e sim somente o "de"
        String novaFrase = frase.replaceAll("\\b" + palavraAntiga + "\\b", palavraNova);

        System.out.println("\nString original: " + frase);
        System.out.println("String com substituição de palavras completas: " + novaFrase);

        scanner.close();
    }
}

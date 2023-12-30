package ex16_contagemPalindromas;

//16.Desenvolva um programa que conte o número de palavras palíndromas em uma lista de strings.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a quantidade de palavras a serem informadas
        System.out.print("Quantas palavras deseja informar? ");
        int quantidade = scanner.nextInt();

        List<String> listaDeStrings = new ArrayList<>();
        List<String> listaPalindromas = new ArrayList<>();

        // Obtém as palavras informadas pelo usuário e as armazena na lista
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a palavra " + (i + 1) + ": ");
            String palavra = scanner.next();
            listaDeStrings.add(palavra);
        }

        int contadorPalindromas = 0;

        // Verifica se cada palavra na lista é um palíndromo
        for (String palavra : listaDeStrings) {

            // Remove espaços e transforma a palavra em minúsculas para facilitar a comparação
            String palavraFormatada = palavra.replaceAll("\\s+", "").toLowerCase();

            int esquerda = 0; //inicio da palavra
            int direita = palavraFormatada.length() - 1; //final da palavra
            boolean ehPalindromo = true;

            // Verifica se a palavra é um palíndromo
            while (direita > esquerda) {
                if (palavraFormatada.charAt(esquerda++) != palavraFormatada.charAt(direita--)) { //exemplo arara - compara indice 0 e 4, 1 e 3, 2 e 2
                    ehPalindromo = false;
                    break;
                }
            }

            if (ehPalindromo) {
                contadorPalindromas++;
                listaPalindromas.add(palavra);
            }
        }

        // Exibe as palavras palíndromas encontradas e o número total de palavras palíndromas na lista inserida
        System.out.println("Palavras palíndromas encontradas: " + listaPalindromas);
        System.out.println("Número de palavras palíndromas na lista: " + contadorPalindromas);

        scanner.close();
    }
}



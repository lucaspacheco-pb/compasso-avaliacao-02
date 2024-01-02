package ex06_quadradoPerfeito;

import java.util.Scanner;

// 6. Escreva um programa que verifique se um número é um quadrado perfeito.

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número");
        int numero = getInteiro(scanner);

        int raiz = (int) Math.sqrt(numero);

        if (raiz * raiz == numero) {
            System.out.println("O número " + numero + " é um quadrado perfeito");
        } else {
            System.out.println("O número " + numero + " não é um quadrado perfeito");
        }

        scanner.close();
    }

    private static int getInteiro(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Erro: informe um valor válido.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
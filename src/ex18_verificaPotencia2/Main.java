package ex18_verificaPotencia2;

// 18.Elabore um programa que verifique se um número é uma potência de 2.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é uma potência de 2: ");

        // Verifica se o próximo valor inserido é um número
        if (!scanner.hasNextInt()) {
            System.out.println("Por favor, digite um número válido.");
            scanner.close();
            return;
        }

        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Número inválido. Digite um número positivo.");
            scanner.close();
            return;
        }

        boolean ePotenciaDeDois = false;

        // Verifica se o número é uma potência de 2
        while (numero != 1) {
            // Se o número for ímpar, não é uma potência de 2
            if (numero % 2 != 0) {
                break;
            }
            numero /= 2;
        }

        // Se o número se tornou 1, é uma potência de 2
        if (numero == 1) {
            ePotenciaDeDois = true;
        }

        if (ePotenciaDeDois) {
            System.out.println("É uma potência de 2.");
        } else {
            System.out.println("Não é uma potência de 2.");
        }

        scanner.close();
    }
}






package ex15_menorPrimo;

//15.Escreva um programa que encontre o menor número primo maior que um número fornecido.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean eNumero = false;

        while (!eNumero) {
            System.out.print("Digite um número inteiro: ");

            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero > 0) { // Verifica se o número fornecido é maior que zero
                    eNumero = true;
                } else {
                    System.out.println("Por favor, digite um número inteiro maior que zero.");
                }
            } else {
                System.out.println("Entrada inválida. O valor inserido não é um número inteiro.");
                scanner.next();
            }
        }

        int verificarN = numero + 1;
        int menorPrimo = 0;
        boolean encontrado = false;

        while (!encontrado) { // Enquanto não encontrar o menor número primo
            boolean ePrimo = true; // Assume que 'verificarN' é primo

            for (int i = 2; i <= verificarN / 2; i++) {
                if (verificarN % i == 0) {
                    ePrimo = false; // Se 'verificarN' for divisível por 'i', não é primo
                    break; // Não precisa continuar verificando
                }
            }

            if (ePrimo) {
                menorPrimo = verificarN; 
                encontrado = true; // Indica que o menor primo foi encontrado, para sair do loop
            }

            verificarN++; 
        }

        System.out.println("O menor número primo maior que " + numero + " é: " + menorPrimo);
        scanner.close();
    }
}

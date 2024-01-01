package ex2_imparOuPar;

import java.util.Scanner;

public class Main {

    // 2.Desenvolva um programa que determine se um número é par ou ímpar.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double valor;

        System.out.println("Digite um número: ");
        valor = validarNumero(scanner);

        
        if (valor % 2 == 0) {
            System.out.println("O número " + valor + " é par.");
        } else {
            System.out.println("O número " + valor + " é ímpar.");
        }

        scanner.close();

    }

    private static double validarNumero(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Digite um número válido: ");
            scanner.next();
        }
        return scanner.nextDouble();

        
    }
    
}

package ex1_calculadoraBasica;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        double numero1, numero2;

        // 1.Crie um programa que receba dois números e exiba a soma, subtração, multiplicação e divisão entre eles.

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        numero1 = validarNumero(scanner);

        System.out.println("Digite o segundo número: ");
        numero2 = validarNumero(scanner);

        // Cálculo das operações matemáticas
        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;
        
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }

    private static double validarNumero(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Digite um número válido: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}

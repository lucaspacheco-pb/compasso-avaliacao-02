package ex17_somaHexadecimal;

// 17.Desenvolva um programa que calcule a soma dos dígitos de um número em uma base específica (além da decimal).A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número na base hexadecimal: ");
        String numero1 = scanner.nextLine();

        System.out.println("Digite o segundo número na base hexadecimal: ");
        String numero2 = scanner.nextLine();

        // Calcula a soma dos números na base hexadecimal
        int soma = calcularSoma(numero1) + calcularSoma(numero2);

        if (soma != -1) {
            System.out.println("Soma dos números na base decimal: " + soma);
            System.out.println("Soma dos números na base hexadecimal: " + Integer.toHexString(soma)); // Mostra o valor hexadecimal da soma
        }

        scanner.close();
    }

    // Função para calcular a soma dos dígitos na base hexadecimal
    public static int calcularSoma(String numero) {
        int soma = 0;

        // Percorre os dígitos do número
        for (int i = 0; i < numero.length(); i++) {
            char digito = numero.charAt(i);
            int valor = 0;

            // Converte cada dígito para um valor na base decimal
            if (digito >= '0' && digito <= '9') {
                valor = digito - '0';
            } else if (digito >= 'A' && digito <= 'F') {
                valor = digito - 'A' + 10; // exemplo A = 65, valor = 65 - 65 + 10, valor = 10
            } else {
                System.out.println("Caractere inválido na base hexadecimal.");
                return -1;
            }
            soma += valor; // Soma os valores convertidos para decimal
        }

        return soma;
    }
}






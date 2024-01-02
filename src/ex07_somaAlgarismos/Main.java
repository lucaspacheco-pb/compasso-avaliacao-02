package ex07_somaAlgarismos;
// Crie um programa que calcule a soma dos dígitos de um número usando um loop.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");

        do {
            String str = entrada.nextLine();

            if (isNumeroInteiro(str)) {
                int numero = Integer.parseInt(str);

                int soma = 0;
                int resto;

                while (numero != 0) {
                    resto = numero % 10; // Obtém o último dígito
                    numero /= 10;
                    soma += resto;
                }

                System.out.println("A soma dos dígitos é: " + soma);
                break;
            } else {
                System.out.println("Por favor, insira um número inteiro válido.");
            }

        }while(true);

        entrada.close();
    }

    private static boolean isNumeroInteiro(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (RuntimeException e) { // quando a conversão da string não ocorre para inteiro
            return false;
        }
    }
}

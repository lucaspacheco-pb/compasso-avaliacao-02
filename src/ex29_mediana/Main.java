/*Implemente um programa  que calcule a mediana de uma lista de numeros */
package ex29_mediana;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite a quantidade de numeros na lista: ");
            int tamanhoDaLista = scanner.nextInt();

            if (tamanhoDaLista <= 0) {
                System.out.println("A lista deve ter pelo menos um numero.");
                return;
            }

            double[] numeros = new double[tamanhoDaLista];

            System.out.println("Digite os numeros da lista:");

            for (int i = 0; i < tamanhoDaLista; i++) {
                System.out.print("Numero " + (i + 1) + ": ");
                numeros[i] = scanner.nextDouble();
            }

            // Ordena a lista
            Arrays.sort(numeros);

            // Calculo da mediana
            double mediana = calcularMediana(numeros);

            System.out.println("A mediana da lista é: " + mediana);

        } catch (InputMismatchException e) {
            System.out.println("Entrada invalida. Por favor, insira apenas numeros.");
        } finally {
            scanner.close();
        }
    }

    // Função que calcula a mediana de uma lista de números
    public static double calcularMediana(double[] numeros) {
        int tamanho = numeros.length;

        // Se a lista tiver um número par de elementos
        if (tamanho % 2 == 0) {
            int meio1 = tamanho / 2 - 1;
            int meio2 = tamanho / 2;

            return (numeros[meio1] + numeros[meio2]) / 2.0;
        } else {
            // Se a lista tiver um número ímpar de elementos
            int meio = tamanho / 2;
            return numeros[meio];
        }
    }
}


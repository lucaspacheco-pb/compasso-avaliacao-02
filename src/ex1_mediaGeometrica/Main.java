package ex1_mediaGeometrica;

import java.util.Scanner;

// 1.Desenvolva um programa que calcule a média geométrica de uma lista de números.

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho = 0;
        double produto = 1;
        double mediaGeometrica;

        System.out.print("Informe a quantidade de números: ");
        tamanho = getInteiro(scanner);

        //loop para receber os valores.
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Informe o " + (i + 1) + "º número: ");
            produto *= getDouble(scanner);
        }

        //math.pow calcula uma base elevada a uma potencia. E 1.0 é para forçar o resultado a ser Double.
        mediaGeometrica = Math.pow(produto, 1.0 / tamanho);

        System.out.println("A média geométrica é: " + mediaGeometrica);

        scanner.close();
    }

    //ambos metodos verificam se o valor informado é um número válido/Double
    private static double getDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Erro: informe um valor válido.");
            scanner.next(); 
        }
        return scanner.nextDouble();
    }

    private static int getInteiro(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Erro: informe um valor válido.");
            scanner.next(); 
        }
        return scanner.nextInt();
    }
}

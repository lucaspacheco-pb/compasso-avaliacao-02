package ex14_distancia2Pontos;

//14.Implemente um programa que calcule a distância euclidiana entre dois pontos em um plano cartesiano.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do ponto A de X: ");
        double pontoXA = obterNumero(scanner);

        System.out.print("Digite o valor do ponto A de Y: ");
        double pontoYA = obterNumero(scanner);

        System.out.print("Digite o valor do ponto B de X: ");
        double pontoXB = obterNumero(scanner);

        System.out.print("Digite o valor do ponto B de Y: ");
        double pontoYB = obterNumero(scanner);

        double calculoDistancia = Math.sqrt(Math.pow(pontoXB - pontoXA, 2) + Math.pow(pontoYB - pontoYA, 2));
        System.out.println("A distância entre os pontos é: " + calculoDistancia);

        scanner.close();
    }

    private static double obterNumero(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor, insira um número.");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}

package ex10_mediaHarmonica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o tamanho da lista: ");
        int tamanhoLista = entrada.nextInt();

        double[] numeros = new double[tamanhoLista];

        System.out.println("Digite os números da lista:");
        for (int i = 0; i < tamanhoLista; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = entrada.nextDouble();
        }

        double mediaHarmonica = calcularMediaHarmonica(numeros);
        System.out.println("A média harmônica é: " + mediaHarmonica);

        entrada.close();
    }
    private static double calcularMediaHarmonica(double[] numeros) {
        double inversos = 0;

        for (double numero : numeros) {
            inversos += 1 / numero;
        }
        double mediaHarmonica = numeros.length / inversos;

        return mediaHarmonica;
    }

}

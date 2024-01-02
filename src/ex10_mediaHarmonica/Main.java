package ex10_mediaHarmonica;
//Crie um programa que calcule a raiz quadrada de um número fornecido.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Double> lista = new ArrayList<>();
        String str = "0";
        System.out.println("Para calcular a média Harmônica de n números...");

        while (!str.equals("s")) {
            System.out.print("Digite um número ('s' para sair): ");
            str = entrada.next();
            if (isNumero(str)) {
                double numero = Double.parseDouble(str);
                lista.add(numero);
            } else if (!str.equals("s")){
                System.out.println("Valor inválido! Elemento não incluído na lista");
            }
        }

        double mediaHarmonica = calcularMediaHarmonica(lista);
        System.out.println("A média harmônica é: " + mediaHarmonica);

        entrada.close();
    }

    private static double calcularMediaHarmonica(List<Double> lista) {
        // mediaHarmonica = N / (1/x1 + 1/x2 + 1/x3... 1/xn)
        double inversos = 0;

        for (double numero : lista) {
            inversos += 1 / numero;
        }
        double mediaHarmonica = lista.size() / inversos;

        return mediaHarmonica;
    }

    public static boolean isNumero(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (RuntimeException e) {
            return false;
        }
    }

}

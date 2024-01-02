package ex10_mediaHarmonica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Double> lista = new ArrayList<>();
        String valor = "0";

        System.out.println("Digite os números da lista:");
        while (!valor.equals("n")){

            valor = entrada.next();
        if (true) {
            double numero = Double.parseDouble(valor);
            lista.add(numero);
        }
    }


        double mediaHarmonica = calcularMediaHarmonica(lista);
        System.out.println("A média harmônica é: " + mediaHarmonica);

        entrada.close();
    }
    private static double calcularMediaHarmonica(List<Double> lista) {
        double inversos = 0;

        for (double numero : lista) {
            inversos += 1 / numero;
        }
        double mediaHarmonica = lista.size() / inversos;

        return mediaHarmonica;
    }

}

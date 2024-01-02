/*Crie um programa que verifique se uma string é um número válido em notação científica */
package ex27_notacaoCientifica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um numero em notaçao cientifica: ");
        String entrada = in.nextLine();

        if (verificandoNotacaoCientifica(entrada)) {
            System.out.println("A string representa um numero em notaçao cientifica valida.");
        } else {
            System.out.println("A string nao representa um numero em notaçao cientifica valida.");
        }

        in.close();
    }

    // Função que verifica se uma string é um número em notação científica válida
    public static boolean verificandoNotacaoCientifica(String str) {
        // Verifica se a string não é nula ou vazia
        if (str == null || str.isEmpty()) {
            return false;
        }

        // Verifica se a string contém exatamente um caractere 'e' ou 'E'
        if (str.indexOf('e') == -1 && str.indexOf('E') == -1) {
            return false;
        }

        // Divide a string usando 'e' ou 'E' como delimitador
        String[] partes = str.split("[eE]");

        // Verifica se existem exatamente duas partes após a divisão
        if (partes.length != 2) {
            return false;
        }

        // Verifica se ambas as partes são números válidos
        try {
            Double.parseDouble(partes[0]);
            Integer.parseInt(partes[1]);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
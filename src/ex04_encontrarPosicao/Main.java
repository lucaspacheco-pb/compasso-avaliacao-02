package ex04_encontrarPosicao;

import java.util.Scanner;
import java.util.ArrayList;

// 4. Implemente um programa que encontre a posição de um elemento específico em um vetor.

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho da lista");
        int tamanho = getInteiro(scanner);

        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Informe os números da lista");
        for (int i = 0; i < tamanho; i++) {
            lista.add(getInteiro(scanner));
        }

        System.out.println("Informe o elemento a ser buscado");
        int elemento = getInteiro(scanner);

        // indexOf(encontra a posição do elemento na lista) retorna -1 se o elemento não for encontrado
        int posicao = lista.indexOf(elemento);

        if (posicao == -1) {
            System.out.println("Elemento não encontrado. Programa encerrado");
        } else {
            System.out.println("Elemento encontrado na posição " + posicao);
        }

        scanner.close();
    }

    private static int getInteiro(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Erro: informe um valor válido.");
            scanner.next();
        }
        return scanner.nextInt();
    }

}

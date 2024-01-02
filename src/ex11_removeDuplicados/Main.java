package ex11_removeDuplicados;
//Desenvolva um programa que remova os elementos duplicados de um vetor.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> vetor = new ArrayList<>();
        String str = "";

        System.out.println("Preenche o vetor: ");
        while (!str.equals("s")) {
            System.out.print("Digite um valor ('s' para sair): ");
            str = entrada.next();

            if (!str.equals("s")) vetor.add(str);
        }

        System.out.println("Vetor original: " + vetor);

        Set<String> listaSemDuplicados = new HashSet<>();
        listaSemDuplicados.addAll(vetor); // Set não aceita duplicados

        System.out.println("Vetor sem duplicatas: " + listaSemDuplicados);
    }
}

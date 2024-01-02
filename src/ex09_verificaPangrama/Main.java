package ex09_verificaPangrama;
//Implemente um programa que determine se uma string é um
//pangrama (contém todas as letras do alfabeto).

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a string: ");
        String str = entrada.nextLine();

        if (isPangrama(str)) {
            System.out.println("A string é um pangrama.");
        } else {
            System.out.println("A string não é um pangrama.");
        }

        entrada.close();
    }

    public static boolean isPangrama(String str) {
        String strMin = str.toLowerCase();
        Set<Character> listaAlfabeto = new HashSet<>(); // Set não adiciona duplicatas

        for (int i = 0; i < strMin.length(); i++) {
            char charAtual = strMin.charAt(i);
            if (Character.isLetter(charAtual)) {
                listaAlfabeto.add(charAtual);
            }
        }
        return listaAlfabeto.size() == 26;
    }

}

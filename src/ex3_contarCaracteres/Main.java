package ex3_contarCaracteres;

import java.util.Scanner;

// 3.Escreva um programa que leia o nome completo de uma pessoa e  exiba o número de caracteres no nome.

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;

        System.out.println("Digite um nome: ");
        nome = scanner.nextLine();
        
        System.out.println("O nome " + nome + " tem " + nome.length() + " caracteres.");

        scanner.close();
    }
    
}

package ex05_conversorMinusculas;

import java.util.Scanner;

// 5. Escreva um programa que converta uma string para letras minúsculas.

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma string");
        String string = scanner.nextLine();

        System.out.println("String original:\n " + string);

       System.err.println();

        System.out.println("String em minúsculas:\n " + string.toLowerCase());

        scanner.close();
    }
    
}

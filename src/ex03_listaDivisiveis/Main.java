package ex03_listaDivisiveis;

import java.util.ArrayList;
import java.util.Scanner;

// 3.  Elabore um programa que leia uma lista de números e exiba apenas os números que são divisíveis por 3 e 5.

public class Main {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        System.out.print("Digite a quantidade de números: ");
        int tamanho = getInteiro(scanner);
        
        
        if (tamanho > 0) {
            System.out.println("Digite os números: ");
            for (int i = 0; i < tamanho; i++) {
                numeros.add(getInteiro(scanner));
            }
            
            System.out.println("Números divisíveis por 3 e 5:");
            for (int numero : numeros) {
                if (numero % 3 == 0 || numero % 5 == 0) {
                    System.out.println(numero);
                }
            }
        } else {
            System.out.println("A quantidade de números deve ser maior que zero. Programa encerrado.");
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

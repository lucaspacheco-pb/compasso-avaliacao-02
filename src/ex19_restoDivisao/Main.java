package ex19_restoDivisao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int dividendo, divisor;

        do {
            System.out.print("Informe um número inteiro (Dividendo) maior que zero: ");
            dividendo = scanner.nextInt();

            if(dividendo <= 0) System.out.println("Número inválido. Tente novamente...");
        } while(dividendo <= 0);

        do {
            System.out.print("Informe um número inteiro (Divisor) maior que zero e menor ou igual ao número anterior: ");
            divisor = scanner.nextInt();

            if(divisor <= 0 || divisor >= dividendo) System.out.println("Número inválido. Tente novamente...");
        } while(divisor <= 0 || divisor >= dividendo);

        System.out.println("O resto da divisão de " + dividendo + " por " + divisor + " é igual a " + dividendo % divisor);

        scanner.close();
    }
}

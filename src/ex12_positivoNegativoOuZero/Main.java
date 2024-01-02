package ex12_positivoNegativoOuZero;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        String str = "0";
        System.out.println("Para verificar se os valor são positivos, negativos ou zero...");

        while (!str.equals("n")) {
            System.out.print("Digite um número: ");
            str = entrada.next().replace(",",".");
            if (isNumero(str)) {
                double numero = Double.parseDouble(str);
                String resultado = isPositivoNegativoOuZero(numero);
                System.out.println("O número é: " + resultado);
            } else if (!str.equals("n")) {
                System.out.println("Valor inválido!");
            }

            System.out.println("Deseja testar mais um número (s/n): ");
            str = entrada.next();
        }

        entrada.close();
    }
    public static boolean isNumero(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (RuntimeException e) {
            return false;
        }
    }
    public static String isPositivoNegativoOuZero(double numero) {
        if (numero > 0) {
            return "positivo";
        } else if (numero < 0) {
            return "negativo";
        } else {
            return "zero";
        }
    }
}

/*Escreva um programa que determine se um numero e triangular */
import java.util.InputMismatchException;
import java.util.Scanner;
public class ex25_numeroTriangular {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro: ");
            int numero = in.nextInt();

            if (ehTriangular(numero)) {
                System.out.println(numero + " é um número triangular.");
            } else {
                System.out.println(numero + " não é um número triangular.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
        } finally {
            in.close();
        }
    }

    // Função que verifica se um número é triangular
    public static boolean ehTriangular(int numero) {
        if (numero < 0) {
            return false; // Números negativos não são triangulares
        }

        int soma = 0;
        int n = 1;

        while (soma < numero) {
            soma += n;
            n++;
        }

        return soma == numero;
    }
}
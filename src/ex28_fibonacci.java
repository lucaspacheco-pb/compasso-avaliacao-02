/*Elabore um programa  que verifique se um numero é um número de fibonacci */
import java.util.Scanner;

public class ex28_fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = in.nextInt();

        if (ehNumeroFibonacci(numero)) {
            System.out.println(numero + " e um numero de Fibonacci.");
        } else {
            System.out.println(numero + " nao e um numero de Fibonacci.");
        }

        in.close();
    }

    // Função que verifica se um número é um número de Fibonacci
    public static boolean ehNumeroFibonacci(int numero) {
        // Verifica se (5n^2 + 4) ou (5n^2 - 4) é um quadrado perfeito
        return ehQuadradoPerfeito(5 * numero * numero + 4) || ehQuadradoPerfeito(5 * numero * numero - 4);
    } // Se pelomenos uma dessas condicoes for verdadeira, o numero e  fibonacci.

    // Função que verifica se um número é um quadrado perfeito
    public static boolean ehQuadradoPerfeito(int numero) {
        int raizQuadrada = (int) Math.sqrt(numero);
        return raizQuadrada * raizQuadrada == numero;
    }
}
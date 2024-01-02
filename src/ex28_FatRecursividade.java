/*Implemente um programa que calcule o fatorial de um numero usando recursividade.*/
import java.util.Scanner;
public class ex28_FatRecursividade{
    public static int calculaFatorial(int numero){
        if(numero == 0 || numero == 1){ // Condição base para recursividade
            return 1;
        }
        else {
            return numero * calculaFatorial (numero -1);
        }
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o numero que voce deseja calcular o fatorial:");
        int numero = in.nextInt();
        if(numero < 0){
            System.out.println("Favor informar outro numero, não existe fatorial negativo!");
        }
        else{
            int resultado = calculaFatorial(numero);
            System.out.println("O fatorial de " + numero + " = " +resultado);
        }
        in.close();
    }
}

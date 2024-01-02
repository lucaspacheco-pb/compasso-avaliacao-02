/*Escreva um programa que inverta a ordem dos elementos em um vetor  */
import java.util.Scanner;
import java.util.Arrays;
public class ex29_vetorInvertido{
    public static void ordemInvertida(int[] vetor){
        int tamanho = vetor.length;

        for(int i = 0 ; i < tamanho/2; i++){
            //Troca o primeiro elemento do vetor com o último; o segundo com o penultimo e assim sucessivamente
            int aux = vetor[i]; // Ou seja faz a troca dos elementos mantendo a ordem
            vetor[i] = vetor[tamanho -1 -i];
            vetor[tamanho -1 -i] = aux;
        }
    }
        public static void main(String [] args){
            
            int [] vetor = {10,20,30,40,50,60};
            System.out.println("Vetor Original = " + Arrays.toString(vetor));
            
            ordemInvertida(vetor); // chamada do metodo para inverter a ordem

            System.out.println("Vetor invertido = " + Arrays.toString(vetor));
        }
    
}

/*Crie um programa que encontre o segundo maior elemento de um vetor */
import java.util.Scanner;
import java.util.Arrays;

public class ex25_maiorElemento{
    
        
        public static int segundoMaiorElemento(int[] vetor){
            if(vetor.length < 2){
                System.out.println(" O vetor precisa ter no minimo dois elementos.");
                return -1; //Indica erro.
            }
            Arrays.sort(vetor); // Ordena o vetor em ordem decrescente
            return vetor[vetor.length - 2]; // Posicao do segundo maior elemento do vetor.
        }
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int[] vetor = {10,12,18,45,26,81};
            int segundoMaior = segundoMaiorElemento(vetor);
            if(segundoMaior != -1){
                System.out.println(" O segundo maior elemento do vetor = " + segundoMaior);
            }
            in.close();
        }
        
   

    
}
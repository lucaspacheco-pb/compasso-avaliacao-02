/*Desenvolva um programa que conte o numero de palavras em uma string */

import java.util.Scanner;
public class ex26_contaPalavraString{
    public static int contadorPalavras(String texto){
        if(texto == null  || texto.isEmpty()){
            return  0;
        }
        texto = texto.replaceAll("[.,;?!-+@]+$","");// Para não contar como palavra qualquer ponto no final de frase
        String[] palavras = texto.split("\\s+");
        return palavras.length;
    }
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        System.out.println("Informe uma frase:");
        String frase = in.nextLine();

        int numeroDePalavras = contadorPalavras(frase);
        System.out.println(" O numero de palavras contido na frase = " + numeroDePalavras);
        in.close();
    }
    
}
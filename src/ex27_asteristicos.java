/*Elabore um programa que substitua todas as vogais em uma string por asteristicos */
import java.util.Scanner;
public class ex27_asteristicos{
    public static String substituirTodasAsVogaisPorAsteristicos(String texto){
        if (texto == null  || texto.isEmpty()){
            return texto;
        }
        texto = texto.replaceAll("[aeiouAEIOU]", "*"); // Substitui as vogais tanto maiusculas como minusculas por asteristicos.
        return texto;

    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a frase:");
        String frase = in.nextLine();
        String resposta = substituirTodasAsVogaisPorAsteristicos(frase);
        System.out.println("A resposta apos a troca = " + resposta);
        in.close();
    }
    
    
}

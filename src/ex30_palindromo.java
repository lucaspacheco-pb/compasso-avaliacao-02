/*Crie um programa que verifique se uma String é um palindromo ignorando espaços em branco e 
maiusculas/minusculas.*/
import java.util.Scanner;
public class ex30_palindromo{
    public static boolean ehPalindromo(String str){
        str = str.replaceAll("\\s","").toLowerCase(); // Remove espaços em branco e converte tudo para minusculo
        int comprimento = str.length();
        for(int i = 0 ; i < comprimento/2 ; i++){
        // Divide a palavra no meio para comprar carecteres correspondentes
           if(str.charAt(i) != str.charAt(comprimento -1 -i)){
            return false;
           }
          
        }
        return true;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a string:");
        String palavra = in.nextLine();

        if(ehPalindromo(palavra)){
            System.out.println(" Eh palindromo!!!");
        }
        else{
            System.out.println("Nao e palindromo!!!");
        }
        in.close();
    }
}

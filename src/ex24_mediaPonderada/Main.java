/*
 *  Implemente um programa que calcule a média ponderada de duas notas com pesos diferentes.
 */

package ex24_mediaPonderada;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double nota1, nota2;
		int peso1, peso2;
		
		do {
			System.out.print("Informe a primeira nota (1 a 10): ");
			nota1 = scanner.nextDouble();
			System.out.print("Informe o peso da primeira nota (inteiro positivo): ");
			peso1 = scanner.nextInt();
			System.out.print("Informe a segunda nota (1 a 10): ");
			nota2 = scanner.nextDouble();
			System.out.print("Informe o peso da segunda nota (inteiro positivo): ");
			peso2 = scanner.nextInt();
			
			// Valida se os dados fornecidos são adequados para o cálculo
			if(nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || peso1 < 1 || peso2 < 1) System.out.println("Dados inválidos! Tente novamente...");
		} while(nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || peso1 < 1 || peso2 < 1);
		
		// Atribui o cálculo de média ponderada à variável
		double mediaPonderada = (nota1 * peso1 + nota2 * peso2) / (peso1 + peso2);
		
		// Imprime o resultado
		System.out.println("Media ponderada = " + mediaPonderada);
		
		scanner.close();
	}

}

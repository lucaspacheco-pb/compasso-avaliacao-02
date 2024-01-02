/*
 * Crie um programa que calcule o produto escalar de dois vetores
 */

package ex22_produtoEscalar;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o tamanho dos vetores: ");
		int tamanho = scanner.nextInt();
		
		// Declara e instancia os vetores com o tamanho informado pelo usuário
		double[] vetorA = new double[tamanho];
		double[] vetorB = new double[tamanho];
		double produtoEscalar = 0.0;
		
		for(int cont = 0; cont < tamanho; cont++) {
			System.out.print("Informe um numero para a posição " + cont + " do vetor A: ");
			vetorA[cont] = scanner.nextDouble();
			System.out.print("Informe um numero para a posição " + cont + " do vetor B: ");
			vetorB[cont] = scanner.nextDouble();
			
			// Com base nos dados informados, realiza o cálculo do produto escalar e soma com o valor atual da variável produtoEscalar
			produtoEscalar += vetorA[cont] * vetorB[cont];
		}
		
		System.out.println("O produto escalar dos vetores A e B é igual a " + produtoEscalar);
		
		scanner.close();
	}

}

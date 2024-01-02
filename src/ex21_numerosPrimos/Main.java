/*
 * Desenvolva um programa que leia uma lista de números e exiba apenas os números primos.
 */
package ex21_numerosPrimos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> numeros = new ArrayList<>();
		List<Integer> primos = new ArrayList<>();
		int numero;
		
		do {
			System.out.print("Informe um número para adicionar a lista ou 0 (zero) para sair: ");
			numero = scanner.nextInt();
			
			// Verifica se o usuário deseja sair do loop
			if(numero == 0) break;
			
			// Adiciona o numero informado à lista de numeros
			numeros.add(numero);
		} while(numero != 0);
		
		for(int num : numeros) {
			// Sabendo que todo o numero é divisivel por 1 e ele mesmo, o contador começa com o valor 2
			for(int cont = 2; cont <= num; cont++) {
				// Se o resto do numero atual pelo cont é ZERO e o contador não é o próprio número, então não é primo e quebra o loop para o proximo numero
				if(num % cont == 0 && cont != num) {
					break;
				}
				// Se o num é igual ao contador, então é primo
				if(num == cont) {
					primos.add(num);
				}
			}
		}
		
		System.out.println(primos);
		
		scanner.close();
	}

}

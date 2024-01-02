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
			
			if(numero == 0) break;
			
			numeros.add(numero);
		} while(numero != 0);
		
		for(int num : numeros) {
			for(int cont = 2; cont <= num; cont++) {
				if(num % cont == 0 && cont != num) {
					break;
				}
				if(num == cont) {
					primos.add(num);
				}
			}
		}
		
		System.out.println(primos);
		
		scanner.close();
	}

}

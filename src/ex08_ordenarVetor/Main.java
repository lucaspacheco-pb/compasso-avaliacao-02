package ex08_ordenarVetor;
//Elabore um programa que ordene um vetor em ordem decrescente.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Boolean> booleanList = new ArrayList<>();
        String[] str;

        while (true) {
            System.out.print("Digite os elementos de um vetor separados por ' '(espaço): ");
            str = entrada.nextLine().split(" ");

            for (String string : str) {
                //Verifica se é número ou não número
                if (isNumero(string)) {
                    booleanList.add(true);
                } else {
                    booleanList.add(false);
                }
            }

            if (booleanList.stream().allMatch(x -> x)) { // verifica se é tudo número (double)
                Double[] numeros = new Double[str.length];
                for (int i = 0; i < str.length; i++) {
                    numeros[i] = Double.parseDouble(str[i]);
                }
                Arrays.sort(numeros, Comparator.reverseOrder());

                for (Double numero : numeros) {
                    System.out.println(numero);
                }

                break;
            } else if (booleanList.stream().allMatch(x -> !x)) { // verifica se é tudo texto (não número)
                Arrays.sort(str, Comparator.reverseOrder());

                for (String string : str) {
                    System.out.println(string);
                }
                break;
            } else {
                System.out.println("Digite apenas dados de um tipo (Texto / Número)");
                booleanList.clear();
            }
        }
        System.out.println("Fim");
        entrada.close();
    }
    public static boolean isNumero(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (RuntimeException e) {
            return false;
        }
    }


}

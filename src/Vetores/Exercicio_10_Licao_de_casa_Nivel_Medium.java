package Vetores;

import javax.swing.*;

public class Exercicio_10_Licao_de_casa_Nivel_Medium {
    public static void main(String[] args) {

        //  Calcule e exiba a sequência de Fibonacci até o 10º elemento.
        //  Ex.: 0, 1,1 .. 34. Usando Vetor, para armazenar o C.A sequência de Fibonacci,
        //  é calculada com a soma dos 2 termos anteriores,sendo o primeiro e o segundo, 0 e 1, respectivamente.

        int elemento = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento de Fibonacci que você deseja descobrir"));
            int[] vetorFibonacci = new int[elemento];
            vetorFibonacci[0] = 0;
            vetorFibonacci[1] = 1;
            for (int i = 2; i < vetorFibonacci.length; i++) {
                vetorFibonacci[i] = vetorFibonacci[i - 1] + vetorFibonacci[i - 2];
            }
            for (int i = 0; i < vetorFibonacci.length; i++) {
                System.out.println(vetorFibonacci[i]);
            }
        }
    }







package Vetores;

import javax.swing.*;

public class Exercicio_05_Licao_de_casa_Nivel_Medium {
    public static void main(String[] args) {

        // 5-) Faça um algoritmo para ler 5 números,verificar e exibir, quais dos 5 números digitados, é o menor.

        int menorNumero = 1;

        for (int i = 1; i <= 5; i++) {
            Integer numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog(" Informe o Número : "));

            if (numeroDigitado < menorNumero || i == 1) {  // i é igual a 1
                menorNumero = numeroDigitado;
            }
        }
        System.out.println("O número: " + menorNumero + " é o menor.");
    }
}


//    while (i <= 5) {
//       Integer  numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog(" Informe o Número :  "));
//       if (numeroDigitado < menorNumero || i == 1) {
//            menorNumero = numeroDigitado;
//       }
//      i++;
//   }
//  System.out.println("O número: " + menorNumero + " é o menor.");
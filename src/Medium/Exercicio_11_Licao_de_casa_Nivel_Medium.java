package Medium;

import javax.swing.*;

public class Exercicio_11_Licao_de_casa_Nivel_Medium {
    public static void main(String[] args) {
//  11-) Faça um algoritmo para ler um número inteiro,somar 2 ao número digitado, até completar 100 iterações.
//  Por ex.: Digitou 10. 10+2, 12+2, 14+2, Até completar 100 iterações.


        Integer i = 1;

        Integer numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número:"));

        while (numeroDigitado <= 99) {    // realizar a contagem ate 100
            numeroDigitado = numeroDigitado + 2;  // somar 2 ao número digitado
             i++;  // incremento
            System.out.println(numeroDigitado);
        }
        System.out.println("Fim");

   }
}



//Integer numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número:"));
  //    for(int i = 0; i<=99;i++){
    // numeroDigitado = numeroDigitado + 2;  // somar 2 ao número digitado
    //    System.out.println(" Interação: " + i  +" - valor: "+ numeroDigitado);
    //    }
     //           System.out.println("Fim das Interações !!");

    //  }
//}
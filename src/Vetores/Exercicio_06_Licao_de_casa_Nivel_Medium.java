package Vetores;

import javax.swing.*;

public class Exercicio_06_Licao_de_casa_Nivel_Medium {
    public static void main(String[] args) {

        // 6-) Faça um algoritmo para ler um número inteiro, calcular e exibir o
        //  Fatorial do número digitado. Ex.: Digitou 10. 10*(10-1)*(10-2)*(10-3)..*(10-1) = 3.628.800
//  Fatorial, i;    //  Fatorial = Fatorial * (i-1);

        int fatorial = 1;

        Integer numeroFatorial = Integer.parseInt(JOptionPane.showInputDialog("Informe um Número para calcular o Fatorial: "));

        for (int i = numeroFatorial; i > 1; i--) {
            numeroFatorial = numeroFatorial * (i-1);
        }
        if (numeroFatorial == 0) {
            System.out.println("O Fatorial do numero digitado é : 1");
        }else{
           System.out.println("O Fatorial do numero digitado é  :" + numeroFatorial);

        }
    }
}


//   double i = 10; // aqui criamos uma variável que irá armazenar o numero do fatorial
//    double Fatorial = i; // aqui criamos outra var. Será o resultado temporário da multiplicação
//      while (i > 1){ // Enquanto x for menor que 1 faça o que está entre as chaves
//     Fatorial = Fatorial * (i-1); // A variável temporária ira receber o resultado da multiplicação dela, pelo valor de x menos 1
//     i--; // aqui decrementamos o valor de x em um, no final do loop
//      System.out.println(" Fatorial do número digitado" + Fatorial); // Esse comando imprime o valor de f. O último será o valor final do Fatorial.
//    }






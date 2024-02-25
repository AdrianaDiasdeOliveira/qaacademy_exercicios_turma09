package Easy;

import javax.swing.*;

public class ExecucaoExercicios {
    public static void main(String[] args) {

              // Exercicio_02_easy
      // Exercicio_02_easy exercicio02Easy = new Exercicio_02_easy();
      // String palavraDigitada= exercicio02Easy.exibirPalavra(" Adriana Dias");
      // System.out.println (palavraDigitada);


             //Exercicio_03_easy
 /*  String valor1 = JOptionPane.showInputDialog("Digite o Primeiro Valor: ");
     String valor2 = JOptionPane.showInputDialog("Digite o Segundo Valor: ");
     Exercicio_03_easy exercicio03Easy = new Exercicio_03_easy();
     System.out.println(exercicio03Easy.armazenarValoresTrocados(valor1 , valor2));*/

        //Exercicio_04_easy
        String numeroDigitado = JOptionPane.showInputDialog("Digite o Número Inteiro:");
        int  numero1 = Integer.parseInt(numeroDigitado); // Conversão e atribuição na variavel numeroDigitado
        Exercicio_04_Licao_de_casa exercicio04Easy = new Exercicio_04_Licao_de_casa();
        System.out.println("O dobro do valor de: " + numero1 + " é " + exercicio04Easy.calcularDobro(numero1));



    }
}
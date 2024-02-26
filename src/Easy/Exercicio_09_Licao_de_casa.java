package Easy;

import javax.swing.*;

public class Exercicio_09_Licao_de_casa {
    public void calcularTabuada( int numero) {
        //   9-)Faça um algoritmo para ler um número inteiro entre: 1 e 10.
        //   calcular e exibir a tabuada deste número digitado. Ex.: 10 x 1 = 10, .., 10 x 10 = 100.


      /*  String numeroDigitado = JOptionPane.showInputDialog("Digite o Número para a Tabuada : ");
        numero = Integer.parseInt(numeroDigitado);       //Conversão da variavel numeroDigitado para Inteiro.
*/
        if (numero <= 0 || numero > 10) {
            System.out.println(" Numero Inválido");

        } else {

            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " x " + i + " = " + i * numero);
            }
        }
    }
}



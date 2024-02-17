package Easy;

import javax.swing.*;

public class Exercicio_04_Licao_de_casa {
    public static void main(String[] args) {

     // 4-)  Faça um algoritmo para ler um número inteiro, armazenar em uma variável, calcular o dobro, e exibir.

        int numero1, resultado;

        String numeroDigitado = JOptionPane.showInputDialog("Digite o Número Inteiro:");

        numero1 = Integer.parseInt(numeroDigitado); // Conversão e atribuição na variavel numeroDigitado

        resultado = numero1 * 2;

        System.out.println(" O dobro do Número Digitado é::" + resultado);

    }
}

package Easy;

import javax.swing.*;
import java.sql.SQLOutput;
// 5-) Faça um algoritmo para ler três números inteiros, armazenar em variáveis,e exibir a soma, a subtração, multiplicação e a média dos três números digitados.

public class Exercicio_05_Licao_de_casa {
    public int exibirSoma (int num1 ,int num2 , int num3 ) {

        Integer media;

        // String primeiroNumero = JOptionPane.showInputDialog("Digite o Primeiro Número: ");
        // String segundoNumero = JOptionPane.showInputDialog("Digite o Segundo  Número: ");
        // String terceiroNumero = JOptionPane.showInputDialog("Digite o Terceiro Número: ");

        //Conversão da variavel primeiroNumero / segundoNumero /terceiroNumero para Inteiro.

        //  num1 = Integer.parseInt(primeiroNumero);
        //  num2 = Integer.parseInt(segundoNumero);
        //  num3 = Integer.parseInt(terceiroNumero);

        return num1 + num2 + num3;

    }
        public int exibirSubitracao (int num1 ,int num2 ) {

            return num1 - num2;

        }

    public int exibirMultiplicacao (int num1 ,int num2 , int num3 ) {
        return num1 * num2 * num3;

    }

    public int exibirMedia (int num1 ,int num2 , int num3 ) {
        return (num1 + num2 + num3 )/ 3;

    }
}


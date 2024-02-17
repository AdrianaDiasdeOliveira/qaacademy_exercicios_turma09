package Easy;

import javax.swing.*;
import java.sql.SQLOutput;

public class Exercicio_05_Licao_de_casa {
    public static void main(String[] args) {

// 5-) Faça um algoritmo para ler três números inteiros, armazenar em variáveis,e exibir a soma, a subtração, multiplicação e a média dos três números digitados.

        Integer num1, num2, num3, media;

        String primeiroNumero = JOptionPane.showInputDialog("Digite o Primeiro Número: ");
        String segundoNumero = JOptionPane.showInputDialog("Digite o Segundo  Número: ");
        String terceiroNumero = JOptionPane.showInputDialog("Digite o Terceiro Número: ");

            //Conversão da variavel primeiroNumero / segundoNumero /terceiroNumero para Inteiro.

        num1 = Integer.parseInt(primeiroNumero);
        num2 = Integer.parseInt(segundoNumero);
        num3 = Integer.parseInt(terceiroNumero);

        System.out.println("A Soma é:" + (num1 + num2 + num3));
        System.out.println(" A subtracao é:" + (num1 - num2 ));
        System.out.println("A multiplicacao é:" + (num1 * num2 * num3));
        System.out.println("A média dos três números digitados :" + (num1 + num2 + num3)/3);

       }
}

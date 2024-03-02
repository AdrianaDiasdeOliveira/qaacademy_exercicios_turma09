package Easy;

import javax.swing.*;

public class Exercicio_07_Licao_de_casa {
//    7-) Faça um algoritmo para ler um valor de salário, calcular e exibir o  valor do INSS a ser pago.
//    Respeitando a tabela abaixo: inss= salario * aliquota

    public double  CalcularSalario (double salario) {
        double inss = 0;

        // double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de Salario :"));

        if (salario < 1320.00) {
            inss = salario * 0.075; //aliquota 7,5%

        } else if (salario >= 1320.01 && salario <= 2571.29) {
            inss = salario * 0.09; // aliquota de 9%

        } else if (salario >= 2571.30 && salario <= 3856.94) {
            inss = salario * 0.12; // aliquota de 12%

        } else if (salario >= 3856.95 && salario <= 7507.49) {
            inss = salario * 0.14; // aliquota de 14%
        }
        if (salario > 7507.49) {
            inss = 1051.04;
        }
        System.out.println("O Valor do inss a ser pago é R$ " + inss);
        return inss;
    }
}


package Easy;

import javax.swing.*;

public class Exercicio_08_Licao_de_casa {
    public static void main(String[] args) {
//   8-) Faça um algoritmo para ler um valor de salário, calcular e exibir o valor do salário bruto,
//   valor do salário líquido e o valor do imposto de renda. Respeitando a tabela abaixo:
//    IR = (Salario * aliquota) -dedução

        double salario = 0;
        double IR = 0;
        double salarioLiquido = 0;

        String salarioBruto = JOptionPane.showInputDialog("Digite o salário bruto do funcionário : ");
        salario = Double.parseDouble(salarioBruto);    // Conversão da variavel salarioBruto

        if (salario <= 2112.00) {
            System.out.println("Isento !");

        } else if (salario >= 2112.01 && salario <= 2826.65) {
            IR = (salario * 0.075) - 158.40;  // 7,50%
            salarioLiquido = salario - IR;

        } else if (salario >= 2826.66 && salario <= 3751.05) {
            IR = (salario * 0.15) - 370.40; // 15,00%
            salarioLiquido = salario - IR;

        } else if (salario >= 3751.06 && salario <= 4664.68) {
            IR = (salario * 0.225) - 651.73; // 22,50%
            salarioLiquido = salario - IR;

        } else if (salario >= 4664.68) {
            IR = (salario * 0.275) - 884.96; // 27,50
            salarioLiquido = salario - IR;
        }
        System.out.println("O Salario Bruto será : R$ " + salario);
        System.out.println("O Salario Liquido será : R$ " + salarioLiquido);
        System.out.println("O valor a ser pago de IR será: R$:" + IR);
    }
}